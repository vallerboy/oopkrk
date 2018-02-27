package company;

public class Boss extends Manager implements Management{
    public Boss(String name, String lastname) {
        super(name, lastname, Float.POSITIVE_INFINITY);
    }

    @Override
    public void voteNo(String reason) {
        System.out.println(reason);
    }

    @Override
    public void voteYes() {
        System.out.println("Ustawa przeszła");
    }
}
