package HomeWork5.dto;

public class Student implements Comparable<Student>{
    private final int id;
    private final String name;
    private final int age;
    private final double score;
    private final boolean olympicParticipant;

    public Student(int id, String name, int age, double score, boolean olympicParticipant) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.olympicParticipant = olympicParticipant;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public boolean isOlympicParticipant() {
        return olympicParticipant;
    }
}
