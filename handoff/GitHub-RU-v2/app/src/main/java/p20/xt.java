package p20;

import java.util.Iterator;
import java.util.List;
import u10.k70;
import u10.l70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xt implements aaShadow.a {
    public static final xt a = new xt();
    public static final List b = sy.d0.o("__typename", "subjectType", "pullRequest", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        hc0.bm bmVar = null;
        k70 k70Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                hc0.bm.Companion.getClass();
                Iterator it = hc0.bm.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((hc0.bm) obj).r.equals(u)) {
                        break;
                    }
                }
                hc0.bm bmVar2 = (hc0.bm) obj;
                bmVar = bmVar2 == null ? hc0.bm.v : bmVar2;
            } else if (r0 == 2) {
                k70Var = (k70) aa.c.c(wt.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        z70.d7 c = z70.h7.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (bmVar == null) {
            k41.b.B(eVar, "subjectType");
            throw null;
        }
        if (k70Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new l70(str, bmVar, k70Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l70 l70Var = (l70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l70Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l70Var.a);
        fVar.z0("subjectType");
        fVar.I(l70Var.b.r);
        fVar.z0("pullRequest");
        aa.c.c(wt.a, false).b(fVar, wVar, l70Var.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, l70Var.d);
        List list = z70.h7.a;
        z70.h7.d(fVar, wVar, l70Var.e);
    }
}
