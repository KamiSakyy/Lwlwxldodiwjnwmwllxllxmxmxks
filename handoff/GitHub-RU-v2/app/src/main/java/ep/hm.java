package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hm implements aa.a {
    public static final hm a = new hm();
    public static final List b = sy.d0.o("id", "parent", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.cw cwVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                cwVar = (jo.cw) aa.c.b(aa.c.c(em.a, false)).a(eVar, wVar);
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
            return new jo.fw(str, cwVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.fw fwVar = (jo.fw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fwVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fwVar.a);
        fVar.z0("parent");
        aa.c.b(aa.c.c(em.a, false)).b(fVar, wVar, fwVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, fwVar.c);
    }
}
