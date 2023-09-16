class Main {
    public static final int SIZE = 5;

    public static int[][] pandemic(int[][] field, int[][] agents) {
        int a;
        int b;
        for (int[] anAgents : agents) {
            a = anAgents[0];
            b = anAgents[1];
            if (field[a][b] != 0) {
                field[a][b] = field[a][b] * 2;
            } else {
                field[a][b] = 1;
            }
        }
        return (field);
    }

    public static void print(int[][] result) {
        for (int[] column : result) {
            for (int row : column) {
                System.out.format("%2d", row);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] field = new int[SIZE][SIZE];
        int[][] agents = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};
        int[][] result = pandemic(field, agents);
        print(result);
    }
}