package Question15;

import java.util.Scanner;

class InvalidEmailException extends Exception{
    public InvalidEmailException(String msg){
        super(msg);
    }
}


public class Main {
    public static void validMail(String mail)throws InvalidEmailException{
        if(!mail.contains("@")){
            throw new InvalidEmailException("Mail does not contain @");
        }
        else {
            System.out.println("Valid E-mail");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mail");
        String mail = sc.nextLine();
        try {
            validMail(mail);
        }
        catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
}
