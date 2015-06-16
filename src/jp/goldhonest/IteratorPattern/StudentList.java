package jp.goldhonest.IteratorPattern;

/**
 * Created by 1256670 on 2015/06/12.
 * TODO:MyStudentList �N���X�ƁAMyStudentListIterator �N���X���������Ȃ����B �������AMyStudentList �N���X�́A�ȑO�̌Â����� StudentList ���g���������̂ɂ��邱�ƁB
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
