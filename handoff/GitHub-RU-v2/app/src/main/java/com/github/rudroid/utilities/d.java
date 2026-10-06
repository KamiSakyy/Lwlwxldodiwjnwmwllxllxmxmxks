package com.github.rudroid.utilities;

@c71.e(c = "com.github.rudroid.utilities.Analytics$insertEvent$1", f = "Analytics.kt", l = {20}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ e w;
    public final /* synthetic */ oa.j x;
    public final /* synthetic */ wj.e y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, oa.j jVar, wj.e eVar2, a71.c cVar) {
        super(2, cVar);
        this.w = eVar;
        this.x = jVar;
        this.y = eVar2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            kj.j jVar = this.w.a;
            this.v = 1;
            if (jVar.a(this.x, this.y, this) == aVar) {
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
    public Object k() { return null; }
}
