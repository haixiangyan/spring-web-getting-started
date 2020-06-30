package monster.entity;

public class RankItem {
    private int score;
    private User user;

    public void setScore(int score) {
        this.score = score;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public User getUser() {
        return user;
    }
}
