/******************************************/
import java.util.*;
public class CeaserCipher{
    private static LinkedList<String> Ceaser=new LinkedList<>();
    private static LinkedList<String> Cipher=new LinkedList<>();
    private  static ArrayList<String> Wrd=new ArrayList<>();
    private  static ArrayList<String> result=new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/**************************code************************************/
           System.out.print("Entrer le mot a crypter:");
           String wd=sc.nextLine();
           wd.replace(" ","");
           String word[]=wd.split("");

           for (int w=0;w<word.length;w++){
               Wrd.add(word[w]);
           }
           int key=0;
           String k[]={};
           do {
               key = IO.setINT("Entrer la cle:");
           }while (key<=0);
           String T[]={"A","B","C","D","E","F","G","H","I","j","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

            for (int i = 0; i<T.length; i++){
                Ceaser.add(T[i]);
                Cipher.add(T[i]);
               // System.out.print(Ceaser.get(i));
                }
            for(int j=0;j<key;j++){
                    Ceaser.removeFirst();
                    Ceaser.addLast(T[j]);
                }
        for(int j=0;j<T.length;j++){
            System.out.print(Cipher.get(j));

        }  System.out.println("\n");
                for(int j=0;j<T.length;j++){
                    System.out.print(Ceaser.get(j));

                }
                System.out.println("\n");

                for (int o=0;o<Wrd.size();o++){
                        for (int l=0;l<T.length;l++){
                        if(Wrd.get(o).equalsIgnoreCase(Cipher.get(l))){
                            result.add(Ceaser.get(l));
                            break;
                        }
                      }
                    }
                    //affichage
                if(result.isEmpty())
                {
                    System.out.print("la liste est vide");
                }else{
                    System.out.println("le mot crypter est:");
                for (int a=0;a<Wrd.size();a++) {
              System.out.print(result.get(a));
                }
                }
            }
}
