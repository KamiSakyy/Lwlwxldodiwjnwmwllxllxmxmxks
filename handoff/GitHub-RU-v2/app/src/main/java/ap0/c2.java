package ap0;

import java.time.ZonedDateTime;
import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"actor", "createdAt", "dismissable", "identifier", "pullRequest"});

    public static a2 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        y1 y1Var = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        z1 z1Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                y1Var = (y1) aa.c.c(b2.a, true).a(eVar, wVar);
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
                z1Var = (z1) aa.c.c(d2.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (y1Var == null) {
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
        if (z1Var != null) {
            return new a2(y1Var, zonedDateTime, booleanValue, str, z1Var);
        }
        k41.b.B(eVar, "pullRequest");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, a2 a2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a2Var, "value");
        fVar.z0("actor");
        aa.c.c(b2.a, true).b(fVar, wVar, a2Var.a);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, a2Var.b);
        fVar.z0("dismissable");
        jo.f4Shadow.C(a2Var.c, aa.c.f, fVar, wVar, "identifier");
        aa.c.a.b(fVar, wVar, a2Var.d);
        fVar.z0("pullRequest");
        aa.c.c(d2.a, true).b(fVar, wVar, a2Var.e);
    }
}
