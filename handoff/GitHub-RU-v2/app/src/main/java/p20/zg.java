package p20;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zg implements aaShadow.a {
    public static final zg a = new zg();
    public static final List b = sy.d0Shadow.o("__typename", "id", "author", "createdAt", "lastEditedAt", "body");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        u10.so soVar = null;
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
                aa.x xVar = hc0.h6.a;
                if (r0 == 3) {
                    hc0.h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                } else if (r0 == 4) {
                    hc0.h6.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                } else {
                    if (r0 != 5) {
                        break;
                    }
                    str3 = (String) aa.c.a.a(eVar, wVar);
                }
            } else {
                soVar = (u10.so) aa.c.b(aa.c.c(tg.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        y60.c cVar = y60.c.a;
        y60.a c = y60.c.c(eVar, wVar);
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
            return new u10.zo(str, str2, soVar, zonedDateTime, zonedDateTime2, str3, c);
        }
        k41.b.B(eVar, "body");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.zo zoVar = (u10.zo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zoVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zoVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, zoVar.b);
        fVar.z0("author");
        aa.c.b(aa.c.c(tg.a, true)).b(fVar, wVar, zoVar.c);
        fVar.z0("createdAt");
        hc0.h6.Companion.getClass();
        aa.x xVar = hc0.h6.a;
        wVar.e(xVar).b(fVar, wVar, zoVar.d);
        noShadow.a.e(fVar, "lastEditedAt", wVar, xVar).b(fVar, wVar, zoVar.e);
        fVar.z0("body");
        bVar.b(fVar, wVar, zoVar.f);
        y60.c cVar = y60.c.a;
        y60.c.d(fVar, wVar, zoVar.g);
    }
}
