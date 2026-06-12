import java.util.Scanner;
public class FileCom{
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.println("==== File Compression Simulator ====");
        System.out.println("Enter String: ");
        String file = abc.next();
        int ar[] = new int[26];
         System.out.println("Original String: "+ file);
        for(int i=0; i<file.length(); i++){
            char ch = file.charAt(i);
            if(ch>='a' && ch<='z'){
                ar[ch-'a']++;
            }
        }
        for(int i=0; i<26; i++){
            if(ar[i]>0){
                System.out.println("Compressed String: "+ (char)(i+'a') + ar[i]);
            }
        }
        System.out.println("Decompressed String: "+file);
        System.out.println("Decompression Successful!");
    }
}
