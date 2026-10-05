package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o3 implements aa.a {
    public static final o3 a = new o3();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        we0.b0 b0Var;
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
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Commit"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            b0Var = we0.f0.c(eVar, wVar);
        } else {
            b0Var = null;
        }
        if (str2 != null) {
            return new kc0.p5(str, str2, b0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.p5 p5Var = (kc0.p5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, p5Var.b);
        we0.b0 b0Var = p5Var.c;
        if (b0Var != null) {
            we0.f0.d(fVar, wVar, b0Var);
        }
    }
}
