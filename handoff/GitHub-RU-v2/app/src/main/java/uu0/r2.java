package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r2 implements aa.a {
    public static final r2 a = new r2();
    public static final List b = sy.d0.o(new String[]{"topic", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g2 g2Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                g2Var = (g2) aa.c.c(c3.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (g2Var == null) {
            k41.b.B(eVar, "topic");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new w1(g2Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w1 w1Var = (w1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w1Var, "value");
        fVar.z0("topic");
        aa.c.c(c3.a, false).b(fVar, wVar, w1Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, w1Var.c);
    }
}
