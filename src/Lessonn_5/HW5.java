package Lessonn_5;

public class HW5 {
    public class Worker {
        private String name;
        private String rang;
        private String email;
        private String TelNumber;
        private int salary;
        private int age;

        public int getAge() {
            return age;
        }

        public Worker(String name, String rang, String email, String telNumber, int salary, int age) {
            this.name = name;
            this.rang = rang;
            this.email = email;
            this.TelNumber = telNumber;
            this.salary = salary;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Worker{" +
                    "name='" + name + '\'' +
                    ", rang='" + rang + '\'' +
                    ", email='" + email + '\'' +
                    ", TelNumber='" + TelNumber + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }

    }
}
