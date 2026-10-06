package gv;

import java.util.List;
import m10.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o3 implements aa.a {
    public static final o3 a = new o3();
    public static final List b = sy.d0Shadow.o("id", "name", "viewerSubscription", "viewerSubscriptionTypes", "owner", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        ya0 ya0Var = null;
        List list = null;
        w2 w2Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                ya0Var = (ya0) aa.c.b(n10.c.e).a(eVar, wVar);
            } else if (r0 == 3) {
                list = (List) aa.c.b(aa.c.a(n10.a.u)).a(eVar, wVar);
            } else if (r0 == 4) {
                w2Var = (w2) aa.c.c(m3.a, false).a(eVar, wVar);
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
        if (w2Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new x2(str, str2, ya0Var, list, w2Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x2 x2Var = (x2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x2Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x2Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, x2Var.b);
        fVar.z0("viewerSubscription");
        aa.c.b(n10.c.e).b(fVar, wVar, x2Var.c);
        fVar.z0("viewerSubscriptionTypes");
        aa.c.b(aa.c.a(n10.a.u)).b(fVar, wVar, x2Var.d);
        fVar.z0("owner");
        aa.c.c(m3.a, false).b(fVar, wVar, x2Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x2Var.f);
    }
}
