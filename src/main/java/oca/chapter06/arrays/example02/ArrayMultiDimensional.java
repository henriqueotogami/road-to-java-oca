package oca.chapter06.arrays.example02;

/**
 * <br>Exemplo de declaração e inicialização de arrays multidimensionais em Java.
 *
 * @author henriqueotogami
 * @since 2026-05-02
 * @version 0.7
 */
public class ArrayMultiDimensional {

    //Um exemplo de um array bidimensional sendo declarado das duas maneiras
    String[][] chessBoard1;
    String chessBoard2[][];

    String[][] square1 = {{"1","2"},{"3","4"}};
    String[][] square2 = new String[2][2];

    //Um exemplo de um array tridimensional sendo declarado das duas maneiras
    int[][][] cube1;
    int cube2[][][];

    int[][][] cube3      = new int[3][3][3];
    int[][] oddSizeArray = { {1,2},{1,2,3,4},{1,2,3} };
    int[][][] array3D    = new int[2][][];
    int[][] grid         = {{1,2},{3,4}};
    int[] subGrid        = grid[1];

    public ArrayMultiDimensional() {
        array3D[0]    = new int[5][];
        array3D[1]    = new int[3][];
        array3D[0][0] = new int[7];
        array3D[0][1] = new int[2];
        array3D[1][0] = new int[4];
    }

    public void setCube1(int[][][] cube1) {
        this.cube1 = cube1;
    }

    public int[][][] getCube1() {
        return cube1;
    }

    public int[][][] getArray3D() {
        return array3D;
    }
}
