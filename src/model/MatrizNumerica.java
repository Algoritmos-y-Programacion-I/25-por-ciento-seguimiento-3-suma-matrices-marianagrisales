package model;

public class MatrizNumerica {

    private int[][] matriz; // Declaro
    private int cantFilas;
    private int cantColumnas;

    public MatrizNumerica(int filas, int columnas) {
        cantFilas = filas;
        cantColumnas = columnas;
        this.matriz = new int[filas][columnas]; // Inicializo
    }

    public void insertarValor(int i, int j, int valor) {
        matriz[i][j] = valor;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public static MatrizNumerica sumaMatrices(MatrizNumerica m1, MatrizNumerica m2){
        int filas = m1.cantFilas;
        int columnas = m1.cantColumnas;
        MatrizNumerica resultado = new MatrizNumerica(filas, columnas);

        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++){
                int suma = m1.matriz[i][j] + m2.matriz[i][j];
                resultado.insertarValor(i, j, suma);
            }
        }
        return resultado;
    }


}