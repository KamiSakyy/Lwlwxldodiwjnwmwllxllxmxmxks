package fd0;

import java.time.ZonedDateTime;
import java.util.List;
import kc0.j40;
import kc0.k40;
import kc0.n40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wr implements aaShadow.a {
    public static final wr a = new wr();
    public static final List b = sy.d0.o(new String[]{"id", "answerChosenAt", "answer", "answerChosenBy", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        j40 j40Var = null;
        k40 k40Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                gn0.r6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, gn0.r6.a, eVar, wVar);
            } else if (r0 == 2) {
                j40Var = (j40) aa.c.b(aa.c.c(tr.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                k40Var = (k40) aa.c.b(aa.c.c(ur.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
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
            return new n40(str, zonedDateTime, j40Var, k40Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n40 n40Var = (n40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n40Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n40Var.a);
        fVar.z0("answerChosenAt");
        gn0.r6.Companion.getClass();
        aa.c.b(wVar.e(gn0.r6.a)).b(fVar, wVar, n40Var.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(tr.a, true)).b(fVar, wVar, n40Var.c);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(ur.a, true)).b(fVar, wVar, n40Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, n40Var.e);
    }
}
