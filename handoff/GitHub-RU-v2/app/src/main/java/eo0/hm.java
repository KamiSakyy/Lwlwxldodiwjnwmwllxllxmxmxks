package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hm implements aa.a {
    public static final hm a = new hm();
    public static final List b = sy.d0.o(new String[]{"id", "mergeQueue", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.aw awVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                awVar = (jn0.aw) aa.c.b(aa.c.c(dm.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.ew(str, awVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ew ewVar = (jn0.ew) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ewVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ewVar.a);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(dm.a, false)).b(fVar, wVar, ewVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ewVar.c);
    }
}
