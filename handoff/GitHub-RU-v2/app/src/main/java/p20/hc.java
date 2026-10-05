package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hc implements aa.a {
    public static final hc a = new hc();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.yi yiVar = null;
        while (eVar.r0(b) == 0) {
            yiVar = (u10.yi) aa.c.b(aa.c.c(oc.a, true)).a(eVar, wVar);
        }
        return new u10.ri(yiVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ri riVar = (u10.ri) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(riVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(oc.a, true)).b(fVar, wVar, riVar.a);
    }
}
