package ap0;

import java.time.ZonedDateTime;
import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "createdAt", "dismissable", "identifier", "reason", "followee"});

    public static v0 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        ZonedDateTime zonedDateTime = null;
        String str2 = null;
        String str3 = null;
        u0 u0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
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
                u0Var = (u0) aa.c.c(x0.a, true).a(eVar, wVar);
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
        if (u0Var != null) {
            return new v0(str, zonedDateTime, booleanValue, str2, str3, u0Var);
        }
        k41.b.B(eVar, "followee");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, v0 v0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v0Var.a);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, v0Var.b);
        fVar.z0("dismissable");
        jo.f4Shadow.C(v0Var.c, aa.c.f, fVar, wVar, "identifier");
        bVar.b(fVar, wVar, v0Var.d);
        fVar.z0("reason");
        bVar.b(fVar, wVar, v0Var.e);
        fVar.z0("followee");
        aa.c.c(x0.a, true).b(fVar, wVar, v0Var.f);
    }
}
