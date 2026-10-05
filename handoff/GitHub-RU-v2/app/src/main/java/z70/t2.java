package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t2 implements aa.a {
    public static final t2 a = new t2();
    public static final List b = sy.d0.o("id", "commit", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        c2 c2Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                c2Var = (c2) aa.c.c(p2.a, false).a(eVar, wVar);
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
        if (c2Var == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str2 != null) {
            return new g2(str, c2Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g2 g2Var = (g2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g2Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g2Var.a);
        fVar.z0("commit");
        aa.c.c(p2.a, false).b(fVar, wVar, g2Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, g2Var.c);
    }
}
