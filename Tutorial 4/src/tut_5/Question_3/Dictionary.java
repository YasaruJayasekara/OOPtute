package tut_5.Question_3;

class Dictionary extends Book {
    private int words; // number of words in the dictionary
    Dictionary(int words, int pages) {
        super(pages);
        this.words = words;
    }

    @Override
    public String toString(){
        return "Number of pages: " + super.toString() + "\nNumber of words: " + words;
    }
/*** for subquestion 2 implement toString() here ***/
}

