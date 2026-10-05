package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e9 implements aa.a {
    public static final e9 a = new e9();
    public static final List b = sy.d0.o(new String[]{"id", "repositories", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.qd qdVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                qdVar = (jn0.qd) aa.c.c(d9.a, false).a(eVar, wVar);
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
        if (qdVar == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str2 != null) {
            return new jn0.rd(str, qdVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.rd rdVar = (jn0.rd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rdVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rdVar.a);
        fVar.z0("repositories");
        aa.c.c(d9.a, false).b(fVar, wVar, rdVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, rdVar.c);
    }
}
