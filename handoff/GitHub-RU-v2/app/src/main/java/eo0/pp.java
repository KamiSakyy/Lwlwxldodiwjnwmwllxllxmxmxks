package eo0;

import java.util.List;
import jn0.n00;
import jn0.p00;
import jn0.q00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pp implements aa.a {
    public static final pp a = new pp();
    public static final List b = sy.d0.o(new String[]{"defaultBranchRef", "refs", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        n00 n00Var = null;
        p00 p00Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                n00Var = (n00) aa.c.b(aa.c.c(mp.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                p00Var = (p00) aa.c.b(aa.c.c(op.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new q00(n00Var, p00Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q00 q00Var = (q00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q00Var, "value");
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(mp.a, false)).b(fVar, wVar, q00Var.a);
        fVar.z0("refs");
        aa.c.b(aa.c.c(op.a, false)).b(fVar, wVar, q00Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q00Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q00Var.d);
    }
}
