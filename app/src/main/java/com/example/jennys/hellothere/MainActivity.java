package com.example.jennys.hellothere;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.textColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));
            }
        });

        findViewById(R.id.bgColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((RelativeLayout) findViewById(R.id.rootView)).setBackgroundColor(
                        getResources().getColor(R.color.pastelPink));
            }
        });

        findViewById(R.id.textButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Linh");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }

            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.white));

                ((RelativeLayout) findViewById(R.id.rootView)).setBackgroundColor(
                        getResources().getColor(R.color.pastelBlue));

                ((TextView) findViewById(R.id.textView)).setText("Hello from Linh");

            }
        });

    }

}