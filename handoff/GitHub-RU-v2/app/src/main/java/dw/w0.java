package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"parent", "id", "__typename"});

    public static s0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        q0 q0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                q0Var = (q0) aa.c.b(aa.c.c(v0.a, false)).a(eVar, wVar);
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
            return new s0(q0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, s0 s0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s0Var, "value");
        fVar.z0("parent");
        aa.c.b(aa.c.c(v0.a, false)).b(fVar, wVar, s0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, s0Var.c);
    }
}
