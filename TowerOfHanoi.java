package dsa.recursion;

public class TowerOfHanoi {

 
    public static void hanoi(int n, char from, char to, char aux) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        hanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        hanoi(n - 1, aux, to, from);
    }

   
    public static void main(String[] args) {

        int disks = 3;
        System.out.println("Tower of Hanoi steps:");
        hanoi(disks, 'A', 'C', 'B');
    }
}
