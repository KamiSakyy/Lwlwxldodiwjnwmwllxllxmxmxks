package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k1 extends FutureTask implements Comparable {
    public final long r;
    public final boolean s;
    public final String t;
    public final /* synthetic */ m1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.u = m1Var;
        long andIncrement = m1.C.getAndIncrement();
        this.r = andIncrement;
        this.t = str;
        this.s = z;
        if (andIncrement == Long.MAX_VALUE) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) m1Var).s).w;
            o1.m(s0Var);
            s0Var.x.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k1 k1Var = (k1) obj;
        boolean z = k1Var.s;
        boolean z2 = this.s;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = k1Var.r;
        long j2 = this.r;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.u).s).w;
        o1.m(s0Var);
        s0Var.y.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.u).s).w;
        o1.m(s0Var);
        s0Var.x.b(th, this.t);
        if ((th instanceof zzhv) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, Callable callable, boolean z) {
        super(callable);
        this.u = m1Var;
        long andIncrement = m1.C.getAndIncrement();
        this.r = andIncrement;
        this.t = "Task exception on worker thread";
        this.s = z;
        if (andIncrement == Long.MAX_VALUE) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) m1Var).s).w;
            o1.m(s0Var);
            s0Var.x.a("Tasks index overflow");
        }
    }
}
