package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ v1 d;

    public /* synthetic */ t1(v1 v1Var, v4 v4Var, Bundle bundle, int i) {
        this.a = i;
        this.b = v4Var;
        this.c = bundle;
        this.d = v1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.a) {
            case 0:
                v1 v1Var = this.d;
                v1Var.f.B();
                return v1Var.f.d0(this.c, this.b);
            default:
                v1 v1Var2 = this.d;
                v1Var2.f.B();
                return v1Var2.f.d0(this.c, this.b);
        }
    }
}
