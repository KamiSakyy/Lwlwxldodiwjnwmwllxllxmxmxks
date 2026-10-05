package ep;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rk implements aa.a {
    public static final rk a = new rk();
    public static final List b = sy.d0.o("__typename", "id", "author", "createdAt", "lastEditedAt", "body");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        jo.wt wtVar = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 != 2) {
                aa.x xVar = m10.sa.a;
                if (r0 == 3) {
                    m10.sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                } else if (r0 == 4) {
                    m10.sa.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                } else {
                    if (r0 != 5) {
                        break;
                    }
                    str3 = (String) aa.c.a.a(eVar, wVar);
                }
            } else {
                wtVar = (jo.wt) aa.c.b(aa.c.c(lk.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        ju.d dVar = ju.d.a;
        ju.a c = ju.d.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (str3 != null) {
            return new jo.du(str, str2, wtVar, zonedDateTime, zonedDateTime2, str3, c);
        }
        k41.b.B(eVar, "body");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.du duVar = (jo.du) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(duVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, duVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, duVar.b);
        fVar.z0("author");
        aa.c.b(aa.c.c(lk.a, true)).b(fVar, wVar, duVar.c);
        fVar.z0("createdAt");
        m10.sa.Companion.getClass();
        aa.x xVar = m10.sa.a;
        wVar.e(xVar).b(fVar, wVar, duVar.d);
        no.a.e(fVar, "lastEditedAt", wVar, xVar).b(fVar, wVar, duVar.e);
        fVar.z0("body");
        bVar.b(fVar, wVar, duVar.f);
        ju.d dVar = ju.d.a;
        ju.d.d(fVar, wVar, duVar.g);
    }
}
