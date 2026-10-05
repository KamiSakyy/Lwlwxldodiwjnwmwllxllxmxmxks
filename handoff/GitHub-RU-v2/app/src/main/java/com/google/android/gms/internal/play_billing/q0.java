package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 implements Executor {
    public static final q0 r;
    public static final /* synthetic */ q0[] s;

    static {
        q0 q0Var = new q0("INSTANCE", 0);
        r = q0Var;
        s = new q0[]{q0Var};
    }

    public static q0[] values() {
        return (q0[]) s.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
