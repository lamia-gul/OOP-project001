public class TestProgram {

        private int n;
        private double s;
        private double x;
        private double y;

        TestProgram() {
            this.n=3;
            this.s=1;
            this.x=0;
            this.y=0;
        }

        TestProgram(int n, double s) {
            this.n=n;
            this.s=s;
            this.y=0;
            this.x=0;
        }

        TestProgram(int n, double s, double x, double y) {
            this.n= n;
            this.s= s;
            this.x= x;
            this.y= y;
        }

        public int getN() {
            return n;
        }
        public void setN(int n) {
            this.n = n;
        }

        public double getS() {
            return s;
        }
        public void setS(double s) {
            this.s = s;
        }

        public double getX() {
            return x;
        }
        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }
        public void setY(double y) {
            this.y = y;
        }

        public double getPerimeter() {
            return n*s;
        }

        public double getArea() {
            return ((n*(s*s))/(4*Math.tan(Math.PI/n)));
        }

}