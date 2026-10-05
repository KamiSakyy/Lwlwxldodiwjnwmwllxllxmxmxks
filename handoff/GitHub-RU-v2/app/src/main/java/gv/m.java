package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "baseCommitOid", "headCommitOid", "commitOid", "line"});

    public static g c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                num = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new g(num, str, str2, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g gVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, gVar.a);
        fVar.z0("baseCommitOid");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, gVar.b);
        fVar.z0("headCommitOid");
        o0Var.b(fVar, wVar, gVar.c);
        fVar.z0("commitOid");
        o0Var.b(fVar, wVar, gVar.d);
        fVar.z0("line");
        aa.c.b(tp.a.a).b(fVar, wVar, gVar.e);
    }
}
