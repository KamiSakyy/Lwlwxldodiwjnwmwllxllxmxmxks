package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k9 implements aaShadow.a {
    public static final k9 a = new k9();
    public static final List b = sy.d0.o(new String[]{"id", "repositories", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.ae aeVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                aeVar = (jn0.ae) aa.c.c(j9.a, false).a(eVar, wVar);
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
        if (aeVar == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str2 != null) {
            return new jn0.be(str, aeVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.be beVar = (jn0.be) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(beVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, beVar.a);
        fVar.z0("repositories");
        aa.c.c(j9.a, false).b(fVar, wVar, beVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, beVar.c);
    }
}
