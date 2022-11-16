package tut_2.Question_4;

public class VendingMachine {
    private int canCount, tokenCount;

    public void fillUp(int cans) {
        canCount += cans;
    }

    public void insertToken() {
        if (isACanAvailable()) {
            ++tokenCount;
            --canCount;
        }
    }

    private boolean isACanAvailable() {
        return canCount > 0;
    }

    public int getCanCount() {
        return canCount;
    }

    public int getTokenCount() {
        return tokenCount;
    }
}
