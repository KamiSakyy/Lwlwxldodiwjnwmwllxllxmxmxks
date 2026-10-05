package com.github.rudroid.twofactor;

import b6.v0;
import t00.f8;
import y71.n1;

@c71.e(c = "com.github.rudroid.twofactor.TwoFactorApproveDenyViewModel$approveRequest$1", f = "TwoFactorApproveDenyViewModel.kt", l = {105}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ h w;
    public final /* synthetic */ fn.a x;
    public final /* synthetic */ int y;
    public final /* synthetic */ b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, fn.a aVar, int i, b bVar, a71.c cVar) {
        super(2, cVar);
        this.w = hVar;
        this.x = aVar;
        this.y = i;
        this.z = bVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l(this.w, this.x, this.y, this.z, cVar);
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
            dn.e eVar = hVar.s;
            fn.a aVar2 = this.x;
            oa.j jVar = aVar2.a;
            f11.b bVar = aVar2.b;
            int i2 = bVar.r;
            String str = bVar.s;
            b bVar2 = this.z;
            i iVar = new i(hVar, bVar2, 0);
            eVar.getClass();
            k71.k.g(jVar, "user");
            k71.k.g(str, "payload");
            int i3 = 0;
            a71.c cVar = null;
            y71.y yVar = new y71.y(new j(hVar, bVar2, null), new y71.y(n1.x(new dn.c(eVar, jVar, i2, cVar, i3), n1.y(n1.D(new f8(new v0(eVar, jVar, str, this.y, (a71.c) null)), new dn.b(2, cVar, i3)), eVar.d)), new dn.d(iVar, jVar, eVar, cVar, i3)));
            k kVar = new k(hVar, bVar2);
            this.v = 1;
            if (yVar.b(kVar, this) == aVar) {
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
