package ep;

import java.time.ZonedDateTime;
import java.util.List;
import jo.ua0;
import jo.va0;
import jo.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rw implements aaShadow.a {
    public static final rw a = new rw();
    public static final List b = sy.d0Shadow.o("id", "answerChosenAt", "answer", "answerChosenBy", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ZonedDateTime zonedDateTime = null;
        ua0 ua0Var = null;
        va0 va0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                m10.sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) noShadow.a.h(wVar, m10.sa.a, eVar, wVar);
            } else if (r0 == 2) {
                ua0Var = (ua0) aa.c.b(aa.c.c(ow.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                va0Var = (va0) aa.c.b(aa.c.c(pw.a, true)).a(eVar, wVar);
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
            return new ya0(str, zonedDateTime, ua0Var, va0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ya0 ya0Var = (ya0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ya0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ya0Var.a);
        fVar.z0("answerChosenAt");
        m10.sa.Companion.getClass();
        aa.c.b(wVar.e(m10.sa.a)).b(fVar, wVar, ya0Var.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(ow.a, true)).b(fVar, wVar, ya0Var.c);
        fVar.z0("answerChosenBy");
        aa.c.b(aa.c.c(pw.a, true)).b(fVar, wVar, ya0Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ya0Var.e);
    }
}
