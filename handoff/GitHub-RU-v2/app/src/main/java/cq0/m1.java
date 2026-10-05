package cq0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 implements aa.a {
    public static final m1 a = new m1();
    public static final List b = sy.d0.o(new String[]{"__typename", "avatarUrl", "name", "user"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        j1 j1Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                j1Var = (j1) aa.c.b(aa.c.c(q1.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new g1(str, str2, str3, j1Var);
        }
        k41.b.B(eVar, "avatarUrl");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g1 g1Var = (g1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g1Var.a);
        fVar.z0("avatarUrl");
        bVar.b(fVar, wVar, g1Var.b);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, g1Var.c);
        fVar.z0("user");
        aa.c.b(aa.c.c(q1.a, false)).b(fVar, wVar, g1Var.d);
    }
}
