package ap0;

import java.time.ZonedDateTime;
import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"actor", "createdAt", "dismissable", "identifier", "repository"});

    public static s5 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        q5 q5Var = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        r5 r5Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                q5Var = (q5) aa.c.c(t5.a, true).a(eVar, wVar);
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
                r5Var = (r5) aa.c.c(u5.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (q5Var == null) {
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
        if (r5Var != null) {
            return new s5(q5Var, zonedDateTime, booleanValue, str, r5Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, s5 s5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s5Var, "value");
        fVar.z0("actor");
        aa.c.c(t5.a, true).b(fVar, wVar, s5Var.a);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, s5Var.b);
        fVar.z0("dismissable");
        jo.f4Shadow.C(s5Var.c, aa.c.f, fVar, wVar, "identifier");
        aa.c.a.b(fVar, wVar, s5Var.d);
        fVar.z0("repository");
        aa.c.c(u5.a, true).b(fVar, wVar, s5Var.e);
    }
}
