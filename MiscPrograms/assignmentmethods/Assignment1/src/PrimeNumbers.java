public class PrimeNumbers {


    private static int flag = 1;

    public PrimeNumbers() {
    }

    public void printPrime(int i) {
        for (i = 1; i <= 1000; i++) {
            if (i == 1 | i == 2)
                output(i);

            else {
                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {
                        flag = 0;
                        break;
                    } else
                        continue;


                }
                if (flag == 1)
                    output(i);

            }
            flag = 1;

        }
    }


    private void output(int i) {
        System.out.print(i + ",");
    }

}