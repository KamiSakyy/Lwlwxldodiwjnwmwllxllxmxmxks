package p20;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q3 implements aaShadow.a {
    public static final q3 a = new q3();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.t5 t5Var;
        u10.u5 u5Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
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
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            t5Var = s3.c(eVar, wVar);
        } else {
            t5Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            u5Var = t3.c(eVar, wVar);
        } else {
            u5Var = null;
        }
        eVar.s0();
        ja0.a c = ja0.b.c(eVar, wVar);
        if (str2 != null) {
            return new u10.r5(str, str2, t5Var, u5Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.r5 r5Var = (u10.r5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, r5Var.b);
        u10.t5 t5Var = r5Var.c;
        if (t5Var != null) {
            s3.d(fVar, wVar, t5Var);
        }
        u10.u5 u5Var = r5Var.d;
        if (u5Var != null) {
            t3.d(fVar, wVar, u5Var);
        }
        List list = ja0.b.a;
        ja0.b.d(fVar, wVar, r5Var.e);
    }
}
