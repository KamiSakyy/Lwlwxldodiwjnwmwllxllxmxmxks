package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c4 implements u0 {
    public final WeakReference r;
    public final b4 s = new b4(this);

    public c4(a4 a4Var) {
        this.r = new WeakReference(a4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.u0
    public final void b(Runnable runnable, Executor executor) {
        this.s.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        a4 a4Var = (a4) this.r.get();
        boolean cancel = this.s.cancel(z);
        if (!cancel || a4Var == null) {
            return cancel;
        }
        a4Var.a = null;
        a4Var.b = null;
        a4Var.c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.s.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.s.r instanceof c1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.s.isDone();
    }

    public final String toString() {
        return this.s.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.s.get(j, timeUnit);
    }
}
