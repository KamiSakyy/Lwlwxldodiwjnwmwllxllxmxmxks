package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tk implements aaShadow.a {
    public static final tk a = new tk();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.bu buVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                buVar = (kc0.bu) aa.c.c(sk.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(pk.a, true)))).a(eVar, wVar);
            }
        }
        if (buVar != null) {
            return new kc0.cu(buVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.cu cuVar = (kc0.cu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cuVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(sk.a, false).b(fVar, wVar, cuVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(pk.a, true)))).b(fVar, wVar, cuVar.b);
    }
}
