package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qj implements aaShadow.a {
    public static final qj a = new qj();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "target", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.us usVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                usVar = (jn0.us) aa.c.b(aa.c.c(yj.a, true)).a(eVar, wVar);
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
            return new jn0.ms(str, usVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ms msVar = (jn0.ms) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(msVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, msVar.a);
        fVar.z0("target");
        aa.c.b(aa.c.c(yj.a, true)).b(fVar, wVar, msVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, msVar.c);
    }
}
