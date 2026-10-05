package com.github.rudroid.searchandfilter;

@c71.e(c = "com.github.rudroid.searchandfilter.NotificationFilterBarViewModel$1", f = "NotificationFilterBarViewModel.kt", l = {59}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class g0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ com.github.rudroid.activities.util.c w;
    public final /* synthetic */ h0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.github.rudroid.activities.util.c cVar, h0 h0Var, a71.c cVar2) {
        super(2, cVar2);
        this.w = cVar;
        this.x = h0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new g0(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            y00.l lVar = this.w.b;
            f0 f0Var = new f0(this.x);
            this.v = 1;
            if (lVar.b(f0Var, this) == aVar) {
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
