package org.student;

public class Automation extends MultipleLanguage implements Language,TestTool {
	public static void main(String[] args) {
		Automation automation = new Automation();
		automation.Java();
		automation.python();
		automation.ruby();
		automation.Selenium();
		automation.JMeter();
		automation.QTP();
	}
	
	@Override
	public void QTP() {
		System.out.println("QTP is called as UFT");
	}
	
	@Override
	public void Selenium() {
		System.out.println("Selenium");
	}

	@Override
	public void Java() {
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}
	
	public void JMeter() {
		System.out.println("JMeter used for performance testing");
	}
}