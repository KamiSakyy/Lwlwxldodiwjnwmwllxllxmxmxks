package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h4 implements aa.a {
    public static final h4 a = new h4();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.r6 r6Var;
        jo.s6 s6Var;
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
            r6Var = j4.c(eVar, wVar);
        } else {
            r6Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            s6Var = k4.c(eVar, wVar);
        } else {
            s6Var = null;
        }
        eVar.s0();
        vx.a c = vx.b.c(eVar, wVar);
        if (str2 != null) {
            return new jo.p6(str, str2, r6Var, s6Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.p6 p6Var = (jo.p6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p6Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p6Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, p6Var.b);
        jo.r6 r6Var = p6Var.c;
        if (r6Var != null) {
            j4.d(fVar, wVar, r6Var);
        }
        jo.s6 s6Var = p6Var.d;
        if (s6Var != null) {
            k4.d(fVar, wVar, s6Var);
        }
        List list = vx.b.a;
        vx.b.d(fVar, wVar, p6Var.e);
    }
}
