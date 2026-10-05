package iy0;

import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static b c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        k c = l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new b(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, b bVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.b);
        List list = l.a;
        k kVar = bVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("__typename");
        aa.b bVar3 = aa.c.a;
        bVar3.b(fVar, wVar, kVar.a);
        fVar.z0("id");
        bVar3.b(fVar, wVar, kVar.b);
        fVar.z0("title");
        bVar3.b(fVar, wVar, kVar.c);
        fVar.z0("updatedAt");
        o7.Companion.getClass();
        aa.x xVar = o7.a;
        wVar.e(xVar).b(fVar, wVar, kVar.d);
        fVar.z0("createdAt");
        wVar.e(xVar).b(fVar, wVar, kVar.e);
    }
}
