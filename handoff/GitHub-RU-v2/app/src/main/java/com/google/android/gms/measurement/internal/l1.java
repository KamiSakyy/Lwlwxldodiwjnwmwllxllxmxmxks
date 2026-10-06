package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l1 extends Thread {
    public Object r;
    public BlockingQueue s;
    public boolean t = false;
    public final /* synthetic */ m1 u;

    public l1(m1 m1Var, String str, BlockingQueue blockingQueue) {
        this.u = m1Var;
        c21.uShadow.g(blockingQueue);
        this.r = new Object();
        this.s = blockingQueue;
        setName(str);
    }

    public final void a() {
        m1 m1Var = this.u;
        synchronized (m1Var.A) {
            try {
                if (!this.t) {
                    m1Var.B.release();
                    m1Var.A.notifyAll();
                    if (this == m1Var.u) {
                        m1Var.u = null;
                    } else if (this == m1Var.v) {
                        m1Var.v = null;
                    } else {
                        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) m1Var).s).w;
                        o1.m(s0Var);
                        s0Var.x.a("Current scheduler thread is neither worker nor network");
                    }
                    this.t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.u.B.acquire();
                z = true;
            } catch (InterruptedException e) {
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.u).s).w;
                o1.m(s0Var);
                s0Var.A.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.s;
                k1 k1Var = (k1) blockingQueue.poll();
                if (k1Var != null) {
                    Process.setThreadPriority(true != k1Var.s ? 10 : threadPriority);
                    k1Var.run();
                } else {
                    Object obj = this.r;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.u.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.u).s).w;
                                o1.m(s0Var2);
                                s0Var2.A.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.u.A) {
                        if (this.s.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
