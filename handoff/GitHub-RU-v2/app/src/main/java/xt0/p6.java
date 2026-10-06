package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p6 implements aa.a {
    public static final p6 a = new p6();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "commit", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        p4 p4Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                p4Var = (p4) aa.c.c(a6.a, false).a(eVar, wVar);
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
        if (p4Var == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str2 != null) {
            return new e5(str, p4Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e5 e5Var = (e5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e5Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e5Var.a);
        fVar.z0("commit");
        aa.c.c(a6.a, false).b(fVar, wVar, e5Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, e5Var.c);
    }
}
