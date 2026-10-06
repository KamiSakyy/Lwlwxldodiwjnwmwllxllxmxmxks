package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ci implements aaShadow.a {
    public static final ci a = new ci();
    public static final List b = sy.d0.o("reactable", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.hq hqVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                hqVar = (u10.hq) aa.c.c(bi.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (hqVar == null) {
            k41.b.B(eVar, "reactable");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.iq(hqVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.iq iqVar = (u10.iq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iqVar, "value");
        fVar.z0("reactable");
        aa.c.c(bi.a, true).b(fVar, wVar, iqVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iqVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, iqVar.c);
    }
}
