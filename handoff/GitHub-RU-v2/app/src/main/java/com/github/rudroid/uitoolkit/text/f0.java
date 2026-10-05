package com.github.rudroid.uitoolkit.text;

import w2.h1;
import w2.i2;

@c71.e(c = "com.github.rudroid.uitoolkit.text.PrimaryTextFieldKt$PrimaryTextField$5$1", f = "PrimaryTextField.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f0 extends c71.j implements j71.e {
    public final /* synthetic */ b2.a0 v;
    public final /* synthetic */ i2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b2.a0 a0Var, i2 i2Var, a71.c cVar) {
        super(2, cVar);
        this.v = a0Var;
        this.w = i2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f0(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        f0 r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        b2.a0.a(this.v);
        h1 h1Var = this.w;
        if (h1Var != null) {
            h1Var.b();
        }
        return w61.a0.a;
    }
}
