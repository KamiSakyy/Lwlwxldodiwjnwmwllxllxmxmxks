package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vd implements aaShadow.a {
    public static final vd a = new vd();
    public static final List b = sy.d0Shadow.o("comment", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.sk skVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                skVar = (u10.sk) aa.c.b(aa.c.c(td.a, false)).a(eVar, wVar);
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
            return new u10.vk(skVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.vk vkVar = (u10.vk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vkVar, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(td.a, false)).b(fVar, wVar, vkVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vkVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, vkVar.c);
    }
}
