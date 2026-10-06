package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 implements Thread.UncaughtExceptionHandler {
    public String a;
    public final /* synthetic */ m1 b;

    public j1(m1 m1Var, String str) {
        this.b = m1Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.b).s).w;
        o1.m(s0Var);
        s0Var.x.b(th, this.a);
    }
}
