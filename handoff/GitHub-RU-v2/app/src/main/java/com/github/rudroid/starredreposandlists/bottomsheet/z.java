package com.github.rudroid.starredreposandlists.bottomsheet;

import y71.n1Shadow;

@c71.e(c = "com.github.rudroid.starredreposandlists.bottomsheet.ListsSelectionBottomSheetViewModel$observe$1", f = "ListsSelectionBottomSheetViewModel.kt", l = {64, 75}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z extends c71.j implements j71.e {
    public xm.a v;
    public int w;
    public final /* synthetic */ w x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w wVar, a71.c cVar) {
        super(2, cVar);
        this.x = wVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z(this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        if (r11.b(r1, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r11 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        xm.a aVar;
        b71.a aVar2 = b71.a.r;
        int i = this.w;
        w wVar = this.x;
        if (i == 0) {
            sy.y.j(obj);
            aVar = wVar.s;
            com.github.rudroid.activities.util.c cVar = wVar.u;
            this.v = aVar;
            this.w = 1;
            cVar.getClass();
            obj = com.github.rudroid.activities.util.a.c(cVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            aVar = this.v;
            sy.y.j(obj);
        }
        oa.j jVar = (oa.j) obj;
        String str = wVar.w;
        String str2 = wVar.v;
        g gVar = new g(1, wVar);
        aVar.getClass();
        k71.k.g(jVar, "user");
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        xm.b bVar = aVar.b;
        bVar.getClass();
        y71.i o = n1Shadow.o(new y71.y(new x(wVar, null), b31.b.J(new c00.g(b31.b.J(((z01.j0) bVar.a.a(jVar)).a(str, str2), jVar, gVar), aVar.a.a(jVar, jVar.c, gVar), new cn.r(3, (a71.c) null, 12), 27), jVar, gVar)), 250L);
        y yVar = new y(wVar);
        this.v = null;
        this.w = 2;
    }
}
