package Controller;

import java.sql.SQLException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import Model.*;
import Model.DAO.Concrete.UtenteDao;

/**
 * Class which implements methods about user's mainteinance
 */
public class GestioneUtenza {

    /**
     * Method used to login into the platform
     *
     * @param username user's username
     * @param password user's password
     * @return Utente istance of user
     */
    public Utente logIn(String username, String password) {
        try {
            if (new UtenteDao().findUserByUsername(username) == null) {
                return null;
            }

            Utente utente = new UtenteDao().findUserByUsername(username);

            //Mysql is case insensitive
            if (!utente.getUsername().equals(username)) {
                return null;
            }
            if (password.equals(utente.getPassword())) {
                return utente;
            }
            return null;
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return null;
    }

    /**
     * Method used to find a user by his username
     *
     * @param username user's username
     * @return Utente istance of user
     */
    public Utente findUser(String username) {
        try {
            return new UtenteDao().findUserByUsername(username);
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return null;
    }

    /**
     * Method used to sign up into the platform
     *
     * @param name user's name
     * @param surname user's surname
     * @param username user's username
     * @param mail user's email
     * @param password user's password
     * @param password2 confirm password
     * @return int information number about enrolment status
     */
    public int signUp(String name, String surname, String username, String mail, String password, String password2) {

        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[\\w!#$%&Ã¢â‚¬â„¢*+/=?`{|}~^-]+(?:\\.[\\w!#$%&Ã¢â‚¬â„¢*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(mail);

        try {
            if (name.trim().isEmpty() || surname.trim().isEmpty() || username.trim().isEmpty() || mail.trim().isEmpty() || password.trim().isEmpty() || password2.trim().isEmpty()) {
                return 1;
            }
            if (name.length() > 30 || surname.length() > 30 || surname.length() > 30 || mail.length() > 50 || password.length() > 30) {
                return 2;
            }
            if (new UtenteDao().usernameAlreadyUsed(username)) {
                return 3;
            }
            if (new UtenteDao().emailAlreadyUsed(mail)) {
                return 4;
            }
            if (!matcher.find()) {
                return 5;
            }
            if (password2.length() < 8) {
                return 6;
            }
            if (!password.equals(password2)) {
                return 7;
            }

            Utente ut = new Utente(name, surname, username, mail, password);

            new UtenteDao().insertUser(ut);
            return 0;
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return -1;
    }

    /**
     * Method to update user's informations
     *
     * @param column value to be changed
     * @param newValue new value for the column
     * @param utente user that receives the update
     * @return String message to be displayed
     */
    public String updateValue(String column, String newValue, Utente utente) {

        try {
            switch (column) {

                case "nome":
                    if (newValue.trim().isEmpty()) {
                        return "Name can't be empty!";
                    }
                    if (newValue.length() > 30) {
                        return "Name can't be longer then 30 chars!";
                    }
                    if (utente != null) {
                        new UtenteDao().updateUser(column, newValue, utente);
                        utente.setNome(newValue);
                    }
                    return "Name has been successfully updated!";

                case "cognome":
                    if (newValue.trim().isEmpty()) {
                        return "Surname can't be empty!!";
                    }
                    if (newValue.length() > 30) {
                        return "Surname can't be longer then 30 chars!";
                    }
                    if (utente != null) {
                        new UtenteDao().updateUser(column, newValue, utente);
                        utente.setCognome(newValue);
                    }
                    return "Surname has been successfully updated";

                case "username":
                    if (newValue.trim().isEmpty()) {
                        return "Username can't be empty!";
                    }
                    if (newValue.length() > 30) {
                        return "Username can't be longer then 30 chars!";
                    }
                    if (new UtenteDao().usernameAlreadyUsed(newValue)) {
                        return "Username already used!";
                    }
                    if (utente != null) {
                        new UtenteDao().updateUser(column, newValue, utente);
                        utente.setUsername(newValue);
                    }
                    return "Username has been successfully update!";

                case "email":
                    if (newValue.trim().isEmpty()) {
                        return "E-Mail can't be empty!";
                    }
                    if (newValue.length() > 45) {
                        return "E-Mail can't be longer then 45 chars!";
                    }

                    Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[\\w!#$%&Ã¢â‚¬â„¢*+/=?`{|}~^-]+(?:\\.[\\w!#$%&Ã¢â‚¬â„¢*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
                    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(newValue);

                    if (new UtenteDao().emailAlreadyUsed(newValue)) {
                        return "E-mail already used!";
                    }
                    if (!matcher.find()) {
                        return "Invalid E-Mail!";
                    }
                    if (utente != null) {
                        new UtenteDao().updateUser(column, newValue, utente);
                        utente.setEmail(newValue);
                    }
                    return "Email has been successfully updated!";

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //This is an example of overload.
    /**
     * Method to update user's password
     *
     * @param column password column
     * @param nuova_password new password
     * @param conferma_password password check
     * @param utente user that receives the update
     * @return String message to be displayed
     */
    public String updateValue(String column, String nuova_password, String conferma_password, Utente utente) {
        if (nuova_password.trim().isEmpty()) {
            return "Password can't be empty";
        }

        if (nuova_password.length() > 30) {
            return "E-Password can't be longer then 45 chars!";
        }

        if (nuova_password.length() < 8) {
            return "Password can't be shorted then 8 chars!";
        }

        if (!nuova_password.equals(conferma_password)) {
            return "Passwords must coincide!";
        }

        try {
            new UtenteDao().updateUser(column, nuova_password, utente);
            utente.setPassword(nuova_password);
            return "Password has been successfully updated!";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
