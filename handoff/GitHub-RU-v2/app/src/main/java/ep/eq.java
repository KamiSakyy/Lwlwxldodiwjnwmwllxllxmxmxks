package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eqShadow implements aaShadow.a {
    public static final eqShadow a = new eqShadow();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        gv.n3 n3Var = gv.n3.a;
        gv.z2 c = gv.n3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.k10(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.k10 k10Var = (jo.k10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k10Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k10Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, k10Var.b);
        gv.n3 n3Var = gv.n3.a;
        gv.n3.d(fVar, wVar, k10Var.c);
    }
}
