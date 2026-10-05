package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b4 extends z3 {
    public final /* synthetic */ c4 y;

    public b4(c4 c4Var) {
        this.y = c4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.z3
    public final String c() {
        a4 a4Var = (a4) this.y.r.get();
        return a4Var == null ? "Completer object has been garbage collected, future will fail soon" : f1.e.z("tag=[", String.valueOf(a4Var.a), "]");
    }
}
