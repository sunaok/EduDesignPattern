package jp.goldhonest.PrototypePattern;

/**
 * Created by 1256670 on 2015/06/15.
 */
public class Teacher {
    public Paper[] createManyCrystals() {
        Paper prototype = new Paper("Snow");
        drawCrystal(prototype);
        cutAccordanceWithLine(prototype);
        Paper[] papers = new Paper[100];
        for (int n = 0; n < papers.length; n++) {
            papers[n] = (Paper) prototype.createClone();
        }
        return papers;
    }

    private void drawCrystal(Paper paper) {
        //���ꂢ�ɕ`�����ߎ��Ԃ�������
    }

    private void cutAccordanceWithLine(Paper paper) {
        //�`���ꂽ���ɉ����Ă��ꂢ�ɐ؂�ɂ͎��Ԃ�������
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Paper[] papers = teacher.createManyCrystals();
        for (Paper paper : papers) {

        }
    }
}
