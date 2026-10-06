package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements aa.a {
    public static final z a = new z();
    public static final List b = sy.d0Shadow.o("__typename", "id");

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
        l0 c = m0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new v(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v vVar = (v) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, vVar.b);
        List list = m0.a;
        l0 l0Var = vVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, l0Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, l0Var.b);
        fVar.z0("url");
        bVar2.b(fVar, wVar, l0Var.c);
        fVar.z0("title");
        bVar2.b(fVar, wVar, l0Var.d);
        fVar.z0("bodyHTML");
        bVar2.b(fVar, wVar, l0Var.e);
        fVar.z0("bodyText");
        bVar2.b(fVar, wVar, l0Var.f);
        fVar.z0("number");
        fVar.z(l0Var.g);
        fVar.z0("repository");
        aa.c.c(n0.a, true).b(fVar, wVar, l0Var.h);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, l0Var.i);
    }
}
