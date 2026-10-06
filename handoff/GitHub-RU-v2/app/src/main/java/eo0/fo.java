package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fo implements aaShadow.a {
    public static final fo a = new fo();
    public static final List b = sy.d0.o(new String[]{"id", "diff", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.xy xyVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                xyVar = (jn0.xy) aa.c.b(aa.c.c(io.a, false)).a(eVar, wVar);
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
            return new jn0.uy(str, xyVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.uy uyVar = (jn0.uy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uyVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, uyVar.a);
        fVar.z0("diff");
        aa.c.b(aa.c.c(io.a, false)).b(fVar, wVar, uyVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, uyVar.c);
    }
}
