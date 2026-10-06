package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class re implements aaShadow.a {
    public static final re a = new re();
    public static final List b = sy.d0.o("organizations", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.xl xlVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                xlVar = (u10.xl) aa.c.c(pe.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (xlVar == null) {
            k41.b.B(eVar, "organizations");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.zl(xlVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.zl zlVar = (u10.zl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zlVar, "value");
        fVar.z0("organizations");
        aa.c.c(pe.a, false).b(fVar, wVar, zlVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zlVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, zlVar.c);
    }
}
