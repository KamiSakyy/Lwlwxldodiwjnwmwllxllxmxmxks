package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"file", "id"});

    public static m4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i4 i4Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                i4Var = (i4) aa.c.b(aa.c.c(w4.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new m4(i4Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, m4 m4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m4Var, "value");
        fVar.z0("file");
        aa.c.b(aa.c.c(w4.a, false)).b(fVar, wVar, m4Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, m4Var.b);
    }
}
