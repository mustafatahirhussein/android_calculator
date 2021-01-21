package net.mustafa.mid_prac_cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {


    TextView exp,result;
    Button c,div,open,close,seven,eight,nine,add,four,five,six,sub,one,two,three,mul,dot,zero,dbzero,eq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exp = findViewById(R.id.exp);
        result = findViewById(R.id.result);

        c = findViewById(R.id.clear);
        div = findViewById(R.id.div);
        open = findViewById(R.id.open);
        close = findViewById(R.id.close);
        seven = findViewById(R.id.seven);
        eight  = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        add = findViewById(R.id.add);
        four = findViewById(R.id.fout);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        sub = findViewById(R.id.sub);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        mul = findViewById(R.id.mul);
        dot = findViewById(R.id.dot);
        zero = findViewById(R.id.zero);
        dbzero = findViewById(R.id.dbzero);
        eq = findViewById(R.id.eq);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exp.setText(null);
                result.setText("0");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("/");
            }
        });

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("(");
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressions(")");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("+");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("6");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("-");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("3");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions(".");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("0");
            }
        });

        dbzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("00");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expressions("*");
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String expr = exp.getText().toString();
                result.setText("");

                Expression ex = new Expression(expr);
                expr = String.valueOf(ex.calculate());
                result.setText(expr);





            }
        });

    }

    public void expressions(String ex)
    {
        String expression = exp.getText().toString();
        expression+= ex;

        exp.setText(expression);
    }


}
