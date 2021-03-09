package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Parole2 {
	 List<String> parole ;
	public Parole2() {
		
		parole=new ArrayList<String>();
	}
	
	public  void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(this.parole);
		return parole;
	}
	
	public void reset() {
	parole.clear();
	}
    
	public String stampaElenco() {
		String elenco="";
		int i=0;
		for(String p: getElenco()) {
			if(i!=0)
				elenco+="\n"+p;
			if(i==0)
				{elenco=p;
		        i++;}
			
		
		}
		
		return elenco;
		
	}
	
	public void cancella(String daEliminare) {
		for(String s:parole)
			{if(s.compareTo(daEliminare)==0)
				parole.remove(s);}
		
	}
}