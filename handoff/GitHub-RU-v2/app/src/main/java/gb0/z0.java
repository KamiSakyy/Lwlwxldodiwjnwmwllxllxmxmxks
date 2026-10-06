package gb0;

import fb0.b1;
import fb0.d1;
import fb0.e1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 implements aa.a {
    public static final z0 a = new z0();
    public static final List b = sy.d0Shadow.o("inbox", "notificationFilters", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b1 b1Var = null;
        d1 d1Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                b1Var = (b1) aa.c.c(w0.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                d1Var = (d1) aa.c.c(y0.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (b1Var == null) {
            k41.b.B(eVar, "inbox");
            throw null;
        }
        if (d1Var == null) {
            k41.b.B(eVar, "notificationFilters");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new e1(b1Var, d1Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e1 e1Var = (e1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("inbox");
        aa.c.c(w0.a, false).b(fVar, wVar, e1Var.a);
        fVar.z0("notificationFilters");
        aa.c.c(y0.a, false).b(fVar, wVar, e1Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e1Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, e1Var.d);
    }
}
