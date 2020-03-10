package saferatestarter.dasnr.okstate.edu.glanceandgo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13, cb14, cb15;
    Button finalsubmit;

    int cbChecked, rbChecked;
    int tv;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        finalsubmit = (Button)findViewById(R.id.button3);

        Bundle thresh = getIntent().getExtras();
        tv = thresh.getInt("tv");
        reset = (Button)findViewById(R.id.button);

        rb1 = (RadioButton)findViewById(R.id.radioButton1);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb3 = (RadioButton)findViewById(R.id.radioButton3);
        rb4 = (RadioButton)findViewById(R.id.radioButton4);
        rb5 = (RadioButton)findViewById(R.id.radioButton5);
        rb6 = (RadioButton)findViewById(R.id.radioButton6);
        rb7 = (RadioButton)findViewById(R.id.radioButton7);
        rb8 = (RadioButton)findViewById(R.id.radioButton8);
        rb9 = (RadioButton)findViewById(R.id.radioButton9);
        rb10 = (RadioButton)findViewById(R.id.radioButton10);
        rb11 = (RadioButton)findViewById(R.id.radioButton11);
        rb12 = (RadioButton)findViewById(R.id.radioButton12);
        rb13 = (RadioButton)findViewById(R.id.radioButton13);
        rb14 = (RadioButton)findViewById(R.id.radioButton14);
        rb15 = (RadioButton)findViewById(R.id.radioButton15);

        cb1 = (CheckBox)findViewById(R.id.CheckBox1);
        cb2 = (CheckBox)findViewById(R.id.CheckBox2);
        cb3 = (CheckBox)findViewById(R.id.CheckBox3);
        cb4 = (CheckBox)findViewById(R.id.CheckBox4);
        cb5 = (CheckBox)findViewById(R.id.CheckBox5);
        cb6 = (CheckBox)findViewById(R.id.CheckBox6);
        cb7 = (CheckBox)findViewById(R.id.CheckBox7);
        cb8 = (CheckBox)findViewById(R.id.CheckBox8);
        cb9 = (CheckBox)findViewById(R.id.CheckBox9);
        cb10 = (CheckBox)findViewById(R.id.CheckBox10);
        cb11 = (CheckBox)findViewById(R.id.CheckBox11);
        cb12 = (CheckBox)findViewById(R.id.CheckBox12);
        cb13 = (CheckBox)findViewById(R.id.CheckBox13);
        cb14 = (CheckBox)findViewById(R.id.CheckBox14);
        cb15 = (CheckBox)findViewById(R.id.CheckBox15);

        //alert box for don't treat
        final AlertDialog alertDialogNo = new AlertDialog.Builder(Main3Activity.this).create();
        alertDialogNo.setTitle("Alert");
        alertDialogNo.setMessage("Please don't treat");
        alertDialogNo.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        //alert box for treating
        final AlertDialog alertDialogYes = new AlertDialog.Builder(Main3Activity.this).create();
        alertDialogYes.setTitle("Alert");
        alertDialogYes.setMessage("Please treat");
        alertDialogYes.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        //alert box for keep sampling
        final AlertDialog alertDialogMore = new AlertDialog.Builder(Main3Activity.this).create();
        alertDialogMore.setTitle("Alert");
        alertDialogMore.setMessage("Please keep sampling (You will be redirected to sample page in 4 seconds)");
        alertDialogMore.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        reset.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1.setChecked(false);
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                rb5.setChecked(false);
                rb6.setChecked(false);
                rb7.setChecked(false);
                rb8.setChecked(false);
                rb9.setChecked(false);
                rb10.setChecked(false);
                rb11.setChecked(false);
                rb12.setChecked(false);
                rb13.setChecked(false);
                rb14.setChecked(false);
                rb15.setChecked(false);

                cb1.setChecked(false);
                cb2.setChecked(false);
                cb3.setChecked(false);
                cb4.setChecked(false);
                cb5.setChecked(false);
                cb6.setChecked(false);
                cb7.setChecked(false);
                cb8.setChecked(false);
                cb9.setChecked(false);
                cb10.setChecked(false);
                cb11.setChecked(false);
                cb12.setChecked(false);
                cb13.setChecked(false);
                cb14.setChecked(false);
                cb15.setChecked(false);

                cbChecked = 0;
                rbChecked = 0;
            }
        });


        finalsubmit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                //getting values from first sampling
                //Intent valueIntent = getIntent();
                Bundle extras = getIntent().getExtras();
                cbChecked = extras.getInt("cb");
                rbChecked = extras.getInt("rb");

                //for mummies
                if (rb1.isChecked()) {
                    rbChecked++;
                }
                if (rb2.isChecked()) {
                    rbChecked++;
                }
                if (rb3.isChecked()) {
                    rbChecked++;
                }
                if (rb4.isChecked()) {
                    rbChecked++;
                }
                if (rb5.isChecked()) {
                    rbChecked++;
                }
                if (rb6.isChecked()) {
                    rbChecked++;
                }
                if (rb7.isChecked()) {
                    rbChecked++;
                }
                if (rb8.isChecked()) {
                    rbChecked++;
                }
                if (rb9.isChecked()) {
                    rbChecked++;
                }
                if (rb10.isChecked()) {
                    rbChecked++;
                }
                if (rb11.isChecked()) {
                    rbChecked++;
                }
                if (rb12.isChecked()) {
                    rbChecked++;
                }
                if (rb13.isChecked()) {
                    rbChecked++;
                }
                if (rb14.isChecked()) {
                    rbChecked++;
                }
                if (rb15.isChecked()) {
                    rbChecked++;
                }

                //for tillers
                if (cb1.isChecked()) {
                    cbChecked++;
                }
                if (cb2.isChecked()) {
                    cbChecked++;
                }
                if (cb3.isChecked()) {
                    cbChecked++;
                }
                if (cb4.isChecked()) {
                    cbChecked++;
                }
                if (cb5.isChecked()) {
                    cbChecked++;
                }
                if (cb6.isChecked()) {
                    cbChecked++;
                }
                if (cb7.isChecked()) {
                    cbChecked++;
                }
                if (cb8.isChecked()) {
                    cbChecked++;
                }
                if (cb9.isChecked()) {
                    cbChecked++;
                }
                if (cb10.isChecked()) {
                    cbChecked++;
                }
                if (cb11.isChecked()) {
                    cbChecked++;
                }
                if (cb12.isChecked()) {
                    cbChecked++;
                }
                if (cb13.isChecked()) {
                    cbChecked++;
                }
                if (cb14.isChecked()) {
                    cbChecked++;
                }
                if (cb15.isChecked()) {
                    cbChecked++;
                }


                //test.setText(String.valueOf(cbChecked));
                switch (tv){
                    case 1:
                if (rbChecked >= 4 || cbChecked <= 3) {
                    // test.setText("Activity 3");
                    //test.setText("Don't treat");
                    alertDialogNo.show();

                } else if (cbChecked >= 4 && cbChecked <= 6) {
                    //keep sampling
                    //test.setText("Please Keep Sampling");
                    alertDialogMore.show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent myIntent = new Intent(Main3Activity.this, Main4Activity.class);
                            Bundle bundle = new Bundle();
                            myIntent.putExtra("cb", cbChecked);
                            myIntent.putExtra("rb", rbChecked);
                            myIntent.putExtra("tv", tv);
                            startActivity(myIntent);

                        }
                    }, 4000);
                } else if (cbChecked >= 7) {
                    //test.setText("Please treat");
                    alertDialogYes.show();
                    //make 6 activities for one threshold, then use a switch statement to switch b/w several thresholds
                                }
                                break;
                    case 3:
                        if (rbChecked >= 4 || cbChecked <= 7) {
                            alertDialogNo.show();
                        } else if (cbChecked >= 8 && cbChecked <= 15) {
                            alertDialogMore.show();
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Intent myIntent = new Intent(Main3Activity.this, Main4Activity.class);
                                    Bundle bundle = new Bundle();
                                    myIntent.putExtra("cb", cbChecked);
                                    myIntent.putExtra("rb", rbChecked);
                                    myIntent.putExtra("tv", tv);
                                    startActivity(myIntent);
                                }
                            }, 4000);
                        } else if (cbChecked >= 16) {
                            alertDialogYes.show();
                        }
                        break;
                    case 5:
                        if (rbChecked >= 4 || cbChecked <= 9) {
                            alertDialogNo.show();
                        } else if (cbChecked >= 10 && cbChecked <= 21) {
                            alertDialogMore.show();
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Intent myIntent = new Intent(Main3Activity.this, Main4Activity.class);
                                    Bundle bundle = new Bundle();
                                    myIntent.putExtra("cb", cbChecked);
                                    myIntent.putExtra("rb", rbChecked);
                                    myIntent.putExtra("tv", tv);
                                    startActivity(myIntent);
                                }
                            }, 4000);
                        } else if (cbChecked >= 22) {
                            alertDialogYes.show();
                        }
                        break;
                    case 7:
                        if (rbChecked >= 10 || cbChecked <= 25) {
                            alertDialogNo.show();
                        } else if (cbChecked >= 10 && cbChecked <= 21) {
                            alertDialogMore.show();
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Intent myIntent = new Intent(Main3Activity.this, Main4Activity.class);
                                    Bundle bundle = new Bundle();
                                    myIntent.putExtra("cb", cbChecked);
                                    myIntent.putExtra("rb", rbChecked);
                                    myIntent.putExtra("tv", tv);
                                    startActivity(myIntent);
                                }
                            }, 4000);
                        } else if (cbChecked >= 26) {
                            alertDialogYes.show();
                        }
                        break;
                    case 9:
                        if (rbChecked >= 4 || cbChecked <= 12) {
                            alertDialogNo.show();
                        } else if (cbChecked >= 13 && cbChecked <= 26) {
                            alertDialogMore.show();
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Intent myIntent = new Intent(Main3Activity.this, Main4Activity.class);
                                    Bundle bundle = new Bundle();
                                    myIntent.putExtra("cb", cbChecked);
                                    myIntent.putExtra("rb", rbChecked);
                                    myIntent.putExtra("tv", tv);
                                    startActivity(myIntent);
                                }
                            }, 4000);
                        } else if (cbChecked >= 27) {
                            alertDialogYes.show();
                        }
                        break;

                        }//switch closed
            }

        });

    }
}
