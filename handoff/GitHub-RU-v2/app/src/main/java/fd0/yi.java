package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yi implements aaShadow.a {
    public static final yi a = new yi();
    public static final List b = sy.d0.o(new String[]{"reactable", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.lr lrVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                lrVar = (kc0.lr) aa.c.c(xi.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (lrVar == null) {
            k41.b.B(eVar, "reactable");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new kc0.mr(lrVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.mr mrVar = (kc0.mr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mrVar, "value");
        fVar.z0("reactable");
        aa.c.c(xi.a, true).b(fVar, wVar, mrVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mrVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, mrVar.c);
    }
}
