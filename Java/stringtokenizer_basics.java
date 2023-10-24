import java.util.*;
public class stringtokenizer_basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a punctuated paragraph: ");
        String s=sc.nextLine();
        System.out.println("Sentences of the paragraph are: \n");
        StringTokenizer st=new StringTokenizer(s,"?!.");//First parameter is the string you want to filter through
        while (st.hasMoreTokens()){//and second parameter is the delimiters. A token is a string between two consecutive
            String tok=st.nextToken(); //delimiters. If 2nd parameter is left blank, space is the default delimiter.
            System.out.println(tok);
        }
    }
}
//SAMPLE I/O : Pleas enter a punctuated paragraph:
//I am X. I am a good boy! Am I not?
//Sentences of the paragraph are:
//I am X
// I am a good boy
// Am I not

