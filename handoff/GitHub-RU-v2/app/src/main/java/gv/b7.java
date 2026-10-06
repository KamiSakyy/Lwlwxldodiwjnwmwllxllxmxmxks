package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b7 implements aa.a {
    public static final b7 a = new b7();
    public static final List b = sy.d0Shadow.o("isAuthor", "isCommenter", "reviewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        a6 a6Var = null;
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
                a6Var = (a6) aa.c.c(o7.a, true).a(eVar, wVar);
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
        if (a6Var != null) {
            return new o5(booleanValue, booleanValue2, a6Var);
        }
        k41.b.B(eVar, "reviewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o5 o5Var = (o5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o5Var, "value");
        fVar.z0("isAuthor");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(o5Var.a, bVar, fVar, wVar, "isCommenter");
        jo.f4Shadow.C(o5Var.b, bVar, fVar, wVar, "reviewer");
        aa.c.c(o7.a, true).b(fVar, wVar, o5Var.c);
    }
}
