package bluemix.org.numbertoarabicwords;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numberET = (EditText) findViewById(R.id.numberET);
        final TextView wordsTV = (TextView) findViewById(R.id.wordsTV);

        Button convertNumberToArWords = (Button) findViewById(R.id.convertButton);

        convertNumberToArWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArabicTools arabicTools = new ArabicTools();

                String number = numberET.getText().toString();

                String arabicWords = arabicTools.numberToArabicWords(number);

                wordsTV.setText(arabicWords);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
