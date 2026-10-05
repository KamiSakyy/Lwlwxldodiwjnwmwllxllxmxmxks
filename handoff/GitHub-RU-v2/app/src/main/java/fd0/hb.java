package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hb implements aa.a {
    public static final hb a = new hb();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.qg qgVar = null;
        while (eVar.r0(b) == 0) {
            qgVar = (kc0.qg) aa.c.c(ib.a, true).a(eVar, wVar);
        }
        if (qgVar != null) {
            return new kc0.pg(qgVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.pg pgVar = (kc0.pg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pgVar, "value");
        fVar.z0("viewer");
        aa.c.c(ib.a, true).b(fVar, wVar, pgVar.a);
    }
}
