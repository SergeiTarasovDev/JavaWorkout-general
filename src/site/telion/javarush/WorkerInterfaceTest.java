package site.telion.javarush;

public class WorkerInterfaceTest {
    public static void execute(WorkerInterface worker) {
        worker.doSomeWork();
    }

    public static void main(String[] args) {
        // без использования лямбды
        execute(new WorkerInterface() {
            @Override
            public void doSomeWork() {
                System.out.println("Worker вызван через анонимный класс");
            }
        });

        // с использованием лямда выражения
        execute( () -> System.out.println("Worker вызван через Lambda"));
    }
}
