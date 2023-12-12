package ub3;

import java.util.ArrayList;

public class MatrixOperations {
    public ArrayList<ArrayList<Integer>> matrix1;
    public ArrayList<ArrayList<Integer>> matrix2;

    public MatrixOperations(ArrayList<ArrayList<Integer>> matrix1, ArrayList<ArrayList<Integer>> matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public static class sumThread extends Thread {
        public ArrayList<ArrayList<Integer>> resultMatrix;
        public ArrayList<ArrayList<Integer>> m1;
        public ArrayList<ArrayList<Integer>> m2;

        public sumThread(ArrayList<ArrayList<Integer>> m1, ArrayList<ArrayList<Integer>> m2) {
            this.m1 = m1;
            this.m2 = m2;
            this.resultMatrix = new ArrayList<>();

            for (int i = 0; i < m1.size(); i++) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j < m1.get(i).size(); j++) {
                    temp.add(0);
                }
                resultMatrix.add(temp);
            }
        }

        @Override
        public void run() {

        }
    }
}
