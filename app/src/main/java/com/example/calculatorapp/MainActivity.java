package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnequal,btnpoint,btnadd,btnsub,btnmul,btndiv;
    TextView text;
    Float input1,input2;
    boolean Addition,Subtraction,Multiply,Division,Decimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btn0=(Button)findViewById(R.id.button0);
        btnequal=(Button)findViewById(R.id.buttonequal);
        btnpoint=(Button)findViewById(R.id.buttonpoint);
        btnadd=(Button)findViewById(R.id.buttonadd);
        btnsub=(Button)findViewById(R.id.buttonsub);
        btnmul=(Button)findViewById(R.id.buttonmul);
        btndiv=(Button)findViewById(R.id.buttondiv);
        text=(TextView)findViewById(R.id.text);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            text.setText(text.getText().toString()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText().toString()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText().toString()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText().toString()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText().toString()+"0");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.getText().length()!= 0) {
                    input1 = Float.parseFloat(text.getText() + "");
                    Addition = true;
                    Decimal=false;
                    text.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.getText().length()!= 0) {
                    input1 = Float.parseFloat(text.getText() + "");
                    Subtraction= true;
                    Decimal=false;
                    text.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.getText().length()!= 0) {
                    input1 = Float.parseFloat(text.getText() + "");
                     Multiply = true;
                    Decimal=false;
                    text.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.getText().length()!= 0) {
                     input1 = Float.parseFloat(text.getText() + "");
                     Division = true;
                    Decimal=false;
                    text.setText(null);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Addition || Subtraction || Multiply || Division) {
                    input2 = Float.parseFloat(text.getText() + "");}


                if (Addition) {

                    text.setText(input1+input2 + "");

                    Addition = false;
                }

                if (Subtraction) {

                    text.setText(input1-input2 + "");

                    Subtraction = false;
                }

                if (Multiply) {
                    text.setText(input1*input2 + "");

                    Multiply = false;
                }

                if (Division) {
                    text.setText(input1/input2 + "");
                    Division = false;
                }

        }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Decimal) {
                    //do nothing or you can show the error
                } else {
                    text.setText(text.getText()+".");
                    Decimal = true;
                }

            }
        });

    }
}
