import java.util.Scanner;
public class XOR
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input A Word: ");
        String word = input.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Input a Number Between 1-255");
        int Key = input2.nextInt();



        char charArray[] = word.toCharArray();

        String finalOutput = "";

        for (char c: charArray)
        {
            int XORNumber = c^Key;
            char newChar = ((char) XORNumber);
            System.out.println(c + " [" + ((int) c) + "] -> " + newChar + " [" + XORNumber + "]");
            finalOutput += newChar;
        }

        System.out.println(finalOutput);



    }
}
