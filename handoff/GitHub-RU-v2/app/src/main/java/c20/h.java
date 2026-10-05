package c20;

import hc0.h6;
import hc0.uu;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "context", "description", "createdAt", "state"});

    public static b20.i c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        uu uuVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(h6.a).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                uu.Companion.getClass();
                Iterator it = uu.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((uu) obj).r.equals(u)) {
                        break;
                    }
                }
                uu uuVar2 = (uu) obj;
                uuVar = uuVar2 == null ? uu.t : uuVar2;
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
        if (uuVar != null) {
            return new b20.i(str, str2, str3, zonedDateTime, uuVar);
        }
        k41.b.B(eVar, "state");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, b20.i iVar) {
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
        h6.Companion.getClass();
        wVar.e(h6.a).b(fVar, wVar, iVar.d);
        fVar.z0("state");
        fVar.I(iVar.e.r);
    }
}
