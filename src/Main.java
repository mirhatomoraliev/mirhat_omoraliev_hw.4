import java.util.*;

public class Main{
    public static void main(String[] args) {

        final int num=5;

        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        System.out.println("Введите "+num+" имен.");
        createList(listA);
        System.out.println("List A: "+listA);

        System.out.println("Введите ещё "+num+" имен.");
        createList(listB);
        System.out.println("List B: "+listB);
        Collections.reverse(listB);

        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println("List C: "+listC);
        Comparator<String> lengthComparator = new Sort();
        Collections.sort(listC, lengthComparator);
        System.out.println("Sort------------\n"+listC);
    }
    public static void createList(ArrayList<String> list){
        Scanner scanner = new Scanner(System.in);
        final int num=5;
        for (int i = 0; i < num; i++) {
            System.out.print(i+1+"-");
            String word = scanner.next();
            list.add(word);
        }
    }
}
