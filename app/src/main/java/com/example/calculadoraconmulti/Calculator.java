package com.example.calculadoraconmulti;

/**
 * Esta clase representa una calculadora que realiza operaciones matematicas simples.
 *
 *
 * @author Cesar Alvaro
 * @version 2.0
 */
public class Calculator {

    /**
     * Calcula el resultado de una expresion aritmetica dada como una cadena.
     *
     * @param input La expresion aritmetica en formato de cadena.
     * @return El resultado de la operacion aritmetica en formato entero.
     */
    public int calculate(String input) {
        // Crea una variable de tipo entero para almacenar el resultado de la operación
        int result;

        if (input.contains("++") || input.contains("+-") || input.contains("+x")
                || input.contains("--") || input.contains("-+") || input.contains("-x")
                || input.contains("xx") || input.contains("x-") || input.contains("x+")) {
            // Si la expresión no es válida el resultado a mostrar será -1
            result = -1;
        } else if (input.contains("+")) {
            // Si contiene el signo "+"
            // Busca la posición de "+" en la expresión y divide la expresión en 2 strings
            int plusIndex = input.indexOf("+");
            String string1 = input.substring(0, plusIndex);
            String string2 = input.substring(plusIndex + 1, input.length());
            // Calcula la suma
            result = calculate(string1) + calculate(string2);
        } else if (input.contains("-")) {
            // Si contiene el signo "-"
            // Busca la posición de "-" en la expresión y divide la expresión en 2 strings
            int minusIndex = input.lastIndexOf("-");
            String string1 = input.substring(0, minusIndex);
            String string2 = input.substring(minusIndex + 1, input.length());
            if (minusIndex == 0) {
                // Si "-" está en la primera posición de la expresión calcula el negativo del segundo string
                result = calculate(string2) * -1;
            } else {
                // Si "-" no está en la primera posición de la expresión calcula la resta
                result = calculate(string1) - calculate(string2);
            }
        } else if (input.contains("x")) {
            // Si contiene el signo "x"
            // Busca la posición de "x" en la expresión y divide la expresión en 2 strings
            int multIndex = input.indexOf("x");
            String string1 = input.substring(0, multIndex);
            String string2 = input.substring(multIndex + 1, input.length());
            // Calcula la multiplicación
            result = calculate(string1) * calculate(string2);
        } else {
            // Si la expresión no contiene símbolos matemáticos
            // "parsea" el string en pantalla a entero
            result = Integer.parseInt(input);
        }

        // Devuelve el resultado de la operación
        return result;
    }
}
