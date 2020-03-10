package saferatestarter.dasnr.okstate.edu.glanceandgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main9Activity extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        back = findViewById(R.id.button6);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Main9Activity.this, Main8Activity.class);
                startActivity(myIntent);
            }
        });
    }
}
