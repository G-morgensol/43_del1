package test;
import static spil.EyeSum.SumPlayer1;

public class test {
    public static void main(String[] args) {
        int TestCount = 1;
        //Defines variables that will store the frequency of sums between 2-12 in the test.
        int Count2 = 0;
        int Count3 = 0;
        int Count4 = 0;
        int Count5 = 0;
        int Count6 = 0;
        int Count7 = 0;
        int Count8 = 0;
        int Count9 = 0;
        int Count10 = 0;
        int Count11 = 0;
        int Count12 = 0;


        while (TestCount <= 1000) {
            //Calls SumPlayer1() Method that rolls 2 dice and returns the sum.
            SumPlayer1();
            int TestSum = SumPlayer1();
            System.out.println((SumPlayer1()));
            if (TestSum == 2) {
                Count2 = Count2 + 1;
            }
            else if (TestSum == 3) {
                Count3 = Count3 + 1;

            }
            else if (TestSum == 4) {
                Count4 = Count4 + 1;

            }
            else if (TestSum == 5) {
                Count5 = Count5 + 1;

            }
            else if (TestSum == 6) {
                Count6 = Count6 + 1;

            }
            else if (TestSum == 7) {
                Count7 = Count7 + 1;

            }
            else if (TestSum == 8) {
                Count8 = Count8 + 1;

            }
            else if (TestSum == 9) {
                Count9 = Count9 + 1;

            }
            else if (TestSum == 10) {
                Count10 = Count10 + 1;

            }
            else if (TestSum == 11) {
                Count11 = Count11 + 1;

            }
            else if (TestSum == 12) {
                Count12 = Count12 + 1;

            }
            System.out.println("Repeat number: " +TestCount);
            //Adds one to the number of repeats done.
            TestCount++;
        }
        System.out.println("Total Frequency of sums:");
        System.out.println(Count2);
        System.out.println(Count3);
        System.out.println(Count4);
        System.out.println(Count5);
        System.out.println(Count6);
        System.out.println(Count7);
        System.out.println(Count8);
        System.out.println(Count9);
        System.out.println(Count10);
        System.out.println(Count11);
        System.out.println(Count12);
        System.out.println("Total sum of frequencies");
        System.out.println(Count2+Count3+Count4+Count5+Count6+Count7+Count8+Count9+Count10+Count11+Count12);

    }
}
