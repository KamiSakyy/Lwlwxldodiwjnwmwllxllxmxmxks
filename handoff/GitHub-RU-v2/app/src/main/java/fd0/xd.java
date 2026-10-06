package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xd implements aaShadow.a {
    public static final xd a = new xd();
    public static final List b = sy.d0Shadow.o(new String[]{"actor", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.rk rkVar = null;
        kc0.xk xkVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                rkVar = (kc0.rk) aa.c.b(aa.c.c(ud.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new kc0.vk(rkVar, xkVar);
                }
                xkVar = (kc0.xk) aa.c.b(aa.c.c(zd.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.vk vkVar = (kc0.vk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vkVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(ud.a, true)).b(fVar, wVar, vkVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(zd.a, true)).b(fVar, wVar, vkVar.b);
    }
}
