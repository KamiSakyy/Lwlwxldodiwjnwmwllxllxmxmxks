package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1 implements ThreadFactory {
    public final ThreadFactory a = Executors.defaultThreadFactory();

    public f1(k1 k1Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
