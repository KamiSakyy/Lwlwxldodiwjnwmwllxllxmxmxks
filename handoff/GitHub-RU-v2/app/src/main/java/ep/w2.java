package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w2 implements aaShadow.a {
    public static final w2 a = new w2();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.s4 s4Var;
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
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            s4Var = y2.c(eVar, wVar);
        } else {
            s4Var = null;
        }
        if (str2 != null) {
            return new jo.q4(str, str2, s4Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.q4 q4Var = (jo.q4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q4Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, q4Var.b);
        jo.s4 s4Var = q4Var.c;
        if (s4Var != null) {
            y2.d(fVar, wVar, s4Var);
        }
    }
}
