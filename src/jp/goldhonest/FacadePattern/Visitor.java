package jp.goldhonest.FacadePattern;

/**
 * Created by 1256670 on 2015/07/01.
 */
public class Visitor {
    public static void main(String[] args) {
        //�����}�ӂ͂ǂ��H
        //���ǂ��̃��\�b�h���g���΂����񂾁H
        //������
        //�����̒�����������
        Librarian nakamura = new Librarian();
        //��������ɍ����}�ӂ̏ꏊ�𕷂�
        String location = nakamura.searchBook("�����}��");
        if (location.equals("�ݏo���ł�")) {
            System.out.println("�ݏo������");

        }else if (location.equals("���̖{�͏������Ă��܂���")) {
            System.out.println("�Ȃ񂾂Ȃ��̂�");
        } else {
            System.out.println("���񂭂�");
        }
    }
}
