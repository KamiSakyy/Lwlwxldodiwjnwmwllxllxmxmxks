package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e7 implements aaShadow.a {
    public static final e7 a = new e7();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "discussionCategories", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.oa oaVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                oaVar = (jn0.oa) aa.c.c(b7.a, false).a(eVar, wVar);
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
        if (oaVar == null) {
            k41.b.B(eVar, "discussionCategories");
            throw null;
        }
        if (str2 != null) {
            return new jn0.ra(str, oaVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ra raVar = (jn0.ra) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(raVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, raVar.a);
        fVar.z0("discussionCategories");
        aa.c.c(b7.a, false).b(fVar, wVar, raVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, raVar.c);
    }
}
