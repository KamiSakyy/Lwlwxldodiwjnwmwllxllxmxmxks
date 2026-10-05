package sz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "groups"});

    public static rz.h0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        rz.c0 c0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                c0Var = (rz.c0) aa.c.c(q.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (c0Var != null) {
            return new rz.h0(str, c0Var);
        }
        k41.b.B(eVar, "groups");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, rz.h0 h0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, h0Var.a);
        fVar.z0("groups");
        aa.c.c(q.a, false).b(fVar, wVar, h0Var.b);
    }
}
