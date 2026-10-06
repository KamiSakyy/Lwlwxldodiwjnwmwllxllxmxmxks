package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ce implements aaShadow.a {
    public static final ce a = new ce();
    public static final List b = sy.d0Shadow.o("organizationDiscussionsRepository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.fl flVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                flVar = (u10.fl) aa.c.b(aa.c.c(de.a, false)).a(eVar, wVar);
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
            return new u10.el(flVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.el elVar = (u10.el) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(elVar, "value");
        fVar.z0("organizationDiscussionsRepository");
        aa.c.b(aa.c.c(de.a, false)).b(fVar, wVar, elVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, elVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, elVar.c);
    }
}
