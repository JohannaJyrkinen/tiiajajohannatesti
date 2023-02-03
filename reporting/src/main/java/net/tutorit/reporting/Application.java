package net.tutorit.reporting;

import java.io.PrintWriter;

public class Application {

	public static void main(String[] args) {
		
	
		TabularFormatter tf= new TabularFormatter();
		ScreenReporter reporter=new ScreenReporter(tf);
		FileReporter repFile=new FileReporter(tf, "report.txt");
		
	
		PersonReport pr=new PersonReport(reporter);
		pr.addData(new Person("John Wayne",82));
		pr.addData(new Person("Ronald Reagan",92));
		pr.doReport();
		
		//System.out.println("");
		
		//CompanyReport cr=new CompanyReport(repScreen);
		//cr.addData(new Company("Coders Unlimited","555-234234","info@coders.net"));
		//cr.addData(new Company("Testers united","555-123123","info@testers.com"));
		//cr.doReport();
		
		//FileReporter frep = new FileReporter("company.txt");
		//frep.beginReport();
		//frep.addColumn("Name",20);
		//frep.addColumn("Age",5);
		//frep.printColumns();
		//frep.printData("John Wayne");
		//frep.printData(82);
		//frep.printData("Ronald Reagan");
		//frep.printData(93);
		//frep.endReport();
		
		
		//ScreenReporter rep=new ScreenReporter();
		//rep.addColumn("Name",20);
		//rep.addColumn("Age",5);
		//rep.printColumns();
		//rep.printData("John Wayne");
		//rep.printData(82);
		//rep.printData("Ronald Reagan");
		//rep.printData(93);
		
		//System.out.println("");
		
		//PersonReport pr=new PersonReport();
		//pr.addData(new Person("John Wayne",82));
		//pr.addData(new Person("Ronald Reagan",92));
		//pr.doReport();
		
		//System.out.println("");
		
		//CompanyReport cr=new CompanyReport();
		//cr.addData(new Company("Coders Unlimited","555-234234","info@coders.net"));
		//cr.addData(new Company("Testers united","555-123123","info@testers.com"));
		//cr.doReport();
		
	

	}

}
