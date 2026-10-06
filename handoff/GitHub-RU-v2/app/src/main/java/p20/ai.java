package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ai implements aaShadow.a {
    public static final ai a = new ai();
    public static final List b = sy.d0.n("removeReaction");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.jq jqVar = null;
        while (eVar.r0(b) == 0) {
            jqVar = (u10.jq) aa.c.b(aa.c.c(di.a, false)).a(eVar, wVar);
        }
        return new u10.gq(jqVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.gq gqVar = (u10.gq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gqVar, "value");
        fVar.z0("removeReaction");
        aa.c.b(aa.c.c(di.a, false)).b(fVar, wVar, gqVar.a);
    }
}
