package qy;

import aa.w;
import java.util.List;
import jo.f4;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.o("id", "isInMergeQueue", "mergeQueue", "mergeQueueEntry", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        py.d dVar = null;
        py.e eVar2 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                dVar = (py.d) aa.c.b(aa.c.c(c.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                eVar2 = (py.e) aa.c.b(aa.c.c(d.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isInMergeQueue");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str2 != null) {
            return new py.g(str, booleanValue, dVar, eVar2, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        py.g gVar = (py.g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gVar.a);
        fVar.z0("isInMergeQueue");
        f4.C(gVar.b, aa.c.f, fVar, wVar, "mergeQueue");
        aa.c.b(aa.c.c(c.a, true)).b(fVar, wVar, gVar.c);
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(d.a, true)).b(fVar, wVar, gVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, gVar.e);
    }
}
