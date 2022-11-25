package org.example;

import java.util.function.IntConsumer;

public class FizzBuzz {
    private int n, counter = 1;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
        while(counter <= n){
            if(counter % 3 == 0 && counter % 5 != 0){
                printFizz.run();
                counter++;
                this.notifyAll();
            }
            else this.wait();
        }
    }

    // printBuzz.run() outputs "buzz".
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
        while(counter <= n){
            if(counter % 3 != 0 && counter % 5 == 0) {
                printBuzz.run();
                counter++;
                this.notifyAll();
            }
            else this.wait();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(counter <= n){
            if(counter % 3 == 0 && counter % 5 == 0) {
                printFizzBuzz.run();
                counter++;
                this.notifyAll();
            }
            else this.wait();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        while(counter <= n){
            if(counter % 3 != 0 && counter % 5 != 0) {
                printNumber.accept(counter);
                counter++;
                this.notifyAll();
            }
            else this.wait();
        }

    }

}

