import javax.swing.DefaultListModel;

public class element {    //�ڰ��� ��� �߰� ,��ü ���� Ŭ����
	
	quicksort quick= new quicksort();
	public element() {   
		project.comarray.addElement("SQL������");
		project.comarray.addElement("����ó����ɻ�");
		project.comarray.addElement("����ó�����");
		project.comarray.addElement("����ó��������");
		project.comarray.addElement("������ű��");
		project.comarray.addElement("�������ȱ��");
		project.comarray.addElement("��ǻ��Ȱ��ɷ�1��");
		project.informarray.addElement("��Ʈ��ũ������2��");
		project.informarray.addElement("����������");
		project.informarray.addElement("�����ű��");
		project.informarray.addElement("������ű��");
		project.informarray.addElement("������ű��");
		project.fusionarray.addElement("������������1��");
		project.fusionarray.addElement("������������2��");
		project.fusionarray.addElement("����������ɻ�");
		project.fusionarray.addElement("����ó�����");
		project.fusionarray.addElement("������ű��");
		project.digitalarray.addElement("�����п�������1��");
		project.digitalarray.addElement("��Ƽ�̵���������������������");
		project.digitalarray.addElement("��Ƽ�̵������������������������");
		project.digitalarray.addElement("���ӱ׷���������");
		project.digitalarray.addElement("�ð������α��");
		project.digitalarray.addElement("�ð������λ�����");
		project.electarray.addElement("����������");
		project.electarray.addElement("������");
		project.electarray.addElement("���������");
		project.electarray.addElement("����������ű�ɻ�");
		project.electarray.addElement("����������Ż�����");
		project.electarray.addElement("����������ű��");
		project.electarray.addElement("������ű��");
		project.electarray.addElement("������Ż�����");
		project.electronarray.addElement("�����ű��");
		project.electronarray.addElement("������");
		project.electronarray.addElement("���������");
		project.electronarray.addElement("���ڰ�����");
		project.electronarray.addElement("���ڰ��������");
		project.electronarray.addElement("����ó�����");
		project.electronarray.addElement("����ó��������");
		project.electronarray.addElement("����ó����ɻ�");
		project.chemistryarray.addElement("�������");
		project.chemistryarray.addElement("����������");
		project.chemistryarray.addElement("���ȯ����");
		project.chemistryarray.addElement("���ȯ�������");
		project.chemistryarray.addElement("�ҹ漳����");
		project.chemistryarray.addElement("����ȯ����");
		project.chemistryarray.addElement("����ȯ�������");
		project.chemistryarray.addElement("����ó�����");
		project.chemistryarray.addElement("ȭ�����");
		project.newmaterialarray.addElement("�ݼ������");
		project.newmaterialarray.addElement("�ݼ���������");
		project.newmaterialarray.addElement("�ݵ�ü������");
		project.newmaterialarray.addElement("�����������");
		project.engineerarray.addElement("�Ϲݱ����");
		project.engineerarray.addElement("�Ϲݱ�������");
		project.engineerarray.addElement("��輳����");
		project.engineerarray.addElement("��輳�������");
		project.engineerarray.addElement("��īƮ�δн����");
		project.engineerarray.addElement("�ڵ���������");
		project.engineerarray.addElement("�ڵ������񼳰���");
		
		project.comarray = quick.quickSort(project.comarray, 0, project.comarray.size() - 1); //�� ����
		project.informarray = quick.quickSort(project.informarray, 0, project.informarray.size() - 1);
		project.fusionarray = quick.quickSort(project.fusionarray, 0, project.fusionarray.size() - 1);
		project.digitalarray = quick.quickSort(project.digitalarray, 0, project.digitalarray.size() - 1);
		project.electarray = quick.quickSort(project.electarray, 0, project.electarray.size() - 1);
		project.electronarray= quick.quickSort(project.electronarray, 0, project.electronarray.size() - 1);
		project.chemistryarray=quick.quickSort(project.chemistryarray, 0, project.chemistryarray.size() - 1);
		project.newmaterialarray=quick.quickSort(project.newmaterialarray, 0, project.newmaterialarray.size() - 1);
		project.engineerarray=quick.quickSort(project.engineerarray, 0, project.engineerarray.size() - 1);
		
		

		int i;
		for (i = 0; i < project.comarray.size(); i++)  //�� �а� �ڰ��� ��ҵ��� ��ü ��Ͽ� �ִ� ����
			project.totalarray.addElement(project.comarray.elementAt(i));
		for (i= 0; i < project.informarray.size(); i++)
			project.totalarray.addElement(project.informarray.elementAt(i));
		for (i = 0; i< project.fusionarray.size(); i++)
			project.totalarray.addElement(project.fusionarray.elementAt(i));
		for (i= 0; i < project.digitalarray.size(); i++)
			project.totalarray.addElement(project.digitalarray.elementAt(i));
		for (i= 0; i < project.electarray.size(); i++)
			project.totalarray.addElement(project.electarray.elementAt(i));
		for (i = 0; i < project.electronarray.size(); i++)
			project.totalarray.addElement(project.electronarray.elementAt(i));
		for (i= 0; i < project.chemistryarray.size(); i++)
			project.totalarray.addElement(project.chemistryarray.elementAt(i));
		for (i= 0; i< project.newmaterialarray.size(); i++)
			project.totalarray.addElement(project.newmaterialarray.elementAt(i));
		for (i = 0;i < project.engineerarray.size(); i++)
			project.totalarray.addElement(project.engineerarray.elementAt(i));
		
		
		project.totalarray=quick.quickSort(project.totalarray, 0,project.totalarray.size() - 1); //��ü �ڰ��� ��� ������
		 DefaultListModel temparray = new DefaultListModel(); //��ü �ڰ��� ����� �ߺ� ���Ÿ� ���� temp ���

		
		for(i=0;i<project.totalarray.size();i++) {  //�ߺ� ��� ����
			 temparray.addElement(project.totalarray.elementAt(i));
			 int cnt=0;
			 for(int j=0;j<project.totalarray.size();j++) {
				 if(project.totalarray.elementAt(i).equals(project.totalarray.elementAt(j)))
					 cnt++;
		 }
		
		i+=(cnt-1);
		}
		project.totalarray.removeAllElements();
		for (i = 0; i < temparray.size(); i++)
			project.totalarray.addElement(temparray.elementAt(i));

		
		
		
	}
}
