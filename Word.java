class Word
{
    String word;
    int occurences =1;;

    public Word(){}
    
    public Word(String w)
    {
        this.word=w;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getOccurences() {
        return occurences;
    }

    public void setOccurences(int occurences) {
        this.occurences = occurences;
    }

    @Override
    public String toString() {
        return "Word [occurences=" + occurences + ", word=" + word + "]";
    }

    
}