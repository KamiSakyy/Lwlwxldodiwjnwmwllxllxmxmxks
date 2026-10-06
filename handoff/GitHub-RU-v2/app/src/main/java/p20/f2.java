package p20;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f2 implements aaShadow.a {
    public static final f2 a = new f2();
    public static final List b = sy.d0Shadow.o("pushedDate", "statusCheckRollup", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ZonedDateTime zonedDateTime = null;
        u10.h4 h4Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                hc0.h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) noShadow.a.h(wVar, hc0.h6.a, eVar, wVar);
            } else if (r0 == 1) {
                h4Var = (u10.h4) aa.c.b(aa.c.c(s2.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.t3(zonedDateTime, h4Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.t3 t3Var = (u10.t3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t3Var, "value");
        fVar.z0("pushedDate");
        hc0.h6.Companion.getClass();
        aa.c.b(wVar.e(hc0.h6.a)).b(fVar, wVar, t3Var.a);
        fVar.z0("statusCheckRollup");
        aa.c.b(aa.c.c(s2.a, false)).b(fVar, wVar, t3Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t3Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t3Var.d);
    }
}
