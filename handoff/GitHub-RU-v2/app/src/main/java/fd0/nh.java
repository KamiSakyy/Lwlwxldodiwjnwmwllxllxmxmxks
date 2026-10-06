package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nh implements aaShadow.a {
    public static final nh a = new nh();
    public static final List b = sy.d0Shadow.o(new String[]{"mentions", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.qp qpVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                qpVar = (kc0.qp) aa.c.b(aa.c.c(kh.a, false)).a(eVar, wVar);
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
            return new kc0.tp(qpVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.tp tpVar = (kc0.tp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tpVar, "value");
        fVar.z0("mentions");
        aa.c.b(aa.c.c(kh.a, false)).b(fVar, wVar, tpVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tpVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tpVar.c);
    }
}
