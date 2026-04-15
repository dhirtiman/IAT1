
// File: MyThread.java


/*
create a class extend Tread class
accept a string name in constructor and call setName() to set the Thread name

override run() method to

print the thread name and i from 1 to 5
inside try block call sleep(500) to sleep for 500 milliseconds
catch InterruptedException and print getName() + " interrupted"

*/
public class MyThread extends Thread {

    MyThread(String name) {
        setName(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(getName() + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}
