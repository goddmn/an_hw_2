package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private Button forward;
    private EditText name;
    private EditText lastName;
    private EditText thirdName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forward = (Button) findViewById(R.id.nextButton);
        name = (EditText) findViewById(R.id.name);
        lastName = (EditText) findViewById(R.id.lastname);
        thirdName = (EditText) findViewById(R.id.thirdname);
    }

    public void goNewView(View v){
        switch (v.getId()) {
            case R.id.nextButton:
                Intent intent = new Intent(this, SecondActivity.class);

                intent.putExtra("name", name.getText().toString());
                intent.putExtra("lastname", lastName.getText().toString());
                intent.putExtra("thirdname", thirdName.getText().toString());

                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void newShare(View view) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("plain/text");
        intent.putExtra("android.intent.extra.TEXT", "текст");
        startActivity(Intent.createChooser(intent, "Поделится ^-^"));
    }

}