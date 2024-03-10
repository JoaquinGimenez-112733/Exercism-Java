class Darts {
    int score(double xOfDart, double yOfDart) {
        double dist;

        dist = Math.sqrt(Math.pow(xOfDart,2) + Math.pow(yOfDart,2));

        if (dist >= 0 && dist <=1){
            return 10;
        }else if(dist > 1 && dist <= 5){
            return 5;
        }else if(dist >5 && dist <= 10){
            return 1;
        }else{
            return 0;
        }
    }
}
