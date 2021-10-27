public class CarCompany {
    private int employee_count;
    private int revenue; // in billions
    private int model_count;

    public CarCompany (int e, int r, int m){
        employee_count = e;
        revenue = r;
        model_count = m;
    }

    public void addModels(int x){
        model_count += x;
    }

    public int getModel_count(){
        return model_count;
    }

    public void hireEmployees(int x){
        employee_count += x;
    }

    public int getEmployee_count (){
        return employee_count;
    }

    public int getRevenue(){
        return revenue;

    }




}
