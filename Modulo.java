
import java.util.Scanner;

public class Modulo {
    /*********Pour les Fractions a/bmodc***********/
    //pour la forme -a/b mod c
    static int ModuloNeg(int a, int b, int c){
        int result=a;
        if(a<b){
            do{
                      result=result+c;
            }  while (!(result%b==0));
            return result/b;
        }else {
            return 1;
        }
    }

    static int ModuloPositif(int a, int b){
        return a%b;
    }
    //pour la forme -a mob b
    static int ModuloPosi_Negtif(int a, int b){
           do{
               a=a+b;
           }while(a<0);
        return a;
    }
    int Modulo_Neg_Neg(int a,int b,int c){
        return 1;
    }

    public static void main(String[] args) {
        /*forme general a/b mod c*/
        System.out.println("1.Forme general  a/b mod c");
        System.out.println("2.Forme general -a/b mod c");
        System.out.println("3.Forme general -a mod c");
        System.out.println("4.Forme general  a mod c\n");
        System.out.println("Votre choix:");
        if(IO.setINT("")==2){

        System.out.print("Entrer a=");
        int a= IO.setINT("");
        System.out.print("Entrer b=");
        int b= IO.setINT("");
        System.out.print("Entrer c=");
        int c= IO.setINT("");


        int k=ModuloNeg(a,b,c);
        if(k==0||k<0){
            System.out.print("impossible");
        }else{
            System.out.println("Modulo=> "+a+"/"+b+"Mod"+c+"="+k);
        }}
        else if(IO.setINT("")==4){
            System.out.print("Entrer a=");
            int a= IO.setINT("");
            System.out.print("Entrer b=");
            int b= IO.setINT("");
            int k=ModuloPositif(a,b);
            System.out.println("Modulo=> "+a+"Mod"+b+"="+k);
            }
        else{
            System.out.println("Pas encore");
        }
    }
}
