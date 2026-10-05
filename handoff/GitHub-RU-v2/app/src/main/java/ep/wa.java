package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wa implements aa.a {
    public static final wa a = new wa();
    public static final List b = sy.d0.o("organization", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.eg egVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                egVar = (jo.eg) aa.c.b(aa.c.c(xa.a, true)).a(eVar, wVar);
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
            return new jo.dg(egVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.dg dgVar = (jo.dg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dgVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(xa.a, true)).b(fVar, wVar, dgVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dgVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, dgVar.c);
    }
}
