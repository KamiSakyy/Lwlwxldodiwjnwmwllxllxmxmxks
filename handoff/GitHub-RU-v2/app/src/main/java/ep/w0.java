package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 implements aaShadow.a {
    public static final w0 a = new w0();
    public static final List b = sy.d0.o("__typename", "id", "headRefOid", "pendingReviews");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        jo.q1 q1Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                q1Var = (jo.q1) aa.c.b(aa.c.c(v0.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        gv.j0 j0Var = gv.j0.a;
        gv.f0 c = gv.j0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new jo.r1(str, str2, str3, q1Var, c);
        }
        k41.b.B(eVar, "headRefOid");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.r1 r1Var = (jo.r1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, r1Var.b);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, r1Var.c);
        fVar.z0("pendingReviews");
        aa.c.b(aa.c.c(v0.a, false)).b(fVar, wVar, r1Var.d);
        gv.j0 j0Var = gv.j0.a;
        gv.j0.d(fVar, wVar, r1Var.e);
    }
}
