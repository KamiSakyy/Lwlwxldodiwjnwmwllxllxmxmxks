package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p7 implements aa.a {
    public static final p7 a = new p7();
    public static final List b = sy.d0Shadow.o("commit", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e7 e7Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                e7Var = (e7) aa.c.c(m7.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (e7Var == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new h7(e7Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h7 h7Var = (h7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h7Var, "value");
        fVar.z0("commit");
        aa.c.c(m7.a, false).b(fVar, wVar, h7Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h7Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h7Var.c);
    }
}
