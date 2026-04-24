package dao;

import modelo.Usuario;
import java.util.HashMap;
import java.io.*;

public class UsuarioDAO {

    public static HashMap<String, Usuario> usuarios = new HashMap<>();
    private static final String ARCHIVO = "usuarios.dat";

    // GUARDAR
    public static void guardar() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO));
            oos.writeObject(usuarios);
            oos.close();
        } catch (Exception e) {
            System.out.println("Error saving");
        }
    }

    // CARGAR
    public static void cargar() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO));
            usuarios = (HashMap<String, Usuario>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            System.out.println("No data saved yet");
        }
        
         if (usuarios.isEmpty()) {
        usuarios.put("admin", new Usuario("admin", "Admin123!@#", "ADMIN"));
    }
}
}