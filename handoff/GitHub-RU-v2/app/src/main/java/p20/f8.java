package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f8 implements aaShadow.a {
    public static final f8 a = new f8();
    public static final List b = sy.d0Shadow.o("id", "pullRequest", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.hc hcVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                hcVar = (u10.hc) aa.c.b(aa.c.c(e8.a, false)).a(eVar, wVar);
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
            return new u10.ic(str, hcVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ic icVar = (u10.ic) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(icVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, icVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(e8.a, false)).b(fVar, wVar, icVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, icVar.c);
    }
}
