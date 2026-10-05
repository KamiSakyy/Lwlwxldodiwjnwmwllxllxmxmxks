package com.github.rudroid.templates;

import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.templates.IssueTemplatesViewModel$loadHead$1", f = "IssueTemplatesViewModel.kt", l = {88, 96}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class o extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ l w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, a71.c cVar) {
        super(2, cVar);
        this.w = lVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new o(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r3.b(r12, r11) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r12 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        o oVar;
        b71.a aVar = b71.a.r;
        int i = this.v;
        l lVar = this.w;
        if (i == 0) {
            y.j(obj);
            bn.b bVar = lVar.s;
            oa.j d = lVar.t.d();
            String str = lVar.w;
            String str2 = lVar.x;
            k kVar = new k(lVar, 1);
            this.v = 1;
            oVar = this;
            obj = bVar.a(d, str, str2, kVar, oVar);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.j(obj);
                return a0.a;
            }
            y.j(obj);
            oVar = this;
        }
        y71.y yVar = new y71.y(new m(lVar, null), (y71.i) obj);
        n nVar = new n(lVar);
        oVar.v = 2;
    }
}
