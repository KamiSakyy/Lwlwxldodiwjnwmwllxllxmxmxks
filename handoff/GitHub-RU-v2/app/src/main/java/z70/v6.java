package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v6 implements aa.a {
    public static final v6 a = new v6();
    public static final List b = sy.d0Shadow.o("isAuthor", "isCommenter", "reviewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        f5 f5Var = null;
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
                f5Var = (f5) aa.c.c(t6.a, true).a(eVar, wVar);
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
        if (f5Var != null) {
            return new h5(booleanValue, booleanValue2, f5Var);
        }
        k41.b.B(eVar, "reviewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h5 h5Var = (h5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h5Var, "value");
        fVar.z0("isAuthor");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(h5Var.a, bVar, fVar, wVar, "isCommenter");
        jo.f4Shadow.C(h5Var.b, bVar, fVar, wVar, "reviewer");
        aa.c.c(t6.a, true).b(fVar, wVar, h5Var.c);
    }
}
