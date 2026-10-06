package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pi implements aaShadow.a {
    public static final pi a = new pi();
    public static final List b = sy.d0Shadow.o("id", "compare", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.jr jrVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                jrVar = (jo.jr) aa.c.b(aa.c.c(mi.a, false)).a(eVar, wVar);
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
            return new jo.mr(str, jrVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.mr mrVar = (jo.mr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mrVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mrVar.a);
        fVar.z0("compare");
        aa.c.b(aa.c.c(mi.a, false)).b(fVar, wVar, mrVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, mrVar.c);
    }
}
