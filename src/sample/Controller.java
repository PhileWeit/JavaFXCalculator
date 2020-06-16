package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private Button number1;
    @FXML private Button number2;
    @FXML private Button number3;
    @FXML private Button number4;
    @FXML private Button number5;
    @FXML private Button number6;
    @FXML private Button number7;
    @FXML private Button number8;
    @FXML private Button number9;
    @FXML private Button number0;


    @FXML private Button delete;
    @FXML private TextField output;
    @FXML private TextField input;
    @FXML private Button cancel;
    @FXML private TextField result;

    @FXML private Button equals;
    @FXML private Button cosine;
    @FXML private Button sine;
    @FXML private Button tan;
    @FXML private Button square;
    @FXML private Button cuberoot;
    @FXML private Button squareroot;

    @FXML private Button division,point;
   // @FXML private Button point;
    @FXML private Button addition;
    @FXML private Button subtraction;
    @FXML private Button multiplication;

    @FXML private String value= "";
    @FXML private double resultat;
    @FXML private double preliminaryResults;
    @FXML private double beforeSign;
    @FXML private final char[] currentSign=new char[2];
    @FXML private char previousSign;
    String outputDisplay="";
    int counter =0;
    boolean signIsClicked=false;//use this to test whether sign is clicked twice eg. ++ or-+ or --
    boolean otherFunctionsIsClicked=false;
    String outputAfterSign="";




    @FXML private void handleNumberAction(ActionEvent actionEvent) {

        if (actionEvent.getSource().equals(number0)){
            value+=0;
            input.setText(value);
            beforeSign=Double.parseDouble(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);
        }
        if (actionEvent.getSource().equals(number1)){
            value+=1;
            input.setText(value);
            beforeSign=Double.parseDouble(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);

        }
        if (actionEvent.getSource().equals(number2)){

            value+=2;
            input.setText(value);
            beforeSign=Double.parseDouble(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);
        }
        if (actionEvent.getSource().equals(number3)){
            value+=3;
            input.setText(value);
            beforeSign=Double.parseDouble(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);
        }
        if (actionEvent.getSource().equals(number4)){
            value+=4;
            input.setText(value);
            beforeSign=Double.parseDouble(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);
        }
        if (actionEvent.getSource().equals(number5)){
            value+=5;
            input.setText(value);
            beforeSign=Double.parseDouble(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);
        }
        if (actionEvent.getSource().equals(number6)){
            value+=6;
            input.setText(value);
            beforeSign=Double.parseDouble(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);
        }
        if (actionEvent.getSource().equals(number7)){
            value+=7;
            input.setText(value);
            beforeSign=Double.parseDouble(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);
        }
        if (actionEvent.getSource().equals(number8)){
            value+=8;
            input.setText(value);
            beforeSign=Double.parseDouble(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);
        }
        if (actionEvent.getSource().equals(number9)){
            value+=9;
            input.setText(value);
            beforeSign=Double.parseDouble(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);
        }
        if (actionEvent.getSource().equals(point)){
            value+='.';
            input.setText(value);
            beforeSign=Double.parseDouble(value);//Integer.parseInt(value);
            outputDisplay=value;
            output.setText(outputAfterSign+outputDisplay);
        }
        signIsClicked=false;//now number is clicked other than the signs

    }

    @FXML private void handleSingleNumberAction(ActionEvent actionEvent) {//handles math signs that require a single number to execute
        //square,squareroot,cuberoot,cosine,sine,tan// oops i forgot cube-->revisit functionality first
        //input.setText("");
        otherFunctionsIsClicked=true;
        if (actionEvent.getSource().equals(cosine)){
            input.setText("cos of "+value);
            outputDisplay="cos of "+value;
            double noForCosine=(value.isEmpty())?0.0:Double.parseDouble(value);
            beforeSign=Math.cos(noForCosine);
        }
        if (actionEvent.getSource().equals(sine)){
            input.setText("sin of "+value);
            outputDisplay="sin of "+value;
            double noForSine=(value.isEmpty())?0.0:Double.parseDouble(value);
            beforeSign=Math.sin(noForSine);
        }
        if (actionEvent.getSource().equals(tan)){
            input.setText("tan of "+value);
            outputDisplay="tan of "+value;
            double noForTan=(value.isEmpty())?0.0:Double.parseDouble(value);
            beforeSign=Math.tan(noForTan);
        }
        if (actionEvent.getSource().equals(square)){
            input.setText("square of "+value);
            outputDisplay="square of "+value;
            double noForSquare=(value.isEmpty())?0.0:Double.parseDouble(value);
            beforeSign=Math.pow( noForSquare,2);
        }
        if (actionEvent.getSource().equals(squareroot)){
            input.setText("squareroot of "+value);
            outputDisplay="squareroot of "+value;
            double noForSquareroot=(value.isEmpty())?0.0:Double.parseDouble(value);
            beforeSign=Math.sqrt(noForSquareroot);
        }
        if (actionEvent.getSource().equals(cuberoot)){
            input.setText("cuberoot of "+value);
            outputDisplay="cuberoot of "+value;
            double noForCuberoot=(value.isEmpty())?0.0:Double.parseDouble(value);
            beforeSign=Math.cbrt(noForCuberoot);
        }
    }

    @FXML private void handleEditCompleteAction(ActionEvent actionEvent) {//delete,cancel,equals
        if (actionEvent.getSource().equals(delete)){
            if (!value.isEmpty()&&!signIsClicked){
                value=value.substring(0,value.length()-1);
                input.setText(value);
                outputDisplay=value;
                beforeSign=Double.parseDouble(value);
            }
        }
        if (actionEvent.getSource().equals(cancel)){/*WE keep everything as default, just as they are when you first open the calculator*/
            output.clear();
            input.clear();
            value="";
            outputDisplay="";
            beforeSign=0.0;
            resultat=0.0;
             previousSign='\u0000';
            counter =0;
            signIsClicked=false;
            outputAfterSign="";
            result.clear();

        }
        if (actionEvent.getSource().equals(equals)){
            if (otherFunctionsIsClicked&&previousSign=='\u0000'){
                resultat+=beforeSign;
            }else{
                resultat=performCalculation(previousSign);
            }
            result.setText(resultat+"");
            beforeSign=0;


        }
    }

    /*These 2 methods are used to service the other main methods--> to avoid repetition and duplication od code*/
    private char determineSign(){
        if (currentSign[0]=='-'&&currentSign[1]=='-'){
           return '+';
        }else if ((currentSign[0]=='-'&&currentSign[1]=='+')||(currentSign[0]=='+'&&currentSign[1]=='-')){
            return '-';
        }else
            return currentSign[0];
    }
    private double performCalculation(char sign){
        switch ( sign){
            case '+':
                resultat+=beforeSign;
                System.out.println("before Sign = "+beforeSign);

                break;
            case '-':
                resultat-=beforeSign;
                break;
            case '/':
                resultat/=beforeSign;
                break;
            case '*':
                resultat*=beforeSign;
                break;
        }
        return resultat;
    }

    @FXML private void handleMathAction(ActionEvent actionEvent) {//add,subtract,multiply,divide
        value="";


        if (actionEvent.getSource().equals(addition)){
            if (signIsClicked){//if its true it means a sign was typed on quick succession. SignIsClicked only false when you click a number.
               //in case two signs are typed
                currentSign[++counter]='+';
                counter=0;//to avoid array out of bounds.Every time we get two signs,we reset the array

            }else{
                signIsClicked=true;
                currentSign[counter]='+';//sign clicked first time after input
            }




            double resultAfterSignClick=(previousSign==	'\u0000')?performCalculation('+'):performCalculation(previousSign);//gets the result lil by lil as per the previous sign


             previousSign=determineSign();//store the sign for use when we click sign next.Assigns current sign as previous sign


             if (previousSign!='+'){
                 previousSign='+';
             }
            System.out.println("outputdisplay before="+outputDisplay);
             outputAfterSign+=outputDisplay+=" + ";
            output.setText(outputAfterSign);//output text-field shows our whole journey/total calculations
            System.out.println("outputdisplay after="+outputDisplay);

           // input.clear();//has to be clear to so that we can capture the input entered without interference
            result.setText(resultAfterSignClick+"");
            beforeSign=0;//being ready to record int value entered after the sign

        }
        if (actionEvent.getSource().equals(subtraction)){
            if (signIsClicked){//if its true it means a sign was typed on quick succession. SignIsClicked only false when you click a number.
                //in case two signs are typed
                currentSign[++counter]='-';
                counter=0;//to avoid array out of bounds.Every time we get two signs,we reset the array

            }else{
                signIsClicked=true;
                currentSign[counter]='-';//sign clicked first time after input
            }


            double resultAfterSignClick=(previousSign==	'\u0000')?performCalculation('+'):performCalculation(previousSign);//gets the result lil by lil as per the previous sign
            previousSign=determineSign();//store the sign for use when we click sign next.Assign current sign to previous sign since we already done using old one
            //performCalculation(previousSign);//gets the result lil by lil as per the previous sign

            if (previousSign!='-'){
                previousSign='-';
            }
            outputAfterSign+=outputDisplay+=" - ";
            output.setText(outputAfterSign);//output text-field shows our whole journey/total calculations


            // input.clear();//has to be clear to so that we can capture the input entered without interference
            result.setText(resultAfterSignClick+"");
            beforeSign=0;//being ready to record int value entered after the sign
        }
        if (actionEvent.getSource().equals(multiplication)){
            if (signIsClicked){//if its true it means a sign was typed on quick succession. SignIsClicked only false when you click a number.
                //in case two signs are typed
                currentSign[++counter]='*';
                counter=0;//to avoid array out of bounds.Every time we get two signs,we reset the array

            }else{
                signIsClicked=true;
                currentSign[counter]='*';//sign clicked first time after input
            }
            double resultAfterSignClick=(previousSign==	'\u0000')?performCalculation('+'):performCalculation(previousSign);//gets the result lil by lil as per the previous sign
            previousSign=determineSign();//store the sign for use when we click sign next
            //performCalculation(previousSign);//gets the result lil by lil as per the previous sign

            if (previousSign!='*'){
                previousSign='*';
            }
            //System.out.println("outputdisplay before="+outputDisplay);
            outputAfterSign+=outputDisplay+=" * ";
            output.setText(outputAfterSign);//output text-field shows our whole journey/total calculations
            //System.out.println("outputdisplay after="+outputDisplay);

            // input.clear();//has to be clear to so that we can capture the input entered without interference
            result.setText(resultAfterSignClick+"");
            beforeSign=0;//being ready to record int value entered after the sign
        }
        if (actionEvent.getSource().equals(division)){
            if (signIsClicked){//if its true it means a sign was typed on quick succession. SignIsClicked only false when you click a number.
                //in case two signs are typed
                currentSign[++counter]='/';
                counter=0;//to avoid array out of bounds.Every time we get two signs,we reset the array

            }else{
                signIsClicked=true;
                currentSign[counter]='/';//sign clicked first time after input
            }

            double resultAfterSignClick=(previousSign==	'\u0000')?performCalculation('+'):performCalculation(previousSign);;//gets the result lil by lil as per the previous sign
            previousSign=determineSign();//store the sign for use when we click sign next
            //performCalculation(previousSign);//gets the result lil by lil as per the previous sign

            if (previousSign!='/'){
                previousSign='/';
            }
            //System.out.println("outputdisplay before="+outputDisplay);
            outputAfterSign+=outputDisplay+=" / ";
            output.setText(outputAfterSign);//output text-field shows our whole journey/total calculations
           // System.out.println("outputdisplay after="+outputDisplay);

            // input.clear();//has to be clear to so that we can capture the input entered without interference
            result.setText(resultAfterSignClick+"");
            beforeSign=0;//being ready to record int value entered after the sign
        }

    }
}
