package template;

import template.clock.Clock;
import template.clock.EmployeeA;
import template.clock.EmployeeB;

/**
 * Created By Rick 2019/3/19
 */
public class TemplateTest {
    public static void main(String[] args) {
        //此处用的是向上造型
        Clock employeeA = new EmployeeA(0);
        employeeA.getWorkSheet();

        Clock employeeB = new EmployeeB(4);
        employeeB.getWorkSheet();
    }
}
