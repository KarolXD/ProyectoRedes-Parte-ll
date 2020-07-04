package data;

import data.DatabaseMYSQL;
import domain.Persona;
import gui.Formulario;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PersonaData extends DatabaseMYSQL {

    public PersonaData() {
    }

    public void insert(Persona carrera) throws ClassNotFoundException, SQLException, IOException {
        try {
            String sqlLlamada = "{CALL registrarCliente(?,?)}";//nombre del procedimiento almacenado

            Connection conexion = getConection();

            CallableStatement callableStatement = conexion.prepareCall(sqlLlamada);

            callableStatement.setString(1, carrera.getNombre());
            callableStatement.setString(2, carrera.getClave());
            callableStatement.execute();
            System.out.println("Insertado correctamente");
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }
}