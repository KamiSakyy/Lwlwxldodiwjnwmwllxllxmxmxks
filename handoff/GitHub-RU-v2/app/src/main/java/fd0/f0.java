package fd0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 implements aa.a {
    public static final f0 a = new f0();
    public static final List b = sy.d0.o(new String[]{"subjectType", "pullRequest", "comments", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        gn0.dn dnVar = null;
        kc0.t0 t0Var = null;
        kc0.p0 p0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                gn0.dn.Companion.getClass();
                Iterator it = gn0.dn.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gn0.dn) obj).r.equals(u)) {
                        break;
                    }
                }
                gn0.dn dnVar2 = (gn0.dn) obj;
                dnVar = dnVar2 == null ? gn0.dn.v : dnVar2;
            } else if (r0 == 1) {
                t0Var = (kc0.t0) aa.c.c(e0.a, true).a(eVar, wVar);
            } else if (r0 == 2) {
                p0Var = (kc0.p0) aa.c.c(b0.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (dnVar == null) {
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
            return new kc0.u0(dnVar, t0Var, p0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.u0 u0Var = (kc0.u0) obj;
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
