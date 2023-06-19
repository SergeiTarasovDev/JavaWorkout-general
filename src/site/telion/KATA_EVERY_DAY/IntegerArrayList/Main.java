package site.telion.KATA_EVERY_DAY.IntegerArrayList;

public class Main {
    public static void main(String[] args) {
        IntegerArrayList listik = new IntegerArrayList();
        System.out.println("listik.size() = " + listik.size());
        listik.add(10);
        listik.add(30942304);
        listik.add(-200);
        System.out.println("listik = " + listik);
        listik.set(220, 1);
        System.out.println("listik = " + listik);
        listik.remove(0);
        System.out.println("listik = " + listik);
    }
}
