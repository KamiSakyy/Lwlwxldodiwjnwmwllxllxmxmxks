package cq;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h6 implements aa.a {
    public static final List a = x61.l.r(new String[]{"createdAt", "dismissable", "identifier", "reason", "repository"});

    public static f6 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        String str2 = null;
        e6 e6Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
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
                e6Var = (e6) aa.c.c(g6.a, true).a(eVar, wVar);
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
        if (e6Var != null) {
            return new f6(zonedDateTime, booleanValue, str, str2, e6Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, f6 f6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f6Var, "value");
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, f6Var.a);
        fVar.z0("dismissable");
        jo.f4.C(f6Var.b, aa.c.f, fVar, wVar, "identifier");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f6Var.c);
        fVar.z0("reason");
        bVar.b(fVar, wVar, f6Var.d);
        fVar.z0("repository");
        aa.c.c(g6.a, true).b(fVar, wVar, f6Var.e);
    }
}
