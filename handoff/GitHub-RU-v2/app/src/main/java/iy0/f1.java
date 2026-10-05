package iy0;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import pz0.o7;
import pz0.tq;
import wx0.b4;
import wx0.j2;
import wx0.x1;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "fullDatabaseId", "updatedAt", "isArchived", "type"});

    public static e1 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        tq tqVar = null;
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
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
            } else if (r0 == 4) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                String u = eVar.u();
                k71.k.d(u);
                tq.Companion.getClass();
                Iterator it = tq.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((tq) obj).r.equals(u)) {
                        break;
                    }
                }
                tq tqVar2 = (tq) obj;
                tqVar = tqVar2 == null ? tq.u : tqVar2;
            }
            bool2 = bool;
        }
        eVar.s0();
        x1 c = b4.c(eVar, wVar);
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
        if (tqVar != null) {
            return new e1(str, str2, str3, zonedDateTime, booleanValue, tqVar, c);
        }
        k41.b.B(eVar, "type");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e1 e1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, e1Var.b);
        fVar.z0("fullDatabaseId");
        aa.c.i.b(fVar, wVar, e1Var.c);
        fVar.z0("updatedAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, e1Var.d);
        fVar.z0("isArchived");
        f4.C(e1Var.e, aa.c.f, fVar, wVar, "type");
        fVar.I(e1Var.f.r);
        List list = b4.a;
        x1 x1Var = e1Var.g;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x1Var, "value");
        fVar.z0("fieldValues");
        aa.c.c(j2.a, false).b(fVar, wVar, x1Var.a);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, x1Var.b);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, x1Var.c);
    }
}
