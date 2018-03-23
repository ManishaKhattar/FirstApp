package com.example.manishakhattar.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    int count = 0;
    Button button1, button2;
    int op1, op2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

//         textView = (TextView)findViewById(R.id.textview);
//        textView.setText("Sample Text !!!");
//
//         button1 = findViewById(R.id.button);
//         button2 =findViewById(R.id.button2);
//        button1.setOnClickListener(this);
//        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.button1){
//            count++;
//            textView.setText(count + "");
            textView.setText("1");

        }else if(view.getId() == R.id.plus){

            String text = textView.getText().toString();
            op1 = Integer.parseInt(text);
//            if(button.isEnabled()) {
//                button.setEnabled(false);
//            }else{
//                button.setEnabled(true);
//            }

        }

//        TextView textView = findViewById(R.id.textview);
//        textView.setText("Abcd");
//        textView.setText(1+"");
        //Toast.makeText(this, "Button Clicked !!",Toast.LENGTH_SHORT).show();

    }
}
