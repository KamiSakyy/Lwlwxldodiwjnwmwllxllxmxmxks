package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fi implements aaShadow.a {
    public static final fi a = new fi();
    public static final List b = sy.d0.o(new String[]{"id", "owner", "ref", "release", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.iq iqVar = null;
        kc0.kq kqVar = null;
        kc0.lq lqVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                iqVar = (kc0.iq) aa.c.c(ai.a, true).a(eVar, wVar);
            } else if (r0 == 2) {
                kqVar = (kc0.kq) aa.c.b(aa.c.c(ci.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                lqVar = (kc0.lq) aa.c.b(aa.c.c(di.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (iqVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new kc0.nq(str, iqVar, kqVar, lqVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.nq nqVar = (kc0.nq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nqVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nqVar.a);
        fVar.z0("owner");
        aa.c.c(ai.a, true).b(fVar, wVar, nqVar.b);
        fVar.z0("ref");
        aa.c.b(aa.c.c(ci.a, false)).b(fVar, wVar, nqVar.c);
        fVar.z0("release");
        aa.c.b(aa.c.c(di.a, true)).b(fVar, wVar, nqVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, nqVar.e);
    }
}
