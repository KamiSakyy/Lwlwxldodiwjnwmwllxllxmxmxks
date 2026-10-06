package ay;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x implements aa.a {
    public static final x a = new x();
    public static final List b = sy.d0Shadow.o("id", "committedDate", "statusCheckRollup", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        zx.y0 y0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
            } else if (r0 == 2) {
                y0Var = (zx.y0) aa.c.b(aa.c.c(j0.a, false)).a(eVar, wVar);
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
            return new zx.l0(str, zonedDateTime, y0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zx.l0 l0Var = (zx.l0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l0Var.a);
        fVar.z0("committedDate");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, l0Var.b);
        fVar.z0("statusCheckRollup");
        aa.c.b(aa.c.c(j0.a, false)).b(fVar, wVar, l0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l0Var.d);
    }
}
