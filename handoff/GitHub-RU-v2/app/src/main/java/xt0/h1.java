package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h1 implements aa.a {
    public static final h1 a = new h1();
    public static final List b = sy.d0Shadow.o(new String[]{"path", "isGenerated", "submodule", "lineCount", "fileType"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        w0 w0Var = null;
        Integer num = null;
        h0 h0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                w0Var = (w0) aa.c.b(aa.c.c(r1.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                num = (Integer) aa.c.b(ro0.a.a).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                h0Var = (h0) aa.c.b(aa.c.c(b1.a, true)).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (bool3 != null) {
            return new m0(str, bool3.booleanValue(), w0Var, num, h0Var);
        }
        k41.b.B(eVar, "isGenerated");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m0 m0Var = (m0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m0Var, "value");
        fVar.z0("path");
        aa.c.i.b(fVar, wVar, m0Var.a);
        fVar.z0("isGenerated");
        jo.f4Shadow.C(m0Var.b, aa.c.f, fVar, wVar, "submodule");
        aa.c.b(aa.c.c(r1.a, false)).b(fVar, wVar, m0Var.c);
        fVar.z0("lineCount");
        aa.c.b(ro0.a.a).b(fVar, wVar, m0Var.d);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(b1.a, true)).b(fVar, wVar, m0Var.e);
    }
    public static final Object i = null;
}
