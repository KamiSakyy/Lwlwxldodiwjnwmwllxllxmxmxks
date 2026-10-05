package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "projectItems", "__typename"});

    public static c c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        b bVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bVar = (b) aa.c.c(f.a, false).a(eVar, wVar);
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
        if (bVar == null) {
            k41.b.B(eVar, "projectItems");
            throw null;
        }
        if (str2 != null) {
            return new c(str, bVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, c cVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("projectItems");
        aa.c.c(f.a, false).b(fVar, wVar, cVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, cVar.c);
    }
}
