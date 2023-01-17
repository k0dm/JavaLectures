package lecture29.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ValidatorChain validator = new ValidatorChain(new ValidatorChain(
                new IsEmptyValidator(),
                new SizeValidator()
        ),
                new HasNumberValidator()
        );
        String password;

        System.out.print("Enter the password(): ");
        password = scanner.nextLine();

        validator.validate(password);



    }
}
