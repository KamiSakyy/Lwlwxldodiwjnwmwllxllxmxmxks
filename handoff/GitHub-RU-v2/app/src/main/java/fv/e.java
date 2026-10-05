package fv;

import aa.w;
import ev.h;
import ev.i;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0.o("node", "id", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        i iVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                iVar = (i) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
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
            return new h(iVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        h hVar = (h) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(hVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, hVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, hVar.c);
    }
}
