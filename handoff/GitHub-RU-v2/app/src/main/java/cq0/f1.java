package cq0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "abbreviatedOid", "oid", "messageHeadline", "messageBody", "__typename"});

    public static e1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                str5 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str6 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "abbreviatedOid");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "oid");
            throw null;
        }
        if (str4 == null) {
            k41.b.B(eVar, "messageHeadline");
            throw null;
        }
        if (str5 == null) {
            k41.b.B(eVar, "messageBody");
            throw null;
        }
        if (str6 != null) {
            return new e1(str, str2, str3, str4, str5, str6);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e1 e1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e1Var.a);
        fVar.z0("abbreviatedOid");
        bVar.b(fVar, wVar, e1Var.b);
        fVar.z0("oid");
        bVar.b(fVar, wVar, e1Var.c);
        fVar.z0("messageHeadline");
        bVar.b(fVar, wVar, e1Var.d);
        fVar.z0("messageBody");
        bVar.b(fVar, wVar, e1Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, e1Var.f);
    }
}
