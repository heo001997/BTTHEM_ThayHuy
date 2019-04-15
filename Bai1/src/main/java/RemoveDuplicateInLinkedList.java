import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicateInLinkedList {
    private static List<Integer> listInteger = new LinkedList<Integer>();
    private static int listLenght;

    private void processInput (String currString){
        String[] splitString;
        splitString = currString.split(" ");

        for (String s : splitString) {
            listInteger.add(Integer.parseInt(s));
        }
    }

    private void processResult (){
        int listIntegerSize = listInteger.size();
        boolean nextIsDuplicated = false;

        for (int i=0; i<listIntegerSize; i++){
            if (i + 1 < listIntegerSize) {
                int nextInteger = i + 1;
                if (listInteger.get(i).equals(listInteger.get(nextInteger))){
                    nextIsDuplicated = true;
                } else {
                    if (!nextIsDuplicated){
                        listInteger.set(listLenght, listInteger.get(i));
                        listLenght++;
                    }
                    nextIsDuplicated = false;
                }
            } else{
                if (!nextIsDuplicated){
                    listInteger.set(listLenght, listInteger.get(i));
                    listLenght++;
                }
            }
        }
    }

    private void showList (){
        if (listLenght != 0){
            for (int i=0; i<listLenght; i++){
                if (i!=0) {
                    System.out.print(" ");
                }
                System.out.print(listInteger.get(i));
            }
        }else{
            System.out.print("No element left");
        }
        System.out.println();
    }

    private void reset (){
        listLenght = 0;
        listInteger.clear();
    }

    public static void main(String[] args) {
        try {
            RemoveDuplicateInLinkedList rDIILL = new RemoveDuplicateInLinkedList();
            Scanner scanner = new Scanner(new File("F:\\ConnectionPool\\src\\main\\resources\\INPUT\\input_ints.txt"));
            int ntest = scanner.nextInt(); scanner.nextLine();

            for (int i=0; i<ntest; i++){
                rDIILL.reset();
                rDIILL.processInput(scanner.nextLine());
                rDIILL.processResult();
                rDIILL.showList();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
