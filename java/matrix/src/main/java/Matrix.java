import java.util.ArrayList;
import java.util.Arrays;

class Matrix {
    ArrayList<int[]> list = new ArrayList<>();
    Matrix(String matrixAsString) {
        String[] stringArr = matrixAsString.split("\\n");

        for (String s : stringArr){
            s = s.trim();
            String[] aux = s.split(" ");

            int[] auxRow = new int[aux.length];

            for (int i = 0; i < auxRow.length; i++) {
                auxRow[i] = Integer.parseInt(aux[i]);
            }
            list.add(auxRow);
        }
    }

    int[] getRow(int rowNumber) {
        return list.get(rowNumber-1);
    }

    int[] getColumn(int columnNumber) {
        int count = 0;
        int[] finalA = new int[list.size()];

        for (int[] a : this.list) {
            for (int j = 0; j < a.length ; j++) {
                if(j == columnNumber - 1){
                    finalA[count] = a[j];
                }
            }
            count++;
        }

        return finalA;
    }
}
