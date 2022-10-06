package pro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringPairsChecking {
	int count = 0;

	public int pairs(String list[]) {

		for (int i = 0; i < list.length; i++) {

			for (int j = 0; j < list.length; j++) {

				if (i != j) {

					int temp = 0;

					for (int k = 0; k < list[j].length(); k++) {

						int given = (list[i].toUpperCase().charAt(k) + 1);
						int check = list[j].toUpperCase().charAt(k);
						if (given == check || given == (check + 26)) {
							temp++;
						} else
							break;

					}
					if (temp == list[j].length()) {
						count++;

						System.out.println(list[i] + "  " + list[j]);
					}

				}
			}

		}

		return count;

	}

	public String resultentname(String s) {
		String x="";
		for (int i = 0; i < s.length(); i++) {
			if(s.toLowerCase().charAt(i)=='z')
				x=x+'a';
			else
			x=x+(char)((int)(s.toLowerCase().charAt(i))+1);
			
		}
		
		return x;
		
		
	}

	public int checkPairs(List<String> arr)
	{
		List< String> list=new ArrayList<String>();
		int count=0;
		for (int i = 0; i < arr.size(); i++) {
			String resultentName=resultentname(arr.get(i));
			list.add(resultentName);
		}	
		
		Iterator newlist =list.iterator();
		Iterator originallist=arr.iterator();
		int x=1;
		while (newlist.hasNext()&& originallist.hasNext()) {
			System.out.println(x++);
			System.out.println("  "+originallist.next()+" "+newlist.next());
			
		}
		
		for (int i = 0; i < arr.size(); i++) {
			if(newlist.next().equals(originallist.next())) {
				count++;
				System.out.println(newlist.next()+" "+originallist.next());
				System.out.println();
			}
			
		}
		
		return count;
	}

	public static void main(String[] args) {

		ArrayList<String> a=new ArrayList<String> ();
		a.add("abc");
		a.add("bcd");
		a.add("cde");
		a.add("xyz");
		a.add("yza");
		a.add("zab");
		
		
		System.out.println(
				new StringPairsChecking().checkPairs(a));
	}

}
