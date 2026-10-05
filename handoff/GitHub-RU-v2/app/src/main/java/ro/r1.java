package ro;

import java.util.List;
import qo.q2;
import qo.r2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 implements aa.a {
    public static final r1 a = new r1();
    public static final List b = sy.d0.o("node", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r2 r2Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                r2Var = (r2) aa.c.b(aa.c.c(s1.a, true)).a(eVar, wVar);
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
            return new q2(r2Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q2 q2Var = (q2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q2Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(s1.a, true)).b(fVar, wVar, q2Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q2Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q2Var.c);
    }
}
