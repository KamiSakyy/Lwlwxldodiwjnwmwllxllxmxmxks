package com.github.rudroid.utilities.viewmodel.paging.model;

@c71.e(c = "com.github.rudroid.utilities.viewmodel.paging.model.StandardPagingModel$loadNextPage$1", f = "StandardPagingModel.kt", l = {50, 50, 52}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ h0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(h0 h0Var, a71.c cVar) {
        super(2, cVar);
        this.w = h0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new a0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            this.v = 1;
            throw null;
        }
        if (i == 1) {
            sy.y.j(obj);
            this.v = 2;
            throw null;
        }
        if (i == 2) {
            sy.y.j(obj);
            h0 h0Var = this.w;
            y71.y yVar = new y71.y(new y(h0Var, null), (y71.i) obj);
            z zVar = new z(h0Var);
            this.v = 3;
            if (yVar.b(zVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }


}
