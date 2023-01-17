package lecture29.task2;

public class IsEmptyValidator implements Validate{

    @Override
    public boolean validate(String password) {

        if(password.isEmpty()){
            throw new IllegalArgumentException("Password is empty!");
        }
        else {
            return true;
        }

    }
}
