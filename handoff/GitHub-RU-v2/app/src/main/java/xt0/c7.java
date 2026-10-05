package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c7 implements aa.a {
    public static final c7 a = new c7();
    public static final List b = sy.d0.o(new String[]{"isAuthor", "isCommenter", "reviewer"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        o5 o5Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                o5Var = (o5) aa.c.c(a7.a, true).a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "isAuthor");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 == null) {
            k41.b.B(eVar, "isCommenter");
            throw null;
        }
        boolean booleanValue2 = bool2.booleanValue();
        if (o5Var != null) {
            return new q5(booleanValue, booleanValue2, o5Var);
        }
        k41.b.B(eVar, "reviewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q5 q5Var = (q5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q5Var, "value");
        fVar.z0("isAuthor");
        aa.b bVar = aa.c.f;
        jo.f4.C(q5Var.a, bVar, fVar, wVar, "isCommenter");
        jo.f4.C(q5Var.b, bVar, fVar, wVar, "reviewer");
        aa.c.c(a7.a, true).b(fVar, wVar, q5Var.c);
    }
}
