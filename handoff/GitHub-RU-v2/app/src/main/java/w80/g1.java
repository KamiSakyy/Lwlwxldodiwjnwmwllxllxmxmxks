package w80;

import hc0.h6;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 implements aa.a {
    public static final g1 a = new g1();
    public static final List b = sy.d0.o("id", "name", "tagName", "publishedAt", "createdAt", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 != 2) {
                aa.x xVar = h6.a;
                if (r0 == 3) {
                    h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                } else if (r0 == 4) {
                    h6.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                } else {
                    if (r0 != 5) {
                        break;
                    }
                    str4 = (String) aa.c.a.a(eVar, wVar);
                }
            } else {
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "tagName");
            throw null;
        }
        if (zonedDateTime2 == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (str4 != null) {
            return new p0(str, str2, str3, zonedDateTime, zonedDateTime2, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p0 p0Var = (p0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p0Var.a);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, p0Var.b);
        fVar.z0("tagName");
        bVar.b(fVar, wVar, p0Var.c);
        fVar.z0("publishedAt");
        h6.Companion.getClass();
        aa.x xVar = h6.a;
        aa.c.b(wVar.e(xVar)).b(fVar, wVar, p0Var.d);
        fVar.z0("createdAt");
        wVar.e(xVar).b(fVar, wVar, p0Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p0Var.f);
    }
}
