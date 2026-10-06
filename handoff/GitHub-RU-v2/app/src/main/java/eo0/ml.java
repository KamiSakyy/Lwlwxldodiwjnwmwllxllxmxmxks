package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ml implements aaShadow.a {
    public static final ml a = new ml();
    public static final List b = sy.d0Shadow.o(new String[]{"repository", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ev evVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                evVar = (jn0.ev) aa.c.b(aa.c.c(nl.a, true)).a(eVar, wVar);
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
            return new jn0.dv(evVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.dv dvVar = (jn0.dv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dvVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(nl.a, true)).b(fVar, wVar, dvVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dvVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, dvVar.c);
    }
}
