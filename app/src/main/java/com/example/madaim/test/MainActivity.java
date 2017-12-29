package com.example.madaim.test;

import   android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    static int cnt=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new HandleClick());
        findViewById(R.id.button2).setOnClickListener(handleClick);
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                Button btn = (Button)arg0;
                TextView tv = (TextView) findViewById(R.id.text);
                cnt++;
                tv.setText(Integer.toString(cnt));
            }
        });
        findViewById(R.id.button4).setOnClickListener((View.OnClickListener) this);
    }

    private class HandleClick implements View.OnClickListener {
        public void onClick(View arg0) {
            Button btn = (Button)arg0;	//cast view to a button
            // get a reference to the TextView
            TextView tv = (TextView) findViewById(R.id.text);
            // update the TextView text
            cnt++;
            tv.setText(Integer.toString(cnt));

        }
    }

    private View.OnClickListener handleClick = new View.OnClickListener(){
        public void onClick(View arg0) {
            Button btn = (Button)arg0;
            TextView tv = (TextView) findViewById(R.id.text);
            cnt++;
            tv.setText(Integer.toString(cnt));
        }
    };
    public void onClick(View arg0) {
        Button btn = (Button)arg0;
        TextView tv = (TextView) findViewById(R.id.text);
        cnt++;
        tv.setText(Integer.toString(cnt));
    }
}




