package px0;

import java.util.List;
import ox0.d1;
import ox0.f1;
import ox0.g1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 implements aa.a {
    public static final b1 a = new b1();
    public static final List b = sy.d0.o(new String[]{"inbox", "notificationFilters", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d1 d1Var = null;
        f1 f1Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d1Var = (d1) aa.c.c(y0.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                f1Var = (f1) aa.c.c(a1.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (d1Var == null) {
            k41.b.B(eVar, "inbox");
            throw null;
        }
        if (f1Var == null) {
            k41.b.B(eVar, "notificationFilters");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new g1(d1Var, f1Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g1 g1Var = (g1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g1Var, "value");
        fVar.z0("inbox");
        aa.c.c(y0.a, false).b(fVar, wVar, g1Var.a);
        fVar.z0("notificationFilters");
        aa.c.c(a1.a, false).b(fVar, wVar, g1Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g1Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, g1Var.d);
    }
}
