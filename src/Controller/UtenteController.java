package Controller;

import java.util.TreeMap;
import java.sql.SQLException;

import Model.*;
import Model.DAO.Concrete.RecensioneDao;
import Model.DAO.Concrete.UtenteDao;

/**
 * Class which represents the controller of MVC pattern for the user
 */
public class UtenteController {

    protected Utente utente;
    protected Gioco gioco;

    /**
     * Basic constructor
	*
     */
    public UtenteController() {
    }

    ;
	
	/**
	*Constructor to set User
	*
	*@param utente user
	*/
	public UtenteController(Utente utente) {
        this.utente = utente;
    }

    /**
     * Constructor to set Game
     *
     * @param gioco game
     */
    public UtenteController(Gioco gioco) {
        this.gioco = gioco;
    }

    /**
     * Full constructor
     *
     * @param utente user of UtenteController
     * @param gioco game on which UtenteController will operate
     */
    public UtenteController(Utente utente, Gioco gioco) {
        this.utente = utente;
        this.gioco = gioco;
    }

    /**
     * Method used to play a game
     */
    public void play() {
        try {
            new UtenteDao().play(utente, gioco);
        } catch (SQLException exc) {
            exc.printStackTrace();
        }

    }

    /**
     * Method used to vote a game
     *
     * @param voto vote to assign
     * @return String string information about voting
     */
    public String vote(int voto) {
        try {
            if (new UtenteDao().gameAlreadyVotedByUser(utente, gioco)) {
                new UtenteDao().updateVote(voto, utente, gioco);
                return "Vote has been successfully updated!";
            }

            new UtenteDao().voteGame(voto, utente, gioco);
            return "Voted!";
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return null;
    }

    /**
     * Method used to review a game
     *
     * @param testoRecensione review's text
     * @return String string information about review
     */
    public String review(String testoRecensione) {
        try {
           if (new UtenteDao().reviewAlreadyMadeByUser(utente, gioco)) {
                new UtenteDao().updateReview(testoRecensione, utente, gioco);
                if (utente.getTipo().equals("moderatore")) {
                    new UtenteDao().approveReview(new RecensioneDao().findReviewByUserAndGame(utente, gioco));
                    return "Review has been successfully updated!";
                }
                return "Review updated, a moderator will examine your review!";
            } else {
                new UtenteDao().reviewGame(testoRecensione, utente, gioco);
                if (utente.getTipo().equals("moderatore")) {
                    new UtenteDao().approveReview(new RecensioneDao().findReviewByUserAndGame(utente, gioco));
                    return "Review added!";
                }
                return "Review sent, a moderator will examine your review!.";
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return null;
    }

    /**
     * Method used to get user's timeline
     *
     * @param username user's username
     * @return TreeMap user's timeline
     */
    public TreeMap<Integer, String> timeline(String username) {
        try {
            Utente utente = new UtenteDao().findUserByUsername(username);
            return new UtenteDao().getTimeline(utente);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
     public int NumberOfUsers(){
        try{
            return new UtenteDao().getMaxUsers();
        }catch(SQLException exc){
            exc.printStackTrace();
        }
        return -1;
    }
}
