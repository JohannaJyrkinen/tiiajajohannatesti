package net.tutorit.reporting;

import java.util.ArrayList;

public class PersonReport extends ReportBase<Person>  { //extends ScreenReporter {
	
	
	public PersonReport(Reporter rep) {
		super(rep); 
		//reporter = rep; 
		//reporter.addColumn("Name", 20);
		//reporter.addColumn("Age", 5);

	}

	protected void addColumns(Reporter reporter){
		reporter.addColumn("Name",20);
		reporter.addColumn("Age",5);
	}
		
	protected void printData(Reporter reporter, Person p){
		reporter.printData(p.getName());
		reporter.printData(p.getAge());
	}
	
	


}
