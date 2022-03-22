import Lessonn_5.Worker;

public class Main {
    public static void main(String[] args) {
        Worker[] WorkerArray = new Worker[5];
        WorkerArray[0] = new Worker("Ivan", "Teaecher", "Ivanivan@gmail.com", "87775412365", 100000, 25);
        WorkerArray[1] = new Worker("Amir", "Police", "amir@gmail.com", "87005648978", 150000, 50);
        WorkerArray[2] = new Worker("Adil", "Engineer", "adil@gmail.com", "87756105686", 80000, 22);
        WorkerArray[3] = new Worker("Vova", "Programmer", "vova@gmail.com", "87015959054", 300000, 45);
        WorkerArray[4] = new Worker("Alex", "Singer", "alex@gmail.com", "87013216549", 200000, 27);
        for (Worker worker : WorkerArray) {
            if (worker.getAge() < 40) {
                System.out.println(worker);
            }
        }
    }
}
