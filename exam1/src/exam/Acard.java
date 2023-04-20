package exam;

import java.util.LinkedList;

public class Acard implements Runnable {
    private LinkedList<String> linkedList;

    Acard() {
    }

    Acard(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void run() {
            while (linkedList.size() != 0) {
                synchronized (this) {
                    System.out.println("线程" + Thread.currentThread().getName() + "获得英雄：" + this.linkedList.removeFirst());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }

    }
}

