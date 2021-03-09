import javax.swing.DefaultListModel;
public class quicksort {
	
	static int partition(DefaultListModel model, int start,int end) {
		
		
		String pivot=(String) model.elementAt((start+end)/2);
		while(start<=end) {
			while(pivot.compareTo((String)model.elementAt(start))>0)start++;
			while(pivot.compareTo((String)model.elementAt(end))<0) end--;
			if(start<=end) {
				String temp=(String)model.elementAt(start);
				model.setElementAt(model.elementAt(end), start);
				model.setElementAt(temp, end);
				start++;
				end--;
			}
		}
		return start;
	}
	static DefaultListModel quickSort(DefaultListModel model,int start, int end) {
		int p=partition(model,start,end);
		if(start<p-1)
			quickSort(model,start,p-1);
		if(p<end)
			quickSort(model,p,end);
		return model;
	}

	}
