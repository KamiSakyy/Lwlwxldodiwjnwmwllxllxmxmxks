package com.github.rudroid.settings.codeoptions;

import com.google.android.gms.internal.measurement.z3;

@c71.e(c = "com.github.rudroid.settings.codeoptions.CodeOptionsViewModel$updateOption$1", f = "CodeOptionsViewModel.kt", l = {31}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ a0 w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ s5.e y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Object obj, s5.e eVar, a71.c cVar) {
        super(2, cVar);
        this.w = a0Var;
        this.x = obj;
        this.y = eVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        r rVar = this.w.s;
        this.v = 1;
        Object n = z3.n(rVar.a, new q(null, this.x, this.y), this);
        if (n != aVar) {
            n = a0Var;
        }
        return n == aVar ? aVar : a0Var;
    }







}
