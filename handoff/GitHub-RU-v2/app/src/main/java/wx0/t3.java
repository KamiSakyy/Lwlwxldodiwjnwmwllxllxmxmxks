package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "name", "nameHTML", "optionId", "field"});

    public static l1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        u uVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                str4 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                uVar = (u) aa.c.c(c2.a, true).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (uVar != null) {
            return new l1(str, str2, str3, str4, uVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, l1 l1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l1Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, l1Var.a);
        fVar.z0("name");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, l1Var.b);
        fVar.z0("nameHTML");
        o0Var.b(fVar, wVar, l1Var.c);
        fVar.z0("optionId");
        o0Var.b(fVar, wVar, l1Var.d);
        fVar.z0("field");
        aa.c.c(c2.a, true).b(fVar, wVar, l1Var.e);
    }
}
