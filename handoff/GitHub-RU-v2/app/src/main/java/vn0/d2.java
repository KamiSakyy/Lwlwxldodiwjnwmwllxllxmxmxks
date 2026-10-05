package vn0;

import java.time.ZonedDateTime;
import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d2 implements aa.a {
    public static final d2 a = new d2();
    public static final List b = sy.d0.o(new String[]{"createdAt", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ZonedDateTime zonedDateTime = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new a2(str, str2, zonedDateTime);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a2 a2Var = (a2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a2Var, "value");
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, a2Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a2Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, a2Var.c);
    }
}
