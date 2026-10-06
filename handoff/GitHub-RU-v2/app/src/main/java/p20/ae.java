package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ae implements aaShadow.a {
    public static final ae a = new ae();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        u10.dl c = be.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u10.cl(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.cl clVar = (u10.cl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(clVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, clVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, clVar.b);
        List list = be.a;
        u10.dl dlVar = clVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dlVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, dlVar.a);
        e50.s sVar = e50.s.a;
        e50.s.d(fVar, wVar, dlVar.b);
    }
}
