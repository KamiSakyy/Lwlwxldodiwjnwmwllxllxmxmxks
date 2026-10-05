package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 implements aa.a {
    public static final l2 a = new l2();
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
        n3 c = o3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new h2(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h2 h2Var = (h2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, h2Var.b);
        List list = o3.a;
        n3 n3Var = h2Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n3Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, n3Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, n3Var.b);
        fVar.z0("title");
        bVar2.b(fVar, wVar, n3Var.c);
        fVar.z0("bodyHTML");
        bVar2.b(fVar, wVar, n3Var.d);
        fVar.z0("bodyText");
        bVar2.b(fVar, wVar, n3Var.e);
        fVar.z0("baseRefName");
        bVar2.b(fVar, wVar, n3Var.f);
        fVar.z0("headRefName");
        bVar2.b(fVar, wVar, n3Var.g);
        fVar.z0("state");
        fVar.I(n3Var.h.r);
        fVar.z0("isDraft");
        jo.f4.C(n3Var.i, aa.c.f, fVar, wVar, "number");
        fVar.z(n3Var.j);
        fVar.z0("repository");
        aa.c.c(p3.a, true).b(fVar, wVar, n3Var.k);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, n3Var.l);
    }
}
