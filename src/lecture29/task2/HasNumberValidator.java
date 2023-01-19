package lecture29.task2;

public class HasNumberValidator implements Validate {


    @Override
    public boolean validate(String password) {
        if(!hasNumber(password)){
            throw new IllegalArgumentException("Password must contain at least 1 number!");
        }
        else {
            return true;
        }
    }

    private boolean hasNumber(String password){
        boolean hasNumber = false;
        char[] symbols = password.toCharArray();
        for (char symbol : symbols){
            if(Character.isDigit(symbol)){
                hasNumber = true;
                break;
            }
        }
        return hasNumber;
    }
}
