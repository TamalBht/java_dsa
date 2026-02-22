import java.io.*;
import java.util.*;
import java.lang.*;

public class FReading {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("note.txt")){
            List<Character> ls=new ArrayList<>();
            while(fr.ready()){
                
                int letters=fr.read();
                ls.add((char)letters);

            }
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
