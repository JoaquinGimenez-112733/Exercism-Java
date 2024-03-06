public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean m = daysSkipped >= 5;
        double f = m ? 0.85 : 1.0;
        return f;
    }

    public int bonusMultiplier(int productsSold) {
        boolean m = productsSold >= 20;
        int i = m ? 13 : 10;
        return i;
    }

    public double bonusForProductsSold(int productsSold) {
        double d =  (double) bonusMultiplier(productsSold) * (double) productsSold;
        return d;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double d = (salaryMultiplier(daysSkipped) * 1000) + bonusForProductsSold(productsSold);
        return d <= 2000 ? d : 2000;
    } 
}
