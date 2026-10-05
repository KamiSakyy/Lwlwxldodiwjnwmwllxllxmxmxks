package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x2 implements aa.a {
    public static final x2 a = new x2();
    public static final List b = sy.d0.o(new String[]{"contentHTML", "path"});

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
                    return new c2(str, str2);
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c2 c2Var = (c2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c2Var, "value");
        fVar.z0("contentHTML");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, c2Var.a);
        fVar.z0("path");
        o0Var.b(fVar, wVar, c2Var.b);
    }
}
