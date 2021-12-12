package dominiatrix.demo;

import android.view.View;
import android.widget.EditText;

public class CalculatriceActivity  {
EditText tv;
String nb1;
String op;
String nb2;
int result;


    public CalculatriceActivity(EditText tv, String op, String nb1, String nb2){
        this.tv = tv;
        this.nb1 = nb1;
        this.nb2 = nb2;
        this.op = op;


    }

    public String getnb1() {
        return nb1;
    }

    public String getnb2() {
        return nb2;
    }

    public void setnb1(String nb1) {
        this.nb1 = nb1;
    }

    public void setnb2(String nb2) {
        this.nb2 = nb2;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public String getop() {
        return op;
    }

    public void setop(String op) {
        this.op = op;
    }
    public Integer calcul ( String op, String nb1, String nb2){

        switch (op){
            case "+":
                result = Integer.decode(nb1) + Integer.decode(nb2);
                break;
            case "-":
                result = Integer.decode(nb1) - Integer.decode(nb2);
                break;
            case "x":
                result = Integer.decode(nb1) * Integer.decode(nb2);
                break;
            case "/":
                result = Integer.decode(nb1) / Integer.decode(nb2);
                break;
        }

        return result;
    }

}



