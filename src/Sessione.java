public class Sessione {
    String nomeSessione;
    Utente utenteLoggato;
    String[] dati;

    public Sessione(){
        nomeSessione = "Sessione di " + utenteLoggato.username;
        dati[0] = utenteLoggato.username;
        dati[1] = utenteLoggato.email;
        dati[2] = utenteLoggato.password;
    }
}
