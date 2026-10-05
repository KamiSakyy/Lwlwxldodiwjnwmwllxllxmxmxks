package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.UserSearchViewModel$loadNextPage$1", f = "UserSearchViewModel.kt", l = {62, 64}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class ra extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ sa w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(sa saVar, a71.c cVar) {
        super(2, cVar);
        this.w = saVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new ra(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (((y71.i) r12).b(r1, r11) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r12 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        ra raVar;
        b71.a aVar = b71.a.r;
        int i = this.v;
        sa saVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            lm.j jVar = saVar.u;
            oa.j d = saVar.v.d();
            String str = saVar.s;
            String str2 = saVar.x.b;
            na naVar = new na(saVar, 1);
            this.v = 1;
            raVar = this;
            obj = jVar.a(d, str, str2, naVar, raVar);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            raVar = this;
        }
        qa qaVar = new qa(saVar);
        raVar.v = 2;
    }
}
