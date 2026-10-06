package cq;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"actor", "createdAt", "dismissable", "identifier", "pullRequest"});

    public static i2 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        g2 g2Var = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        h2 h2Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                g2Var = (g2) aa.c.c(j2.a, true).a(eVar, wVar);
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
                h2Var = (h2) aa.c.c(l2.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (g2Var == null) {
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
        if (h2Var != null) {
            return new i2(g2Var, zonedDateTime, booleanValue, str, h2Var);
        }
        k41.b.B(eVar, "pullRequest");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, i2 i2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i2Var, "value");
        fVar.z0("actor");
        aa.c.c(j2.a, true).b(fVar, wVar, i2Var.a);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, i2Var.b);
        fVar.z0("dismissable");
        jo.f4Shadow.C(i2Var.c, aa.c.f, fVar, wVar, "identifier");
        aa.c.a.b(fVar, wVar, i2Var.d);
        fVar.z0("pullRequest");
        aa.c.c(l2.a, true).b(fVar, wVar, i2Var.e);
    }
}
