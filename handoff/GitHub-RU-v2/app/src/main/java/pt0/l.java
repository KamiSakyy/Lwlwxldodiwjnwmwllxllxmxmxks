package pt0;

import aa.w;
import java.util.List;
import jo.f4;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = d0.o(new String[]{"path", "isGenerated", "submodule", "lineCount", "fileType"});

    public final Object a(ea.e eVar, w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        g gVar = null;
        Integer num = null;
        b bVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                gVar = (g) aa.c.b(aa.c.c(p.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                num = (Integer) aa.c.b(ro0.a.a).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                bVar = (b) aa.c.b(aa.c.c(j.a, true)).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (bool3 != null) {
            return new d(str, bool3.booleanValue(), gVar, num, bVar);
        }
        k41.b.B(eVar, "isGenerated");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        d dVar = (d) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("path");
        aa.c.i.b(fVar, wVar, dVar.a);
        fVar.z0("isGenerated");
        f4.C(dVar.b, aa.c.f, fVar, wVar, "submodule");
        aa.c.b(aa.c.c(p.a, false)).b(fVar, wVar, dVar.c);
        fVar.z0("lineCount");
        aa.c.b(ro0.a.a).b(fVar, wVar, dVar.d);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(j.a, true)).b(fVar, wVar, dVar.e);
    }
}
