package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class om implements aa.a {
    public static final om a = new om();
    public static final List b = sy.d0.o(new String[]{"node", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.rw rwVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                rwVar = (jn0.rw) aa.c.b(aa.c.c(qm.a, true)).a(eVar, wVar);
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
            return new jn0.pw(rwVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.pw pwVar = (jn0.pw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pwVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(qm.a, true)).b(fVar, wVar, pwVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pwVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, pwVar.c);
    }
}
