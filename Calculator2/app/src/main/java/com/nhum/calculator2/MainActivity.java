package com.nhum.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    long temp=0,num=0,num2=0,num3=0;
    double divnum = 0;
    int stage=0;
    boolean plus=false,min=false,div=false,mul=false;

    Button ButtonSubmit;
    Button ButtonReset;
    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;
    Button Button5;
    Button Button6;
    Button Button7;
    Button Button8;
    Button Button9;
    Button Button0;
    Button ButtonDel;
    Button ButtonPlus;
    Button ButtonMin;
    Button ButtonMul;
    Button ButtonDiv;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonSubmit = (Button)  findViewById(R.id.buttonSubmit);
        ButtonReset = (Button)  findViewById(R.id.buttonReset);
         Button1 = (Button) findViewById(R.id.button1);
         Button2 = (Button) findViewById(R.id.button2);
         Button3 = (Button) findViewById(R.id.button3);
         Button4 = (Button) findViewById(R.id.button4);
         Button5 = (Button) findViewById(R.id.button5);
         Button6 = (Button) findViewById(R.id.button6);
         Button7 = (Button) findViewById(R.id.button7);
         Button8 = (Button) findViewById(R.id.button8);
         Button9 = (Button) findViewById(R.id.button9);
         Button0 = (Button) findViewById(R.id.button0);
         ButtonDel = (Button) findViewById(R.id.buttonReset);
         ButtonPlus = (Button) findViewById(R.id.buttonPlus);
         ButtonMin = (Button) findViewById(R.id.buttonMin);
         ButtonMul = (Button) findViewById(R.id.buttonMul);
         ButtonDiv = (Button) findViewById(R.id.buttonDiv);
         tvOutput = (TextView) findViewById(R.id.tvOutput);


        Button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num<100000000&&stage==0) {
                    temp = 1;
                    num = (num * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num));
                }
                if(num2<100000000&&stage == 1){
                    temp = 1;
                    num2 = (num2 * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num2));
                }



            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num<100000000&&stage==0) {
                    temp = 2;
                    num = (num * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num));
                }
                if(num2<100000000&&stage == 1){
                    temp = 2;
                    num2 = (num2 * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num2));
                }



            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num<100000000&&stage==0) {
                    temp = 3;
                    num = (num * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num));
                }
                if(num2<100000000&&stage == 1){
                    temp = 3;
                    num2 = (num2 * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num2));
                }



            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num<100000000&&stage==0) {
                    temp = 4;
                    num = (num * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num));
                }
                if(num2<100000000&&stage == 1){
                    temp = 4;
                    num2 = (num2 * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num2));
                }



            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num<100000000&&stage == 0) {
                    temp = 5;
                    num = (num * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num));
                }
                if(num2<100000000&&stage == 1){
                    temp = 5;
                    num2 = (num2 * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num2));
                }



            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num<100000000&&stage==0) {
                    temp = 6;
                    num = (num * 10) + temp;
                    temp = 6;
                    tvOutput.setText(String.valueOf(num));
                }
                if(num2<100000000&&stage == 1){
                    temp = 6;
                    num2 = (num2 * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num2));
                }



            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num<100000000&&stage==0) {
                    temp = 7;
                    num = (num * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num));
                }
                if(num2<100000000&&stage == 1){
                    temp = 7;
                    num2 = (num2 * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num2));
                }



            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num<100000000&&stage==0) {
                    temp = 8;
                    num = (num * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num));
                }
                if(num2<100000000&&stage == 1){
                    temp = 8;
                    num2 = (num2 * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num2));
                }



            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num<100000000&&stage==0) {
                    temp = 9;
                    num = (num * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num));
                }
                if(num2<100000000&&stage == 1){
                    temp = 9;
                    num2 = (num2 * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num2));
                }



            }
        });
        Button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num<100000000&&stage==0) {
                    temp = 0;
                    num = (num * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num));
                }
                if(num2<100000000&&stage == 1){
                    temp = 0;
                    num2 = (num2 * 10) + temp;
                    temp = 0;
                    tvOutput.setText(String.valueOf(num2));
                }



            }
        });

        ButtonReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num = 0;
                num2 = 0;
                stage = 0;
                tvOutput.setText(String.valueOf(num));

            }
        });
        ButtonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(stage==0){
                    plus=true;
                    tvOutput.setText(" + ");
                    stage =1 ;
                }
                else if (stage ==1){
                    if(plus) {
                        tvOutput.setText(String.valueOf(num + num2));
                        plus=false;
                    }
                    if(min) {
                        tvOutput.setText(String.valueOf(num - num2));
                            min=false;
                    }
                    if(mul) {
                        tvOutput.setText(String.valueOf(num * num2));
                        mul=false;
                    }
                    if(div) {
                        double divtemp = (double)num / (double)num2;
                        tvOutput.setText(String.valueOf(divtemp));
                        div=false;
                    }
                    num=0;
                    num2=0;
                    stage = 0;
                }
            }
        });
        ButtonMin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(stage==0){
                    min=true;
                    tvOutput.setText(" - ");

                    stage =1 ;
                }
                else if (stage ==1){
                    if(plus) {
                        tvOutput.setText(String.valueOf(num + num2));
                        plus=false;
                    }
                    if(min) {
                        tvOutput.setText(String.valueOf(num - num2));
                        min=false;
                    }
                    if(mul) {
                        tvOutput.setText(String.valueOf(num * num2));
                        mul=false;
                    }
                    if(div) {
                        double divtemp = (double)num / (double)num2;
                        tvOutput.setText(String.valueOf(divtemp));
                        div=false;
                    }
                    num=0;
                    num2=0;
                    stage = 0;
                }
            }
        });
        ButtonDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(stage==0){
                    div=true;
                    tvOutput.setText(" / ");
                    stage =1 ;
                }
                else if (stage ==1){
                    if(plus) {
                        tvOutput.setText(String.valueOf(num + num2));
                        plus=false;
                    }
                    if(min) {
                        tvOutput.setText(String.valueOf(num - num2));
                        min=false;
                    }
                    if(mul) {
                        tvOutput.setText(String.valueOf(num * num2));
                        mul=false;
                    }
                    if(div) {
                        double divtemp = (double)num / (double)num2;
                        tvOutput.setText(String.valueOf(divtemp));
                        div=false;
                    }
                    num=0;
                    num2=0;
                    stage = 0;
                }
            }
        });
        ButtonMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(stage==0){
                    mul=true;
                    tvOutput.setText(" * ");
                    stage =1 ;
                }

                else if (stage ==1){
                    if(plus) {
                        tvOutput.setText(String.valueOf(num + num2));
                        plus=false;
                    }
                    if(min) {
                        tvOutput.setText(String.valueOf(num - num2));
                        min=false;
                    }
                    if(mul) {
                        tvOutput.setText(String.valueOf(num * num2));
                        mul=false;
                    }
                    if(div) {
                        double divtemp = (double)num / (double)num2;
                        tvOutput.setText(String.valueOf(divtemp));
                        div=false;
                    }
                    num=0;
                    num2=0;
                    stage = 0;
                }
            }
        });
        ButtonSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(plus) {
                    tvOutput.setText(String.valueOf(num + num2));
                    plus=false;
                }
                if(min) {
                    tvOutput.setText(String.valueOf(num - num2));
                    min=false;
                }
                if(mul) {
                    tvOutput.setText(String.valueOf(num * num2));
                    mul=false;
                }
                if(div) {
                    double divtemp = (double)num / (double)num2;
                    tvOutput.setText(String.valueOf(divtemp));
                    div=false;
                }
                else {
                    tvOutput.setText("0");
                }
                num=0;
                num2=0;
                stage = 0;
            }
        });


    }
}
