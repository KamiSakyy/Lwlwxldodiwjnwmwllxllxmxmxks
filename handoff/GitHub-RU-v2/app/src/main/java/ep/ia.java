package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ia implements aaShadow.a {
    public static final ia a = new ia();
    public static final List b = sy.d0.o("filters", "items");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        jo.nf nfVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.c(ja.a, false))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                nfVar = (jo.nf) aa.c.c(ka.a, false).a(eVar, wVar);
            }
        }
        if (nfVar != null) {
            return new jo.lf(list, nfVar);
        }
        k41.b.B(eVar, "items");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.lf lfVar = (jo.lf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lfVar, "value");
        fVar.z0("filters");
        aa.c.b(aa.c.a(aa.c.c(ja.a, false))).b(fVar, wVar, lfVar.a);
        fVar.z0("items");
        aa.c.c(ka.a, false).b(fVar, wVar, lfVar.b);
    }
}
