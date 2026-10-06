package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xd implements aaShadow.a {
    public static final xd a = new xd();
    public static final List b = sy.d0.o("id", "discussion", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.vk vkVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                vkVar = (u10.vk) aa.c.b(aa.c.c(vd.a, false)).a(eVar, wVar);
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
            return new u10.xk(str, vkVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.xk xkVar = (u10.xk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xkVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xkVar.a);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(vd.a, false)).b(fVar, wVar, xkVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xkVar.c);
    }
}
