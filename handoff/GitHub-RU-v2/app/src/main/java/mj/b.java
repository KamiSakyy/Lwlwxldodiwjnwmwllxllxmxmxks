package mj;

import b01.g;
import k71.k;
import yz0.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final a a;

    public b(a aVar) {
        k.g(aVar, "authorDataMapper");
        this.a = aVar;
    }

    public final lj.b a(g gVar) {
        k.g(gVar, "serviceComment");
        s sVar = gVar.a;
        String id = sVar.getId();
        com.github.service.models.response.a e = sVar.e();
        this.a.getClass();
        return new lj.b(id, a.a(e), a.a(sVar.c()), sVar.b(), sVar.g(), sVar.j(), sVar.h(), sVar.d(), sVar.i(), sVar.a(), sVar.k(), sVar.getUrl(), sVar.getType(), gVar.b, gVar.c, gVar.k, gVar.n, gVar.o, sVar.f(), gVar.h);
    }
}
