package com.example.m.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.EventListener;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity implements EventListener {


    float numberOne , numberTwo, gold ;

    boolean isAddition , isSubtract ,isMultiplication ,isDivision, isModulo, isOperation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonZero = findViewById(R.id.buttonZero);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonComa = findViewById(R.id.buttonComa);
        Button buttonC = findViewById(R.id.buttonC);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonCE = findViewById(R.id.buttonCE);
        Button buttonMod = findViewById(R.id.buttonF1);
        Button buttonGold = findViewById(R.id.buttonF2);
        final EditText editor = findViewById(R.id.myResult);

        buttonZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editor.setText(editor.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isOperation){
                editor.setText("1");
                isOperation = false;
            }
                else{
                editor.setText(editor.getText()+"1");
            }}
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isOperation){
                    editor.setText("2");
                    isOperation = false;
                }
                else{
                editor.setText(editor.getText()+"2");
            }}
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isOperation){
                    editor.setText("3");
                    isOperation = false;
                }
                else{
                    editor.setText(editor.getText()+"3");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isOperation){
                    editor.setText("4");
                    isOperation = false;
                }
                else{
                    editor.setText(editor.getText()+"4");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isOperation){
                    editor.setText("5");
                    isOperation = false;
                }
                else{
                    editor.setText(editor.getText()+"5");
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isOperation){
                    editor.setText("6");
                    isOperation = false;
                }
                else{
                    editor.setText(editor.getText()+"6");
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isOperation){
                    editor.setText("7");
                    isOperation = false;
                }
                else{
                    editor.setText(editor.getText()+"7");
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isOperation){
                    editor.setText("8");
                    isOperation = false;
                }
                else{
                    editor.setText(editor.getText()+"8");
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isOperation){
                    editor.setText("9");
                    isOperation = false;
                }
                else{
                    editor.setText(editor.getText()+"9");
                }
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editor == null){
                    editor.setText("");
                }else {
                    numberOne = Float.parseFloat(editor.getText() + "");
                    isAddition = true;
                    isOperation = true;
                    editor.setText("+");
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Float.parseFloat(editor.getText() + "");
                isSubtract = true ;
                isOperation = true;
                editor.setText("-");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Float.parseFloat(editor.getText() + "");
                isMultiplication = true ;
                isOperation = true;
                editor.setText("*");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Float.parseFloat(editor.getText()+"");
                isDivision = true ;
                isOperation = true;
                editor.setText("/");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberTwo = Float.parseFloat(editor.getText() + "");

                if (isAddition == true){

                    editor.setText(numberOne + numberTwo +"");
                    isAddition=false;
                }


                if (isSubtract == true){
                    editor.setText(numberOne - numberTwo+"");
                    isSubtract=false;
                }

                if (isMultiplication == true){
                    editor.setText(numberOne * numberTwo+"");
                    isMultiplication=false;
                }

                if (isDivision == true){
                    editor.setText(numberOne / numberTwo+"");
                    isDivision=false;
                }

                if(isModulo == true){
                    editor.setText(numberOne % numberTwo+ "");
                    isModulo = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable numbers = editor.getText();
                int length = numbers.length();
                if(length > 0){
                   numbers.delete(length-1,length);
                }
            }
        });

        buttonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+".");
            }
        });

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText("");
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Float.parseFloat(editor.getText() + "");
                isModulo = true ;
                isOperation = true;
                editor.setText("%");
            }
        });

        buttonGold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Float.parseFloat(editor.getText()+"");
                gold = (numberOne + (float) sqrt((numberOne*numberOne +4)))/2;
                editor.setText(gold+"");
            }
        });
    }







}
