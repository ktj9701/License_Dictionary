import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import javax.swing.*;

public class project extends JFrame {
	
	ImageIcon saveicon=new ImageIcon(Driver.class.getResource("images/save.jpg"));
	ImageIcon savelisticon=new ImageIcon(Driver.class.getResource("images/savelist.png"));
	ImageIcon backicon=new ImageIcon(Driver.class.getResource("images/back.png"));
	ImageIcon delicon=new ImageIcon(Driver.class.getResource("images/del.png"));
	ImageIcon plusicon=new ImageIcon(Driver.class.getResource("images/plus.jpg"));
	ImageIcon minusicon=new ImageIcon(Driver.class.getResource("images/minus.png"));
	ImageIcon backgroundicon=new ImageIcon(Driver.class.getResource("images/background.jpg"));

	public static JList List; // 리스트 목록
	public static JList List2;
	public static JList List3;
	public static JList List4;
	public static JList List5;
	public static JList List6;
	public static JList List7;
	public static JList List8;
	public static JList List9;
	public static JList List10;
	public static JList List11;
	public static JList saveList;
	public static JList saveList2;
	public static JList saveList3;
	private JComboBox Box; // 콤보박스

	public static JScrollPane scroll; // 스크롤 목록
	public static JScrollPane scroll2;
	public static JScrollPane scroll3;
	public static JScrollPane scroll4;
	public static JScrollPane scroll5;
	public static JScrollPane scroll6;
	public static JScrollPane scroll7;
	public static JScrollPane scroll8;
	public static JScrollPane scroll9;
	public static JScrollPane scroll10;
	public static JScrollPane scroll11;
	public static JScrollPane savescroll;
	public static JScrollPane savescroll2;
	public static JScrollPane savescroll3;
	public static JButton start = new JButton("시작하기");  //시작버튼
	public static JButton save=new JButton();  //저장버튼
	public static JButton savelistButton=new JButton(); //즐겨찾기 목록버튼
	public static JButton sort=new JButton("과거순");  //정렬버튼
	public static JButton Back=new JButton();  //뒤로가기 버튼
	public static JButton del=new JButton(); // 삭제 버튼
	public static JButton plus=new JButton(); // 자격증추가 버튼
	public static JButton minus=new JButton(); // 자격증삭제 버튼
	JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(backgroundicon.getImage(),0, 0,null);
			setOpaque(false);
			super.paintComponent(g);
		}
	};
	
	static DefaultListModel comarray = new DefaultListModel(); // 저장목록
	static DefaultListModel informarray = new DefaultListModel(); // 저장목록
	static DefaultListModel fusionarray = new DefaultListModel(); // 저장목록
	static DefaultListModel digitalarray = new DefaultListModel(); // 저장목록
	static DefaultListModel electarray = new DefaultListModel(); // 저장목록
	static DefaultListModel electronarray = new DefaultListModel(); // 저장목록
	static DefaultListModel chemistryarray = new DefaultListModel(); // 저장목록
	static DefaultListModel newmaterialarray = new DefaultListModel(); // 저장목록
	static DefaultListModel engineerarray = new DefaultListModel(); // 저장목록
	 DefaultListModel customarray = new DefaultListModel(); // 저장목록
	static DefaultListModel totalarray = new DefaultListModel(); // 저장목록
	
	DefaultListModel model = new DefaultListModel(); // 저장목록
	DefaultListModel recentmodel = new DefaultListModel();
	DefaultListModel abcmodel = new DefaultListModel();
	
	
	int index; // 리스트 위치
	int stack=0; // 정렬버튼 문구 변경 스택
	String name; // 저장할 변수
	boolean flag = false; // 저장목록인지 아닌지 확인하는 변수
	event event = new event();     //이벤트 클래스
	setting set = new setting();    //좌표 ,크기 설정 클래스
	quicksort quick=new quicksort();  //퀵정렬 클래스
	
	element element=new element();    //자격증 요소 추가, 합체 클래스
	
	
	public project() {
		setTitle("따지?");
		setSize(Driver.SCREEN_WIDTH, Driver.SCREEN_HEIGHT);
		// 기본 틀 생성
		background.setLayout(null);
		setContentPane(background);

		String[] box = { "(선택하세요)", "|컴퓨터공학과|", "|정보통신공학과|", "|융합소프트웨어학부|", "|디지털콘텐츠디자인학과|", "|전기공학과|", "|전자공학과|", "|화학공학과|",
				"|신소재공학과|", "|기계공학과|","~사용자설정~" };
		Arrays.sort(box); // 가나다순 정렬
		Box = new JComboBox(box);
		// 콤보박스 생성
		Box.setBounds(0, 0, 396, 30); // 위치 크기 설정
		add(Box);
		Box.setVisible(false);
		
		

		List = new JList(totalarray); // 전체 총 학과 자격증
		List2 = new JList(engineerarray); // 기계공학과 자격증
		List3 = new JList(digitalarray); // 디지털콘텐츠디자인학과 자격증
		List4 = new JList(newmaterialarray); // 신소재공학과 자격증
		List5 = new JList(fusionarray); // 융합소프트웨어학부 자격증
		List6 = new JList(electarray); // 전기공학과 자격증
		List7 = new JList(electronarray); // 전자공학과 자격증
		List8 = new JList(informarray); // 정보통신공학과 자격증
		List9 = new JList(comarray); // 컴퓨터공학과 자격증
		List10 = new JList(chemistryarray); // 화학공학과 자격증
		List11 = new JList(customarray); // 사용자설정 
		saveList = new JList(model); //  과거순저장할 자격증
		saveList2 = new JList(recentmodel);  //최신순저장할 자격증
		saveList3 = new JList(abcmodel);   //사전순저장할 자격증
		
		scroll = new JScrollPane(List); // 전체 총 학과 자격증
		scroll2 = new JScrollPane(List2); // 기계공학과 자격증
		scroll3 = new JScrollPane(List3); // 디지털콘텐츠디자인학과 자격증
		scroll4 = new JScrollPane(List4); // 신소재공학과 자격증
		scroll5 = new JScrollPane(List5); // 융합소프트웨어학부 자격증
		scroll6 = new JScrollPane(List6); // 전기공학과 자격증
		scroll7 = new JScrollPane(List7); // 전자공학과 자격증
		scroll8 = new JScrollPane(List8); // 정보통신공학과 자격증
		scroll9 = new JScrollPane(List9); // 컴퓨터공학과 자격증
		scroll10 = new JScrollPane(List10); // 화학공학과 자격증
		scroll11 = new JScrollPane(List11); //사용자 설정 자격증
		savescroll = new JScrollPane(saveList); // 과거순저장목록
		savescroll2= new JScrollPane(saveList2);  //최신순저장목록
		savescroll3 = new JScrollPane(saveList3); // 사전순저장목록
		
		
		set.setscroll(scroll);// 전체 총 학과 자격증
		set.setscroll(scroll2); // 기계공학과 자격증
		set.setscroll(scroll3);// 디지털콘텐츠디자인학과 자격증
		set.setscroll(scroll4);// 신소재공학과 자격증
		set.setscroll(scroll5);// 융합소프트웨어학부 자격증
		set.setscroll(scroll6);// 전기공학과 자격증
		set.setscroll(scroll7);// 전자공학과 자격증
		set.setscroll(scroll8);// 정보통신공학가 자격증
		set.setscroll(scroll9);// 컴퓨터공학과 자격증
		set.setscroll(scroll10);// 화학공학과 자격증
		set.setscroll(scroll11);// 사용자설정 자격증
		set.setscroll(savescroll);// 과거순저장목록
		set.setscroll(savescroll2);// 최신순저장목록
		set.setscroll(savescroll3);// 사전순저장목록
		add(scroll);
		add(scroll2);
		add(scroll3);
		add(scroll4);
		add(scroll5);
		add(scroll6);
		add(scroll7);
		add(scroll8);
		add(scroll9);
		add(scroll10);
		add(scroll11);
		add(savescroll);
		add(savescroll2);
		add(savescroll3);
		// 저장목록 만들기
		
		save.setIcon(saveicon);
		savelistButton.setIcon(savelisticon);
		Back.setIcon(backicon);
		del.setIcon(delicon);
		plus.setIcon(plusicon);
		minus.setIcon(minusicon);
		set.setbutton(plus, 44,330, 43, 43, false);
		set.setbutton(minus, 88,330, 43, 43, false);
		set.setbutton(start, 140, 150, 100, 50, true);
		set.setbutton(save, 0, 330, 43, 43, false);
		set.setbutton(savelistButton, 353, 330, 43, 43, false);
		set.setbutton(Back, 353, 330, 43, 43, false);
		set.setbutton(sort, 0, 330, 100, 43, false);
		set.setbutton(del, 309, 330, 43, 43, false);

		add(start);
		add(save);
		add(savelistButton);
		add(plus);
		add(minus);
		add(Back);
		add(sort);
		add(del);

		buttonlistener listener = new buttonlistener();
		start.addActionListener(listener); // 시작 버튼 이벤트
		save.addActionListener(listener); // 저장버튼 이벤트
		plus.addActionListener(listener);
		minus.addActionListener(listener);
		savelistButton.addActionListener(listener); // 저장목록 버튼 이벤트
		Back.addActionListener(listener); // 뒤로가기 버튼 이벤트
		del.addActionListener(listener);
		sort.addActionListener(listener);

		combolistener Combolistener = new combolistener();
		Box.addActionListener(Combolistener); // 콤보박스 이벤트

		ListSelectionListener listlistener = new Listlistener(); // 리스트 이벤트
		List.addListSelectionListener(listlistener);
		List2.addListSelectionListener(listlistener);
		List3.addListSelectionListener(listlistener);
		List4.addListSelectionListener(listlistener);
		List5.addListSelectionListener(listlistener);
		List6.addListSelectionListener(listlistener);
		List7.addListSelectionListener(listlistener);
		List8.addListSelectionListener(listlistener);
		List9.addListSelectionListener(listlistener);
		List10.addListSelectionListener(listlistener);
		List11.addListSelectionListener(listlistener);
		saveList.addListSelectionListener(listlistener);

		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null);  //화면 중앙에 오도록 하는 설정
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public class Listlistener implements ListSelectionListener { // 리스트 이벤트
		public void valueChanged(ListSelectionEvent lse) {
			if (lse.getValueIsAdjusting()) {
				name = event.savelistname(index);
				if (flag == false) {
					Dialog log = new Dialog(name);
				}
			}
		}
	}

	public class buttonlistener implements ActionListener { // 버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if ((JButton) obj == start) { // 시작버튼 이벤트
				start.setVisible(false);
				Box.setVisible(true);
				scroll.setVisible(true);
				save.setVisible(true);
				savelistButton.setVisible(true);
		
			} 
			else if((JButton)obj==plus) {
				String log;
				String lisence;
				boolean saveflag= false;
					log=JOptionPane.showInputDialog("추가하고 싶은 자격증을 입력하세요");
					for(int i=0;i<totalarray.size();i++) {
						if(log.equals(totalarray.elementAt(i))) {
							saveflag=true;
							JOptionPane.showMessageDialog(null, "이미 있는 자격증입니다.");
						}
					}
					for(int i=0;i<customarray.size();i++) {
						if(log.equals(customarray.elementAt(i))) {
							saveflag=true;
							JOptionPane.showMessageDialog(null, "이미 있는 자격증입니다.");
						}
					}
					if(saveflag==false)
					customarray.addElement(log);
			}
			else if((JButton)obj==minus) {
				name=(String) List11.getSelectedValue();
				customarray.removeElement(name);
				model.removeElement(name);   //각 리스트모델의 name 값을 삭제
				recentmodel.removeElement(name);
				abcmodel.removeElement(name);
			}
			else if ((JButton) obj == save && name != null) { // 저장버튼 이벤트, name 변수에 값이 있을때
					boolean saveflag = false;   //중복 저장 검열 변수
					for (int i = 0; i < model.size(); i++) {
						if (name.equals(model.elementAt(i))) {
							saveflag = true;  //중복된 자격증이라면 true
							JOptionPane.showMessageDialog(null, "이미 저장된 자격증입니다.");
						}
					}
					if (saveflag==false) {   //중복되지 않았다면 false
						model.addElement(name);
						abcmodel.addElement(name);
						JOptionPane.showMessageDialog(null,"저장되었습니다.");
					}
				
				
				name = null;
			} 
			
			else if ((JButton) obj == savelistButton) { // 저장목록 버튼 이벤트
				
				if(model.size()==0)
					JOptionPane.showMessageDialog(null,"저장목록이 비어있습니다.");				
				else {
				remove();
				stack=0;
				sort.setText("과거순");
				flag=true;  //저장목록애 둘어왔다는 변수
				savescroll.setVisible(true);
				savelistButton.setVisible(false);
				Back.setVisible(true);
				sort.setVisible(true);
				save.setVisible(false);
				del.setVisible(true);
				plus.setVisible(false);
				minus.setVisible(false);
				}
			} else if ((JButton) obj == Back) { // 뒤로 가기 버튼 이벤트
				remove();
				
				flag=false;  //저장목록을 빠져나왔다는 변수
				event.setvisiblebutton();
				event.backlist(index);
				
			} else if ((JButton) obj == del) { // 삭제 버튼 이벤트
				if(stack==0)      //과거순  목록일때
				name = (String) saveList.getSelectedValue();
				if(stack==1)     //최신순 목록일때
					name = (String) saveList2.getSelectedValue();
				if(stack==2)     //사전순 목록일때
					name = (String) saveList3.getSelectedValue();
				
				model.removeElement(name);   //각 리스트모델의 name 값을 삭제
				recentmodel.removeElement(name);
				abcmodel.removeElement(name);
				
				
			} else if ((JButton) obj == sort) {  //정렬 버튼 이벤트
				stack += 1;  //정렬방법 선정 
				stack %= 3;  
				switch (stack) {
				case 0:   //스택이 0이면 과거순
					savescroll3.setVisible(false);
					savescroll.setVisible(true);
					sort.setText("과거순");
					break;
				case 1:   //스택이 1이면 최신순
					savescroll.setVisible(false);
					recentmodel.removeAllElements();     //최신순리스트모델 초기화
					for(int i=model.size()-1;i>=0;i--)   //과거순리스트모델 값들을 최신순리스트모델값에 선언
						recentmodel.addElement(model.elementAt(i));
					savescroll2.setVisible(true);
					sort.setText("최신순");
					break;
				case 2:    //스택이 2이면 사전순
					 abcmodel=quick.quickSort(abcmodel, 0, abcmodel.size() - 1);  //사전순리스트모델 퀵소트
					 savescroll2.setVisible(false);
					 savescroll3.setVisible(true);
					sort.setText("사전순");
					break;
				}
			}
		}
	}

	public class combolistener implements ActionListener { // 콤보박스 선택시 이벤트 발생 클래스
		public void actionPerformed(ActionEvent e) {
			JComboBox cb = (JComboBox) e.getSource();
			index = cb.getSelectedIndex();
			remove();

			event.changelist(e); // 콤보박스에 맞는 리스트 출력
		}
	}

	public void remove() { // 스크롤 갖추기 메소드
		scroll.setVisible(false); // 안보이게 하기
		scroll2.setVisible(false);
		scroll3.setVisible(false);
		scroll4.setVisible(false);
		scroll5.setVisible(false);
		scroll6.setVisible(false);
		scroll7.setVisible(false);
		scroll8.setVisible(false);
		scroll9.setVisible(false);
		scroll10.setVisible(false);
		scroll11.setVisible(false);
		savescroll.setVisible(false);
	}
}
