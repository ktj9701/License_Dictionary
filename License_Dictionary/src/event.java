import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

public class event {
	public void changelist(ActionEvent e) {  //리스트 변경시 이벤트
		JComboBox cb=(JComboBox)e.getSource();
		if (cb.getSelectedIndex() == 0) { //0번째 콤보박스 일때
			setvisiblebutton();
			project.scroll.setVisible(true);
		}
		if (cb.getSelectedIndex() == 1) { //1번째 콤보박스 일때
			setvisiblebutton();
			project.scroll2.setVisible(true);
		}
		if (cb.getSelectedIndex() == 2) { //2번째 콤보박스 일때
			setvisiblebutton();
			project.scroll3.setVisible(true);
		}
		if (cb.getSelectedIndex() == 3){ //3번째 콤보박스 일때
			setvisiblebutton();
			project.scroll4.setVisible(true);
		}
		if (cb.getSelectedIndex() == 4){ //4번째 콤보박스 일때
			setvisiblebutton();
			project.scroll5.setVisible(true);
		}
		if (cb.getSelectedIndex() == 5){ //5번째 콤보박스 일때
			setvisiblebutton();
			project.scroll6.setVisible(true);
		}
		if (cb.getSelectedIndex() == 6){ //6번째 콤보박스 일때
			setvisiblebutton();
			project.scroll7.setVisible(true);
		}
		if (cb.getSelectedIndex() == 7){ //7번째 콤보박스 일때
			setvisiblebutton();
			project.scroll8.setVisible(true);
		}
		if (cb.getSelectedIndex() == 8){ //8번째 콤보박스 일때
			setvisiblebutton();
			project.scroll9.setVisible(true);
		}
		if (cb.getSelectedIndex() == 9) { //9번째 콤보박스 일때
			setvisiblebutton();
			project.scroll10.setVisible(true);
		}
		if (cb.getSelectedIndex() == 10) { //10번째 콤보박스 일때
			setvisiblebutton();
			project.plus.setVisible(true);
			project.minus.setVisible(true);
			project.scroll11.setVisible(true);
	}
	}
	
	public  void backlist(int index) {       //원래 리스트로 돌아갈때 이벤트
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
			return (String) project.List.getSelectedValue();  //List에서 클릭한 항목 name에 저장
		if(index==1)
			return (String) project.List2.getSelectedValue();//List2에서 클릭한 항목 name에 저장
		if(index==2)
			return (String) project.List3.getSelectedValue();//List3에서 클릭한 항목 name에 저장
		if(index==3)
			return (String) project.List4.getSelectedValue();//List4에서 클릭한 항목 name에 저장
		if(index==4)
			return (String) project.List5.getSelectedValue();//List5에서 클릭한 항목 name에 저장
		if(index==5)
			return (String) project.List6.getSelectedValue();//List6에서 클릭한 항목 name에 저장
		if(index==6)
			return (String) project.List7.getSelectedValue();//List7에서 클릭한 항목 name에 저장
		if(index==7)
			return (String) project.List8.getSelectedValue();//List8에서 클릭한 항목 name에 저장
		if(index==8)
			return (String) project.List9.getSelectedValue();//List9에서 클릭한 항목 name에 저장
		if(index==9)
			return (String) project.List10.getSelectedValue();//List10에서 클릭한 항목 name에 저장
		if(index==10)
			return (String) project.List11.getSelectedValue();//List10에서 클릭한 항목 name에 저장
		return null;
	}
	public void setvisiblebutton() {  //전체 목록으로 돌아가기 위한 버튼 숨기기
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
