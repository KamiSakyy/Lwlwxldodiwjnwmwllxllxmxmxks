package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zj implements aaShadow.a {
    public static final zj a = new zj();
    public static final List b = sy.d0Shadow.n("gitUrl");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new kc0.bt(str);
        }
        k41.b.B(eVar, "gitUrl");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.bt btVar = (kc0.bt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(btVar, "value");
        fVar.z0("gitUrl");
        aa.c.a.b(fVar, wVar, btVar.a);
    }
}
