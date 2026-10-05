package sc0;

import gn0.e20;
import java.util.Iterator;
import java.util.List;
import rc0.k2;
import rc0.l2;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "name", "url", "state", "runs"});

    public static k2 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        e20 e20Var = null;
        l2 l2Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                String u = eVar.u();
                k71.k.d(u);
                e20.Companion.getClass();
                Iterator it = e20.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((e20) obj).r.equals(u)) {
                        break;
                    }
                }
                e20 e20Var2 = (e20) obj;
                e20Var = e20Var2 == null ? e20.t : e20Var2;
            } else {
                if (r0 != 4) {
                    break;
                }
                l2Var = (l2) aa.c.c(q1.a, true).a(eVar, wVar);
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
        if (str3 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (e20Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (l2Var != null) {
            return new k2(str, str2, str3, e20Var, l2Var);
        }
        k41.b.B(eVar, "runs");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, k2 k2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k2Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k2Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, k2Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, k2Var.c);
        fVar.z0("state");
        fVar.I(k2Var.d.r);
        fVar.z0("runs");
        aa.c.c(q1.a, true).b(fVar, wVar, k2Var.e);
    }
}
