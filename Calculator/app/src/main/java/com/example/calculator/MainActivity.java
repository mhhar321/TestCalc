package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String p = "";
    Double temp = 0.0;
    String sign = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText1 = findViewById(R.id.editText);

        final Button button_10 = findViewById(R.id.button10);

        button_10.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p += button_10.getText(); editText1.setText(p); }});
        final Button button_2 = findViewById(R.id.button2);

        button_2.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p += button_2.getText(); editText1.setText(p); }});
        final Button button_3 = findViewById(R.id.button3);

        button_3.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p += button_3.getText(); editText1.setText(p); }});
        final Button button_13 = findViewById(R.id.button13);

        button_13.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p += button_13.getText(); editText1.setText(p); }});
        final Button button_6 = findViewById(R.id.button6);

        button_6.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p += button_6.getText(); editText1.setText(p); }});
        final Button button_5 = findViewById(R.id.button5);

        button_5.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p += button_5.getText(); editText1.setText(p); }});
        final Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p += button.getText(); editText1.setText(p); }});
        final Button button_9 = findViewById(R.id.button9);

        button_9.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p += button_9.getText(); editText1.setText(p); }});
        final Button button_8 = findViewById(R.id.button8);

        button_8.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p += button_8.getText(); editText1.setText(p); }});
        final Button button_12 = findViewById(R.id.button12);

        button_12.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p += button_12.getText(); editText1.setText(p); }});

final Button button_7 = findViewById(R.id.button7);
        button_7.setOnClickListener(new View.OnClickListener() { public void onClick(View view){p = ""; editText1.setText(p); }});

        final Button button_14 = findViewById(R.id.button14);
        button_14.setOnClickListener(new View.OnClickListener() { public void onClick(View view){temp = Double.parseDouble(editText1.getText().toString()); p = ""; editText1.setText(p); sign = "-";}});

        final Button button_15 = findViewById(R.id.button15);
        button_15.setOnClickListener(new View.OnClickListener() { public void onClick(View view){temp = Double.parseDouble(editText1.getText().toString()); p = ""; editText1.setText(p); sign = "+"; }});

        final Button button_16 = findViewById(R.id.button16);
        button_16.setOnClickListener(new View.OnClickListener() { public void onClick(View view){temp = Double.parseDouble(editText1.getText().toString()); p = ""; editText1.setText(p); sign = "/"; }});
        final Button button_18 = findViewById(R.id.button18);
        button_18.setOnClickListener(new View.OnClickListener() { public void onClick(View view){temp = Double.parseDouble(editText1.getText().toString()); p = ""; editText1.setText(p); sign = "*"; }});

        final Button button_11 = findViewById(R.id.button11);
        button_11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {Double t2 = Double.parseDouble(editText1.getText().toString());
            switch (sign){
                case "+" : p = Double.toString( temp + t2);temp += t2;
             break;
             case "-": p = Double.toString(temp - t2);temp -= t2;
             break;
                case "*": p = Double.toString(temp*t2); temp *= t2;
                    break;
                case "/": p = Double.toString(temp/t2); temp /= t2;
                    break;}
            editText1.setText(p); }});

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
