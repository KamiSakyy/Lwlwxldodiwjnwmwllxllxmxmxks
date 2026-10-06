package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k7 implements aa.a {
    public static final k7 a = new k7();
    public static final List b = sy.d0Shadow.o(new String[]{"isAuthor", "isCommenter", "reviewer"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        s5 s5Var = null;
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
                s5Var = (s5) aa.c.c(i7.a, true).a(eVar, wVar);
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
        if (s5Var != null) {
            return new u5(booleanValue, booleanValue2, s5Var);
        }
        k41.b.B(eVar, "reviewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u5 u5Var = (u5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u5Var, "value");
        fVar.z0("isAuthor");
        aa.b bVar = aa.c.f;
        jo.f4Shadow.C(u5Var.a, bVar, fVar, wVar, "isCommenter");
        jo.f4Shadow.C(u5Var.b, bVar, fVar, wVar, "reviewer");
        aa.c.c(i7.a, true).b(fVar, wVar, u5Var.c);
    }
}
