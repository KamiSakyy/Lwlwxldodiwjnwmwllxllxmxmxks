package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wj implements aaShadow.a {
    public static final wj a = new wj();
    public static final List b = sy.d0.n("repositoryOwner");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ht htVar = null;
        while (eVar.r0(b) == 0) {
            htVar = (u10.ht) aa.c.b(aa.c.c(fk.a, true)).a(eVar, wVar);
        }
        return new u10.ys(htVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ys ysVar = (u10.ys) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ysVar, "value");
        fVar.z0("repositoryOwner");
        aa.c.b(aa.c.c(fk.a, true)).b(fVar, wVar, ysVar.a);
    }
}
