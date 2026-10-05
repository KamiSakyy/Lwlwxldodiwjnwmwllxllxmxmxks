package com.github.rudroid.searchandfilter;

@c71.e(c = "com.github.rudroid.searchandfilter.FilterBarViewModel$7", f = "FilterBarViewModel.kt", l = {364}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ q w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a71.c cVar, q qVar) {
        super(2, cVar);
        this.w = qVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k(cVar, this.w);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            q qVar = this.w;
            y00.l b = qVar.v.a.b();
            j jVar = new j(qVar);
            this.v = 1;
            if (b.b(jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
