package cq;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "createdAt", "dismissable", "identifier", "reason", "followee"});

    public static d1 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        ZonedDateTime zonedDateTime = null;
        String str2 = null;
        String str3 = null;
        c1 c1Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                c1Var = (c1) aa.c.c(f1Shadow.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
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
        if (str2 == null) {
            k41.b.B(eVar, "identifier");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "reason");
            throw null;
        }
        if (c1Var != null) {
            return new d1(str, zonedDateTime, booleanValue, str2, str3, c1Var);
        }
        k41.b.B(eVar, "followee");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, d1 d1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d1Var.a);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, d1Var.b);
        fVar.z0("dismissable");
        jo.f4Shadow.C(d1Var.c, aa.c.f, fVar, wVar, "identifier");
        bVar.b(fVar, wVar, d1Var.d);
        fVar.z0("reason");
        bVar.b(fVar, wVar, d1Var.e);
        fVar.z0("followee");
        aa.c.c(f1Shadow.a, true).b(fVar, wVar, d1Var.f);
    }
}
