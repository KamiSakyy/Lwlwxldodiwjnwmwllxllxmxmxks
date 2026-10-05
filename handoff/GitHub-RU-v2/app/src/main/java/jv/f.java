package jv;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import m10.sa;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.o("__typename", "id", "status", "messageHeadline", "author", "committedDate");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        c cVar = null;
        String str3 = null;
        a aVar = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                cVar = (c) aa.c.b(aa.c.c(h.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                aVar = (a) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
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
        if (str3 == null) {
            k41.b.B(eVar, "messageHeadline");
            throw null;
        }
        if (zonedDateTime != null) {
            return new b(str, str2, cVar, str3, aVar, zonedDateTime);
        }
        k41.b.B(eVar, "committedDate");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        b bVar = (b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.b);
        fVar.z0("status");
        aa.c.b(aa.c.c(h.a, false)).b(fVar, wVar, bVar.c);
        fVar.z0("messageHeadline");
        bVar2.b(fVar, wVar, bVar.d);
        fVar.z0("author");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, bVar.e);
        fVar.z0("committedDate");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, bVar.f);
    }
}
