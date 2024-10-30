
public class matriser {

    public class matrise {

        private final int[][] matrix;

        public matrise(int[][] matrix) {
            this.matrix = matrix;
        }

        public matrise add(matrise m2) {
            if (this.matrix.length != m2.matrix.length || this.matrix[0].length != m2.matrix[0].length) {
                return null;
            }

            int rows = this.matrix.length;
            int cols = this.matrix[0].length;
            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = this.matrix[i][j] + m2.matrix[i][j];
                }
            }
            return new matrise(result);
        }

        public matrise multiply(matrise m2) {
            if (this.matrix[0].length != m2.matrix.length) {
                return null;
            }

            int rows = this.matrix.length;
            int cols = m2.matrix[0].length;
            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) { 
                for (int j = 0; j < cols; j++) { 
                    for (int k = 0; k < this.matrix[0].length; k++) { 
                        result[i][j] += this.matrix[i][k] * m2.matrix[k][j]; 
                    }
                }
            }

            return new matrise(result);
        }

        public matrise transpose() {
            int cols = this.matrix.length;
            int rows = this.matrix[0].length;

            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) { 
                for (int j = 0; j < cols; j++) { 
                    result[i][j] = this.matrix[j][i];
                }
            }

            return new matrise(result);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sb.append(matrix[i][j]).append(" "); // Append each element followed by a space
                }
                sb.append("\n"); // Append a newline after each row
            }
            return sb.toString(); // Return the constructed string
        }

    }

    public static void main(String[] args) {
        matriser matriser = new matriser();
        matrise m1 = matriser.new matrise(new int[][] {{1, 1}, {1, 1}});
        matrise m2 = matriser.new matrise(new int[][] {{2, 1}, {2, 1}});

        matrise result = m1.add(m2);

        System.out.println(result);

        result = m1.multiply(m2);

        System.out.println(result);

        result = m1.transpose();

        System.out.println(result);


    }

}
