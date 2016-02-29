package com.cloudcentrk.basicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BasicReverseName extends AppCompatActivity {

    EditText txtName;
    Button btnDisplay;
    TextView txtReverse;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_reverse_name);

        txtName = (EditText) findViewById(R.id.editText);
        btnDisplay = (Button) findViewById(R.id.button);
        txtReverse = (TextView) findViewById(R.id.result_txt);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = txtName.getText().toString();
                String reStr = ReverseName.reversString(str);
                Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
                msg.show();
                txtReverse.setText(reStr);

            }
        });





        //txtName =
    }
}
