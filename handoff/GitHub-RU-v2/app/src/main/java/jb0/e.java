package jb0;

import aa.w;
import ib0.f;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0Shadow.o("id", "status", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        ib0.d dVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                dVar = (ib0.d) aa.c.b(aa.c.c(c.a, true)).a(eVar, wVar);
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
            return new f(str, dVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        f fVar2 = (f) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(fVar2, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fVar2.a);
        fVar.z0("status");
        aa.c.b(aa.c.c(c.a, true)).b(fVar, wVar, fVar2.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, fVar2.c);
    }
}
