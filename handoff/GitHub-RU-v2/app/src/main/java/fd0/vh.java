package fd0;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vh implements aaShadow.a {
    public static final vh a = new vh();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "author", "createdAt", "lastEditedAt", "body"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        kc0.wp wpVar = null;
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
                aa.x xVar = gn0.r6.a;
                if (r0 == 3) {
                    gn0.r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                } else if (r0 == 4) {
                    gn0.r6.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                } else {
                    if (r0 != 5) {
                        break;
                    }
                    str3 = (String) aa.c.a.a(eVar, wVar);
                }
            } else {
                wpVar = (kc0.wp) aa.c.b(aa.c.c(ph.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        qh0.d dVar = qh0.d.a;
        qh0.a c = qh0.d.c(eVar, wVar);
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
            return new kc0.dq(str, str2, wpVar, zonedDateTime, zonedDateTime2, str3, c);
        }
        k41.b.B(eVar, "body");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.dq dqVar = (kc0.dq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dqVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dqVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, dqVar.b);
        fVar.z0("author");
        aa.c.b(aa.c.c(ph.a, true)).b(fVar, wVar, dqVar.c);
        fVar.z0("createdAt");
        gn0.r6.Companion.getClass();
        aa.x xVar = gn0.r6.a;
        wVar.e(xVar).b(fVar, wVar, dqVar.d);
        no.a.e(fVar, "lastEditedAt", wVar, xVar).b(fVar, wVar, dqVar.e);
        fVar.z0("body");
        bVar.b(fVar, wVar, dqVar.f);
        qh0.d dVar = qh0.d.a;
        qh0.d.d(fVar, wVar, dqVar.g);
    }
}
