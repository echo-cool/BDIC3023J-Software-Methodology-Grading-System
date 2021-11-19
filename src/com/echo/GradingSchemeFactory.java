package com.echo;

/**
 * @Author: WangYuyang
 * @Date: 2021/11/15-15:20
 * @Project: Methmology
 * @Package: com.echo
 * @Description:
 **/
public class GradingSchemeFactory {
    public static enum Scheme {
        TYPE_A,
        TYPE_B
    }
    public GradingScheme getGradingScheme(Scheme scheme){
        if(scheme == Scheme.TYPE_A){
            return new MarkingAlgorithm(0.4,0.6);
        }
        else if(scheme == Scheme.TYPE_B){
            return new MarkingAlgorithm(0.5,0.5);
        }
        throw new RuntimeException("Unknown scheme");
    }
}
