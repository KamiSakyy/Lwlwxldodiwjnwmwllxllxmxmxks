package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z2 implements aa.a {
    public static final z2 a = new z2();
    public static final List b = sy.d0Shadow.o("contentHTML", "path");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new e2(str, str2);
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e2 e2Var = (e2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e2Var, "value");
        fVar.z0("contentHTML");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, e2Var.a);
        fVar.z0("path");
        o0Var.b(fVar, wVar, e2Var.b);
    }
}
