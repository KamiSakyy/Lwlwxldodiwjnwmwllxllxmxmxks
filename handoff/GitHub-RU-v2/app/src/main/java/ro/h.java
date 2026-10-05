package ro;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import m10.da0;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "context", "description", "createdAt", "state"});

    public static qo.i c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        da0 da0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                da0.Companion.getClass();
                Iterator it = da0.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((da0) obj).r.equals(u)) {
                        break;
                    }
                }
                da0 da0Var2 = (da0) obj;
                da0Var = da0Var2 == null ? da0.t : da0Var2;
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "context");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (da0Var != null) {
            return new qo.i(str, str2, str3, zonedDateTime, da0Var);
        }
        k41.b.B(eVar, "state");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, qo.i iVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("context");
        bVar.b(fVar, wVar, iVar.b);
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, iVar.c);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, iVar.d);
        fVar.z0("state");
        fVar.I(iVar.e.r);
    }
}
