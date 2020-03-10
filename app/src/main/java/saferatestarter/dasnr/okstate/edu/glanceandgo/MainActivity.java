package saferatestarter.dasnr.okstate.edu.glanceandgo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    String CCValue;
    double CCValueDouble;
    String MVValue;
    double MVValueDouble;
    double seasonValueDouble;
    int thresholdValue;
    String seasonValue;
    Spinner CC;
    Spinner MV;
    Spinner season;
    Button submit;
    EditText threshold;
    ArrayAdapter<CharSequence> CCadapter;
    ArrayAdapter<CharSequence> MVadapter;
    ArrayAdapter<CharSequence> seasonadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        threshold = (EditText)findViewById(R.id.editText2);
        submit = (Button) findViewById(R.id.button2);
        CC = (Spinner)findViewById(R.id.spinner2);
        MV = (Spinner)findViewById(R.id.spinner3);
        season = (Spinner)findViewById(R.id.spinner);

        threshold.setEnabled(false);

        CCadapter = ArrayAdapter.createFromResource(this, R.array.ControlCostArray, android.R.layout.simple_spinner_item);
        CCadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CC.setAdapter(CCadapter);
       // CC.setSelection(0);

        MVadapter = ArrayAdapter.createFromResource(this, R.array.MarketValueArray, android.R.layout.simple_spinner_item);
        MVadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        MV.setAdapter(MVadapter);
       // MV.setSelection(0);

        seasonadapter = ArrayAdapter.createFromResource(this, R.array.Seasons, android.R.layout.simple_spinner_item);
        seasonadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        season.setAdapter(seasonadapter);
        season.setSelection(0);
        //season.setSelection(0);

        CC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                CCValue =  CC.getSelectedItem().toString();
                CCValueDouble = Double.parseDouble(CCValue);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        MV.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                MVValue = MV.getSelectedItem().toString();
                MVValueDouble = Double.parseDouble(MVValue);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        season.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                seasonValue = season.getSelectedItem().toString();
               // seasonValueDouble = Double.parseDouble(seasonValue);
                }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

            submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                if((CCValue.equals("3") && MVValue.equals("3.5")) || (CCValue.equals("3") && MVValue.equals("4")) || (CCValue.equals("3") && MVValue.equals("5")) ||
                        (CCValue.equals("4") && MVValue.equals("4.5")) || (CCValue.equals("4") && MVValue.equals("5")) ||
                        (CCValue.equals("5") && MVValue.equals("5"))){

                    thresholdValue = 1;

                } else if((CCValue.equals("3") && MVValue.equals("2")) || (CCValue.equals("3") && MVValue.equals("2.5")) || (CCValue.equals("3") && MVValue.equals("3")) ||
                        (CCValue.equals("4") && MVValue.equals("2.5")) || (CCValue.equals("4") && MVValue.equals("3")) || (CCValue.equals("4") && MVValue.equals("3.5")) || (CCValue.equals("4") && MVValue.equals("4")) ||
                        (CCValue.equals("5") && MVValue.equals("3")) || (CCValue.equals("5") && MVValue.equals("3.5")) || (CCValue.equals("5") && MVValue.equals("4")) || (CCValue.equals("5") && MVValue.equals("4.5")) ||
                        (CCValue.equals("6") && MVValue.equals("3.5")) || (CCValue.equals("6") && MVValue.equals("4")) || (CCValue.equals("6") && MVValue.equals("4.5")) || (CCValue.equals("6") && MVValue.equals("5")) ||
                        (CCValue.equals("7") && MVValue.equals("4")) || (CCValue.equals("7") && MVValue.equals("4.5")) || (CCValue.equals("7") && MVValue.equals("5")) ||
                        (CCValue.equals("8") && MVValue.equals("4.5")) || (CCValue.equals("8") && MVValue.equals("5")) ||
                        (CCValue.equals("9") && MVValue.equals("5"))){

                    thresholdValue = 3;

                }  else if((CCValue.equals("4") && MVValue.equals("2")) ||
                        (CCValue.equals("5") && MVValue.equals("2")) || (CCValue.equals("5") && MVValue.equals("2.5")) ||
                        (CCValue.equals("6") && MVValue.equals("2.5")) || (CCValue.equals("6") && MVValue.equals("3")) ||
                        (CCValue.equals("7") && MVValue.equals("3")) || (CCValue.equals("7") && MVValue.equals("3.5")) ||
                        (CCValue.equals("8") && MVValue.equals("3")) || (CCValue.equals("8") && MVValue.equals("3.5")) || (CCValue.equals("8") && MVValue.equals("4")) ||
                        (CCValue.equals("9") && MVValue.equals("3.5")) || (CCValue.equals("9") && MVValue.equals("4")) || (CCValue.equals("9") && MVValue.equals("4.5"))||
                        (CCValue.equals("10") && MVValue.equals("4.5")) || (CCValue.equals("10") && MVValue.equals("5"))){

                    thresholdValue = 5;

                } else if ((CCValue.equals("6") && MVValue.equals("2")) ||
                        (CCValue.equals("7") && MVValue.equals("2")) || (CCValue.equals("7") && MVValue.equals("2.5")) ||
                        (CCValue.equals("8") && MVValue.equals("2.5")) ||
                        (CCValue.equals("9") && MVValue.equals("2.5")) || (CCValue.equals("9") && MVValue.equals("3")) ||
                        (CCValue.equals("10") && MVValue.equals("3.5")) || (CCValue.equals("10") && MVValue.equals("4"))){

                    thresholdValue = 7;

                } else if((CCValue.equals("8") && MVValue.equals("2"))||
                        (CCValue.equals("9") && MVValue.equals("2")) ||
                        (CCValue.equals("10") && MVValue.equals("2")) || (CCValue.equals("10") && MVValue.equals("2.5")) || (CCValue.equals("10") && MVValue.equals("3"))){

                    thresholdValue = 9;

                }

                //Alert for selecting season
                final AlertDialog alertDialogSeason = new AlertDialog.Builder(MainActivity.this).create();
                alertDialogSeason.setTitle("Alert");
                alertDialogSeason.setMessage("Please select the season to proceed");
                alertDialogSeason.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });

                if (seasonValue.equalsIgnoreCase("Select season"))
                {
                    alertDialogSeason.show();
                }
                else {
                    threshold.setText(String.valueOf(thresholdValue));
                    Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
                    myIntent.putExtra("tv", thresholdValue);
                    myIntent.putExtra("sv", seasonValue);
                    startActivity(myIntent);
                }
            }
        });


    }
}
