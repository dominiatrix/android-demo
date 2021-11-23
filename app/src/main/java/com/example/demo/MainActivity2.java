package dominiatrix.demo;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0;
    Button button1,button2;
    Button button3,button4;
    Button button5,button6;
    Button button7,button8;
    Button button9,buttonaddition;
    Button buttonsoustraction,buttondivision;
    Button buttonmultiplication;
    Button buttonreset,buttonegal,buttonvirgule;
    Button buttonsuppr;
    Button buttonpourcent;

    EditText rendu;

    private double chiffre1;
    private boolean clickoperateur = false;
    private boolean screenempty = false;
    private String operateur = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button0 = (Button) findViewById(R.id.button0);
        this.button1 = (Button) findViewById(R.id.button1);
        this.button2 = (Button) findViewById(R.id.button2);
        this.button3 = (Button) findViewById(R.id.button3);
        this.button4 = (Button) findViewById(R.id.button4);
        this.button5 = (Button) findViewById(R.id.button5);
        this.button6 = (Button) findViewById(R.id.button6);
        this.button7 = (Button) findViewById(R.id.button7);
        this.button8 = (Button) findViewById(R.id.button8);
        this.button9 = (Button) findViewById(R.id.button9);
        this.buttonpourcent =   (Button) findViewById(R.id.buttonpourcent);
        this.buttonaddition = (Button) findViewById(R.id.buttonaddition);
        this.buttonsoustraction = (Button) findViewById(R.id.buttonsoustraction);
        this.buttondivision = (Button) findViewById(R.id.buttondivision);
        this.buttonmultiplication = (Button) findViewById(R.id.buttonmultiplication);
        this.buttonreset = (Button) findViewById(R.id.buttonreset);
        this.buttonegal = (Button) findViewById(R.id.buttonegal);
        this.buttonvirgule = (Button) findViewById(R.id.buttonvirgule);
        this.buttonsuppr = (Button) findViewById(R.id.buttonsuppr);
        this.rendu = (EditText) findViewById(R.id.rendu);

        button0.setBackgroundColor(Color.BLACK);
        button1.setBackgroundColor(Color.BLACK);
        button2.setBackgroundColor(Color.BLACK);
        button3.setBackgroundColor(Color.BLACK);
        button4.setBackgroundColor(Color.BLACK);
        button5.setBackgroundColor(Color.BLACK);
        button6.setBackgroundColor(Color.BLACK);
        button7.setBackgroundColor(Color.BLACK);
        button8.setBackgroundColor(Color.BLACK);
        button9.setBackgroundColor(Color.BLACK);

        
        buttonreset.setTextColor(Color.BLUE);

        buttonsuppr.setBackgroundColor(Color.BLACK);
        buttonsuppr.setTextColor(Color.BLUE);

        buttonvirgule.setBackgroundColor(Color.BLACK);
        buttonpourcent.setBackgroundColor(Color.BLACK);
        buttondivision.setBackgroundColor(Color.BLACK);
        buttondivision.setTextColor(Color.BLUE);

        buttonmultiplication.setBackgroundColor(Color.BLACK);
        buttonmultiplication.setTextColor(Color.BLUE);

        buttonsoustraction.setBackgroundColor(Color.BLACK);
        buttonsoustraction.setTextColor(Color.BLUE);

        buttonaddition.setBackgroundColor(Color.BLACK);
        buttonaddition.setTextColor(Color.BLUE);

        buttonegal.setBackgroundColor(Color.BLUE);




        buttonsuppr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               rendu.getText();
                String str;
                str = String.valueOf(rendu.getText());
                ;
                str = str.substring(0, str.length()-1);
                rendu.setText(str);
            }
        });


        buttonaddition.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickAddition();
                rendu.setText("+");

            }
        });
        buttonsoustraction.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickSoustraction();
                rendu.setText("-");

            }
        });
        buttonpourcent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickPourcent();
                rendu.setText("%");

            }
        });
        buttonmultiplication.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickMultiplication();
                rendu.setText("x");
            }
        });
        buttondivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickDivision();
                rendu.setText("/");
            }
        });
        buttonvirgule.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickChiffre(".");

            }
        });
        buttonreset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickReset();
            }
        });
        buttonegal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickEgal();
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickChiffre("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickChiffre("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickChiffre("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickChiffre("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickChiffre("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickChiffre("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
             ClickChiffre("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickChiffre("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickChiffre("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                ClickChiffre("9");
            }
        });
        buttonpourcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void ClickPourcent() {
        if(clickoperateur){
            calcul();
            rendu.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(rendu.getText().toString()).doubleValue();
            clickoperateur = true;
        }
        operateur = "%";
        screenempty = true;
    }

    private void ClickDivision() {


        if(clickoperateur){
            calcul();
            rendu.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(rendu.getText().toString()).doubleValue();
            clickoperateur = true;
        }
        operateur = "/";
        screenempty = true;
    }

    private void ClickReset() {

            clickoperateur = false;
            screenempty = true;
            chiffre1 = 0;
            operateur = "";
            rendu.setText("0");
    }

    private void ClickMultiplication() {

        if(clickoperateur){
            calcul();
            rendu.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(rendu.getText().toString()).doubleValue();
            clickoperateur = true;
        }
        operateur = "*";
        screenempty = true;
    }



    private void ClickSoustraction() {

        if(clickoperateur){

            calcul();
            rendu.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(rendu.getText().toString()).doubleValue();
            clickoperateur = true;
        }
        operateur = "-";
        screenempty = true;
    }

    private void ClickAddition() {

        if(clickoperateur){
            calcul();
            rendu.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(rendu.getText().toString()).doubleValue();
            clickoperateur = true;
        }
        operateur = "+";
        screenempty = true;
    }

    private void calcul() {
        if(operateur.equals("+")){
            chiffre1 = chiffre1 +
                    Double.valueOf(rendu.getText().toString()).doubleValue();
            rendu.setText(String.valueOf(chiffre1));
        }
        if(operateur.equals("-")){
            chiffre1 = chiffre1 -
                    Double.valueOf(rendu.getText().toString()).doubleValue();
            rendu.setText(String.valueOf(chiffre1));
        }
        if(operateur.equals("%")){
            chiffre1 = chiffre1 / 100;
                    rendu.setText(String.valueOf(chiffre1));

        }
        if(operateur.equals("*")){
            chiffre1 = chiffre1 *
                    Double.valueOf(rendu.getText().toString()).doubleValue();
            rendu.setText(String.valueOf(chiffre1));
        }
        if(operateur.equals("/")){
            try{
                chiffre1 = chiffre1 /
                        Double.valueOf(rendu.getText().toString()).doubleValue();
                rendu.setText(String.valueOf(chiffre1));
            }catch(ArithmeticException e){
                rendu.setText("0");
            }
        }
    }



    private void ClickEgal(){
        calcul();
        screenempty = true;
        clickoperateur = false;
    }


    private void ClickChiffre(String s) {

        if(screenempty){
            screenempty = false;
        }else{
            if(!rendu.getText().equals("0"))
                s = rendu.getText() + s;
        }
        rendu.setText(s);

    }
}