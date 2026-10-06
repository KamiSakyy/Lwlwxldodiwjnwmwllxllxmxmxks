package ep;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dq implements aaShadow.a {
    public static final dq a = new dq();
    public static final List b = sy.d0Shadow.o("id", "message", "committedDate", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        ZonedDateTime zonedDateTime = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                m10.sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(m10.sa.a).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "message");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "committedDate");
            throw null;
        }
        if (str3 != null) {
            return new jo.j10(str, str2, str3, zonedDateTime);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.j10 j10Var = (jo.j10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j10Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j10Var.a);
        fVar.z0("message");
        bVar.b(fVar, wVar, j10Var.b);
        fVar.z0("committedDate");
        m10.sa.Companion.getClass();
        wVar.e(m10.sa.a).b(fVar, wVar, j10Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j10Var.d);
    }
}
