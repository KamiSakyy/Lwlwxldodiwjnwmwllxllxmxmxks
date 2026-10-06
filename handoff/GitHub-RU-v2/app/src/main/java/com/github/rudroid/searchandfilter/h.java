package com.github.rudroid.searchandfilter;

@c71.e(c = "com.github.rudroid.searchandfilter.FilterBarViewModel$6$invokeSuspend$$inlined$flatMapLatest$1", f = "FilterBarViewModel.kt", l = {189}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
public final class h extends c71.j implements j71.f {
    public int v;
    public /* synthetic */ y71.j w;
    public /* synthetic */ Object x;
    public final /* synthetic */ q y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a71.c cVar, q qVar) {
        super(3, cVar);
        this.y = qVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        h hVar = new h((a71.c) obj3, this.y);
        hVar.w = (y71.j) obj;
        hVar.x = obj2;
        return hVar.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            y71.j jVar = this.w;
            oa.j jVar2 = (oa.j) this.x;
            com.github.rudroid.searchandfilter.newflags.i iVar = this.y.B;
            iVar.getClass();
            k71.k.g(jVar2, "user");
            com.github.rudroid.searchandfilter.newflags.h hVar = new com.github.rudroid.searchandfilter.newflags.h(new com.github.rudroid.searchandfilter.newflags.c(iVar.a.a.b));
            this.w = null;
            this.x = null;
            this.v = 1;
            if (y71.n1Shadow.q(jVar, hVar, this) == aVar) {
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
