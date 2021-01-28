

import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        ReadFileData rd = new ReadFileData();
        String filePath= "./data/daffodils.txt";
        LinkedList linkedList=rd.readFileData(filePath);
        System.out.println("====================================================");
        System.out.println("List of words with  respective occurences");
        linkedList.show();
        System.out.println("====================================================");
        System.out.println("List of words with  respective occurences in sorted list ");
        System.out.println("====================================================");
        long start = System.currentTimeMillis();
        linkedList.sort();
        long end = System.currentTimeMillis(); 
        System.out.println("Sorting  takes " + (end - start) + "ms"); 
        System.out.println("====================================================");
        System.out.println(" Reverse order List of words with respective occurences");
        System.out.println("====================================================");
        Node head = linkedList.reverseshow();
        long start1 = System.currentTimeMillis();
        linkedList.reverse(head);
        long end1 = System.currentTimeMillis();
        System.out.println("Reverse order List takes " + (end1 - start1) + "ms"); 
        System.out.println("====================================================");
        System.out.println(" List of Words sorted   in desceding order of occurences");
        System.out.println("====================================================");
        long start2 = System.currentTimeMillis(); 
        linkedList.showFrequentWords();
        long end2 = System.currentTimeMillis(); 
        System.out.println("showFrequentWords takes " + (end2 - start2) + "ms"); 

        

    }
}