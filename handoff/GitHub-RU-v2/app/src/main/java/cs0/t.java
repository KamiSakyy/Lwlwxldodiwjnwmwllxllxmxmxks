package cs0;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "labels"});

    public static i c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        b bVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                bVar = (b) aa.c.b(aa.c.c(l.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new i(str, bVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, i iVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, iVar.a);
        fVar.z0("labels");
        aa.c.b(aa.c.c(l.a, false)).b(fVar, wVar, iVar.b);
    }
}
