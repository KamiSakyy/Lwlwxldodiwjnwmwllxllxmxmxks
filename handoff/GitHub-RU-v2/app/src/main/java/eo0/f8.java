package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f8 implements aaShadow.a {
    public static final f8 a = new f8();
    public static final List b = sy.d0.o(new String[]{"repository", "search", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.lc lcVar = null;
        jn0.mc mcVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                lcVar = (jn0.lc) aa.c.b(aa.c.c(i8.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                mcVar = (jn0.mc) aa.c.c(j8.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (mcVar == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.ic(lcVar, mcVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ic icVar = (jn0.ic) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(icVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(i8.a, false)).b(fVar, wVar, icVar.a);
        fVar.z0("search");
        aa.c.c(j8.a, false).b(fVar, wVar, icVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, icVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, icVar.d);
    }
}
