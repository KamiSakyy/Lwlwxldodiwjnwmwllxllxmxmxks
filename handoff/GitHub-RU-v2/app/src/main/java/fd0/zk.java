package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zk implements aa.a {
    public static final zk a = new zk();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ju juVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                juVar = (kc0.ju) aa.c.c(yk.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(vk.a, true)))).a(eVar, wVar);
            }
        }
        if (juVar != null) {
            return new kc0.ku(juVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ku kuVar = (kc0.ku) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kuVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(yk.a, false).b(fVar, wVar, kuVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(vk.a, true)))).b(fVar, wVar, kuVar.b);
    }
}
