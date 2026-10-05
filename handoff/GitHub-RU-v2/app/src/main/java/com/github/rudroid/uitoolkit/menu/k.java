package com.github.rudroid.uitoolkit.menu;

import b2.a0;
import sy.y;
import v71.z;

@c71.e(c = "com.github.rudroid.uitoolkit.menu.PrimaryDropDownMenuKt$PrimaryDropDownMenu$1$2$1$1", f = "PrimaryDropDownMenu.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k extends c71.j implements j71.e {
    public final /* synthetic */ a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a0 a0Var, a71.c cVar) {
        super(2, cVar);
        this.v = a0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        k r = r((a71.c) obj2, (z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        y.j(obj);
        a0.a(this.v);
        return w61.a0.a;
    }
}
