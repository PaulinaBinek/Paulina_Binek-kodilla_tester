public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public int getLast() {
        return grades[size - 1];
    }

    public int average() {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result = result + grades[i];
        }
        return result/size;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(10);
        grades.add(5);
        grades.add(10);
        grades.add(1);
        grades.add(5);
        grades.add(7);

        System.out.println(grades.getLast());
        System.out.println(grades.size);
        System.out.println(grades.average());
    }
}
