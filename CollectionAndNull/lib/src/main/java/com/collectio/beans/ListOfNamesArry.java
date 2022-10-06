package com.collectio.beans;

import java.util.List;

public class ListOfNamesArry {

	List li = null;
	int x[] ;

	public ListOfNamesArry(List li,int m[]) {
		System.out.println(li.getClass().getName());
		this.li = li;
		this.x=m;
		
	}

	public void show() {
		System.out.println(li);
		for(int i:x)
			System.out.println(i);
	}

}
