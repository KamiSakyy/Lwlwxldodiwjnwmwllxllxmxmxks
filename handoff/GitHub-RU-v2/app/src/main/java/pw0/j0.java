package pw0;

import java.util.List;
import ow0.w0;
import xt0.b4;
import xt0.e4;
import xt0.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static w0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        b4 c = e4.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new w0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, w0 w0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, w0Var.b);
        List list = e4.a;
        b4 b4Var = w0Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b4Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, b4Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, b4Var.b);
        fVar.z0("timelineItems");
        aa.c.c(f4.a, false).b(fVar, wVar, b4Var.c);
    }
}
