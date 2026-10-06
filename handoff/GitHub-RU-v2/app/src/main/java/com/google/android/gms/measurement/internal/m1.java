package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 extends w1 {
    public static final AtomicLong C = new AtomicLong(Long.MIN_VALUE);
    public Object A;
    public Semaphore B;
    public l1 u;
    public l1 v;
    public PriorityBlockingQueue w;
    public LinkedBlockingQueue x;
    public j1 y;
    public j1 z;

    public m1(o1 o1Var) {
        super(o1Var);
        this.A = new Object();
        this.B = new Semaphore(2);
        this.w = new PriorityBlockingQueue();
        this.x = new LinkedBlockingQueue();
        this.y = new j1(this, "Thread death: Uncaught exception on worker thread");
        this.z = new j1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.w1
    public final boolean A() {
        return false;
    }

    public final void D() {
        if (Thread.currentThread() != this.v) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void E() {
        if (Thread.currentThread() == this.u) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean F() {
        return Thread.currentThread() == this.u;
    }

    public final k1 G(Callable callable) {
        B();
        k1 k1Var = new k1(this, callable, false);
        if (Thread.currentThread() != this.u) {
            M(k1Var);
            return k1Var;
        }
        if (!this.w.isEmpty()) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.a("Callable skipped the worker queue.");
        }
        k1Var.run();
        return k1Var;
    }

    public final k1 H(Callable callable) {
        B();
        k1 k1Var = new k1(this, callable, true);
        if (Thread.currentThread() == this.u) {
            k1Var.run();
            return k1Var;
        }
        M(k1Var);
        return k1Var;
    }

    public final void I(Runnable runnable) {
        B();
        c21.u.g(runnable);
        M(new k1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object J(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).x;
            o1.m(m1Var);
            m1Var.I(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
                o1.m(s0Var);
                q0 q0Var = s0Var.A;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                q0Var.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var2);
            s0Var2.A.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void K(Runnable runnable) {
        B();
        M(new k1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void L(Runnable runnable) {
        B();
        k1 k1Var = new k1(this, runnable, false, "Task exception on network thread");
        synchronized (this.A) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.x;
                linkedBlockingQueue.add(k1Var);
                l1 l1Var = this.v;
                if (l1Var == null) {
                    l1 l1Var2 = new l1(this, "Measurement Network", linkedBlockingQueue);
                    this.v = l1Var2;
                    l1Var2.setUncaughtExceptionHandler(this.z);
                    this.v.start();
                } else {
                    Object obj = l1Var.r;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void M(k1 k1Var) {
        synchronized (this.A) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.w;
                priorityBlockingQueue.add(k1Var);
                l1 l1Var = this.u;
                if (l1Var == null) {
                    l1 l1Var2 = new l1(this, "Measurement Worker", priorityBlockingQueue);
                    this.u = l1Var2;
                    l1Var2.setUncaughtExceptionHandler(this.y);
                    this.u.start();
                } else {
                    Object obj = l1Var.r;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z() {
        if (Thread.currentThread() != this.u) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}
