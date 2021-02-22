package com.arbind.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button zeroBtn, oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn, addBtn, multiplyBtn, divideBtn, subtractBtn, percentBtn, cBtn, equalBtn, dotBtn;
    ImageButton clrBtn;
    TextView textView, resultTextView;
    String op;
    char opSy;

    public String equalFunction(){
        String str = textView.getText().toString();
        int len = str.length();
        if(len==0){

        }
        else if(str.indexOf(opSy)<0){

        }
        else if(str.indexOf(opSy)==(len-1)){

        }
        else{
            int pos = str.indexOf(opSy);
            int dotpos = str.indexOf('.');
            String str1 = str.substring(0, pos);
            String str2 = str.substring(pos+1, len);
            double num1 = Double.parseDouble(str1);
            double num2 = Double.parseDouble(str2);



            if(opSy=='-'){

                double result1;
                String resultstr1;
                result1 = num1-num2;
                resultstr1 = Double.toString(result1);
                if(dotpos<0&&result1<Integer.MAX_VALUE&&result1>Integer.MIN_VALUE){
                    String str4 = numWithoutDot(resultstr1);
                    //textView.setText(numWithoutDot(str4));
                    return numWithoutDot(str4);
                }
                else{
                    //textView.setText(resultstr1);
                    return resultstr1;
                }

            }
            else if(opSy=='+'){
                double result;
                String resultstr;
                result = num1+num2;
                resultstr = Double.toString(result);

                if(dotpos<0&&result<Integer.MAX_VALUE&&result>Integer.MIN_VALUE){
                    String str4 = numWithoutDot(resultstr);
                    //textView.setText(numWithoutDot(str4));
                    return numWithoutDot(str4);
                }
                else{
                    //textView.setText(resultstr);
                    return resultstr;
                }
            }
            else if(opSy=='x'){
                double result2;
                String resultstr2;
                result2 = num1*num2;
                resultstr2 = Double.toString(result2);
                if(dotpos<0&&result2<Integer.MAX_VALUE&&result2>Integer.MIN_VALUE){
                    String str4 = numWithoutDot(resultstr2);
                    //textView.setText(numWithoutDot(str4));
                    return numWithoutDot(str4);
                }
                else{
                    //textView.setText(resultstr2);
                    return resultstr2;
                }
            }
            else if(opSy=='/'){
                double result3;
                String resultstr3;
                result3 = (double)num1/num2;
                resultstr3 = Double.toString(result3);


                //textView.setText(resultstr3);
                return resultstr3;


            }

            else if(opSy=='%'){
                double result4;
                String resultstr4;
                result4 = (double)(num1/num2)*100;
                resultstr4 = Double.toString(result4);


                //textView.setText(resultstr4);
                return resultstr4;

            }
        }
        return null;
    }

    public String numWithoutDot(String str2){
        double dou1 = Double.parseDouble(str2);
        int num = (int) dou1;
        return Integer.toString(num);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zeroBtn = findViewById(R.id.zero);
        oneBtn = findViewById(R.id.one);
        twoBtn = findViewById(R.id.two);
        threeBtn = findViewById(R.id.three);
        fourBtn = findViewById(R.id.four);
        fiveBtn = findViewById(R.id.five);
        sixBtn = findViewById(R.id.six);
        sevenBtn = findViewById(R.id.seven);
        eightBtn = findViewById(R.id.eight);
        nineBtn = findViewById(R.id.nine);
        dotBtn = findViewById(R.id.point);
        resultTextView  =findViewById(R.id.result_tv);

        cBtn = findViewById(R.id.c);
        equalBtn = findViewById(R.id.equal);
        addBtn = findViewById(R.id.add);
        subtractBtn = findViewById(R.id.minus);
        multiplyBtn = findViewById(R.id.multi);
        divideBtn = findViewById(R.id.divide);
        clrBtn = findViewById(R.id.back);
        percentBtn = findViewById(R.id.percent);

        textView = findViewById(R.id.textview);
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+"0");
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+"1");
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+"2");
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+"3");
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+"4");
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+"5");
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+"6");
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+"7");
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+"8");
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+"9");
            }
        });
        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });

        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString()+".");
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                int len = str.length();
                int indexOfPlus = str.indexOf('+');
                int indexOfMinus = str.indexOf('-');
                int indexOfMultiply = str.indexOf('x');
                int indexOfDivid = str.indexOf('/');
                int indexOfPercent = str.indexOf('%');
                if(str.length()==0){

                }
                else if(str.charAt(len-1)=='+'||str.charAt(len-1)=='-'||str.charAt(len-1)=='x'||str.charAt(len-1)=='/'||str.charAt(len-1)=='%'){
                    textView.setText(str.substring(0, len-1)+"+");
                    op = "add";
                    opSy='+';
                }
                else if(indexOfPlus>0||indexOfMinus>0||indexOfMultiply>0||indexOfDivid>0||indexOfPercent>0){
                    String retVal = equalFunction();
                    textView.setText(retVal+"+");
                    op = "add";
                    opSy = '+';

                }
                else{
                    textView.setText(textView.getText().toString()+"+");
                    op = "add";
                    opSy = '+';
                }

            }
        });

        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                int len = str.length();
                int indexOfPlus = str.indexOf('+');
                int indexOfMinus = str.indexOf('-');
                int indexOfMultiply = str.indexOf('x');
                int indexOfDivid = str.indexOf('/');
                int indexOfPercent = str.indexOf('%');
                if(str.length()==0){

                }
                else if(str.charAt(len-1)=='+'||str.charAt(len-1)=='-'||str.charAt(len-1)=='x'||str.charAt(len-1)=='/'||str.charAt(len-1)=='%'){
                    textView.setText(str.substring(0, len-1)+"-");
                    op = "sub";
                    opSy = '-';
                }
                else if(indexOfPlus>0||indexOfMinus>0||indexOfMultiply>0||indexOfDivid>0||indexOfPercent>0){
                    String retVal = equalFunction();
                    textView.setText(retVal+"-");
                    op = "sub";
                    opSy = '-';

                }
                else{
                    textView.setText(textView.getText().toString()+"-");
                    op = "sub";
                    opSy = '-';
                }

            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                int len = str.length();
                int indexOfPlus = str.indexOf('+');
                int indexOfMinus = str.indexOf('-');
                int indexOfMultiply = str.indexOf('x');
                int indexOfDivid = str.indexOf('/');
                int indexOfPercent = str.indexOf('%');
                if(str.length()==0){

                }
                else if(str.charAt(len-1)=='+'||str.charAt(len-1)=='-'||str.charAt(len-1)=='x'||str.charAt(len-1)=='/'||str.charAt(len-1)=='%'){
                    textView.setText(str.substring(0, len-1)+"x");
                    op = "mul";
                    opSy = 'x';
                }
                else if(indexOfPlus>0||indexOfMinus>0||indexOfMultiply>0||indexOfDivid>0||indexOfPercent>0){
                    String retVal = equalFunction();
                    textView.setText(retVal+"x");
                    op = "mul";
                    opSy = 'x';

                }
                else{
                    textView.setText(textView.getText().toString()+"x");
                    op = "mul";
                    opSy = 'x';
                }

            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                int len = str.length();
                int indexOfPlus = str.indexOf('+');
                int indexOfMinus = str.indexOf('-');
                int indexOfMultiply = str.indexOf('x');
                int indexOfDivid = str.indexOf('/');
                int indexOfPercent = str.indexOf('%');
                if(str.length()==0){

                }
                else if(str.charAt(len-1)=='+'||str.charAt(len-1)=='-'||str.charAt(len-1)=='x'||str.charAt(len-1)=='/'||str.charAt(len-1)=='%'){
                    textView.setText(str.substring(0, len-1)+"/");
                    op = "div";
                    opSy = '/';
                }
                else if(indexOfPlus>0||indexOfMinus>0||indexOfMultiply>0||indexOfDivid>0||indexOfPercent>0){
                    String retVal = equalFunction();
                    textView.setText(retVal+"/");
                    op = "div";
                    opSy = '/';

                }
                else{
                    textView.setText(textView.getText().toString()+"/");
                    op = "div";
                    opSy = '/';
                }

            }
        });

        clrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = textView.getText().toString();
                int len = str.length();
                if(len<1){

                }
                else{
                    textView.setText(str.substring(0, len-1));
                }

            }
        });

        percentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();

                int len = str.length();
                int indexOfPlus = str.indexOf('+');
                int indexOfMinus = str.indexOf('-');
                int indexOfMultiply = str.indexOf('x');
                int indexOfDivid = str.indexOf('/');
                int indexOfPercent = str.indexOf('%');
                if(str.length()==0){

                }
                else if(str.charAt(len-1)=='+'||str.charAt(len-1)=='-'||str.charAt(len-1)=='x'||str.charAt(len-1)=='/'||str.charAt(len-1)=='%'){
                    textView.setText(str.substring(0, len-1)+"%");
                    op = "per";
                    opSy = '%';
                }
                else if(indexOfPlus>0||indexOfMinus>0||indexOfMultiply>0||indexOfDivid>0||indexOfPercent>0){
                    String retVal = equalFunction();
                    textView.setText(retVal+"%");
                    op = "per";
                    opSy = '%';

                }
                else{
                    textView.setText(textView.getText().toString()+"%");
                    op = "per";
                    opSy = '%';
                }
            }
        });

        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = textView.getText().toString();
                int len = str.length();
                if(len==0){

                }
                else if(str.indexOf(opSy)<0){

                }
                else if(str.indexOf(opSy)==(len-1)){

                }
                else{
                    int pos = str.indexOf(opSy);
                    int dotpos = str.indexOf('.');
                    String str1 = str.substring(0, pos);
                    String str2 = str.substring(pos+1, len);
                    double num1 = Double.parseDouble(str1);
                    double num2 = Double.parseDouble(str2);



                    if(opSy=='-'){

                        double result1;
                        String resultstr1;
                        result1 = num1-num2;
                        resultstr1 = Double.toString(result1);
                        if(dotpos<0&&result1<Integer.MAX_VALUE&&result1>Integer.MIN_VALUE){
                            String str4 = numWithoutDot(resultstr1);
                            textView.setText(numWithoutDot(str4));
                            resultTextView.setText("="+numWithoutDot(str4));
                        }
                        else{
                            textView.setText(resultstr1);
                            resultTextView.setText("="+resultstr1);
                        }

                    }
                    else if(opSy=='+'){
                        double result;
                        String resultstr;
                        result = num1+num2;
                        resultstr = Double.toString(result);

                        if(dotpos<0&&result<Integer.MAX_VALUE&&result>Integer.MIN_VALUE){
                            String str4 = numWithoutDot(resultstr);
                            textView.setText(numWithoutDot(str4));
                            resultTextView.setText("="+numWithoutDot(str4));
                        }
                        else{
                            textView.setText(resultstr);
                            resultTextView.setText("="+resultstr);
                        }
                    }
                    else if(opSy=='x'){
                        double result2;
                        String resultstr2;
                        result2 = num1*num2;
                        resultstr2 = Double.toString(result2);
                        if(dotpos<0&&result2<Integer.MAX_VALUE&&result2>Integer.MIN_VALUE){
                            String str4 = numWithoutDot(resultstr2);
                            textView.setText(numWithoutDot(str4));
                            resultTextView.setText("="+numWithoutDot(str4));
                        }
                        else{
                            textView.setText(resultstr2);
                            resultTextView.setText("="+resultstr2);
                        }
                    }
                    else if(opSy=='/'){
                        double result3;
                        String resultstr3;
                        result3 = (double)num1/num2;
                        resultstr3 = Double.toString(result3);


                        textView.setText(resultstr3);
                        resultTextView.setText("="+resultstr3);


                    }

                    else if(opSy=='%'){
                        double result4;
                        String resultstr4;
                        result4 = (double)(num1/num2)*100;
                        resultstr4 = Double.toString(result4);


                        textView.setText(resultstr4);
                        resultTextView.setText("="+resultstr4);

                    }

                    else{

                    }
                }
            }
        });
    }
}