package sc0;

import gn0.r6;
import gn0.yv;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "context", "description", "createdAt", "state"});

    public static rc0.i c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        yv yvVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                yv.Companion.getClass();
                Iterator it = yv.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((yv) obj).r.equals(u)) {
                        break;
                    }
                }
                yv yvVar2 = (yv) obj;
                yvVar = yvVar2 == null ? yv.t : yvVar2;
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
        if (yvVar != null) {
            return new rc0.i(str, str2, str3, zonedDateTime, yvVar);
        }
        k41.b.B(eVar, "state");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, rc0.i iVar) {
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
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, iVar.d);
        fVar.z0("state");
        fVar.I(iVar.e.r);
    }
}
