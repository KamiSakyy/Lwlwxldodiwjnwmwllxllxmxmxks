package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c8 implements aaShadow.a {
    public static final c8 a = new c8();
    public static final List b = sy.d0Shadow.o(new String[]{"organization", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ec ecVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ecVar = (jn0.ec) aa.c.b(aa.c.c(d8.a, false)).a(eVar, wVar);
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
            return new jn0.dc(ecVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.dc dcVar = (jn0.dc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dcVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(d8.a, false)).b(fVar, wVar, dcVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dcVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, dcVar.c);
    }
}
