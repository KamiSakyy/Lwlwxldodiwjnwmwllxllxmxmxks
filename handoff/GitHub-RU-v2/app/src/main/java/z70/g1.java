package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 implements aa.a {
    public static final g1 a = new g1();
    public static final List b = sy.d0Shadow.o("path", "isGenerated", "submodule", "lineCount", "fileType");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        v0 v0Var = null;
        Integer num = null;
        g0 g0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                v0Var = (v0) aa.c.b(aa.c.c(q1.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                num = (Integer) aa.c.b(y20.a.a).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                g0Var = (g0) aa.c.b(aa.c.c(a1.a, true)).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (bool3 != null) {
            return new l0(str, bool3.booleanValue(), v0Var, num, g0Var);
        }
        k41.b.B(eVar, "isGenerated");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l0 l0Var = (l0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("path");
        aa.c.i.b(fVar, wVar, l0Var.a);
        fVar.z0("isGenerated");
        jo.f4Shadow.C(l0Var.b, aa.c.f, fVar, wVar, "submodule");
        aa.c.b(aa.c.c(q1.a, false)).b(fVar, wVar, l0Var.c);
        fVar.z0("lineCount");
        aa.c.b(y20.a.a).b(fVar, wVar, l0Var.d);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(a1.a, true)).b(fVar, wVar, l0Var.e);
    }
}
