package org.example.demo22;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Arrays;

public class controller {
    @FXML
    private AnchorPane profile;
    @FXML
    private AnchorPane three;
    @FXML
    private AnchorPane four;
    @FXML
    private AnchorPane five;
    @FXML
    private GridPane threegrid;
    @FXML
    private  GridPane fourgrid;
    @FXML
    private  GridPane fivegrid1;
    @FXML
    private  GridPane fivegrid2;
//    @FXML
    public static int len;
    @FXML
    private int radif = 2 ;
    @FXML
    private int soton = 4 ;

    @FXML
    private String position = "three";
    @FXML
    private String[] arrayS = new String[radif*soton];

    //    =============================
    public void initialize(){
        profile.setVisible(true);
        three.setVisible(true);
        hidefive();
        hidefour();
    }
//    =================================
    @FXML
    private void hidefour(){
        four.setVisible(false);
    }
    @FXML
    private void hidefive(){
        five.setVisible(false);
    }
//================================== handles
    @FXML
    private void  handlethreebutton(){
    radif = 2;
    soton=4;
    len=3;
    position = "three";
    four.setVisible(false);
    three.setVisible(true);
    five.setVisible(false);
    profile.setVisible(true);
}
    @FXML
    private void  handlefourbutton(){
        radif = 4;
        soton = 4;
        len = 4;
        position = "four";
        four.setVisible(true);
        three.setVisible(false);
        five.setVisible(false);
        profile.setVisible(true);
        System.out.println(position);
    }

    @FXML
    private void  handlefivebutton(){
//        num = 5;
        len = 5;
        position = "five";
        four.setVisible(false);
        three.setVisible(false);
        five.setVisible(true);
        profile.setVisible(true);
    }
//    =====================================
    public static String[] merge(String a[], String b[]) {
    String[] c = new String[a.length+b.length];
    for (int i = 0 ; i<a.length;i++){
        c[i]=a[i];
    }for (int j = 0 ; j<a.length;j++){
        c[a.length+j]=b[j];
    }
    return c;
}
//    =====================================
    public static ArrayList<String> removeNull(String[] array) {
        ArrayList<String> newArray = new ArrayList<>();

        for (String s : array) {
            if (s != null && !s.equals("")) {
                newArray.add(s);
            }
        }

    return newArray;
    }
//    =====================================get id function get abcd of midterms
    public String[] get_id(){
        String[] ar = new String[radif*soton];
        String[] ar2 = new String[radif*soton];
        int count=0;
       /* switch (position){
            case "three":
                for (Node node : threegrid.getChildren()){
                    if (node instanceof TextField){
                        TextField textField = (TextField) node;
                        try {
                            String value = textField.getId();
                            if (1  == Integer.parseInt(textField.getText()))
                                ar[count]=value;
                            count++;

                            if (count>(radif*soton)){
                                break;
                            }
                        }
                        catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                }arrayS = ar;
                arrayS = removeNull(arrayS).toArray(new String[0]);
                System.out.println(Arrays.toString(arrayS));

                return arrayS;
            case "four":
                for (Node node : fourgrid.getChildren()){
                    if (node instanceof TextField){
                        TextField textField = (TextField) node;
                        try {
                            String value = textField.getId();
                            if (1  == Integer.parseInt(textField.getText()))
                                ar[count]=value;
                            count++;

                            if (count>(radif*soton)){
                                break;
                            }
                        }
                        catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                }arrayS = ar;
                arrayS = removeNull(arrayS).toArray(new String[0]);
                System.out.println(Arrays.toString(arrayS));
                return arrayS;
            case "five":
                for (Node node : fivegrid1.getChildren()){
                    if (node instanceof TextField){
                        TextField textField = (TextField) node;
                        try {
                            String value = textField.getId();
                            if (1  == Integer.parseInt(textField.getText()))
                                ar[count]=value;
                            count++;

                            if (count>(radif*soton)){
                                break;
                            }
                        }
                        catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                }
                for (Node node : fivegrid2.getChildren()){
                    if (node instanceof TextField){
                        TextField textField = (TextField) node;
                        try {
                            String value = textField.getId();
                            if (1  == Integer.parseInt(textField.getText()))
                                ar2[count]=value;
                            count++;

                            if (count>(radif*soton)){
                                break;
                            }
                        }
                        catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                }
                arrayS = merge(ar,ar2);
                arrayS = removeNull(arrayS).toArray(new String[0]);
                System.out.println(Arrays.toString(arrayS));
                return arrayS;
        }*/
        return arrayS;
    }
//    ======================================bollean of midterms


