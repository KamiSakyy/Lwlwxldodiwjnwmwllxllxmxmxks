package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p8 implements aaShadow.a {
    public static final p8 a = new p8();
    public static final List b = sy.d0Shadow.o(new String[]{"nodes", "pageInfo"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        kc0.vc vcVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(n8.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                vcVar = (kc0.vc) aa.c.c(o8.a, false).a(eVar, wVar);
            }
        }
        if (vcVar != null) {
            return new kc0.wc(list, vcVar);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.wc wcVar = (kc0.wc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wcVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(n8.a, true)))).b(fVar, wVar, wcVar.a);
        fVar.z0("pageInfo");
        aa.c.c(o8.a, false).b(fVar, wVar, wcVar.b);
    }
}
