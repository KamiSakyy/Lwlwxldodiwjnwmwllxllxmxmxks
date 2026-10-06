package z70;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s5 implements aa.a {
    public static final s5 a = new s5();
    public static final List b = sy.d0Shadow.o("id", "committedDate", "statusCheckRollup", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        g5 g5Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                hc0.h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(hc0.h6.a).a(eVar, wVar);
            } else if (r0 == 2) {
                g5Var = (g5) aa.c.b(aa.c.c(u6.a, false)).a(eVar, wVar);
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
        if (zonedDateTime == null) {
            k41.b.B(eVar, "committedDate");
            throw null;
        }
        if (str2 != null) {
            return new f4(str, zonedDateTime, g5Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f4 f4Var = (f4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f4Var.a);
        fVar.z0("committedDate");
        hc0.h6.Companion.getClass();
        wVar.e(hc0.h6.a).b(fVar, wVar, f4Var.b);
        fVar.z0("statusCheckRollup");
        aa.c.b(aa.c.c(u6.a, false)).b(fVar, wVar, f4Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, f4Var.d);
    }
}
