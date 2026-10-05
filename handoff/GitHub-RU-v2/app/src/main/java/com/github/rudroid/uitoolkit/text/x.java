package com.github.rudroid.uitoolkit.text;

import w2.h1;
import w2.i2;

@c71.e(c = "com.github.rudroid.uitoolkit.text.PrimaryOutlinedTextFieldKt$PrimaryOutlinedTextField$6$1", f = "PrimaryOutlinedTextField.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class x extends c71.j implements j71.e {
    public final /* synthetic */ boolean v;
    public final /* synthetic */ b2.a0 w;
    public final /* synthetic */ i2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z, b2.a0 a0Var, i2 i2Var, a71.c cVar) {
        super(2, cVar);
        this.v = z;
        this.w = a0Var;
        this.x = i2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new x(this.v, this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        x r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        if (this.v) {
            b2.a0.a(this.w);
            h1 h1Var = this.x;
            if (h1Var != null) {
                h1Var.b();
            }
        }
        return w61.a0.a;
    }
}
