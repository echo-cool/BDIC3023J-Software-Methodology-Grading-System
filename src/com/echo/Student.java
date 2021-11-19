package com.echo;

public class Student {

	private String name;        // full name of the student
	private Double assignment;  // score for the assignment
	private Double exam;        // score for the exam
	private GradingScheme gradingScheme;
	
	/**
	 * Construct the student from their name
	 * @param name full name of the student
	 */
	public Student(String name) {
		this.name = name;
		assignment = 0.0;
		exam = 0.0;
	}

	/**
	 * @return the student's full name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param as the assignment score to set
	 */
	public void setAssignmentScore(double as) {
		assignment = as;
	}
	/**
	 * @param es the exam score to set
	 */
	public void setExamScore(double es) {
		exam = es;
	}

	// TODO get the final score
	public Double getFinalScore() {
		if(gradingScheme == null) {
			throw new RuntimeException("Grading scheme not set");
		}
		return gradingScheme.getGrade(assignment, exam);
	}

	public void setGradingScheme(GradingScheme gradingScheme) {
		this.gradingScheme = gradingScheme;
	}
}
