import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class setting {  //��ũ�����ΰ� ��ư ��ġ, ũ�� ���� Ŭ����

	public void setscroll(JScrollPane scroll) {

		scroll.setBounds(0, 30, 397, 300);
		scroll.setVisible(false);
	}
	public void setbutton(JButton button,int a, int b, int c, int d,boolean bool) {

		button.setBounds(a, b, c, d);
		button.setVisible(bool);
	}
}
