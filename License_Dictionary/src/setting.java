import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class setting {  //스크롤페인과 버튼 위치, 크기 설정 클래스

	public void setscroll(JScrollPane scroll) {

		scroll.setBounds(0, 30, 397, 300);
		scroll.setVisible(false);
	}
	public void setbutton(JButton button,int a, int b, int c, int d,boolean bool) {

		button.setBounds(a, b, c, d);
		button.setVisible(bool);
	}
}
