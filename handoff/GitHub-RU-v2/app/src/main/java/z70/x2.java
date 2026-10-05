package z70;

import hc0.ev;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x2 implements aa.a {
    public static final x2 a = new x2();
    public static final List b = sy.d0.o("id", "name", "viewerSubscription", "viewerSubscriptionTypes", "owner", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        ev evVar = null;
        List list = null;
        i2 i2Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                evVar = (ev) aa.c.b(ic0.b.o).a(eVar, wVar);
            } else if (r0 == 3) {
                list = (List) aa.c.b(aa.c.a(ic0.a.i)).a(eVar, wVar);
            } else if (r0 == 4) {
                i2Var = (i2) aa.c.c(v2.a, false).a(eVar, wVar);
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
        if (i2Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new j2(str, str2, evVar, list, i2Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j2 j2Var = (j2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j2Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j2Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, j2Var.b);
        fVar.z0("viewerSubscription");
        aa.c.b(ic0.b.o).b(fVar, wVar, j2Var.c);
        fVar.z0("viewerSubscriptionTypes");
        aa.c.b(aa.c.a(ic0.a.i)).b(fVar, wVar, j2Var.d);
        fVar.z0("owner");
        aa.c.c(v2.a, false).b(fVar, wVar, j2Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j2Var.f);
    }
}
