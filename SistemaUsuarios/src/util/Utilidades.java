/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

public class Utilidades {

    public static boolean validarPassword(String pass) {
        if (pass.length() < 13) return false;

        boolean mayus = false;
        boolean especial = false;

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) mayus = true;
            if (!Character.isLetterOrDigit(c)) especial = true;
        }

        return mayus && especial;
    }

    public static String encriptar(String pass) {
        return pass; // simple por ahora
    }
}