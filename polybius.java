
import java.util.Scanner;
public class polybius{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*declaration des lettres alphabètique*/
        String[][] letter =
                {
                        {"A","B","C","D","E"},
                        {"F","G","H","I","K"},
                        {"L","M","N","O","P"},
                        {"Q","R","S","T","U"},
                        {"V","W","X","Y","Z"}
                };
        /*********************************** */
//Enter word for crypting
       System.out.print("Entrer un mot:");
        String m =sc.nextLine();
        String p=m.toUpperCase();
        String tab[]=p.split("");
        System.out.print("\nOn obtient:");    

    for (int k = 0; k < tab.length; k++){
        for (int i=0;i<letter.length;i++){
            for(int j=0;j<letter.length;j++)  {
                     if (letter[i][j].equals(tab[k])){    
                          System.out.print(i+1);
                          System.out.print(j+1);
                    }

            }}
        }

    }
}