package ep;

import java.util.List;
import jo.ua0;
import jo.za0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ow implements aaShadow.a {
    public static final ow a = new ow();
    public static final List b = sy.d0Shadow.o("__typename", "id", "replyTo");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        za0 za0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                za0Var = (za0) aa.c.b(aa.c.c(swShadow.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        ms.i c = ms.l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new ua0(str, str2, za0Var, c);
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
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(swShadow.a, false)).b(fVar, wVar, ua0Var.c);
        List list = ms.l.a;
        ms.l.d(fVar, wVar, ua0Var.d);
    }
}
