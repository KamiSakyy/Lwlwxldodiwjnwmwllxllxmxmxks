package com.github.rudroid.uitoolkit.swipetodismiss;

import a0.f1;
import androidx.compose.runtime.l1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public static final a Companion = new a();
    public s3.c a;
    public n b;

    public static final class a {
    }

    public g0(h0 h0Var, s3.c cVar, j71.c cVar2, j71.c cVar3) {
        k71.k.g(h0Var, "initialValue");
        this.a = cVar;
        f1 f1Var = b.a;
        this.b = new n(h0Var, cVar3, new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j(21, this), cVar2);
    }

    public final h0 a() {
        n nVar = this.b;
        l1 l1Var = nVar.i;
        l1 l1Var2 = nVar.i;
        return (l1Var.y() == 0.0f || Float.isNaN(l1Var2.y())) ? h0.t : l1Var2.y() > 0.0f ? h0.r : h0.s;
    }
    public Object getValue() { return null; }
    public Object r = null;
    public Object s = null;
}
