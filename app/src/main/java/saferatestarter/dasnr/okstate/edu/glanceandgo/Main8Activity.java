package saferatestarter.dasnr.okstate.edu.glanceandgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {
    Button start;
    Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        start = findViewById(R.id.button4);
        help = findViewById(R.id.button5);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Main8Activity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent myIntent = new Intent(Main8Activity.this, Main9Activity.class);
            startActivity(myIntent);
            }
        });
    }
}
