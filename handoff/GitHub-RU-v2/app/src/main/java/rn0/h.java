package rn0;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import pz0.n30;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "context", "description", "createdAt", "state"});

    public static qn0.i c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        n30 n30Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                n30.Companion.getClass();
                Iterator it = n30.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((n30) obj).r.equals(u)) {
                        break;
                    }
                }
                n30 n30Var2 = (n30) obj;
                n30Var = n30Var2 == null ? n30.t : n30Var2;
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
        if (n30Var != null) {
            return new qn0.i(str, str2, str3, zonedDateTime, n30Var);
        }
        k41.b.B(eVar, "state");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, qn0.i iVar) {
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
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, iVar.d);
        fVar.z0("state");
        fVar.I(iVar.e.r);
    }
}
