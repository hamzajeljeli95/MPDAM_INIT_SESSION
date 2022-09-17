package tn.hamzajeljeli.mpdamfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.myLabel);
        b = findViewById(R.id.mybutton);
        final int[] i = {0};
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i[0]++;
                t.setText(String.valueOf(i[0]));
            }
        });
    }
}