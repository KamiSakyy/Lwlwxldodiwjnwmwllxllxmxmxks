package iq0;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import pz0.o7;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "discussion", "createdAt"});

    public static e c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        b bVar = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                aVar = (a) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                bVar = (b) aa.c.b(aa.c.c(h.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (zonedDateTime != null) {
            return new e(str, str2, aVar, bVar, zonedDateTime);
        }
        k41.b.B(eVar, "createdAt");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, e eVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(eVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, eVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, eVar.c);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(h.a, false)).b(fVar, wVar, eVar.d);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, eVar.e);
    }
}
