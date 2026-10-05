package com.github.rudroid.searchandfilter.complexfilter.user;

import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.user.RepositoryUsersBaseViewModel$1", f = "RepositoryUsersBaseViewModel.kt", l = {57, 59}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class n extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ o w;
    public final /* synthetic */ com.github.rudroid.activities.util.c x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, com.github.rudroid.activities.util.c cVar, a71.c cVar2) {
        super(2, cVar2);
        this.w = oVar;
        this.x = cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new n(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (((y71.i) r9).b(r1, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r9 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        o oVar = this.w;
        if (i == 0) {
            y.j(obj);
            lm.b bVar = oVar.F;
            com.github.rudroid.activities.util.c cVar = this.x;
            oa.j d = cVar.d();
            String str = cVar.d().c;
            com.github.rudroid.actions.checklog.t tVar = new com.github.rudroid.actions.checklog.t(4);
            this.v = 1;
            obj = bVar.a(d, str, tVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.j(obj);
                return a0.a;
            }
            y.j(obj);
        }
        m mVar = new m(oVar);
        this.v = 2;
    }
}
