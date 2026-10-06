package ep;

import java.util.List;
import jo.d90;
import jo.z80;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class kv implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "timelineItem"});

    public static z80 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        d90 d90Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                d90Var = (d90) aa.c.b(aa.c.c(ov.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new z80(str, d90Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, z80 z80Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z80Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, z80Var.a);
        fVar.z0("timelineItem");
        aa.c.b(aa.c.c(ov.a, true)).b(fVar, wVar, z80Var.b);
    }
}
