package com.github.rudroid.twofactor;

import t00.f8;
import y71.n1;

@c71.e(c = "com.github.rudroid.twofactor.TwoFactorApproveDenyViewModel$approveRequest$2", f = "TwoFactorApproveDenyViewModel.kt", l = {128}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class o extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ h w;
    public final /* synthetic */ fn.a x;
    public final /* synthetic */ b y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, fn.a aVar, b bVar, a71.c cVar) {
        super(2, cVar);
        this.w = hVar;
        this.x = aVar;
        this.y = bVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new o(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            h hVar = this.w;
            dn.g gVar = hVar.t;
            fn.a aVar2 = this.x;
            oa.j jVar = aVar2.a;
            f11.b bVar = aVar2.b;
            int i2 = bVar.r;
            String str = bVar.s;
            b bVar2 = this.y;
            i iVar = new i(hVar, bVar2, 1);
            gVar.getClass();
            k71.k.g(jVar, "user");
            k71.k.g(str, "payload");
            a71.c cVar = null;
            int i3 = 1;
            y71.y yVar = new y71.y(new m(hVar, bVar2, null), new y71.y(n1.x(new dn.c(gVar, jVar, i2, cVar, i3), n1.y(n1.D(new f8(new a0.h(gVar, jVar, str, (a71.c) null, 12)), new dn.b(2, cVar, 1)), gVar.d)), new dn.d(iVar, jVar, gVar, cVar, i3)));
            n nVar = new n(hVar, bVar2);
            this.v = 1;
            if (yVar.b(nVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
