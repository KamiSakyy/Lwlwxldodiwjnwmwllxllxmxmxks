package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a3 implements aa.a {
    public static final a3 a = new a3();
    public static final List b = sy.d0.o(new String[]{"id", "commit", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        e2 e2Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                e2Var = (e2) aa.c.c(u2.a, false).a(eVar, wVar);
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
        if (e2Var == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str2 != null) {
            return new k2(str, e2Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k2 k2Var = (k2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k2Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k2Var.a);
        fVar.z0("commit");
        aa.c.c(u2.a, false).b(fVar, wVar, k2Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k2Var.c);
    }
}
