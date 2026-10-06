package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eb implements aaShadow.a {
    public static final eb a = new eb();
    public static final List b = sy.d0Shadow.o("id", "object", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.ng ngVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                ngVar = (jo.ng) aa.c.b(aa.c.c(cb.a, true)).a(eVar, wVar);
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
            return new jo.pg(str, ngVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.pg pgVar = (jo.pg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pgVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pgVar.a);
        fVar.z0("object");
        aa.c.b(aa.c.c(cb.a, true)).b(fVar, wVar, pgVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, pgVar.c);
    }
}
