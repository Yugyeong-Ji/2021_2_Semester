package com.example.mainapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener
        (new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                    TextView t = (TextView) findViewById(R.id.textView);
                    t.setText("Cliked");
                }
            }
        );
    }
}
