package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y5 implements aaShadow.a {
    public static final y5 a = new y5();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

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
        oe0.f c = oe0.h.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new kc0.b9(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.b9 b9Var = (kc0.b9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b9Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b9Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, b9Var.b);
        List list = oe0.h.a;
        oe0.f fVar2 = b9Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("name");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, fVar2.a);
        fVar.z0("status");
        fVar.I(fVar2.b.r);
        fVar.z0("id");
        bVar2.b(fVar, wVar, fVar2.c);
        fVar.z0("conclusion");
        aa.c.b(hn0.a.b).b(fVar, wVar, fVar2.d);
        fVar.z0("permalink");
        bVar2.b(fVar, wVar, fVar2.e);
        fVar.z0("deployment");
        aa.c.b(aa.c.c(oe0.g.a, false)).b(fVar, wVar, fVar2.f);
        fVar.z0("steps");
        aa.c.b(aa.c.c(oe0.l.a, false)).b(fVar, wVar, fVar2.g);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, fVar2.h);
    }
}
