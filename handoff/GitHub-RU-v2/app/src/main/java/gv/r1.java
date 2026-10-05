package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 implements aa.a {
    public static final r1 a = new r1();
    public static final List b = sy.d0.o("path", "isGenerated", "submodule", "lineCount", "fileType");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        g1 g1Var = null;
        Integer num = null;
        r0 r0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                g1Var = (g1) aa.c.b(aa.c.c(b2.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                num = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                r0Var = (r0) aa.c.b(aa.c.c(l1.a, true)).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (bool3 != null) {
            return new w0(str, bool3.booleanValue(), g1Var, num, r0Var);
        }
        k41.b.B(eVar, "isGenerated");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w0 w0Var = (w0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("path");
        aa.c.i.b(fVar, wVar, w0Var.a);
        fVar.z0("isGenerated");
        jo.f4.C(w0Var.b, aa.c.f, fVar, wVar, "submodule");
        aa.c.b(aa.c.c(b2.a, false)).b(fVar, wVar, w0Var.c);
        fVar.z0("lineCount");
        aa.c.b(tp.a.a).b(fVar, wVar, w0Var.d);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(l1.a, true)).b(fVar, wVar, w0Var.e);
    }
}
