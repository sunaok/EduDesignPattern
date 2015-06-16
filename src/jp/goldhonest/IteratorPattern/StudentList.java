package jp.goldhonest.IteratorPattern;

/**
 * Created by 1256670 on 2015/06/12.
 * TODO:MyStudentList クラスと、MyStudentListIterator クラスを実装しなさい。 ただし、MyStudentList クラスは、以前の古い名簿 StudentList を拡張したものにすること。
 */
public class StudentList {
    protected Student[] students;
    private int last = 0;
    public StudentList(){super();}

    public StudentList(int studentCount) {
        this.students = new Student[studentCount];
    }

    public Student getStudentAt(int index) {
        return students[index];
    }

    public int getLastNum() {
        return last;
    }

    public void add(Student student) {
        students[last] =student;
        last++;

    }
}
