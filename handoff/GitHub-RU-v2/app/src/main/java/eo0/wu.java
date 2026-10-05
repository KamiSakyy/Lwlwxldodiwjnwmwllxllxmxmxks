package eo0;

import java.time.ZonedDateTime;
import java.util.List;
import jn0.g80;
import jn0.h80;
import jn0.k80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wu implements aa.a {
    public static final wu a = new wu();
    public static final List b = sy.d0.o(new String[]{"id", "answerChosenAt", "answer", "answerChosenBy", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        g80 g80Var = null;
        h80 h80Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                pz0.o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, pz0.o7.a, eVar, wVar);
            } else if (r0 == 2) {
                g80Var = (g80) aa.c.b(aa.c.c(tu.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                h80Var = (h80) aa.c.b(aa.c.c(uu.a, true)).a(eVar, wVar);
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
            return new k80(str, zonedDateTime, g80Var, h80Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k80 k80Var = (k80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k80Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k80Var.a);
        fVar.z0("answerChosenAt");
        pz0.o7.Companion.getClass();
        aa.c.b(wVar.e(pz0.o7.a)).b(fVar, wVar, k80Var.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(tu.a, true)).b(fVar, wVar, k80Var.c);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(uu.a, true)).b(fVar, wVar, k80Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k80Var.e);
    }
}
