package ap0;

import java.time.ZonedDateTime;
import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"createdAt", "dismissable", "identifier", "reason", "repository"});

    public static j5 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        String str2 = null;
        i5 i5Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                i5Var = (i5) aa.c.c(k5.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
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
        if (str2 == null) {
            k41.b.B(eVar, "reason");
            throw null;
        }
        if (i5Var != null) {
            return new j5(zonedDateTime, booleanValue, str, str2, i5Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, j5 j5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j5Var, "value");
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, j5Var.a);
        fVar.z0("dismissable");
        jo.f4Shadow.C(j5Var.b, aa.c.f, fVar, wVar, "identifier");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j5Var.c);
        fVar.z0("reason");
        bVar.b(fVar, wVar, j5Var.d);
        fVar.z0("repository");
        aa.c.c(k5.a, true).b(fVar, wVar, j5Var.e);
    }
}
