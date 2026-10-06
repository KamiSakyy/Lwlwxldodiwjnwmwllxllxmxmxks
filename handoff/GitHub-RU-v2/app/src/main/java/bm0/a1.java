package bm0;

import am0.c1;
import am0.e1;
import am0.f1Shadow;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 implements aa.a {
    public static final a1 a = new a1();
    public static final List b = sy.d0Shadow.o(new String[]{"inbox", "notificationFilters", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c1 c1Var = null;
        e1 e1Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                c1Var = (c1) aa.c.c(x0.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                e1Var = (e1) aa.c.c(z0.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (c1Var == null) {
            k41.b.B(eVar, "inbox");
            throw null;
        }
        if (e1Var == null) {
            k41.b.B(eVar, "notificationFilters");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new f1Shadow(c1Var, e1Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f1Shadow f1Var = (f1Shadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f1Var, "value");
        fVar.z0("inbox");
        aa.c.c(x0.a, false).b(fVar, wVar, f1Var.a);
        fVar.z0("notificationFilters");
        aa.c.c(z0.a, false).b(fVar, wVar, f1Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f1Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, f1Var.d);
    }
}
