package p20;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 implements aaShadow.a {
    public static final f0 a = new f0();
    public static final List b = sy.d0.o("subjectType", "pullRequest", "comments", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        hc0.bm bmVar = null;
        u10.t0 t0Var = null;
        u10.p0 p0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
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
            } else if (r0 == 1) {
                t0Var = (u10.t0) aa.c.c(e0.a, true).a(eVar, wVar);
            } else if (r0 == 2) {
                p0Var = (u10.p0) aa.c.c(b0.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (bmVar == null) {
            k41.b.B(eVar, "subjectType");
            throw null;
        }
        if (t0Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (p0Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.u0(bmVar, t0Var, p0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.u0 u0Var = (u10.u0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("subjectType");
        fVar.I(u0Var.a.r);
        fVar.z0("pullRequest");
        aa.c.c(e0.a, true).b(fVar, wVar, u0Var.b);
        fVar.z0("comments");
        aa.c.c(b0.a, false).b(fVar, wVar, u0Var.c);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u0Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, u0Var.e);
    }
}
