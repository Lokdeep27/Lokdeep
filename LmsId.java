package collection1;

import java.util.ArrayList;

public class LmsId {
	public static void main(String[]args) {
		ArrayList<Integer>id=new ArrayList<>();
		
		id.add(879);
		id.add(860);
		id.add(877);
		id.add(878);
		id.add(872);
		id.add(1,900);
		id.set(4,200);
		id.remove(2);
		id.add(765);
		
		for (int i=0;i<id.size();i++) {
			System.out.println(id.get(i));
		}
		for (Integer l:id) {
			System.out.println(l);
		}
		id.forEach(l->{System.out.println(l);});
		System.out.println(id.get(4));
		System.out.println(id);
		System.out.println(id.size());
		
	}

}