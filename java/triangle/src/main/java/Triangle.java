class Triangle {

    private double s1;
    private double s2;
    private double s3;
    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1 == 0 || side2 == 0 || side3 == 0){
            throw new TriangleException();
        }

        this.s1 = side1;
        this.s2 = side2;
        this.s3 = side3;

        if(!isTriangle()){
            throw new TriangleException();
        }
    }

    boolean isEquilateral() {
        return this.s1 == this.s2 && this.s1 == this.s3 && this.s2 == this.s3;
    }

    boolean isIsosceles() {
        return isEquilateral() || (this.s1 == this.s2 || this.s1 == this.s3 || this.s2 == this.s3);
    }

    boolean isScalene() {
        return this.s1 != this.s2 && this.s1 != this.s3 && this.s2 != this.s3;
    }

    boolean isTriangle() {
        return this.s1 + this.s2 >= this.s3 && this.s1 + this.s3 >= this.s2 && this.s2+this.s3 >= this.s1;
    }
}
