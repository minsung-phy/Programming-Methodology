package TeamProject;

public class PayrollController { // Controller
    PayrollView view = new PayrollView();

    public void processPayroll() {
        PayrollReader reader = new PayrollReader(view.input_name());
        PayrollWriter writer = new PayrollWriter(view.output_name());

        while (reader.getNextRecord()) {
            int monthlySalary = reader.hoursPerWeek() * reader.weeksPerMonth() * reader.payrate();
            writer.printCheck(reader.name(), monthlySalary);
        }
        writer.printCheck("!");
        reader.close();
        writer.close();
    }
}