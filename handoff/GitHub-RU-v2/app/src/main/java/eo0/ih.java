package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ih implements aaShadow.a {
    public static final ih a = new ih();
    public static final List b = sy.d0.o(new String[]{"id", "ref", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.pp ppVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                ppVar = (jn0.pp) aa.c.b(aa.c.c(hh.a, false)).a(eVar, wVar);
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
            return new jn0.qp(str, ppVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qp qpVar = (jn0.qp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qpVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qpVar.a);
        fVar.z0("ref");
        aa.c.b(aa.c.c(hh.a, false)).b(fVar, wVar, qpVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, qpVar.c);
    }
}
