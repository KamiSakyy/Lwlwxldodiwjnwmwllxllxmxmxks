package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class po implements aaShadow.a {
    public static final po a = new po();
    public static final List b = sy.d0.o(new String[]{"id", "compare", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.fz fzVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                fzVar = (jn0.fz) aa.c.b(aa.c.c(oo.a, false)).a(eVar, wVar);
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
            return new jn0.gz(str, fzVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.gz gzVar = (jn0.gz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gzVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gzVar.a);
        fVar.z0("compare");
        aa.c.b(aa.c.c(oo.a, false)).b(fVar, wVar, gzVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, gzVar.c);
    }
}
