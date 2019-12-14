package domain.card;

public enum Symbol {
    ACE(1,"A"),
    TWO(2,"2"),
    THREE(3,"3"),
    FOUR(4,"4"),
    FIVE(5,"5"),
    SIX(6,"6"),
    SEVEN(7,"7"),
    EIGHT(8,"8"),
    NINE(9,"9"),
    TEN(10,"10"),
    JACK(10,"잭"),
    QUEEN(10,"퀸"),
    KING(10,"킹");

    private int score;
    private String alias;

    Symbol(int score, String alias) {
        this.score = score;
        this.alias = alias;
    }

    public int getScore() {
        return score;
    }

    public String getAlias() {
        return alias;
    }
}
