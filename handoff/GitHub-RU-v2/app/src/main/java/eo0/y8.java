package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y8 implements aa.a {
    public static final y8 a = new y8();
    public static final List b = sy.d0.o(new String[]{"diff", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.gd gdVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                gdVar = (jn0.gd) aa.c.b(aa.c.c(v8.a, false)).a(eVar, wVar);
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
            return new jn0.jd(gdVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.jd jdVar = (jn0.jd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jdVar, "value");
        fVar.z0("diff");
        aa.c.b(aa.c.c(v8.a, false)).b(fVar, wVar, jdVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jdVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, jdVar.c);
    }
}
