package Labor12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Storage {
    private Map<Integer,Product> products=new HashMap<>();

    public Storage(String fileName) {
        try(Scanner scanner=new Scanner(new File(fileName)))
        {
            while(scanner.hasNextLine())
            {
                String line=scanner.nextLine();
                String[] items=line.split(" ");
                //1765933 vqdyoq 56 6
                int id=Integer.parseInt(items[0].trim());
                String name=items[1];
                int amount=Integer.parseInt(items[2].trim());
                int value=Integer.parseInt(items[3].trim());
                products.put(id,new Product(id,name,amount,value));

            }
            System.out.println("Size of storage:"+products.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void update(String fileName){
        try(Scanner scanner=new Scanner(new File(fileName)))
        {
            int counter=0;
            while(scanner.hasNextLine())
            {
                String line=scanner.nextLine();
                String[] items=line.split(" ");
                //1765933 43
                int id=Integer.parseInt(items[0].trim());
                int amount=Integer.parseInt(items[1].trim());
                Product product=products.get(id);
                if(product!=null){
                    product.updateAmount(amount);
                    counter++;
                }

            }
            System.out.println("Updates:"+counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
