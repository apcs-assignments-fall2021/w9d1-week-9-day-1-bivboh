public class CarClient {
    public static void main(String[] args) {
        CarCompany xyz_motors = new CarCompany(10000,15, 10);
        xyz_motors.hireEmployees(-5000); // after a private equity takeover, new models and employees
        xyz_motors.addModels(5);
        System.out.println("Before the private equity takeover, xyz motors had 10000 employees, $15 billion in revenue, and " +
                "10 models.\nFollowing the private equity takeover, xyz motors had " + xyz_motors.getEmployee_count() + " employees, $" +
                xyz_motors.getRevenue() + " billion in revenue, and " + xyz_motors.getModel_count() + " models.");







    }


}
