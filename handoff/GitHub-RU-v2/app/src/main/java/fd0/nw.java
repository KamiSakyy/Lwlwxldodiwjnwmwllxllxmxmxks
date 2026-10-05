package fd0;

import java.util.List;
import kc0.hb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nw implements aa.a {
    public static final nw a = new nw();
    public static final List b = sy.d0.o(new String[]{"id", "name"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new hb0(str, str2);
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        hb0 hb0Var = (hb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hb0Var, "value");
        fVar.z0("id");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, hb0Var.a);
        fVar.z0("name");
        o0Var.b(fVar, wVar, hb0Var.b);
    }
}
