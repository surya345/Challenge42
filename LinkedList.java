public class LinkedList {
    Node head;
    public Node createNode(Word word){
        Node node= new Node(word);
        node.word=word;
        node.node=null;
        return node;
    }
    public Node WordFun(Word w)
    {
        Node next = head;
        while(next!=null)
        {
            if(next.word.word.equals(w.word))
            {
                return next;
            }
            next=next.node;
        }
        return null;
    }
    public void insert(Word word)
    {
        Node node=new Node(word);
        if (head==null) 
        {
            head=node;
        }
        if(WordFun(word)!=null)
        {
            WordFun(word).word.occurences++;
        }
        else
        {
            Node temp=head;
            while(temp.node!=null)
            {
                temp=temp.node;
            }
            temp.node=node;
        }
    }
    public void  show() {
        Node temp = head;
       
        while (temp!= null) {
            System.out.println("---->"+temp.word.getWord()+"---->"+temp.word.getOccurences());
            temp = temp.node;
        }
        
    }


    public Node reverseshow() {
        Node temp = head;
        return temp;
    }

    public void sort(){
        Node current = head, index = null;  
        Word temp;  
        while(current != null) {  
                index = current.node;  
                  
                while(index != null) {  
                     if(((current.word.getWord() ).compareToIgnoreCase(index.word.getWord()))>0 ) { 
                         temp = current.word;  
                        current.word = index.word;  
                        index.word = temp;  
                    }  
                    index = index.node;  
                   
                }  
                 System.out.println("---->"+current.word.getWord()+"---->"+current.word.getOccurences());
                current = current.node;  
      }     
    }
    public void reverse (Node head){
        Node current = head;
        Node last    = null; 
    
        while (last != head) { 
            while (current.node != last) {
                current = current.node;
            }
            last  = current;
            System.out.println("--->"+last.word.getWord()+"--->"+last.word.getOccurences());
            current = head;
        }

        
    
    }
    public void showFrequentWords (){
        Node current = head, index = null;  
        Word temp;  
        while(current != null) {  
                index = current.node;  
                  
                while(index != null) {  
                     if(((current.word.getOccurences() )<(index.word.getOccurences()))) { 
                         temp = current.word;  
                        current.word = index.word;  
                        index.word = temp;  
                    }  
                    index = index.node;  
                   
                }  
                 System.out.println("---->"+current.word.getWord()+"---->"+current.word.getOccurences());
                current = current.node;  
    
    }
}
}