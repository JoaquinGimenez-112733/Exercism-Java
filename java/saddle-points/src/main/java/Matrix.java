import java.util.*;

class Matrix {
    private List<List<Integer>> list = new ArrayList<>();
    Matrix(List<List<Integer>> values) {
        this.list = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {

        Set<MatrixCoordinate> saddlePoints = new HashSet<>();

        int row = 0;
        for (List<Integer> l : this.list){ //rows

            int valueOfCandidateRow = rowCandidatePoint(l);

            for (int i = 0; i < l.size(); i++) { // cols
                if(l.get(i) == valueOfCandidateRow){
                    List<Integer> cols = getColumnOfCandidateRow(i);

                    if(isSaddlePoint(cols, valueOfCandidateRow)){
                        MatrixCoordinate m =  new MatrixCoordinate(row+1, i+1);
                        saddlePoints.add(m);
                    }
                }
            }

            row++;
        }
        return saddlePoints;
    }

    int rowCandidatePoint(List<Integer> l){
        List<Integer> copy = new ArrayList<>(l);
        Collections.sort(copy);
        return copy.getLast();
    }

    List<Integer> getColumnOfCandidateRow(int indexCandidate){
        List<Integer> cols = new ArrayList<>();

        for (List<Integer> l : this.list){
            Integer i = l.get(indexCandidate);
            cols.add(i);
        }

        return cols;
    }

    boolean isSaddlePoint(List<Integer> l, Integer rowCandidate){
        boolean result = true;

        for (Integer i : l){
            if(i < rowCandidate){
                result = false;
            }
        }
        return result;
    }
}
