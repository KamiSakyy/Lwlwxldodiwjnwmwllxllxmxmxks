package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nb implements aaShadow.a {
    public static final nb a = new nb();
    public static final List b = sy.d0.n("followUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ch chVar = null;
        while (eVar.r0(b) == 0) {
            chVar = (jn0.ch) aa.c.b(aa.c.c(ob.a, false)).a(eVar, wVar);
        }
        return new jn0.bh(chVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.bh bhVar = (jn0.bh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bhVar, "value");
        fVar.z0("followUser");
        aa.c.b(aa.c.c(ob.a, false)).b(fVar, wVar, bhVar.a);
    }
}
