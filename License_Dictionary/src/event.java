import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class event {
	public void changelist(ActionEvent e) {  //����Ʈ ����� �̺�Ʈ
		JComboBox cb=(JComboBox)e.getSource();
		if (cb.getSelectedIndex() == 0) { //0��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.scroll.setVisible(true);
		}
		if (cb.getSelectedIndex() == 1) { //1��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.scroll2.setVisible(true);
		}
		if (cb.getSelectedIndex() == 2) { //2��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.scroll3.setVisible(true);
		}
		if (cb.getSelectedIndex() == 3){ //3��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.scroll4.setVisible(true);
		}
		if (cb.getSelectedIndex() == 4){ //4��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.scroll5.setVisible(true);
		}
		if (cb.getSelectedIndex() == 5){ //5��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.scroll6.setVisible(true);
		}
		if (cb.getSelectedIndex() == 6){ //6��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.scroll7.setVisible(true);
		}
		if (cb.getSelectedIndex() == 7){ //7��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.scroll8.setVisible(true);
		}
		if (cb.getSelectedIndex() == 8){ //8��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.scroll9.setVisible(true);
		}
		if (cb.getSelectedIndex() == 9) { //9��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.scroll10.setVisible(true);
		}
		if (cb.getSelectedIndex() == 10) { //10��° �޺��ڽ� �϶�
			setvisiblebutton();
			project.plus.setVisible(true);
			project.minus.setVisible(true);
			project.scroll11.setVisible(true);
	}
	}
	
	public  void backlist(int index) {       //���� ����Ʈ�� ���ư��� �̺�Ʈ
		if(index==0)
			project.scroll.setVisible(true);
		if(index==1)
			project.scroll2.setVisible(true);
		if(index==2)
			project.scroll3.setVisible(true);
		if(index==3)
			project.scroll4.setVisible(true);
		if(index==4)
			project.scroll5.setVisible(true);
		if(index==5)
			project.scroll6.setVisible(true);
		if(index==6)
			project.scroll7.setVisible(true);
		if(index==7)
			project.scroll8.setVisible(true);
		if(index==8)
			project.scroll9.setVisible(true);
		if(index==9)
			project.scroll10.setVisible(true);
		if(index==10) {
			project.plus.setVisible(true);
			project.minus.setVisible(true);
			project.scroll11.setVisible(true);
		}
	}
	public String savelistname (int index) {
		if(index==0)
			return (String) project.List.getSelectedValue();  //List���� Ŭ���� �׸� name�� ����
		if(index==1)
			return (String) project.List2.getSelectedValue();//List2���� Ŭ���� �׸� name�� ����
		if(index==2)
			return (String) project.List3.getSelectedValue();//List3���� Ŭ���� �׸� name�� ����
		if(index==3)
			return (String) project.List4.getSelectedValue();//List4���� Ŭ���� �׸� name�� ����
		if(index==4)
			return (String) project.List5.getSelectedValue();//List5���� Ŭ���� �׸� name�� ����
		if(index==5)
			return (String) project.List6.getSelectedValue();//List6���� Ŭ���� �׸� name�� ����
		if(index==6)
			return (String) project.List7.getSelectedValue();//List7���� Ŭ���� �׸� name�� ����
		if(index==7)
			return (String) project.List8.getSelectedValue();//List8���� Ŭ���� �׸� name�� ����
		if(index==8)
			return (String) project.List9.getSelectedValue();//List9���� Ŭ���� �׸� name�� ����
		if(index==9)
			return (String) project.List10.getSelectedValue();//List10���� Ŭ���� �׸� name�� ����
		if(index==10)
			return (String) project.List11.getSelectedValue();//List10���� Ŭ���� �׸� name�� ����
		return null;
	}
	public void setvisiblebutton() {  //��ü ������� ���ư��� ���� ��ư �����
		project.del.setVisible(false);
		project.Back.setVisible(false);
		project.savelistButton.setVisible(true);
		project.save.setVisible(true);
		project.sort.setVisible(false);
		project.savescroll.setVisible(false);
		project.savescroll2.setVisible(false);
		project.savescroll3.setVisible(false);
		project.plus.setVisible(false);
		project.minus.setVisible(false);
		
	}
}
