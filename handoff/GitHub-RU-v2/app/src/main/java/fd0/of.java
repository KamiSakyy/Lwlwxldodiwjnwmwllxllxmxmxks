package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class of implements aa.a {
    public static final of a = new of();
    public static final List b = sy.d0.o(new String[]{"organizations", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.bn bnVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bnVar = (kc0.bn) aa.c.c(mf.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (bnVar == null) {
            k41.b.B(eVar, "organizations");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new kc0.dn(bnVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.dn dnVar = (kc0.dn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dnVar, "value");
        fVar.z0("organizations");
        aa.c.c(mf.a, false).b(fVar, wVar, dnVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dnVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, dnVar.c);
    }
}
