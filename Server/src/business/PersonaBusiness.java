package business;

import domain.Persona;
import java.io.IOException;
import java.sql.SQLException;



public class PersonaBusiness {

    public boolean registrarPersona(Persona p) throws ClassNotFoundException, SQLException, IOException {

        data.PersonaData metodos = new data.PersonaData();
        metodos.insert(p);
        return true;
    }

}
