package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hk implements aa.a {
    public static final hk a = new hk();
    public static final List b = sy.d0.o(new String[]{"id", "latestRelease", "releases", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.bt btVar = null;
        jn0.et etVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                btVar = (jn0.bt) aa.c.b(aa.c.c(dk.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                etVar = (jn0.et) aa.c.c(gk.a, false).a(eVar, wVar);
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
        if (etVar == null) {
            k41.b.B(eVar, "releases");
            throw null;
        }
        if (str2 != null) {
            return new jn0.ft(str, btVar, etVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ft ftVar = (jn0.ft) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ftVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ftVar.a);
        fVar.z0("latestRelease");
        aa.c.b(aa.c.c(dk.a, false)).b(fVar, wVar, ftVar.b);
        fVar.z0("releases");
        aa.c.c(gk.a, false).b(fVar, wVar, ftVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ftVar.d);
    }
}
