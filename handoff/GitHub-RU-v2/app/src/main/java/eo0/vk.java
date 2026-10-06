package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vk implements aaShadow.a {
    public static final vk a = new vk();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "url", "parent"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        jn0.gu guVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                guVar = (jn0.gu) aa.c.b(aa.c.c(xk.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        uu0.j5 c = uu0.r5.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new jn0.eu(str, str2, str3, guVar, c);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.eu euVar = (jn0.eu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(euVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, euVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, euVar.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, euVar.c);
        fVar.z0("parent");
        aa.c.b(aa.c.c(xk.a, true)).b(fVar, wVar, euVar.d);
        List list = uu0.r5.a;
        uu0.r5.d(fVar, wVar, euVar.e);
    }
}
