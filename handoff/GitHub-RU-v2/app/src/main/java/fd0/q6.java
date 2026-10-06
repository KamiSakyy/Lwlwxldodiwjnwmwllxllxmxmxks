package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q6 implements aaShadow.a {
    public static final q6 a = new q6();
    public static final List b = sy.d0.o(new String[]{"id", "discussionCategories", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.u9 u9Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                u9Var = (kc0.u9) aa.c.c(n6.a, false).a(eVar, wVar);
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
        if (u9Var == null) {
            k41.b.B(eVar, "discussionCategories");
            throw null;
        }
        if (str2 != null) {
            return new kc0.x9(str, u9Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.x9 x9Var = (kc0.x9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x9Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x9Var.a);
        fVar.z0("discussionCategories");
        aa.c.c(n6.a, false).b(fVar, wVar, x9Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x9Var.c);
    }
}
