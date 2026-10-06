package p20;

import java.util.List;
import u10.ua0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xv implements aaShadow.a {
    public static final xv a = new xv();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
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
        w80.q3 c = w80.s3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new ua0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ua0 ua0Var = (ua0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ua0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ua0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ua0Var.b);
        List list = w80.s3.a;
        w80.s3.d(fVar, wVar, ua0Var.c);
    }
}
