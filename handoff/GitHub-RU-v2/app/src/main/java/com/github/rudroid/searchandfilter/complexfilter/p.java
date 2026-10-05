package com.github.rudroid.searchandfilter.complexfilter;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.BaseSearchViewModel$loadNextPage$1", f = "BaseSearchViewModel.kt", l = {161, 167}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ k w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, String str, a71.c cVar) {
        super(2, cVar);
        this.w = kVar;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (((y71.i) r10).b(r1, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r10 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        p pVar;
        b71.a aVar = b71.a.r;
        int i = this.v;
        k kVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            oa.j d = kVar.s.d();
            String str = kVar.z.b;
            l lVar = new l(kVar, 1);
            this.v = 1;
            pVar = this;
            obj = kVar.Q(d, this.x, str, lVar, pVar);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            pVar = this;
        }
        o oVar = new o(kVar);
        pVar.v = 2;
    }
}
