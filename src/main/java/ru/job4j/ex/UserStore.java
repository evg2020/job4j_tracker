package ru.job4j.ex;
//0.5. Иерархия исключений и множественный catch. [#299274]
/*
 Вам необходимо реализовать метод findUser, validate и main.
         -findUser - если пользователя не нашли в списке,
         то кинуть исключение UserNotFoundException.
         -validate - если пользователь не валидный или если имя пользователя
         состоит из менее трех символов, то кинуть исключение UserInvalidException
         -Метод validate принимает аргумент user. У объекта user есть метод isValid(). Если он false, то нужно выкинуть исключение UserInvalidException.
         Так же в этом методе нужно проверить, что у объекта user количество символов в поле username меньше 3.
         Если оно меньше, то нужно выкинуть исключение UserInvalidException.
         Для этого нужно воспользоваться методом String.lenght().
         main - поправить код за счет использования try-catch с множественным блоком catch.
         В блоке catch(UserNotFoundException) - должно быть выведено на консоль сообщение, что пользователя не найдено.
         В блоке  catch(UserInvalidException) - должно быть выведено на консоль сообщение, что пользователь не валидный.
*/

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                user = users[i];
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User is not in the list");
        }
        return user;
    }

    public  static  boolean validate(User user) throws UserInvalidException {
        boolean res = true;
        if (user.getUsername().length() < 3 || (user.isValid() == false)) {
            res = false;
            throw new UserInvalidException("If the user is not valid");
        }
        return  res;
    }


    public static void main(String[] args) {

        try {
        User[] users = {new User("Petr Arsentev", true)};
        User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
