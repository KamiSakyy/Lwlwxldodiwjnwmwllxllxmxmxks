package ep;

import java.util.List;
import jo.af0;
import jo.hf0;
import jo.jf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tz implements aaShadow.a {
    public static final tz a = new tz();
    public static final List b = sy.d0Shadow.o("actor", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        af0 af0Var = null;
        hf0 hf0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                af0Var = (af0) aa.c.b(aa.c.c(lz.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jf0(af0Var, hf0Var);
                }
                hf0Var = (hf0) aa.c.b(aa.c.c(rz.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jf0 jf0Var = (jf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jf0Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(lz.a, true)).b(fVar, wVar, jf0Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(rz.a, false)).b(fVar, wVar, jf0Var.b);
    }
}
