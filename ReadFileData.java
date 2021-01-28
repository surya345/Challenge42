import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReadFileData {
    LinkedList readFileData(String filename) throws IOException {
        File file = new File(filename);
        LinkedList s1 = null;
        Word word[] = new Word[200];
        int i = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            String[] worspltdata = null;
            s1 = new LinkedList();
            int j = 0;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[,':;.?]", "");
                worspltdata = line.split(" ");
                for (i = 0; i < worspltdata.length; i++) {
                    word[j] = new Word();
                    word[j].setWord(worspltdata[i]);
                    List<Word> all = Arrays.asList(word[j]);
                    for(int k=0;k<all.size();k++){
                        s1.insert(all.get(k));
                    }
                    
                }
                j++;
            }
            return s1;
            }
        }
    }