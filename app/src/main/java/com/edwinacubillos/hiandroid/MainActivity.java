package com.edwinacubillos.hiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         eTo = (EditText) findViewById(R.id.eTo);
        final EditText eSubject = (EditText) findViewById(R.id.eSubject);
        final EditText eMessage = (EditText) findViewById(R.id.eMessage);
        Button bSend = (Button) findViewById(R.id.bSend);

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //String to, subject, message;
                double to, subject, message;

           /*     to = String.valueOf(eTo.getText());
                subject = String.valueOf(eSubject.getText());
                message = to +" y "+ subject;
                eMessage.setText(message);*/

                to = Double.parseDouble(eTo.getText().toString());
                subject = Double.parseDouble(eSubject.getText().toString());
                message = to * subject;
                eMessage.setText(String.valueOf(message));
            }
        });

    }


}
