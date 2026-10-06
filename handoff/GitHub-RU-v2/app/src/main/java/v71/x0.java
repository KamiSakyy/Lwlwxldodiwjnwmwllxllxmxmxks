package v71;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes5.dex */
public final class x0 extends w0 implements g0 {
    public final Executor t;

    public x0(Executor executor) {
        Method method;
        this.t = executor;
        Method method2 = a81.a.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = a81.a.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // v71.g0
    public final n0 E0(long j, Runnable runnable, a71.h hVar) {
        Executor executor = this.t;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                b0.h(hVar, b0.a("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new m0(scheduledFuture) : c0.A.E0(j, runnable, hVar);
    }

    @Override // v71.v
    public final void J0(a71.h hVar, Runnable runnable) {
        try {
            this.t.execute(runnable);
        } catch (RejectedExecutionException e) {
            b0.h(hVar, b0.a("The task was rejected", e));
            c81.e eVar = l0.a;
            c81.d.t.J0(hVar, runnable);
        }
    }

    @Override // v71.g0
    public final void K(long j, l lVar) {
        Executor executor = this.t;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            com.google.common.util.concurrent.b bVar = new com.google.common.util.concurrent.b(25, this, lVar);
            a71.h hVar = lVar.v;
            try {
                scheduledFuture = scheduledExecutorService.schedule((Runnable) bVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                b0.h(hVar, b0.a("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            lVar.w(new i(0, scheduledFuture));
        } else {
            c0.A.K(j, lVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.t;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x0) && ((x0) obj).t == this.t;
    }

    public final int hashCode() {
        return System.identityHashCode(this.t);
    }

    @Override // v71.v
    public final String toString() {
        return this.t.toString();
    }
}
