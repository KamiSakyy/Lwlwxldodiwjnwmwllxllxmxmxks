package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gf implements aa.a {
    public static final gf a = new gf();
    public static final List b = sy.d0.o("id", "ref", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.tm tmVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                tmVar = (u10.tm) aa.c.b(aa.c.c(ff.a, false)).a(eVar, wVar);
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
            return new u10.um(str, tmVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.um umVar = (u10.um) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(umVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, umVar.a);
        fVar.z0("ref");
        aa.c.b(aa.c.c(ff.a, false)).b(fVar, wVar, umVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, umVar.c);
    }
}
