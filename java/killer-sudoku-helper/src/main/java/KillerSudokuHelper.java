import java.util.ArrayList;
import java.util.List;

public class KillerSudokuHelper {

    List<Integer> validNumbers = new ArrayList<>();

    KillerSudokuHelper() {
        this.validNumbers.add(1);
        this.validNumbers.add(2);
        this.validNumbers.add(3);
        this.validNumbers.add(4);
        this.validNumbers.add(5);
        this.validNumbers.add(6);
        this.validNumbers.add(7);
        this.validNumbers.add(8);
        this.validNumbers.add(9);
    }

    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize, List<Integer> exclude) {
        List<List<Integer>> list = new ArrayList<>();
        this.validNumbers.removeAll(exclude);

        switch (cageSize) {
            case 1: {
                list = oneDigitSum(cageSum, this.validNumbers);
                break;
            }
            case 2: {
                list = twoDigitSum(cageSum, this.validNumbers);
                break;
            }
            case 3: {
                list = threeDigitSum(cageSum, this.validNumbers);
                break;
            }
        }

        return list;
    }

    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize) {
        List<List<Integer>> list = new ArrayList<>();

        switch (cageSize) {
            case 1: {
                list = oneDigitSum(cageSum, this.validNumbers);
                break;
            }
            case 2: {
                list = twoDigitSum(cageSum, this.validNumbers);
                break;
            }
            case 3: {
                list = threeDigitSum(cageSum, this.validNumbers);
                break;
            }
            case 9: {
                list = nineDigitSum(cageSum, this.validNumbers);
                break;
            }
        }

        return list;
    }

    public List<List<Integer>> oneDigitSum(Integer cageSum, List<Integer> include) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listInternal = new ArrayList<>();

        for (Integer i : include) {
            if (i.equals(cageSum)) {
                listInternal.add(i);
                list.add(new ArrayList<>(listInternal));

                listInternal.clear();
            }

        }
        return list;
    }

    public List<List<Integer>> twoDigitSum(Integer cageSum, List<Integer> include) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listInternal = new ArrayList<>();

        for (Integer i : include) {

            for (Integer j : include) {
                if (i >= j) continue;
                if (i + j == cageSum) {
                    listInternal.add(i);
                    listInternal.add(j);
                    list.add(new ArrayList<>(listInternal));

                    listInternal.clear();
                }
            }

        }
        return list;
    }

    public List<List<Integer>> threeDigitSum(Integer cageSum, List<Integer> include) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listInternal = new ArrayList<>();

        for (Integer i : include) {

            for (Integer j : include) {
                if (i >= j) continue;
                for (Integer k : include) {
                    if (j >= k) continue;
                    if (i + j + k == cageSum) {
                        listInternal.add(i);
                        listInternal.add(j);
                        listInternal.add(k);
                        list.add(new ArrayList<>(listInternal));

                        listInternal.clear();
                    }

                }

            }

        }
        return list;
    }


    public List<List<Integer>> nineDigitSum(Integer cageSum, List<Integer> include) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listInternal = new ArrayList<>();

        for (Integer i : include) {//1
            for (Integer j : include) {//2
                if (i >= j) continue;
                for (Integer k : include) {//3
                    if (j >= k) continue;
                    for (Integer l : include) {//4
                        if (k >= l) continue;
                        for (Integer m : include) {//5
                            if (l >= m) continue;
                            for (Integer n : include) {//6
                                if (m >= n) continue;
                                for (Integer o : include) {//7
                                    if (n >= o) continue;
                                    for (Integer p : include) {//8
                                        if (o >= p) continue;
                                        for (Integer q : include) {//9
                                            if (p >= q) continue;
                                            if (i + j + k + l + m + n + o + p + q == cageSum) {
                                                listInternal.add(i);
                                                listInternal.add(j);
                                                listInternal.add(k);
                                                listInternal.add(l);
                                                listInternal.add(m);
                                                listInternal.add(n);
                                                listInternal.add(o);
                                                listInternal.add(p);
                                                listInternal.add(q);
                                                list.add(new ArrayList<>(listInternal));

                                                listInternal.clear();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }
        return list;
    }

}
