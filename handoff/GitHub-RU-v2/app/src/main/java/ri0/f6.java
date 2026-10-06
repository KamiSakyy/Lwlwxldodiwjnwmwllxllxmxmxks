package ri0;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f6 implements aa.a {
    public static final f6 a = new f6();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "committedDate", "statusCheckRollup", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        t5 t5Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                gn0.r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(gn0.r6.a).a(eVar, wVar);
            } else if (r0 == 2) {
                t5Var = (t5) aa.c.b(aa.c.c(j7.a, false)).a(eVar, wVar);
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
            return new q4(str, zonedDateTime, t5Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q4 q4Var = (q4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q4Var.a);
        fVar.z0("committedDate");
        gn0.r6.Companion.getClass();
        wVar.e(gn0.r6.a).b(fVar, wVar, q4Var.b);
        fVar.z0("statusCheckRollup");
        aa.c.b(aa.c.c(j7.a, false)).b(fVar, wVar, q4Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q4Var.d);
    }
}
