package lecture29.task2;

public class ValidatorChain implements Validate{

    private final Validate firstValidator;
    private final Validate secondValidator;

    public ValidatorChain(Validate firstValidator, Validate secondValidator) {
        this.firstValidator = firstValidator;
        this.secondValidator = secondValidator;
    }


    @Override
    public  boolean validate(String password){
        var isValid = firstValidator.validate(password);
        if(isValid){
            isValid = secondValidator.validate(password);
        }
        return  isValid;
    }
}
