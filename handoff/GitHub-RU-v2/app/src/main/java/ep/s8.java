package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s8 implements aaShadow.a {
    public static final s8 a = new s8();
    public static final List b = sy.d0.o("organization", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.bd bdVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bdVar = (jo.bd) aa.c.b(aa.c.c(t8.a, false)).a(eVar, wVar);
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
            return new jo.ad(bdVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ad adVar = (jo.ad) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(adVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(t8.a, false)).b(fVar, wVar, adVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, adVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, adVar.c);
    }
}
