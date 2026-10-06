package xk;

import in.rShadow;
import t00.z1;
import y71.y;
import z01.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public l a;
    public oa.g b;
    public oa.g c;

    public j(l lVar, oa.g gVar, oa.g gVar2) {
        k71.k.g(lVar, "pinnedItemsStore");
        k71.k.g(gVar, "homeServiceFactory");
        k71.k.g(gVar2, "favoritesServiceFactory");
        this.a = lVar;
        this.b = gVar;
        this.c = gVar2;
    }

    public final gl.f a(oa.j jVar) {
        k71.k.g(jVar, "user");
        return rShadow.l(new y(((a0) this.b.a(jVar)).d(), new z1(this, jVar, null, 26), 6));
    }
}
