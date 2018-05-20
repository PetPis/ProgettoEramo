# ProgettoEramo
##### Project for Object-Oriented-Software-Design course of [University of L'Aquila](http://univaq.it/)
##### This project has the aim to realize a gaming platform in which are present three main actors: simple user, moderator and administrator.
* Simple user can earn exp points and collect trophies by playing games, he can review and vote games too.
* Moderator user can do the same things of Simple users but he can also promote or demote other users and they can approve or disapprove review made by users
* Aministrator user can't play so he has not trophies, levels or exp points. He can Promote, Demote or delete users, insert and delete games, and he can manage the Database

##### For more details read the [documentations](https://github.com/PetPis/ProgettoEramo/blob/master/doc/PIATTAFORMA%20GAMING.pdf)

# Team
1. Marco Pistilli
2. Davide Petrini

# Repository Structure
## Repository structure
 ```
.
├── doc
│   └── documentation.pdf
│
├── javadoc
│
└── src
    │
    ├── controller
    │   ├── AmministratoreController.java
    │   ├── GestioneUtenza.java
    │   ├── GiocoController.java
    │   ├── ModeratoreController.java
    │   └── UtenteController.java
    │  
    ├── model
    │   │
    │   ├── dao
    │   │   ├── concrete
    │   │   │   ├── GiocoDao.java
    │   │   │   ├── RecensioneDao.java
    │   │   │   └── UtenteDao.java
    │   │   │
    │   │   └── interfaces
    │   │       ├── GiocoDaoInterface.java
    │   │       ├── RecensioneDaoInterface.java
    │   │       └── UtenteDaoInterface.java
    │   │   
    │   ├── database
    │   │   ├── DB.java
    │   │   └── SQL.sql
    │   │
    │   ├── Gioco.java
    │   ├── Recensione.java
    │   └── Utente.java
    └── view
        ├── amministratore
        │   ├── AddGameView.java
        │   ├── AmministratoreView.java
        │   ├── EditGameView.java
        │   └── UserListAdminView.java
        │
        ├── gioco
        │   ├── GiocoRecensioniView.java
        │   └── GiocoView.java
        │
        ├── img
        │
        ├── Login.java
        ├── SignUp.java
        │  
        ├── moderatore
        │   ├── ModeratoreView.java
        │   ├── UserListView.java
        │   └── ReviewListview.java
        │
        └── utente
            ├── GameListUtente.java
            ├── UtenteView.java
            ├── ProfiloGamingView.java
            ├── ProfiloPersonaleView.java
            └── TrofeiView.java
```

# Prerequisite
* [java](https://www.java.com/it/download/) to run application
* [SQLiteStudio](https://sqlitestudio.pl/index.rvt?act=download) to make app work with database

## Contacts

 - marco.pistilli@student.univaq.it
 - davide.petrini1@student.univa.it


## License

 This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
