package iw;

import aa.w;
import java.util.List;
import jo.f4;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0.o("__typename", "author", "includesCreatedEdit", "id");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        b bVar = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bVar = (b) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "includesCreatedEdit");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new c(str, bVar, booleanValue, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c cVar = (c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("author");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, cVar.b);
        fVar.z0("includesCreatedEdit");
        f4.C(cVar.c, aa.c.f, fVar, wVar, "id");
        bVar.b(fVar, wVar, cVar.d);
    }

}
