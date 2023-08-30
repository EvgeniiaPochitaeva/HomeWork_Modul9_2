package HomeWork_Modul9_2;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        String colorBlack = "Black";
        String colorWhite = "White";
        String colorGreen = "Green";
        myLinkedList.add(colorBlack);
        myLinkedList.add(colorWhite);
        myLinkedList.add(colorGreen);

        System.out.println(myLinkedList.size());

        Object secondColor = myLinkedList.get(1);
        System.out.println(secondColor);

        myLinkedList.remove(2);

        myLinkedList.clear();

        myLinkedList.printList();
    }


}
