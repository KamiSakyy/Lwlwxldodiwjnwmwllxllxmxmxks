package com.github.rudroid.utilities.viewmodel.paging.model;

@c71.e(c = "com.github.rudroid.utilities.viewmodel.paging.model.LegacyPagingModel$observe$1", f = "LegacyPagingModel.kt", l = {92, 92, 94}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f extends c71.j implements j71.e {
    public Object v;
    public int w;
    public final /* synthetic */ j x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, a71.c cVar) {
        super(2, cVar);
        this.x = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f(this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r3.b(r8, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r8 == r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        j71.g gVar;
        b71.a aVar = b71.a.r;
        int i = this.w;
        j jVar = this.x;
        if (i == 0) {
            sy.y.j(obj);
            gVar = jVar.r;
            com.github.rudroid.activities.util.a aVar2 = jVar.u;
            this.v = gVar;
            this.w = 1;
            obj = aVar2.a(this);
        } else if (i == 1) {
            gVar = (j71.g) this.v;
            sy.y.j(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            y71.y yVar = new y71.y(new d(jVar, null), (y71.i) obj);
            e eVar = new e(jVar);
            this.w = 3;
        }
        com.github.rudroid.support.u uVar = jVar.x;
        this.v = null;
        this.w = 2;
        obj = gVar.n(obj, (Object) null, uVar, this);
    }
}
