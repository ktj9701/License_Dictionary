import javax.swing.DefaultListModel;

public class element {    //자격증 요소 추가 ,합체 정렬 클래스
	
	quicksort quick= new quicksort();
	public element() {   
		project.comarray.addElement("SQL개발자");
		project.comarray.addElement("정보처리기능사");
		project.comarray.addElement("정보처리기사");
		project.comarray.addElement("정보처리산업기사");
		project.comarray.addElement("정보통신기사");
		project.comarray.addElement("정보보안기사");
		project.comarray.addElement("컴퓨터활용능력1급");
		project.informarray.addElement("네트워크관리사2급");
		project.informarray.addElement("무선설비기사");
		project.informarray.addElement("방송통신기사");
		project.informarray.addElement("전파통신기사");
		project.informarray.addElement("정보통신기사");
		project.fusionarray.addElement("리눅스마스터1급");
		project.fusionarray.addElement("리눅스마스터2급");
		project.fusionarray.addElement("정보기기운용기능사");
		project.fusionarray.addElement("정보처리기사");
		project.fusionarray.addElement("정보통신기사");
		project.digitalarray.addElement("디지털영상편집1급");
		project.digitalarray.addElement("멀티미디어콘텐츠제작전문가기사");
		project.digitalarray.addElement("멀티미디어콘텐츠제작전문가산업기사");
		project.digitalarray.addElement("게임그래픽전문가");
		project.digitalarray.addElement("시각디자인기사");
		project.digitalarray.addElement("시각지다인산업기사");
		project.electarray.addElement("무선설비기사");
		project.electarray.addElement("전기기사");
		project.electarray.addElement("전기산업기사");
		project.electarray.addElement("전파전자통신기능사");
		project.electarray.addElement("전파전자통신산업기사");
		project.electarray.addElement("전파전자통신기사");
		project.electarray.addElement("정보통신기사");
		project.electarray.addElement("정보통신산업기사");
		project.electronarray.addElement("방송통신기사");
		project.electronarray.addElement("전기기사");
		project.electronarray.addElement("전기산업기사");
		project.electronarray.addElement("전자계산기기사");
		project.electronarray.addElement("전자계산기산업기사");
		project.electronarray.addElement("정보처리기사");
		project.electronarray.addElement("정보처리산업기사");
		project.electronarray.addElement("정보처리기능사");
		project.chemistryarray.addElement("가스기사");
		project.chemistryarray.addElement("가스산업기사");
		project.chemistryarray.addElement("대기환경기사");
		project.chemistryarray.addElement("대기환경산업기사");
		project.chemistryarray.addElement("소방설비기사");
		project.chemistryarray.addElement("수질환경기사");
		project.chemistryarray.addElement("수질환경산업기사");
		project.chemistryarray.addElement("정보처리기사");
		project.chemistryarray.addElement("화공기사");
		project.newmaterialarray.addElement("금속재료기사");
		project.newmaterialarray.addElement("금속재료산업기사");
		project.newmaterialarray.addElement("반도체설계기사");
		project.newmaterialarray.addElement("섬유물리기사");
		project.engineerarray.addElement("일반기계기사");
		project.engineerarray.addElement("일반기계산업기사");
		project.engineerarray.addElement("기계설계기사");
		project.engineerarray.addElement("기계설계산업기사");
		project.engineerarray.addElement("메카트로닉스기사");
		project.engineerarray.addElement("자동차정비기사");
		project.engineerarray.addElement("자동차정비설계기사");
		
		project.comarray = quick.quickSort(project.comarray, 0, project.comarray.size() - 1); //퀵 정렬
		project.informarray = quick.quickSort(project.informarray, 0, project.informarray.size() - 1);
		project.fusionarray = quick.quickSort(project.fusionarray, 0, project.fusionarray.size() - 1);
		project.digitalarray = quick.quickSort(project.digitalarray, 0, project.digitalarray.size() - 1);
		project.electarray = quick.quickSort(project.electarray, 0, project.electarray.size() - 1);
		project.electronarray= quick.quickSort(project.electronarray, 0, project.electronarray.size() - 1);
		project.chemistryarray=quick.quickSort(project.chemistryarray, 0, project.chemistryarray.size() - 1);
		project.newmaterialarray=quick.quickSort(project.newmaterialarray, 0, project.newmaterialarray.size() - 1);
		project.engineerarray=quick.quickSort(project.engineerarray, 0, project.engineerarray.size() - 1);
		
		

		int i;
		for (i = 0; i < project.comarray.size(); i++)  //각 학과 자격증 요소들을 전체 목록에 넣는 과정
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
		
		
		project.totalarray=quick.quickSort(project.totalarray, 0,project.totalarray.size() - 1); //전체 자격증 목록 퀵정렬
		 DefaultListModel temparray = new DefaultListModel(); //전체 자격증 목록의 중복 제거를 위한 temp 목록

		
		for(i=0;i<project.totalarray.size();i++) {  //중복 목록 제거
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
