package com.github.rudroid.searchandfilter.complexfilter;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.BaseLocalSearchViewModel$loadHead$1", f = "BaseLocalSearchViewModel.kt", l = {122, 126}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ b w;
    public final /* synthetic */ y x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, y yVar, a71.c cVar) {
        super(2, cVar);
        this.w = bVar;
        this.x = yVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (((y71.i) r6).b(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r6 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        b bVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            oa.j d = bVar.s.d();
            this.v = 1;
            obj = b.P(bVar, d, null, this.x, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
        }
        c cVar = new c(bVar);
        this.v = 2;
    }
    public Object k(Object p1) { return null; }
    public Object k(Object) { return null; }
}
