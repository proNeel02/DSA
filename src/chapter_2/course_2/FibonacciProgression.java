package chapter_2;

import chapter_2.course_2.AbstractProgression;

public class FibonacciProgression extends AbstractProgression {

    protected long prev;

    public FibonacciProgression(){this(0,1);}

    public FibonacciProgression(long first, long second){
        super(first);
        prev = second - first;
    }

    protected void advance(){
        long temp = prev;
        prev = current;
        current += temp;
    }

}
