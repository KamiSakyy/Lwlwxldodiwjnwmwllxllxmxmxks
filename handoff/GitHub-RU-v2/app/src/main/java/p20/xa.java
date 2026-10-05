package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xa implements aa.a {
    public static final xa a = new xa();
    public static final List b = sy.d0.o("__typename", "id", "replyTo");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        u10.kg kgVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                kgVar = (u10.kg) aa.c.b(aa.c.c(cb.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        i50.h c = i50.k.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u10.eg(str, str2, kgVar, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.eg egVar = (u10.eg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(egVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, egVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, egVar.b);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(cb.a, false)).b(fVar, wVar, egVar.c);
        List list = i50.k.a;
        i50.k.d(fVar, wVar, egVar.d);
    }
}
