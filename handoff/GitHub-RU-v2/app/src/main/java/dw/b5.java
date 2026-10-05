package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "isCopilot"});

    public static r4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool != null) {
            return new r4(str, bool.booleanValue());
        }
        k41.b.B(eVar, "isCopilot");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, r4 r4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r4Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, r4Var.a);
        fVar.z0("isCopilot");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(r4Var.b));
    }
}
