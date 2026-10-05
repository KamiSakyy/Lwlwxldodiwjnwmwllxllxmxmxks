package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gd implements aa.a {
    public static final gd a = new gd();
    public static final List b = sy.d0.o(new String[]{"owner", "name", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ij ijVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ijVar = (jn0.ij) aa.c.c(ed.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (ijVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new jn0.kj(ijVar, str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.kj kjVar = (jn0.kj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kjVar, "value");
        fVar.z0("owner");
        aa.c.c(ed.a, true).b(fVar, wVar, kjVar.a);
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kjVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, kjVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, kjVar.d);
    }
}
