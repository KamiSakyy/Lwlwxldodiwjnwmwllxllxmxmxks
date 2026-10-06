package eo0;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jj implements aaShadow.a {
    public static final jj a = new jj();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "author", "createdAt", "lastEditedAt", "body"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        jn0.yr yrVar = null;
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
                aa.x xVar = pz0.o7.a;
                if (r0 == 3) {
                    pz0.o7.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                } else if (r0 == 4) {
                    pz0.o7.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                } else {
                    if (r0 != 5) {
                        break;
                    }
                    str3 = (String) aa.c.a.a(eVar, wVar);
                }
            } else {
                yrVar = (jn0.yr) aa.c.b(aa.c.c(dj.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        at0.d dVar = at0.d.a;
        at0.a c = at0.d.c(eVar, wVar);
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
            return new jn0.fs(str, str2, yrVar, zonedDateTime, zonedDateTime2, str3, c);
        }
        k41.b.B(eVar, "body");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.fs fsVar = (jn0.fs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fsVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fsVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, fsVar.b);
        fVar.z0("author");
        aa.c.b(aa.c.c(dj.a, true)).b(fVar, wVar, fsVar.c);
        fVar.z0("createdAt");
        pz0.o7.Companion.getClass();
        aa.x xVar = pz0.o7.a;
        wVar.e(xVar).b(fVar, wVar, fsVar.d);
        no.a.e(fVar, "lastEditedAt", wVar, xVar).b(fVar, wVar, fsVar.e);
        fVar.z0("body");
        bVar.b(fVar, wVar, fsVar.f);
        at0.d dVar = at0.d.a;
        at0.d.d(fVar, wVar, fsVar.g);
    }
}
