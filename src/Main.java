import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
       if(args.length==0){
            System.out.println("Please provide input filname");
            return;
        }
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        File inputFile = new File(args[0]);
        FileReader fr = new FileReader(inputFile);
        int i;
        while ((i=fr.read())!=-1){
            Character c = (char)i;
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        FileWriter outputFile = new FileWriter("result.txt");
        for (Map.Entry<Character,Integer> e: hm.entrySet()){
            System.out.println(String.valueOf(e.getKey())+" "+ String.valueOf(e.getValue()));
            outputFile.write(String.valueOf(e.getKey())+" "+ String.valueOf(e.getValue())+"\n");
        }
        outputFile.close();
    }
}
