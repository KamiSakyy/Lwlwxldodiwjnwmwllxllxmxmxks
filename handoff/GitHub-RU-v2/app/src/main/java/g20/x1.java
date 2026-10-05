package g20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x1 implements aa.a {
    public static final x1 a = new x1();
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
        c2 c = f2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u1(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u1 u1Var = (u1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, u1Var.b);
        List list = f2.a;
        c2 c2Var = u1Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c2Var, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, c2Var.a);
        fVar.z0("name");
        bVar2.b(fVar, wVar, c2Var.b);
        fVar.z0("state");
        fVar.I(c2Var.c.r);
        fVar.z0("runs");
        aa.c.c(e2.a, false).b(fVar, wVar, c2Var.d);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, c2Var.e);
    }
}
