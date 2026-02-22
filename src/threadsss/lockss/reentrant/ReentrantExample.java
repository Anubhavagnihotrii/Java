package threadsss.lockss.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    // Creating ReentrantLock object
    private final ReentrantLock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();   // Hold count becomes 1
        try {
            System.out.println("Inside outerMethod, now calling innerMethod");
            innerMethod();
        } finally {
            lock.unlock();  // Hold count becomes 0 (lock released)
        }
    }

    public void innerMethod() {
        lock.lock();   // Same thread acquires again (Hold count becomes 2)
        try {
            System.out.println("Inside innerMethod");
        } finally {
            lock.unlock();  // Hold count becomes 1
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}


/*
========================= NOTES =========================

1) What is ReentrantLock?
   - It allows the same thread to acquire the same lock multiple times.
   - This property is called REENTRANCY.

2) Why no deadlock in this example?
   - outerMethod() acquires the lock.
   - innerMethod() tries to acquire the same lock again.
   - Since it is the SAME THREAD, ReentrantLock allows it.
   - Therefore, no deadlock occurs.

3) Internal Working:
   - ReentrantLock maintains a HOLD COUNT.

   First lock() call  → Hold count = 1
   Second lock() call → Hold count = 2
   First unlock()     → Hold count = 1
   Second unlock()    → Hold count = 0 (Lock fully released)

4) Important:
   - Number of unlock() calls must match number of lock() calls.
   - If unlock() is called more times than lock(),
     it throws IllegalMonitorStateException.

   - ReentrantLock provides more flexibility than synchronized.
   - It supports fairness policy.
   - It supports tryLock().
        tryLock() attempts to acquire the lock without blocking.
        It returns immediately with true or false.
        It can also wait for a specified time using tryLock(timeout).
        **  It is mainly used to avoid deadlocks and improve performance.
   - It supports interruptible lock acquisition.

=========================================================
*/