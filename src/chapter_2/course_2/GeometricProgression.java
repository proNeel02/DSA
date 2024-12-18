package chapter_2;

import chapter_2.course_2.AbstractProgression;

public class GeometricProgression extends AbstractProgression {

    protected long base;

    public GeometricProgression(){
        this(2,1);
    }

    public GeometricProgression(long b){
        this(b,1);
    }

    public GeometricProgression(long b, long start){
        super(start);
        base = b;
    }

    protected void advance(){
        current *= base;
    }
}
