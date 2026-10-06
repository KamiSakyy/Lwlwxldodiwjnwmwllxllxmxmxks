package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ge implements aaShadow.a {
    public static final ge a = new ge();
    public static final List b = sy.d0.o("organizationDiscussionsRepository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ll llVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                llVar = (u10.ll) aa.c.b(aa.c.c(he.a, false)).a(eVar, wVar);
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
            return new u10.kl(llVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.kl klVar = (u10.kl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(klVar, "value");
        fVar.z0("organizationDiscussionsRepository");
        aa.c.b(aa.c.c(he.a, false)).b(fVar, wVar, klVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, klVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, klVar.c);
    }
}
