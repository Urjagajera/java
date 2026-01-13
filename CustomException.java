class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class CustomException {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Not eligible");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) throws InvalidAgeException {
        checkAge(16);
    }
}
