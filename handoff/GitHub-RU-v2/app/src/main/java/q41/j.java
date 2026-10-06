package q41;

import c21.u;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements Executor {
    public static final Logger w = Logger.getLogger(j.class.getName());
    public final Executor r;
    public final ArrayDeque s = new ArrayDeque();
    public int t = 1;
    public long u = 0;
    public final com.google.common.util.concurrent.b v = new com.google.common.util.concurrent.b(this);

    public j(Executor executor) {
        u.g(executor);
        this.r = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        u.g(runnable);
        synchronized (this.s) {
            int i = this.t;
            if (i != 4 && i != 3) {
                long j = this.u;
                h21.b bVar = new h21.b(runnable, 2);
                this.s.add(bVar);
                this.t = 2;
                try {
                    this.r.execute(this.v);
                    if (this.t != 2) {
                        return;
                    }
                    synchronized (this.s) {
                        try {
                            if (this.u == j && this.t == 2) {
                                this.t = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.s) {
                        try {
                            int i2 = this.t;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.s.removeLastOccurrence(bVar)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.s.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.r + "}";
    }
    public Object c = null;
    public Object d = null;
}
