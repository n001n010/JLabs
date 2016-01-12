package L1.DemoClasses;

import L1.Interfaces.*;

    public class Point implements DebugOutputStream{

        final double xAxisPosition;
        final double yAxisPosition;

        public Point(double x, double y) {
            this.xAxisPosition = x;
            this.yAxisPosition = y;
        }

        private double involuteTheDifferenceOfTwoNumbers(double a, double b) {
            return Math.pow(a - b, 2);
        }
        
        public double findDistanceToAnotherPoint(Point another) {
            return Math.sqrt(involuteTheDifferenceOfTwoNumbers(another.xAxisPosition, this.xAxisPosition)
                    + involuteTheDifferenceOfTwoNumbers(another.yAxisPosition, this.yAxisPosition));
        }
        
        @Override
        public boolean equals(Object anObject) {
            if (this == anObject) return true;
            if (anObject instanceof Point) {
                Point another = (Point)anObject;
                return this.xAxisPosition == another.xAxisPosition && 
                       this.yAxisPosition == another.yAxisPosition;
            }
            return false;
        }
        
        @Override
        public String getInformation() {
            return "(" + this.xAxisPosition + ";" + this.yAxisPosition + ")";
        }
        
        @Override
        public String knowMyself() {
            return this.getClass().getSimpleName();
        }
        
        @Override
        public String toString() {
            return this.knowMyself()+" "+this.getInformation();
        }
    }