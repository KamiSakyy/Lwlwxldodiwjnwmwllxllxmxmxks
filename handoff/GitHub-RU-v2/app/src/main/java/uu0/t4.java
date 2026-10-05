package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"contentHTML", "path"});

    public static s4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new s4(str, str2);
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, s4 s4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s4Var, "value");
        fVar.z0("contentHTML");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, s4Var.a);
        fVar.z0("path");
        o0Var.b(fVar, wVar, s4Var.b);
    }
}
