/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

/**
 *
 * @author 203pc19
 */
public class NewClass {

    char[] plaza;

    public void parking() {
        plaza = new char[100];
    }

    public void parking(int numPlazas) {
        plaza = new char[numPlazas];
    }

    private void inicializar() {
        for (int numPlazas = 0; numPlazas < plaza.length; numPlazas++) {
            plaza[numPlazas] = 'L';
        }
    }

    public int entrada() {
        int numPlazas = 0;
        boolean encontrado = false;
        while (numPlazas < plaza.length && !encontrado) {
            if (plaza[numPlazas] == 'L') {
                encontrado = true;
            } else {
                numPlazas++;
            }
        }
        if (encontrado) {
            plaza[numPlazas] = 'O';
        } else {
            numPlazas = -1;
        }
        return numPlazas;
    }

    public int salida(int numPlazas) {
        boolean encontrado = false;
        while (numPlazas < plaza.length && !encontrado) {
            if (plaza[numPlazas] == 'O') {
                encontrado = true;
            } else {
                numPlazas--;
            }
        }
        if (encontrado) {
            plaza[numPlazas] = 'L';
        } else {
            numPlazas = +1;
        }
        return numPlazas;
    }

    public void visualizar() {
        System.out.println("NºPlazas\tEstado");
        for (int numPlazas = 0; numPlazas < plaza.length; numPlazas++) {
            System.out.println(numPlazas + "\t" + plaza[numPlazas]);
        }
    }
}
