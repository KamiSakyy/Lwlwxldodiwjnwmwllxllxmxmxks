package ap0;

import java.time.ZonedDateTime;
import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "createdAt", "dismissable", "identifier", "followee", "follower"});

    public static g1 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        ZonedDateTime zonedDateTime = null;
        String str2 = null;
        e1 e1Var = null;
        f1 f1Var = null;
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
                e1Var = (e1) aa.c.c(i1.a, true).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                f1Var = (f1) aa.c.c(j1.a, true).a(eVar, wVar);
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
        if (e1Var == null) {
            k41.b.B(eVar, "followee");
            throw null;
        }
        if (f1Var != null) {
            return new g1(str, zonedDateTime, booleanValue, str2, e1Var, f1Var);
        }
        k41.b.B(eVar, "follower");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g1 g1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g1Var.a);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, g1Var.b);
        fVar.z0("dismissable");
        jo.f4.C(g1Var.c, aa.c.f, fVar, wVar, "identifier");
        bVar.b(fVar, wVar, g1Var.d);
        fVar.z0("followee");
        aa.c.c(i1.a, true).b(fVar, wVar, g1Var.e);
        fVar.z0("follower");
        aa.c.c(j1.a, true).b(fVar, wVar, g1Var.f);
    }
    public static final Object i = null;
}
