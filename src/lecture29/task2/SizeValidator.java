package lecture29.task2;

public class SizeValidator implements Validate{
    private final static int SIZE = 8;

    @Override
    public boolean validate(String password) {
        if (password.length() < SIZE) {
            throw new IllegalArgumentException("Password must has "+ SIZE+" symbols!");
        }
        else {
            return true;
        }
    }
}
