import java.util.*;

public class CeaserCipher{
    //implementation du chiffrement de cesar
    private static Scanner sc = new Scanner(System.in);
    private static LinkedList<String> Ceaser=new LinkedList<>();
    private static LinkedList<String> Cipher=new LinkedList<>();
    private  static ArrayList<String> Wrd=new ArrayList<>();
    private  static ArrayList<String> result=new ArrayList<>();
    private static int saisie_message(){

        return IO.setINT("Votre choix");
    }
    private static String[] Saisie_du_mot(String message)
    {  String wd;
        System.out.print("Entrer le mot a "+message+": ");
        wd=sc.nextLine();
        wd.replaceAll(" ","");
        String word[]=wd.split("");
       return word;
    }
    private static int saisie_de_la_cle(){
        int key;
      //  do {
            key = IO.setINT("Entrer la cle:");
     //   }while (key<=0);
        return key;
    }

    private static void add_element_inlist(String[] word){
        for (int w=0;w<word.length;w++){
            Wrd.add(word[w]);
        }
    }
    private  static void insert(String[] alphabet,int key){
        for (int i = 0; i<alphabet.length; i++){
            Ceaser.add(alphabet[i]);
            Cipher.add(alphabet[i]);
            // System.out.print(Ceaser.get(i));
        }
        for(int j=0;j<key;j++){
            Ceaser.removeFirst();
            Ceaser.addLast(alphabet[j]);
        }
    }
    private  static void detail(String [] alphabet){
      //////////////////pour l'affichage////////////////

        for(int j=0;j<alphabet.length;j++){
            System.out.print(Cipher.get(j));

        }  System.out.println("\n");
        for(int j=0;j<alphabet.length;j++){
            System.out.print(Ceaser.get(j));

        }

        System.out.println("\n");
     //////////////////////////////////////////

        for (int o=0;o<Wrd.size();o++){
            for (int l=0;l<alphabet.length;l++){
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
            System.out.println("le mot crypter est: ");
            for (int a=0;a<Wrd.size();a++) {
                System.out.print(result.get(a));
            }
        }
    }

    private static String decryptage(String Word,int key,String message){
        Saisie_du_mot(message);
  //    a b c d e f g h i j k l m n o p q r s t u v w x y z
  //    c d e f g h i j k l m n o p q r s t u v w x y z a b
        //gffa    //key=2
        return "s";
    }
    public static void main(String[] args) {

/**************************code************************************/
           int key=0;
           String k[]={};
           String a[];

           String T[]={"A","B","C","D","E","F","G","H","I","j","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            /*****************************************************/
            System.out.println("-------------Chiffrement de Cesar------------");
            System.out.println("1.Crypter");
            System.out.println("2.Décrypter");
            System.out.println("3.Trouver la cle");
            switch (saisie_message())
            {
                case 1:
                {
                    a=Saisie_du_mot("Crypter");
                    key=saisie_de_la_cle();
                     if(key<0){
                      key=Modulo.ModuloPosi_Negtif(key,26);
                    }
                    if(key>26){
                        key=Modulo.ModuloPositif(key,26);
                    }
                    add_element_inlist(a);
                    insert(T,key);
                    detail(T);
                    break;
                }
                case 2:
                    {
                        result.clear();
                        Wrd.clear();
                        a= Saisie_du_mot("Decrypter");
                        key=saisie_de_la_cle();
                        insert(T,key);
                        add_element_inlist(a);
                        for (int o=0;o<Wrd.size();o++){
                            for (int l=0;l<T.length;l++){
                                if(Wrd.get(o).equalsIgnoreCase(Ceaser.get(l))){
                                    result.add(Cipher.get(l));
                                    break;
                                }
                            }
                        }
                        if(result.isEmpty())
                        {
                            System.out.print("la liste est vide");
                        }else{
                            System.out.println("le mot qui était crypter est:");
                            for (int z=0;z<Wrd.size();z++) {
                                System.out.print(result.get(z));
                            }
                        }
                    break;
            }
            }
    }}