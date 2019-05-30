package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class SecondActivity extends Activity {

    private Button back;
    private TextView name;
    private TextView lastName;
    private TextView thirdName;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        back = (Button) findViewById(R.id.back_button);
        name = (TextView) findViewById(R.id.nametxt);
        lastName = (TextView) findViewById(R.id.lastnametxt);
        thirdName = (TextView) findViewById(R.id.thirdnametxt);

        String txtName = getIntent().getStringExtra("name");

        String txtLastname = getIntent().getStringExtra("lastname");

        String txtThirdname = getIntent().getStringExtra("thirdname");

        name.setText(name.getText().toString() + " " + txtName);

        lastName.setText(lastName.getText().toString() + " " + txtLastname);

        thirdName.setText(thirdName.getText().toString() + " " + txtThirdname);
    }

    public void backButton(View v){
        switch (v.getId()) {
            case R.id.back_button:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}