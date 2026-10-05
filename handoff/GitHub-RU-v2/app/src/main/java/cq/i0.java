package cq;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"actor", "createdAt", "dismissable", "identifier", "repository"});

    public static g0 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        e0 e0Var = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        f0 f0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                e0Var = (e0) aa.c.c(h0.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                f0Var = (f0) aa.c.c(j0.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (e0Var == null) {
            k41.b.B(eVar, "actor");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "dismissable");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str == null) {
            k41.b.B(eVar, "identifier");
            throw null;
        }
        if (f0Var != null) {
            return new g0(e0Var, zonedDateTime, booleanValue, str, f0Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g0 g0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("actor");
        aa.c.c(h0.a, true).b(fVar, wVar, g0Var.a);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, g0Var.b);
        fVar.z0("dismissable");
        jo.f4.C(g0Var.c, aa.c.f, fVar, wVar, "identifier");
        aa.c.a.b(fVar, wVar, g0Var.d);
        fVar.z0("repository");
        aa.c.c(j0.a, true).b(fVar, wVar, g0Var.e);
    }
}