    public int[] get_Id(){

        String[] ar = new String[radif*soton];
        String[] ar2 = new String[radif*soton];
        int count=0;
        switch (position){
            case "three":
                for (javafx.scene.Node node : threegrid.getChildren()){
                    if (node instanceof TextField textField){

                        try {

                            if (1 == Integer.parseInt(textField.getText())){
                                String value = textField.getId();

                                ar[count]=value;}

                            count++;

                            if (count>(radif*soton)){
                                break;
                            }
                        }
                        catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                }arrayS = ar;
                arrayS = removeNull(arrayS).toArray(new String[0]);
                break;
            case "four":
                for (Node node : fourgrid.getChildren()){
                    if (node instanceof TextField){
                        TextField textField = (TextField) node;
                        try {
                            String value = textField.getId();
                            if (textField.getText().equals("1"))
                                ar[count]=value;
                            count++;

                            if (count>(radif*soton)){
                                break;
                            }
                        }
                        catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                }arrayS = ar;
                arrayS = removeNull(arrayS).toArray(new String[0]);

                break;
            case "five":
                for (Node node : fivegrid1.getChildren()){
                    if (node instanceof TextField){
                        TextField textField = (TextField) node;
                        try {
                            String value = textField.getId();
                            if (textField.getText().equals("1"))
                                ar[count]=value;
                            count++;

                            if (count>(radif*soton)){
                                break;
                            }
                        }
                        catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                }
                for (Node node : fivegrid2.getChildren()){
                    if (node instanceof TextField){
                        TextField textField = (TextField) node;
                        try {
                            String value = textField.getId();
                            if (1  == Integer.parseInt(textField.getText()))
                                ar2[count]=value;
                            count++;

                            if (count>(radif*soton)){
                                break;
                            }
                        }
                        catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                }
                arrayS = merge(ar,ar2);
                arrayS = removeNull(arrayS).toArray(new String[0]);
                break;
        }
        System.out.println(Arrays.deepToString(arrayS));
        String[] s = arrayS;
        System.out.println(Arrays.deepToString(s));

        String[] newArray = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            String g = "";
            for (int j = 0; j < s[i].length(); j++) {
                if (Character.isUpperCase(s[i].charAt(j))) {
                    g += "1";
                } else {
                    g += "0";
                }
            }
            newArray[i] = g;
        }

        QM qm=new QM();
        bintodec obj = new bintodec();
        System.out.println((Arrays.toString(obj.bintodec(newArray))) );
        //TermTable tm=new TermTable();
      //  TermTable.j=obj.bintodec(newArray);
//        QM.main();

        return  obj.bintodec(newArray);



    }

/*
    public int[] makeBool() {
    System.out.println(position);
    String[] s = get_id();
    String[] newArray = new String[s.length];
    for (int i = 0; i < s.length; i++) {
        String g = "";
        for (int j = 0; j < s[i].length(); j++) {
            if (Character.isUpperCase(s[i].charAt(j))) {
                g += "1";
            } else {
                g += 0;
            }
        }
        newArray[i] = g;
    }
    QM qm=new QM();
    bintodec obj = new bintodec();
  //  qm.start(obj.bintodec(newArray));

    return  obj.bintodec(newArray);
}
*/
//=========================================
}
