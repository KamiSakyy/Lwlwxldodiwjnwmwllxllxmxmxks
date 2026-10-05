package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "text", "field"});

    public static m1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        s sVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                sVar = (s) aa.c.c(a2.a, true).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (sVar != null) {
            return new m1(str, str2, sVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, m1 m1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m1Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, m1Var.a);
        fVar.z0("text");
        aa.c.i.b(fVar, wVar, m1Var.b);
        fVar.z0("field");
        aa.c.c(a2.a, true).b(fVar, wVar, m1Var.c);
    }
}
