package ap0;

import java.time.ZonedDateTime;
import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"actor", "createdAt", "dismissable", "identifier", "release"});

    public static m2 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        k2 k2Var = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        l2 l2Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                k2Var = (k2) aa.c.c(n2.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
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
                l2Var = (l2) aa.c.c(p2.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (k2Var == null) {
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
        if (l2Var != null) {
            return new m2(k2Var, zonedDateTime, booleanValue, str, l2Var);
        }
        k41.b.B(eVar, "release");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, m2 m2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m2Var, "value");
        fVar.z0("actor");
        aa.c.c(n2.a, true).b(fVar, wVar, m2Var.a);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, m2Var.b);
        fVar.z0("dismissable");
        jo.f4.C(m2Var.c, aa.c.f, fVar, wVar, "identifier");
        aa.c.a.b(fVar, wVar, m2Var.d);
        fVar.z0("release");
        aa.c.c(p2.a, true).b(fVar, wVar, m2Var.e);
    }
}
