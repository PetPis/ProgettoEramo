package Controller;

import java.sql.SQLException;

import Model.*;
import Model.DAO.Concrete.UtenteDao;
import Model.dao.Concrete.GiocoDao;

/**
 * Class which represents the controller of MVC pattern for the adminstrator
 */
public class AmministratoreController {

    private Utente utente_target;
    private Gioco gioco;

    /**
     * Basic constructor
	*
     */
    public AmministratoreController() {
    }

    /**
     * Full constructor
     *
     * @param utente_target AmministratoreController's user on which admin can
     * operate
     * @param gioco AmministratoreController's game on which admin can operate
     */
    public AmministratoreController(Utente utente_target, Gioco gioco) {
        this.utente_target = utente_target;
        this.gioco = gioco;
    }

    /**
     * User constructor
     *
     * @param utente_target AmministratoreController's user on which admin can
     * operate
     */
    public AmministratoreController(Utente utente_target) {
        this.utente_target = utente_target;
    }

    /**
     * Game constructor
     *
     * @param gioco AmministratoreController's game on which admin can operate
     */
    public AmministratoreController(Gioco gioco) {
        this.gioco = gioco;
    }

    /**
     * Method used to insert a new game
     *
     * @param nome game's name
     * @param exp game's amount of exp
     * @return String information string about insertion
     */
    public String insertGame(String nome, int exp) {
        if (exp > 100) {
            return "A game can't give more then 100exp";
        }
        gioco = new Gioco(nome,exp);
        try {
            new GiocoDao().insertGame(gioco);
            return "Game has been successfully added!";
        } catch (SQLException e) {
            return "Game already exists!.";
        }
    }

    /**
     * Method used to delete an existing game
     *
     * @return String information string about cancellation
     */
    public String deleteGame() {
        try {
            new GiocoDao().deleteGame(gioco);
            return "Game has been successfully deleted !";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method used to delete an existing user
     *
     * @return String information string about cancellation
     */
    public String deleteUser() {
        try {
            new UtenteDao().deleteUser(utente_target);
            return "User has been successfully deleted!";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
