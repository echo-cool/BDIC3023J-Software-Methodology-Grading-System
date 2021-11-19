package com.echo;

public class TestCase {

    public static void main(String[] args) {

        Student student = new Student("Harry Potter");
        student.setAssignmentScore(88);
        student.setExamScore(66);

        GradingSchemeFactory factory = new GradingSchemeFactory();
        // TODO switch to algorithm A:
        student.setGradingScheme(
                factory.getGradingScheme(
                        GradingSchemeFactory.Scheme.TYPE_A
                ));
        System.out.println(
                student.getName()
                        + "  "
                        + student.getFinalScore().toString());

        // TODO switch to algorithm B 
        student.setGradingScheme(
                factory.getGradingScheme(
                        GradingSchemeFactory.Scheme.TYPE_B
                ));
        System.out.println(
                student.getName()
                        + "  "
                        + student.getFinalScore().toString());

    }

}
