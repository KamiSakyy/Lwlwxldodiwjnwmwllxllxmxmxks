package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ff implements aa.a {
    public static final ff a = new ff();
    public static final List b = sy.d0.o("id", "compare", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.qm qmVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                qmVar = (u10.qm) aa.c.b(aa.c.c(cf.a, false)).a(eVar, wVar);
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
            return new u10.tm(str, qmVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.tm tmVar = (u10.tm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tmVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tmVar.a);
        fVar.z0("compare");
        aa.c.b(aa.c.c(cf.a, false)).b(fVar, wVar, tmVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tmVar.c);
    }
}
