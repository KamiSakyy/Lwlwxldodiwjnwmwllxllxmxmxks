package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 implements aa.a {
    public static final p2 a = new p2();
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
        g3 c = k3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new l2(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l2 l2Var = (l2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, l2Var.b);
        List list = k3.a;
        g3 g3Var = l2Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g3Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, g3Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, g3Var.b);
        fVar.z0("url");
        bVar2.b(fVar, wVar, g3Var.c);
        fVar.z0("name");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, g3Var.d);
        fVar.z0("shortDescriptionHTML");
        o0Var.b(fVar, wVar, g3Var.e);
        fVar.z0("tagName");
        bVar2.b(fVar, wVar, g3Var.f);
        fVar.z0("mentions");
        aa.c.b(aa.c.c(i3.a, false)).b(fVar, wVar, g3Var.g);
        fVar.z0("repository");
        aa.c.c(l3.a, true).b(fVar, wVar, g3Var.h);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(h3.a, false)).b(fVar, wVar, g3Var.i);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, g3Var.j);
    }
}
