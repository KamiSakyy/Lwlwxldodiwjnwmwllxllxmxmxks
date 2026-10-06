package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements aaShadow.a {
    public static final h0 a = new h0();
    public static final List b = sy.d0.o("__typename", "id", "headRefOid");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        gv.l8 c = gv.p8.c(eVar, wVar);
        eVar.s0();
        gv.j0 j0Var = gv.j0.a;
        gv.f0 c2 = gv.j0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new jo.y0(str, str2, str3, c, c2);
        }
        k41.b.B(eVar, "headRefOid");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.y0 y0Var = (jo.y0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, y0Var.b);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, y0Var.c);
        List list = gv.p8.a;
        gv.p8.d(fVar, wVar, y0Var.d);
        gv.j0 j0Var = gv.j0.a;
        gv.j0.d(fVar, wVar, y0Var.e);
    }
}
