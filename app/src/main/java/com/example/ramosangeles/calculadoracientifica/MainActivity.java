package com.example.ramosangeles.calculadoracientifica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import bsh.Interpreter;
import java.lang.String;




public class MainActivity extends AppCompatActivity {

    private TextView consola;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnAC;
    private Button btnElimina;
    private Button btnPunto;
    private Button btnSuma;
    private Button btnAbre;
    private Button btnCierra;
    private Button btnIgual;
    private Button btnMenos;
    private Button btnDivision;
    private Button btnMultiplicacion;
    private Button btnSeno;
    private Button btnCoseno;
    private Button btnTangente;
    double valor1=0.0;
    double valor2=0.0;
    String valor="";
    String valor3="";

    ArrayList<String> expr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 =(Button)findViewById(R.id.button0);
        btn1 =(Button)findViewById(R.id.button1);
        btn2 =(Button)findViewById(R.id.button2);
        btn3 =(Button)findViewById(R.id.button3);
        btn4 =(Button)findViewById(R.id.button4);
        btn5 =(Button)findViewById(R.id.button5);
        btn6 =(Button)findViewById(R.id.button6);
        btn7 =(Button)findViewById(R.id.button7);
        btn8 =(Button)findViewById(R.id.button8);
        btn9 =(Button)findViewById(R.id.button9);
        btnElimina =(Button)findViewById(R.id.buttonReg);
        btnPunto =(Button)findViewById(R.id.buttonPun);
        btnAC =(Button)findViewById(R.id.buttonAC);
        btnAbre =(Button)findViewById(R.id.buttonAbre);
        btnCierra =(Button)findViewById(R.id.buttonCierra);
        btnSuma =(Button)findViewById(R.id.buttonMas);
        btnMenos =(Button)findViewById(R.id.buttonMenos);
        btnDivision =(Button)findViewById(R.id.botonDivision);
        btnIgual =(Button)findViewById(R.id.buttonIgual);
        btnMultiplicacion =(Button)findViewById(R.id.buttonMultiplicacion);
        btnSeno =(Button)findViewById(R.id.buttonSen);
        btnCoseno =(Button)findViewById(R.id.buttonCos);
        btnTangente =(Button)findViewById(R.id.buttonTan);
        consola = (TextView)findViewById(R.id.textview1);

        expr = new ArrayList<String>();

    }

    public void onClickReg (View view) {

        if (expr.isEmpty()){
            consola.setText("");
        }else {
            valor = consola.getText().toString();
            valor = valor.substring(0, valor.length() - 1);
            consola.setText(valor);
            expr.remove(expr.size() - 1);
        }

    }
    /*
    */
    public void boton0 (View view){
        expr.add(btn0.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }

    public void boton1 (View view){
        expr.add(btn1.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void boton2(View view){
        expr.add(btn2.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void boton3(View view){
        expr.add(btn3.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void boton4(View view){
        expr.add(btn4.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void boton5(View view){
        expr.add(btn5.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void boton6(View view){
        expr.add(btn6.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void boton7(View view){
        expr.add(btn7.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void boton8(View view){
        expr.add(btn8.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void boton9(View view){
        expr.add(btn9.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void botonAbre (View view){
        expr.add(btnAbre.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }


    public void botonCierra(View view){
        expr.add(btnCierra.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }



    public void botonMas(View view){
        expr.add(btnSuma.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void botonMenos(View view){
        expr.add(btnMenos.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void botonMultiplicacion(View view){
        expr.add(btnMultiplicacion.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void botonDivision(View view){
        expr.add(btnDivision.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);
        consola.setText(valor);
    }
    public void botonPun (View view){

        expr.add(btnPunto.getText().toString());
        String valor = "";
        for(int i =0; i<expr.size();i++)
            valor+=expr.get(i);

    }

    public void onClickBtnSen(View view){
        valor=consola.getText().toString();
        valor1=Double.parseDouble(valor);
        valor2=Math.toRadians(valor1);
        Math.sin(valor2);
        valor3=String.valueOf(valor2);
        consola.setText(valor3);

    }

    public void onClickBtnCos(View view){
        valor=consola.getText().toString();
        valor1=Double.parseDouble(valor);
        valor2=        Math.toRadians(valor1);
        Math.cos(valor2);
        valor3=String.valueOf(valor2);
        consola.setText(valor3);
    }


    public void onClickBtnTan(View view){

        valor=consola.getText().toString();
        valor1=Double.parseDouble(valor);
        valor2=        Math.toRadians(valor1);
        Math.tan(valor2);
        valor3=String.valueOf(valor2);
        consola.setText(valor3);
    }



    public void botonIgual(View view){

        Interpreter intrpt = new Interpreter();
        String valorTotal = "";

        for(int i =0; i<expr.size();i++)
            valorTotal+=expr.get(i);

        try {

            intrpt.eval("result ="+valorTotal);
            String resultado = intrpt.get("result").toString();
            consola.setText(resultado);
            expr.clear();
            expr.add(resultado);
        }catch (Exception e){
            System.err.println(e);
        }


    }
    public void onClickBtnAC(View view) {

        consola.setText("");
        expr.clear();
    }
}

