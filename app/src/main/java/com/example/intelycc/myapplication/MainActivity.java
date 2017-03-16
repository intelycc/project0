package com.example.intelycc.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int toastDuration = Toast.LENGTH_SHORT;
    Toast toast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        Button button = (Button)view;
        show(button.getText());
    }

    private void show(CharSequence text){
        if(toast == null){
            toast = Toast.makeText(this, "启动应用:"+ text, toastDuration);
        }else{
            toast.setText(text);
        }

        toast.show();
    }


}
