package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x8 implements aaShadow.a {
    public static final x8 a = new x8();
    public static final List b = sy.d0Shadow.o(new String[]{"diffLines", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(w8.a, true)))).a(eVar, wVar);
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
            return new jn0.id(str, str2, list);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.id idVar = (jn0.id) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(idVar, "value");
        fVar.z0("diffLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(w8.a, true)))).b(fVar, wVar, idVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, idVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, idVar.c);
    }
}
