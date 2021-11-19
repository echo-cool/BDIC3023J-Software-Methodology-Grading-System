package com.echo;

/**
 * @Author: WangYuyang
 * @Date: 2021/11/15-14:58
 * @Project: Methodology
 * @Package: com.echo
 * @Description:
 **/
public class MarkingAlgorithm implements GradingScheme {
    private double assignmentContribution;
    private double examContribution;

    public MarkingAlgorithm(double assignmentContribution, double examContribution) {
        if ((assignmentContribution < 0 || assignmentContribution > 1)
                || (examContribution < 0 || examContribution > 1)) {
            throw new RuntimeException(
                    "The assignment contribution and " +
                            "exam contribution should be " +
                            "between 0 and 1, now: " +
                            assignmentContribution +
                            " " +
                            examContribution);
        }
        if ((assignmentContribution + examContribution) != 1) {
            throw new RuntimeException("The sum of assignment contribution and " +
                    "exam contribution should be " +
                    "1, now: " +
                    (assignmentContribution + examContribution));
        }
        this.assignmentContribution = assignmentContribution;
        this.examContribution = examContribution;
    }

    @Override
    public double getGrade(double assignment, double exam) {
        return assignmentContribution * assignment + examContribution * exam;
    }
}
