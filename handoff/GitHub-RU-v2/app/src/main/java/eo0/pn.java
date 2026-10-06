package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pn implements aaShadow.a {
    public static final pn a = new pn();
    public static final List b = sy.d0Shadow.o(new String[]{"defaultBranchRef", "refs", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ux uxVar = null;
        jn0.xx xxVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                uxVar = (jn0.ux) aa.c.b(aa.c.c(ln.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                xxVar = (jn0.xx) aa.c.b(aa.c.c(on.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new jn0.yx(uxVar, xxVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.yx yxVar = (jn0.yx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yxVar, "value");
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(ln.a, false)).b(fVar, wVar, yxVar.a);
        fVar.z0("refs");
        aa.c.b(aa.c.c(on.a, false)).b(fVar, wVar, yxVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, yxVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, yxVar.d);
    }
}
