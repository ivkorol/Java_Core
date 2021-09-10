package HW01.Competitors;

public interface Competitor {
    void run(int distance);
    void swim(int distance);
    void jump(int height);
    boolean isOnDistance();
    void showResult();
}
