package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d2 implements aa.a {
    public static final d2 a = new d2();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

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
        r2 c = s2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new z1(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z1 z1Var = (z1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, z1Var.b);
        List list = s2.a;
        r2 r2Var = z1Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r2Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, r2Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, r2Var.b);
        fVar.z0("title");
        bVar2.b(fVar, wVar, r2Var.c);
        fVar.z0("bodyHTML");
        bVar2.b(fVar, wVar, r2Var.d);
        fVar.z0("bodyText");
        bVar2.b(fVar, wVar, r2Var.e);
        fVar.z0("baseRefName");
        bVar2.b(fVar, wVar, r2Var.f);
        fVar.z0("headRefName");
        bVar2.b(fVar, wVar, r2Var.g);
        fVar.z0("state");
        fVar.I(r2Var.h.r);
        fVar.z0("isDraft");
        jo.f4Shadow.C(r2Var.i, aa.c.f, fVar, wVar, "number");
        fVar.z(r2Var.j);
        fVar.z0("repository");
        aa.c.c(t2.a, true).b(fVar, wVar, r2Var.k);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, r2Var.l);
    }
}
