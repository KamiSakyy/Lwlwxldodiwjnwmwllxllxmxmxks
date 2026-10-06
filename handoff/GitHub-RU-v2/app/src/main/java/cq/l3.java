package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l3 implements aa.a {
    public static final l3 a = new l3();
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
        c4 c = g4.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new h3(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h3 h3Var = (h3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h3Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h3Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, h3Var.b);
        List list = g4.a;
        c4 c4Var = h3Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c4Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, c4Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, c4Var.b);
        fVar.z0("url");
        bVar2.b(fVar, wVar, c4Var.c);
        fVar.z0("name");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, c4Var.d);
        fVar.z0("shortDescriptionHTML");
        o0Var.b(fVar, wVar, c4Var.e);
        fVar.z0("tagName");
        bVar2.b(fVar, wVar, c4Var.f);
        fVar.z0("mentions");
        aa.c.b(aa.c.c(e4.a, false)).b(fVar, wVar, c4Var.g);
        fVar.z0("repository");
        aa.c.c(h4.a, true).b(fVar, wVar, c4Var.h);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(d4.a, false)).b(fVar, wVar, c4Var.i);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, c4Var.j);
    }
}
