package com.github.rudroid.starredreposandlists;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements androidx.compose.ui.layout.v0 {
    public final /* synthetic */ androidx.compose.runtime.f1 a;
    public final /* synthetic */ y3.o b;
    public final /* synthetic */ y3.m c;
    public final /* synthetic */ androidx.compose.runtime.f1 d;

    public l(androidx.compose.runtime.f1 f1Var, y3.o oVar, y3.m mVar, androidx.compose.runtime.f1 f1Var2) {
        this.a = f1Var;
        this.b = oVar;
        this.c = mVar;
        this.d = f1Var2;
    }

    public final androidx.compose.ui.layout.w0 a(androidx.compose.ui.layout.x0 x0Var, List list, long j) {
        this.a.getValue();
        long f = this.b.f(j, x0Var.getLayoutDirection(), this.c, list, 257);
        this.d.getValue();
        return x0Var.h0((int) (f >> 32), (int) (f & 4294967295L), x61.s.r, new k(this.b, list));
    }
}
