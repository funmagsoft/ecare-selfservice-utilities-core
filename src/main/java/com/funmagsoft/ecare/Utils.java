package com.funmagsoft.ecare;

/**
 * Klasa narzędziowa zawierająca statyczne funkcje pomocnicze.
 */
public class Utils {

    /**
     * Konwertuje dowolny string na jego wersję UPPER (wielkie litery).
     * 
     * @param str string do konwersji
     * @return string w wersji UPPER, lub null jeśli wejściowy string był null
     */
    public static String upper(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
}
