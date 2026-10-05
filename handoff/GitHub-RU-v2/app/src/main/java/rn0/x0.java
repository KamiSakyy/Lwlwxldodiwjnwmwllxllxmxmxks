package rn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 implements aa.a {
    public static final x0 a = new x0();
    public static final List b = sy.d0.o(new String[]{"node", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        qn0.l1 l1Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l1Var = (qn0.l1) aa.c.b(aa.c.c(y0.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new qn0.k1(l1Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qn0.k1 k1Var = (qn0.k1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k1Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(y0.a, true)).b(fVar, wVar, k1Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k1Var.c);
    }
}
