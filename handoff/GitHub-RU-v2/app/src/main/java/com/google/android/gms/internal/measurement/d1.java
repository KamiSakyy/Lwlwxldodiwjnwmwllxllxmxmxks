package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class d1 implements Callable {
    public static final /* synthetic */ d1 a = new d1();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r5 r5Var = new r5("internal.platform", 4);
        r5Var.s.put("getVersion", new r5("getVersion", 3));
        return r5Var;
    }
}
