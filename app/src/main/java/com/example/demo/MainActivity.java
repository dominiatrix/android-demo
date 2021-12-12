package dominiatrix.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    Button button0;
    Button button1, button2;
    Button button3, button4;
    Button button5, button6;
    Button button7, button8;
    Button button9, buttonaddition;
    Button buttonsoustraction, buttondivision;
    Button buttonmultiplication;
    Button buttonreset, buttonegal, buttonvirgule;
    Button buttonsuppr;
    Button buttonpourcent;
    boolean opbool = false;

    EditText rendu;

    String nb;
    String op;


    CalculatriceActivity cal = new CalculatriceActivity(null,null,null,null);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculatrice);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonpourcent = (Button) findViewById(R.id.buttonpourcent);
        buttonaddition = (Button) findViewById(R.id.buttonaddition);
        buttonsoustraction = (Button) findViewById(R.id.buttonsoustraction);
        buttondivision = (Button) findViewById(R.id.buttondivision);
        buttonmultiplication = (Button) findViewById(R.id.buttonmultiplication);
        buttonreset = (Button) findViewById(R.id.buttonreset);
        buttonegal = (Button) findViewById(R.id.buttonegal);
        buttonvirgule = (Button) findViewById(R.id.buttonvirgule);
        buttonsuppr = (Button) findViewById(R.id.buttonsuppr);
        rendu = (EditText) findViewById(R.id.rendu);


       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               clickchiffre("1");
           }
       });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickchiffre("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickchiffre("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickchiffre("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickchiffre("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickchiffre("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickchiffre("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickchiffre("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickchiffre("9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickchiffre("0");
            }
        });
        buttonaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickop("+");
            }
        });
        buttonsoustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickop("-");
            }
        });
        buttonmultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickop("x");
            }
        });
        buttondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickop("/");
            }
        });
        buttonreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
        buttonegal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickegal();
            }
        });

    }

    public void clickchiffre(String chiffre){

        if(rendu.getText().toString() == "0" ){
            rendu.setText(chiffre);
        }
        else{
            if(opbool == true){
                rendu.setText(chiffre);

            }else {
                rendu.setText(rendu.getText()+chiffre);
            }


        }
    opbool = false;
    }
    public void clickop(String op){
            opbool = true;
            if (nb == null){

                    nb = rendu.getText().toString();
                    cal.nb1 = nb;
                    cal.op = op;
                    rendu.setText(op);
                System.out.println(cal.nb1);
                    System.out.println(cal.op);

            }else{
                    nb = rendu.getText().toString();
                    cal.nb2 = nb;
                    cal.op = op;
                    rendu.setText(op);
                    op = null;
                System.out.println(cal.nb2);
             }

           }

       public void reset(){
            if (rendu.getText().toString() != null){
                rendu.setText("0");
            }
       }
       public void clickegal(){
           System.out.println(cal.calcul(cal.op.toString(),cal.nb1.toString(),cal.nb2.toString()));  //  rendu.setText(cal.calcul(cal.op.toString(),cal.nb1.toString(),cal.nb2.toString()).toString());
       }

}


