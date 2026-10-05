package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t8 implements aa.a {
    public static final t8 a = new t8();
    public static final List b = sy.d0.n("name");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new u10.ed(str);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ed edVar = (u10.ed) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(edVar, "value");
        fVar.z0("name");
        aa.c.a.b(fVar, wVar, edVar.a);
    }
}
