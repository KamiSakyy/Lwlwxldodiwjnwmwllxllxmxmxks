package ri0;

import gn0.kw;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e3 implements aa.a {
    public static final e3 a = new e3();
    public static final List b = sy.d0.o(new String[]{"id", "name", "viewerSubscription", "viewerSubscriptionTypes", "owner", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        kw kwVar = null;
        List list = null;
        m2 m2Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                kwVar = (kw) aa.c.b(hn0.b.o).a(eVar, wVar);
            } else if (r0 == 3) {
                list = (List) aa.c.b(aa.c.a(hn0.a.i)).a(eVar, wVar);
            } else if (r0 == 4) {
                m2Var = (m2) aa.c.c(c3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (m2Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new n2(str, str2, kwVar, list, m2Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n2 n2Var = (n2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n2Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n2Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, n2Var.b);
        fVar.z0("viewerSubscription");
        aa.c.b(hn0.b.o).b(fVar, wVar, n2Var.c);
        fVar.z0("viewerSubscriptionTypes");
        aa.c.b(aa.c.a(hn0.a.i)).b(fVar, wVar, n2Var.d);
        fVar.z0("owner");
        aa.c.c(c3.a, false).b(fVar, wVar, n2Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, n2Var.f);
    }
}
