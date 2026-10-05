package n00;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e implements aa.a {
    public static final List a = d0.n("__typename");

    public static m00.i c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        o00.f fVar = o00.f.a;
        o00.b c = o00.f.c(eVar, wVar);
        if (str != null) {
            return new m00.i(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, m00.i iVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, iVar.a);
        o00.f fVar2 = o00.f.a;
        o00.f.d(fVar, wVar, iVar.b);
    }
}
