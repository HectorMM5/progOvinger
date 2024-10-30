public class myRandom {
    java.util.Random numGen = new java.util.Random();


    public int nextInteger(int min, int max) {


        if (min >= max) {
            throw new IllegalArgumentException("Minimum kan ikke vaere storre eller lik max");
        }

        else if (min < 0 && max < 0) {
            return (-1*(numGen.nextInt(min, max)));
        }

        else if (min < 0) {
            int range = max - min;
            int tempNum = numGen.nextInt(0, range);

            return (min + tempNum);
        }

        else {
            return (numGen.nextInt(min, max));
        }


    }

    public double nextDouble(double min, double max) {

        int intComponent = nextInteger((int) min, (int) max);

        double tempDouble = ((double) intComponent + numGen.nextDouble());

        while (min > tempDouble || tempDouble > max) {
            tempDouble = ((double) intComponent + numGen.nextDouble());
        }

        return tempDouble;
    }


    public static void main(String[] args) {

        myRandom randomGenerator = new myRandom();

        for (int i = 0; i < 10; i++) {
            System.out.println(randomGenerator.nextInteger(1, 10));
            System.out.println(randomGenerator.nextDouble(1, 10));
        }

    }


}