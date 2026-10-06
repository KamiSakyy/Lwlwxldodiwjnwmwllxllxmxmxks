package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yh implements aaShadow.a {
    public static final yh a = new yh();
    public static final List b = sy.d0Shadow.o("organizations", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.lq lqVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                lqVar = (jo.lq) aa.c.c(wh.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (lqVar == null) {
            k41.b.B(eVar, "organizations");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.nq(lqVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.nq nqVar = (jo.nq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nqVar, "value");
        fVar.z0("organizations");
        aa.c.c(wh.a, false).b(fVar, wVar, nqVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nqVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, nqVar.c);
    }
}
