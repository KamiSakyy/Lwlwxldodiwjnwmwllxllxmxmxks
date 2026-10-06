package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v1 implements aa.a {
    public static final v1 a = new v1();
    public static final List b = sy.d0Shadow.o("path", "fileType");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        s0 s0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new a1(str, s0Var);
                }
                s0Var = (s0) aa.c.b(aa.c.c(m1.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a1 a1Var = (a1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a1Var, "value");
        fVar.z0("path");
        aa.c.i.b(fVar, wVar, a1Var.a);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(m1.a, true)).b(fVar, wVar, a1Var.b);
    }
}
