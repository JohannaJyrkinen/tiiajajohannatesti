package net.tutorit.reporting;

import java.util.ArrayList;

public class CompanyReport extends ReportBase<Company> {
	
	

	public CompanyReport(Reporter rep) {
		super(rep); 
		//ScreenReporter report=new ScreenReporter();
		//report.addColumn("Name",20);
		//report.addColumn("Phone",20);
		//report.addColumn("Email", 20);	
	}


	
	protected void printData(Reporter reporter, Company company) {
		reporter.printData(company.getName());
		reporter.printData(company.getPhone());
		reporter.printData(company.getEmail());
	}

	
	protected void addColumns(Reporter reporter) {
		reporter.addColumn("Company", 20);
		reporter.addColumn("Phone", 20);
		reporter.addColumn("Email", 20);
		
		
		
	}
	
	
}
