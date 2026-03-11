import java.util.*;

class Visitor implements Comparable<Visitor> {
    String name;
    int money;

    public Visitor(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public int compareTo(Visitor other) {
        return Integer.compare(other.money, this.money);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class DS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah orang: ");

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Masukkan nama: ");

        String[] names = sc.nextLine().split(",\\s*");
        
        System.out.println("Masukkan jumlah uang: ");
        List<Visitor> queue = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                int money = sc.nextInt();
                if (i < names.length && !names[i].equalsIgnoreCase("Jeff")) {
                    queue.add(new Visitor(names[i], money));
                }
            }
        }

        Collections.sort(queue);
        System.out.println(queue);
        
        sc.close();
    }
}