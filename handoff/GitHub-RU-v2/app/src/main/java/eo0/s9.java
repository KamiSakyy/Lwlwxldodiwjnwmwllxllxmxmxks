package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s9 implements aa.a {
    public static final s9 a = new s9();
    public static final List b = sy.d0.o(new String[]{"filters", "items"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        jn0.pe peVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.c(t9.a, false))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                peVar = (jn0.pe) aa.c.c(u9.a, false).a(eVar, wVar);
            }
        }
        if (peVar != null) {
            return new jn0.ne(list, peVar);
        }
        k41.b.B(eVar, "items");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ne neVar = (jn0.ne) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(neVar, "value");
        fVar.z0("filters");
        aa.c.b(aa.c.a(aa.c.c(t9.a, false))).b(fVar, wVar, neVar.a);
        fVar.z0("items");
        aa.c.c(u9.a, false).b(fVar, wVar, neVar.b);
    }
}
