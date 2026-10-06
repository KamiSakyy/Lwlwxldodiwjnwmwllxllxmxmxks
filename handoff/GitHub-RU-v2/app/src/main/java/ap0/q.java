package ap0;

import java.time.ZonedDateTime;
import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q implements aa.a {
    public static final List a = x61.l.r(new String[]{"actor", "createdAt", "dismissable", "identifier", "previewImageUrl", "discussion"});

    public static o c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        m mVar = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        String str2 = null;
        n nVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                mVar = (m) aa.c.c(p.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                nVar = (n) aa.c.c(r.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (mVar == null) {
            k41.b.B(eVar, "actor");
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
        if (str == null) {
            k41.b.B(eVar, "identifier");
            throw null;
        }
        if (nVar != null) {
            return new o(mVar, zonedDateTime, booleanValue, str, str2, nVar);
        }
        k41.b.B(eVar, "discussion");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("actor");
        aa.c.c(p.a, true).b(fVar, wVar, oVar.a);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, oVar.b);
        fVar.z0("dismissable");
        jo.f4Shadow.C(oVar.c, aa.c.f, fVar, wVar, "identifier");
        aa.c.a.b(fVar, wVar, oVar.d);
        fVar.z0("previewImageUrl");
        aa.c.i.b(fVar, wVar, oVar.e);
        fVar.z0("discussion");
        aa.c.c(r.a, true).b(fVar, wVar, oVar.f);
    }
}
