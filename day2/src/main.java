import java.util.Scanner;

public class main {

    public static void getChecksum(int[][] spreadsheet) {
        int counter = 0;
        int checksum = 0;
        for (int i = 0; i < spreadsheet[counter].length - 1; i += 1) {
            int smallestNumber = 0, largestNumber = 0;
            for (int x = 0; x < spreadsheet[counter].length; x += 1) {
                 if (spreadsheet[counter][x] > largestNumber) {
                     largestNumber = spreadsheet[counter][x];
                 }
                 if (spreadsheet[counter][x] < smallestNumber) {
                     smallestNumber = spreadsheet[counter][x];
                 }
            }
            checksum += (largestNumber - smallestNumber);
            System.out.println("large number: " + largestNumber + "\nSmall number: " + smallestNumber);
            System.out.println("Difference: " + (largestNumber - smallestNumber));
            counter += 1;
        }
        System.out.println("Checksum: " + checksum);
    }

    public static void getInput(int[][] spreadsheet, int counter) {
        if (counter == 2) {
            System.out.println("checksum func");
            getChecksum(spreadsheet);
        } else {
            Scanner s = new Scanner(System.in);
            String line = s.nextLine();
            for (int i = 0; i < line.length(); i += 1) {
                System.out.println(line.charAt(i));
                int curNum = Integer.parseInt(line.substring(i, i + 1));

                spreadsheet[counter][i] = curNum;
            }
            counter += 1;
            getInput(spreadsheet, counter);

        }

    }

    public static void main(String[] args) {

        System.out.println("Enter 5 lines of 5 numbers");
        int[][] spreadsheet = new int[5][5];
        getInput(spreadsheet, 0);


    }

}
