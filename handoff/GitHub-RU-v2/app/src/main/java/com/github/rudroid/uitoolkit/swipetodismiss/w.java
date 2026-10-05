package com.github.rudroid.uitoolkit.swipetodismiss;

import androidx.compose.runtime.l1;
import h0.a1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements a1 {
    public final /* synthetic */ n a;

    public w(n nVar) {
        this.a = nVar;
    }

    public final void a(float f) {
        n nVar = this.a;
        u uVar = nVar.m;
        l1 l1Var = nVar.i;
        uVar.a(aa1.b.u((Float.isNaN(l1Var.y()) ? 0.0f : l1Var.y()) + f, nVar.d().a(), nVar.d().f()), 0.0f);
    }
}
