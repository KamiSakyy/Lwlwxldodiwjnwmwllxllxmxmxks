package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y3 implements aa.a {
    public static final y3 a = new y3();
    public static final List b = sy.d0.o("node", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.f6 f6Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                f6Var = (jo.f6) aa.c.b(aa.c.c(z3.a, true)).a(eVar, wVar);
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
            return new jo.e6(f6Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.e6 e6Var = (jo.e6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e6Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(z3.a, true)).b(fVar, wVar, e6Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, e6Var.c);
    }
}
