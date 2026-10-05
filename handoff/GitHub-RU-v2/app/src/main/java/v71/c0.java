package v71;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c0 extends u0 implements Runnable {
    public static final c0 A;
    public static final long B;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        c0 c0Var = new c0();
        A = c0Var;
        c0Var.Q0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        B = timeUnit.toNanos(l.longValue());
    }

    @Override // v71.u0, v71.g0
    public final n0 E0(long j, Runnable runnable, a71.h hVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return n1.r;
        }
        long nanoTime = System.nanoTime();
        r0 r0Var = new r0(runnable, j2 + nanoTime);
        Y0(nanoTime, r0Var);
        return r0Var;
    }

    @Override // v71.v0
    public final Thread P0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(A.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // v71.v0
    public final void T0(long j, s0 s0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // v71.u0
    public final void U0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.U0(runnable);
    }

    public final synchronized void Z0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            u0.x.set(this, null);
            u0.y.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean X0;
        t1.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (X0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long R0 = R0();
                    if (R0 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = B + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            Z0();
                            if (X0()) {
                                return;
                            }
                            P0();
                            return;
                        }
                        if (R0 > j2) {
                            R0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (R0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            Z0();
                            if (X0()) {
                                return;
                            }
                            P0();
                            return;
                        }
                        LockSupport.parkNanos(this, R0);
                    }
                }
            }
        } finally {
            _thread = null;
            Z0();
            if (!X0()) {
                P0();
            }
        }
    }

    @Override // v71.u0, v71.v0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // v71.v
    public final String toString() {
        return "DefaultExecutor";
    }
}
