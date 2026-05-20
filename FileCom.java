import java.util.Scanner;
public class FileCom{
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        String file = abc.next();
        int ar[] = new int[26];
        for(int i=0; i<file.length(); i++){
            char ch = file.charAt(i);
            if(ch>='a' && ch<='z'){
                ar[ch-'a']++;
            }
        }
        for(int i=0; i<26; i++){
            if(ar[i]>0){
                System.out.println((char)(i+'a') + ar[i]);
            }
        }
    }
}