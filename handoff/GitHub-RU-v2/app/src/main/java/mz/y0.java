package mz;

import java.util.List;
import jo.f4;
import lz.d1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 implements aa.a {
    public static final y0 a = new y0();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
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
        nu.a c = nu.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new d1(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d1 d1Var = (d1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, d1Var.b);
        List list = nu.b.a;
        nu.a aVar = d1Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, aVar.a);
        fVar.z0("name");
        bVar2.b(fVar, wVar, aVar.b);
        fVar.z0("unreadCount");
        fVar.z(aVar.c);
        fVar.z0("queryString");
        bVar2.b(fVar, wVar, aVar.d);
        fVar.z0("isDefaultFilter");
        f4.C(aVar.e, aa.c.f, fVar, wVar, "__typename");
        bVar2.b(fVar, wVar, aVar.f);
    }
}
