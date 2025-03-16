

package Eje_11_users;

public class UserValidator {

    static void validateUser(User user) throws NameInvalidException, AgeInvalidException, EmailInvalidException{

        if (user.getName().isEmpty()){
            throw new NameInvalidException("Name can't be empty");
        }
        if(user.getAge() < 18){
            throw new AgeInvalidException("The age is under 18");
        }
        if(!user.getEmail().contains("@")){
            throw new EmailInvalidException("The email must to include: @");
        }
    }
}
