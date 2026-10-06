package com.github.rudroid.twofactor;

import com.github.service.models.ApiFailure;
import java.util.Map;
import y71.n1Shadow;
import y71.y1;

@c71.e(c = "com.github.rudroid.twofactor.TwoFactorApproveDenyViewModel$fetchAuthRequest$1", f = "TwoFactorApproveDenyViewModel.kt", l = {167, 167}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ h w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h hVar, a71.c cVar) {
        super(2, cVar);
        this.w = hVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r13 == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        if (r13 == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        h hVar = this.w;
        y1 y1Var = hVar.x;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            dn.p pVar = hVar.v;
            this.v = 1;
            obj = pVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                fn.a aVar2 = (fn.a) obj;
                if (aVar2 != null) {
                    fl.e eVar = fl.f.Companion;
                    b bVar = new b(aVar2, a.s, "");
                    eVar.getClass();
                    fl.f c = fl.e.c(bVar);
                    y1Var.getClass();
                    y1Var.k((Object) null, c);
                } else {
                    oa.j g = hVar.w.g();
                    if (g != null) {
                        fl.e eVar2 = fl.f.Companion;
                        fl.b bVar2 = new fl.b(fl.c.D, (String) null, new Integer(0), (Map) x61.s.r, g, (ApiFailure) null, 96);
                        b bVar3 = new b(null, a.r, "");
                        eVar2.getClass();
                        fl.f a = fl.e.a(bVar2, bVar3);
                        y1Var.getClass();
                        y1Var.k((Object) null, a);
                    }
                }
                return w61.a0.a;
            }
            sy.y.j(obj);
        }
        this.v = 2;
        obj = n1Shadow.v((y71.i) obj, this);
    }
}
