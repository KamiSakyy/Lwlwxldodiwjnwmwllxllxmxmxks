package kk;

import b01.j;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final g a;
    public final mj.a b;

    public h(g gVar, mj.a aVar) {
        k.g(gVar, "discussionDataMapper");
        k.g(aVar, "authorDataMapper");
        this.a = gVar;
        this.b = aVar;
    }

    public final jk.g a(j jVar) {
        k.g(jVar, "serviceDiscussion");
        com.github.service.models.response.a aVar = jVar.a;
        this.b.getClass();
        lj.a a = mj.a.a(aVar);
        String str = jVar.b;
        b01.b bVar = jVar.c;
        return new jk.g(false, a, str, this.a.a(bVar), bVar.d, bVar.g, bVar.f, bVar.e, bVar.h, bVar.i, bVar.j, bVar.k, bVar.l, jVar.d, jVar.e, jVar.f, jVar.g, jVar.h, jVar.i, jVar.j, jVar.k, jVar.l, jVar.m, jVar.n, bVar.x, bVar.y, bVar.z);
    }
    public static final Object c = null;
}
