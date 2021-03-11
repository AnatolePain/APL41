package com.example.apl41;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tp06_ex01_01 implements View.OnClickListener {

    private TextView textView;
    private String adn;

    public Tp06_ex01_01(TextView tv){
        this.textView = tv;
        this.adn = "";
    }

    @Override
    public void onClick(View v) {
        Button b = (Button)v;
        this.adn = this.adn + b.getText();
        textView.setText(this.adn);
        Log.d("TEST","button : " + b.getText());
    }
}
