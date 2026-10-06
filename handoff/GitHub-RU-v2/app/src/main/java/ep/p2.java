package ep;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p2 implements aaShadow.a {
    public static final p2 a = new p2();
    public static final List b = sy.d0Shadow.o("pushedDate", "statusCheckRollup", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ZonedDateTime zonedDateTime = null;
        jo.w4 w4Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                m10.sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) noShadow.a.h(wVar, m10.sa.a, eVar, wVar);
            } else if (r0 == 1) {
                w4Var = (jo.w4) aa.c.b(aa.c.c(c3.a, false)).a(eVar, wVar);
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
            return new jo.i4(zonedDateTime, w4Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.i4 i4Var = (jo.i4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i4Var, "value");
        fVar.z0("pushedDate");
        m10.sa.Companion.getClass();
        aa.c.b(wVar.e(m10.sa.a)).b(fVar, wVar, i4Var.a);
        fVar.z0("statusCheckRollup");
        aa.c.b(aa.c.c(c3.a, false)).b(fVar, wVar, i4Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i4Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i4Var.d);
    }
}
