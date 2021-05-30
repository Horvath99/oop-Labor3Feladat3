package Labor8_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {
    ArrayList<String> words=new ArrayList<>();
    //ArrayListDictionary instance;
    public ArrayListDictionary(){
        Scanner scanner=null;
        try{
            scanner=new Scanner(new File(DICTIONARY_FILE));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + DICTIONARY_FILE);
            System.exit(1);
        }
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            words.add(line);
        }
    }
    public boolean add(String word){
        if(find(word)==false){
            words.add(word);
        }
        return false;
    }
    public boolean find(String word){
        if(Collections.binarySearch(words,word)>0){
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){
        return words.size();
    }

}
