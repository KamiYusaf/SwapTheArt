package com.example.kamranyusaf.swaptheart;

/**
 * Created by kamranyusaf on 12/05/15.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.ibrahim.swapart1.R;

public class Logind extends Activity implements OnClickListener {

    Button logindButton;
    EditText userText, kodeText;//vvjv


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_ind);

        logindButton =(Button)findViewById(R.id.logIndbutton);
        userText = (EditText)findViewById(R.id.userText);
        kodeText = (EditText)findViewById(R.id.kodeText);
        logindButton.setOnClickListener(this);//kjahfk



    }


    @Override
    public void onClick(View v) {
        if(true){
            System.out.println("Hi");//ghjagfd

        }


    }
}
