package f00;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import m10.ew;
import m10.sa;
import tz.c4;
import tz.k2;
import tz.x1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "fullDatabaseId", "updatedAt", "isArchived", "type"});

    public static g1 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        ew ewVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
            } else if (r0 == 4) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                String u = eVar.u();
                k71.k.d(u);
                ew.Companion.getClass();
                Iterator it = ew.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ew) obj).r.equals(u)) {
                        break;
                    }
                }
                ew ewVar2 = (ew) obj;
                ewVar = ewVar2 == null ? ew.u : ewVar2;
            }
            bool2 = bool;
        }
        eVar.s0();
        x1 c = c4.c(eVar, wVar);
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "updatedAt");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isArchived");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (ewVar != null) {
            return new g1(str, str2, str3, zonedDateTime, booleanValue, ewVar, c);
        }
        k41.b.B(eVar, "type");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g1 g1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, g1Var.b);
        fVar.z0("fullDatabaseId");
        aa.c.i.b(fVar, wVar, g1Var.c);
        fVar.z0("updatedAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, g1Var.d);
        fVar.z0("isArchived");
        f4.C(g1Var.e, aa.c.f, fVar, wVar, "type");
        fVar.I(g1Var.f.r);
        List list = c4.a;
        x1 x1Var = g1Var.g;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x1Var, "value");
        fVar.z0("fieldValues");
        aa.c.c(k2.a, false).b(fVar, wVar, x1Var.a);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, x1Var.b);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, x1Var.c);
    }
}
