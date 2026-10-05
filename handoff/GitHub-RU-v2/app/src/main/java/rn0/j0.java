package rn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static qn0.s0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        vn0.v c = vn0.b0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new qn0.s0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, qn0.s0 s0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, s0Var.b);
        List list = vn0.b0.a;
        vn0.b0.d(fVar, wVar, s0Var.c);
    }
}
