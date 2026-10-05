package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"file", "id"});

    public static q3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m3 m3Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                m3Var = (m3) aa.c.b(aa.c.c(a4.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new q3(m3Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, q3 q3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q3Var, "value");
        fVar.z0("file");
        aa.c.b(aa.c.c(a4.a, false)).b(fVar, wVar, q3Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, q3Var.b);
    }
}
