package ru.job4j.ex;

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
