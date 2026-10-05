package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k6 implements aa.a {
    public static final k6 a = new k6();
    public static final List b = sy.d0.o("id", "discussionCategories", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.m9 m9Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                m9Var = (u10.m9) aa.c.c(h6.a, false).a(eVar, wVar);
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
        if (m9Var == null) {
            k41.b.B(eVar, "discussionCategories");
            throw null;
        }
        if (str2 != null) {
            return new u10.p9(str, m9Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.p9 p9Var = (u10.p9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p9Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p9Var.a);
        fVar.z0("discussionCategories");
        aa.c.c(h6.a, false).b(fVar, wVar, p9Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p9Var.c);
    }
}
