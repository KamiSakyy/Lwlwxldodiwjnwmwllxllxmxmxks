package com.github.rudroid.searchandfilter.complexfilter;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.BaseSearchViewModel$loadHead$1", f = "BaseSearchViewModel.kt", l = {141, 147}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class n extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ k w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, String str, a71.c cVar) {
        super(2, cVar);
        this.w = kVar;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new n(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (((y71.i) r10).b(r1, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r10 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        n nVar;
        b71.a aVar = b71.a.r;
        int i = this.v;
        k kVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            oa.j d = kVar.s.d();
            l lVar = new l(kVar, 0);
            this.v = 1;
            nVar = this;
            obj = kVar.Q(d, this.x, null, lVar, nVar);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            nVar = this;
        }
        m mVar = new m(kVar);
        nVar.v = 2;
    }
}
