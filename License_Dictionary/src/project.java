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

	public static JList List; // ����Ʈ ���
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
	private JComboBox Box; // �޺��ڽ�

	public static JScrollPane scroll; // ��ũ�� ���
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
	public static JButton start = new JButton("�����ϱ�");  //���۹�ư
	public static JButton save=new JButton();  //�����ư
	public static JButton savelistButton=new JButton(); //���ã�� ��Ϲ�ư
	public static JButton sort=new JButton("���ż�");  //���Ĺ�ư
	public static JButton Back=new JButton();  //�ڷΰ��� ��ư
	public static JButton del=new JButton(); // ���� ��ư
	public static JButton plus=new JButton(); // �ڰ����߰� ��ư
	public static JButton minus=new JButton(); // �ڰ������� ��ư
	JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(backgroundicon.getImage(),0, 0,null);
			setOpaque(false);
			super.paintComponent(g);
		}
	};
	
	static DefaultListModel comarray = new DefaultListModel(); // ������
	static DefaultListModel informarray = new DefaultListModel(); // ������
	static DefaultListModel fusionarray = new DefaultListModel(); // ������
	static DefaultListModel digitalarray = new DefaultListModel(); // ������
	static DefaultListModel electarray = new DefaultListModel(); // ������
	static DefaultListModel electronarray = new DefaultListModel(); // ������
	static DefaultListModel chemistryarray = new DefaultListModel(); // ������
	static DefaultListModel newmaterialarray = new DefaultListModel(); // ������
	static DefaultListModel engineerarray = new DefaultListModel(); // ������
	 DefaultListModel customarray = new DefaultListModel(); // ������
	static DefaultListModel totalarray = new DefaultListModel(); // ������
	
	DefaultListModel model = new DefaultListModel(); // ������
	DefaultListModel recentmodel = new DefaultListModel();
	DefaultListModel abcmodel = new DefaultListModel();
	
	
	int index; // ����Ʈ ��ġ
	int stack=0; // ���Ĺ�ư ���� ���� ����
	String name; // ������ ����
	boolean flag = false; // ���������� �ƴ��� Ȯ���ϴ� ����
	event event = new event();     //�̺�Ʈ Ŭ����
	setting set = new setting();    //��ǥ ,ũ�� ���� Ŭ����
	quicksort quick=new quicksort();  //������ Ŭ����
	
	element element=new element();    //�ڰ��� ��� �߰�, ��ü Ŭ����
	
	
	public project() {
		setTitle("����?");
		setSize(Driver.SCREEN_WIDTH, Driver.SCREEN_HEIGHT);
		// �⺻ Ʋ ����
		background.setLayout(null);
		setContentPane(background);

		String[] box = { "(�����ϼ���)", "|��ǻ�Ͱ��а�|", "|������Ű��а�|", "|���ռ���Ʈ�����к�|", "|�������������������а�|", "|������а�|", "|���ڰ��а�|", "|ȭ�а��а�|",
				"|�ż�����а�|", "|�����а�|","~����ڼ���~" };
		Arrays.sort(box); // �����ټ� ����
		Box = new JComboBox(box);
		// �޺��ڽ� ����
		Box.setBounds(0, 0, 396, 30); // ��ġ ũ�� ����
		add(Box);
		Box.setVisible(false);
		
		

		List = new JList(totalarray); // ��ü �� �а� �ڰ���
		List2 = new JList(engineerarray); // �����а� �ڰ���
		List3 = new JList(digitalarray); // �������������������а� �ڰ���
		List4 = new JList(newmaterialarray); // �ż�����а� �ڰ���
		List5 = new JList(fusionarray); // ���ռ���Ʈ�����к� �ڰ���
		List6 = new JList(electarray); // ������а� �ڰ���
		List7 = new JList(electronarray); // ���ڰ��а� �ڰ���
		List8 = new JList(informarray); // ������Ű��а� �ڰ���
		List9 = new JList(comarray); // ��ǻ�Ͱ��а� �ڰ���
		List10 = new JList(chemistryarray); // ȭ�а��а� �ڰ���
		List11 = new JList(customarray); // ����ڼ��� 
		saveList = new JList(model); //  ���ż������� �ڰ���
		saveList2 = new JList(recentmodel);  //�ֽż������� �ڰ���
		saveList3 = new JList(abcmodel);   //������������ �ڰ���
		
		scroll = new JScrollPane(List); // ��ü �� �а� �ڰ���
		scroll2 = new JScrollPane(List2); // �����а� �ڰ���
		scroll3 = new JScrollPane(List3); // �������������������а� �ڰ���
		scroll4 = new JScrollPane(List4); // �ż�����а� �ڰ���
		scroll5 = new JScrollPane(List5); // ���ռ���Ʈ�����к� �ڰ���
		scroll6 = new JScrollPane(List6); // ������а� �ڰ���
		scroll7 = new JScrollPane(List7); // ���ڰ��а� �ڰ���
		scroll8 = new JScrollPane(List8); // ������Ű��а� �ڰ���
		scroll9 = new JScrollPane(List9); // ��ǻ�Ͱ��а� �ڰ���
		scroll10 = new JScrollPane(List10); // ȭ�а��а� �ڰ���
		scroll11 = new JScrollPane(List11); //����� ���� �ڰ���
		savescroll = new JScrollPane(saveList); // ���ż�������
		savescroll2= new JScrollPane(saveList2);  //�ֽż�������
		savescroll3 = new JScrollPane(saveList3); // ������������
		
		
		set.setscroll(scroll);// ��ü �� �а� �ڰ���
		set.setscroll(scroll2); // �����а� �ڰ���
		set.setscroll(scroll3);// �������������������а� �ڰ���
		set.setscroll(scroll4);// �ż�����а� �ڰ���
		set.setscroll(scroll5);// ���ռ���Ʈ�����к� �ڰ���
		set.setscroll(scroll6);// ������а� �ڰ���
		set.setscroll(scroll7);// ���ڰ��а� �ڰ���
		set.setscroll(scroll8);// ������Ű��а� �ڰ���
		set.setscroll(scroll9);// ��ǻ�Ͱ��а� �ڰ���
		set.setscroll(scroll10);// ȭ�а��а� �ڰ���
		set.setscroll(scroll11);// ����ڼ��� �ڰ���
		set.setscroll(savescroll);// ���ż�������
		set.setscroll(savescroll2);// �ֽż�������
		set.setscroll(savescroll3);// ������������
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
		// ������ �����
		
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
		start.addActionListener(listener); // ���� ��ư �̺�Ʈ
		save.addActionListener(listener); // �����ư �̺�Ʈ
		plus.addActionListener(listener);
		minus.addActionListener(listener);
		savelistButton.addActionListener(listener); // ������ ��ư �̺�Ʈ
		Back.addActionListener(listener); // �ڷΰ��� ��ư �̺�Ʈ
		del.addActionListener(listener);
		sort.addActionListener(listener);

		combolistener Combolistener = new combolistener();
		Box.addActionListener(Combolistener); // �޺��ڽ� �̺�Ʈ

		ListSelectionListener listlistener = new Listlistener(); // ����Ʈ �̺�Ʈ
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

		setResizable(false); // ���α׷� ũ�� ���� �Ұ� ����
		setLocationRelativeTo(null);  //ȭ�� �߾ӿ� ������ �ϴ� ����
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public class Listlistener implements ListSelectionListener { // ����Ʈ �̺�Ʈ
		public void valueChanged(ListSelectionEvent lse) {
			if (lse.getValueIsAdjusting()) {
				name = event.savelistname(index);
				if (flag == false) {
					Dialog log = new Dialog(name);
				}
			}
		}
	}

	public class buttonlistener implements ActionListener { // ��ư �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if ((JButton) obj == start) { // ���۹�ư �̺�Ʈ
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
					log=JOptionPane.showInputDialog("�߰��ϰ� ���� �ڰ����� �Է��ϼ���");
					for(int i=0;i<totalarray.size();i++) {
						if(log.equals(totalarray.elementAt(i))) {
							saveflag=true;
							JOptionPane.showMessageDialog(null, "�̹� �ִ� �ڰ����Դϴ�.");
						}
					}
					for(int i=0;i<customarray.size();i++) {
						if(log.equals(customarray.elementAt(i))) {
							saveflag=true;
							JOptionPane.showMessageDialog(null, "�̹� �ִ� �ڰ����Դϴ�.");
						}
					}
					if(saveflag==false)
					customarray.addElement(log);
			}
			else if((JButton)obj==minus) {
				name=(String) List11.getSelectedValue();
				customarray.removeElement(name);
				model.removeElement(name);   //�� ����Ʈ���� name ���� ����
				recentmodel.removeElement(name);
				abcmodel.removeElement(name);
			}
			else if ((JButton) obj == save && name != null) { // �����ư �̺�Ʈ, name ������ ���� ������
					boolean saveflag = false;   //�ߺ� ���� �˿� ����
					for (int i = 0; i < model.size(); i++) {
						if (name.equals(model.elementAt(i))) {
							saveflag = true;  //�ߺ��� �ڰ����̶�� true
							JOptionPane.showMessageDialog(null, "�̹� ����� �ڰ����Դϴ�.");
						}
					}
					if (saveflag==false) {   //�ߺ����� �ʾҴٸ� false
						model.addElement(name);
						abcmodel.addElement(name);
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
					}
				
				
				name = null;
			} 
			
			else if ((JButton) obj == savelistButton) { // ������ ��ư �̺�Ʈ
				
				if(model.size()==0)
					JOptionPane.showMessageDialog(null,"�������� ����ֽ��ϴ�.");				
				else {
				remove();
				stack=0;
				sort.setText("���ż�");
				flag=true;  //�����Ͼ� �Ѿ�Դٴ� ����
				savescroll.setVisible(true);
				savelistButton.setVisible(false);
				Back.setVisible(true);
				sort.setVisible(true);
				save.setVisible(false);
				del.setVisible(true);
				plus.setVisible(false);
				minus.setVisible(false);
				}
			} else if ((JButton) obj == Back) { // �ڷ� ���� ��ư �̺�Ʈ
				remove();
				
				flag=false;  //�������� �������Դٴ� ����
				event.setvisiblebutton();
				event.backlist(index);
				
			} else if ((JButton) obj == del) { // ���� ��ư �̺�Ʈ
				if(stack==0)      //���ż�  ����϶�
				name = (String) saveList.getSelectedValue();
				if(stack==1)     //�ֽż� ����϶�
					name = (String) saveList2.getSelectedValue();
				if(stack==2)     //������ ����϶�
					name = (String) saveList3.getSelectedValue();
				
				model.removeElement(name);   //�� ����Ʈ���� name ���� ����
				recentmodel.removeElement(name);
				abcmodel.removeElement(name);
				
				
			} else if ((JButton) obj == sort) {  //���� ��ư �̺�Ʈ
				stack += 1;  //���Ĺ�� ���� 
				stack %= 3;  
				switch (stack) {
				case 0:   //������ 0�̸� ���ż�
					savescroll3.setVisible(false);
					savescroll.setVisible(true);
					sort.setText("���ż�");
					break;
				case 1:   //������ 1�̸� �ֽż�
					savescroll.setVisible(false);
					recentmodel.removeAllElements();     //�ֽż�����Ʈ�� �ʱ�ȭ
					for(int i=model.size()-1;i>=0;i--)   //���ż�����Ʈ�� ������ �ֽż�����Ʈ�𵨰��� ����
						recentmodel.addElement(model.elementAt(i));
					savescroll2.setVisible(true);
					sort.setText("�ֽż�");
					break;
				case 2:    //������ 2�̸� ������
					 abcmodel=quick.quickSort(abcmodel, 0, abcmodel.size() - 1);  //����������Ʈ�� ����Ʈ
					 savescroll2.setVisible(false);
					 savescroll3.setVisible(true);
					sort.setText("������");
					break;
				}
			}
		}
	}

	public class combolistener implements ActionListener { // �޺��ڽ� ���ý� �̺�Ʈ �߻� Ŭ����
		public void actionPerformed(ActionEvent e) {
			JComboBox cb = (JComboBox) e.getSource();
			index = cb.getSelectedIndex();
			remove();

			event.changelist(e); // �޺��ڽ��� �´� ����Ʈ ���
		}
	}

	public void remove() { // ��ũ�� ���߱� �޼ҵ�
		scroll.setVisible(false); // �Ⱥ��̰� �ϱ�
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
