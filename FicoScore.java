public class FicoScore {
    private String bank;
    private int score;

    private static FicoScore ficoScore = null;

    private FicoScore(){}

    public static FicoScore getInstance(){
        if(ficoScore == null){
            ficoScore = new FicoScore();
        }
        return ficoScore;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
