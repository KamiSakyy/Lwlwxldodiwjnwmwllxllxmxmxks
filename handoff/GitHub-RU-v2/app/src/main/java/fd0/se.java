package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class se implements aa.a {
    public static final se a = new se();
    public static final List b = sy.d0.o(new String[]{"organizationDiscussionsRepository", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.bm bmVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bmVar = (kc0.bm) aa.c.b(aa.c.c(te.a, false)).a(eVar, wVar);
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
            return new kc0.am(bmVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.am amVar = (kc0.am) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(amVar, "value");
        fVar.z0("organizationDiscussionsRepository");
        aa.c.b(aa.c.c(te.a, false)).b(fVar, wVar, amVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, amVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, amVar.c);
    }
}
