package coursework;


public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Грищук", "Виктор", "Викторович", 32_000, 1);
        employees[1] = new Employee("Щукин", "Даниил", "Адольфович", 28_000, 2);
        employees[2] = new Employee("Раев", "Анатолий", "Анатольевич", 23_000, 4);
        employees[3] = new Employee("Уткин", "Адольф", "Тарасович", 19_000, 1);
        employees[4] = new Employee("Красотин", "Аврелий", "Андреевич", 40_000, 5);
        employees[5] = new Employee("Никифоров", "Петр", "Игорьевич", 25_000, 3);
        employees[6] = new Employee("Федотов", "Иван", "Ассемблерович", 38_000, 2);
        employees[7] = new Employee("Киселев", "Лука", "Маттиевович", 20_000, 3);
        employees[8] = new Employee("Кипелов", "Иван", "Григорьевич", 37_000, 5);
        employees[9] = new Employee("Логинов", "Валентин", "Викторович", 27_000, 4);

        printEmployee();
        System.out.println();
        System.out.println("Сумма затрат - " + sum());
        System.out.println();
        System.out.println(findMinSalary());
        System.out.println();
        System.out.println(findMaxSalary());
        System.out.println();
        System.out.println("Средняя зп - " + getAverage());
        System.out.println();
        printFIO();
    }

    static void printEmployee() {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
    static int sum() {
        int sum = 0;
        for (Employee employee: employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    static Employee findMinSalary() {
        Employee min = null;
        for (Employee employee: employees) {
            if (null == min || employee.getSalary() < min.getSalary()){
                min = employee;
            }
        }
        return min;
    }
    static Employee findMaxSalary() {
        Employee max = null;
        for (Employee employee: employees) {
            if (null == max || employee.getSalary() > max.getSalary()){
                max = employee;
            }
        }
        return max;
    }
    static double getAverage(){
        return (double) sum()/ employees.length;

    }
    static void printFIO(){
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }
}
