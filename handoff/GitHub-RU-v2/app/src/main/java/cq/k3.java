package cq;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"actor", "createdAt", "dismissable", "identifier", "release"});

    public static i3 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        g3 g3Var = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        h3 h3Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                g3Var = (g3) aa.c.c(j3.a, true).a(eVar, wVar);
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
                h3Var = (h3) aa.c.c(l3.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (g3Var == null) {
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
        if (h3Var != null) {
            return new i3(g3Var, zonedDateTime, booleanValue, str, h3Var);
        }
        k41.b.B(eVar, "release");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, i3 i3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i3Var, "value");
        fVar.z0("actor");
        aa.c.c(j3.a, true).b(fVar, wVar, i3Var.a);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, i3Var.b);
        fVar.z0("dismissable");
        jo.f4.C(i3Var.c, aa.c.f, fVar, wVar, "identifier");
        aa.c.a.b(fVar, wVar, i3Var.d);
        fVar.z0("release");
        aa.c.c(l3.a, true).b(fVar, wVar, i3Var.e);
    }
}
