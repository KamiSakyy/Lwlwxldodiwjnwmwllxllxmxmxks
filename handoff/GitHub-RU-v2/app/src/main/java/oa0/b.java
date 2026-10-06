package oa0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements aa.a {
    public static final b a = new b();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        na0.d dVar;
        na0.e eVar2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
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
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            dVar = c.c(eVar, wVar);
        } else {
            dVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            eVar2 = d.c(eVar, wVar);
        } else {
            eVar2 = null;
        }
        if (str2 != null) {
            return new na0.c(str, str2, dVar, eVar2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.c cVar = (na0.c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.b);
        na0.d dVar = cVar.c;
        if (dVar != null) {
            c.d(fVar, wVar, dVar);
        }
        na0.e eVar = cVar.d;
        if (eVar != null) {
            d.d(fVar, wVar, eVar);
        }
    }
}
