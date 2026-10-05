package com.github.rudroid.uitoolkit.snackbar;

import androidx.compose.runtime.f1;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n extends k71.l implements j71.a {
    public final /* synthetic */ f1 s;
    public final /* synthetic */ y3.m t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f1 f1Var, y3.m mVar) {
        super(0);
        this.s = f1Var;
        this.t = mVar;
    }

    public final Object a() {
        this.s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
        this.t.u = true;
        return a0.a;
    }
}
