package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bh implements aa.a {
    public static final bh a = new bh();
    public static final List b = sy.d0.o("organization", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.kp kpVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                kpVar = (jo.kp) aa.c.b(aa.c.c(dh.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
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
            return new jo.ip(kpVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ip ipVar = (jo.ip) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ipVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(dh.a, false)).b(fVar, wVar, ipVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ipVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ipVar.c);
    }
}
