package net.tutorit.reporting;

import java.util.ArrayList;

public abstract class ReportBase<T> {
	private Reporter reporter;
	private ArrayList<T> data; 
	
	
	public ReportBase(Reporter rep) {
		this.reporter = rep;
		addColumns(reporter);
		this.data = new ArrayList<>(); 
	}
	
	
	
	abstract protected void printData(Reporter reporter, T item);
	abstract protected void addColumns(Reporter reporter);
	
	
	public void addData(T item) {
		this.data.add(item); 
		
	}
	
	public void doReport() {
		reporter.beginReport();
		//reporter.printColumns();
		
		for (T item: data) {
			printData(reporter, item);
				
			}
		
		reporter.endReport();
	}
	
	
	
	

}
