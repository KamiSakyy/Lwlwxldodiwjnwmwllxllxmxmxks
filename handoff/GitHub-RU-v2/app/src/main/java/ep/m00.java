package ep;

import java.util.List;
import jo.og0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m00 implements aaShadow.a {
    public static final m00 a = new m00();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        yw.f fVar = yw.f.a;
        yw.b c = yw.f.c(eVar, wVar);
        if (str != null) {
            return new og0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        og0 og0Var = (og0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(og0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, og0Var.a);
        yw.f fVar2 = yw.f.a;
        yw.f.d(fVar, wVar, og0Var.b);
    }
}
