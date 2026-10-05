package com.github.rudroid.uitoolkit.snackbar;

import androidx.compose.runtime.f1;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.layout.w0;
import androidx.compose.ui.layout.x0;
import java.util.List;
import x61.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements v0 {
    public final /* synthetic */ f1 a;
    public final /* synthetic */ y3.o b;
    public final /* synthetic */ y3.m c;
    public final /* synthetic */ f1 d;

    public m(f1 f1Var, y3.o oVar, y3.m mVar, f1 f1Var2) {
        this.a = f1Var;
        this.b = oVar;
        this.c = mVar;
        this.d = f1Var2;
    }

    public final w0 a(x0 x0Var, List list, long j) {
        this.a.getValue();
        long f = this.b.f(j, x0Var.getLayoutDirection(), this.c, list, 257);
        this.d.getValue();
        return x0Var.h0((int) (f >> 32), (int) (f & 4294967295L), s.r, new l(this.b, list));
    }
}
