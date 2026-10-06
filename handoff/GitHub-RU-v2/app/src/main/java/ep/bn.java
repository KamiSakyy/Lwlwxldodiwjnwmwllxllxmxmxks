package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bn implements aaShadow.a {
    public static final bn a = new bn();
    public static final List b = sy.d0Shadow.n("gitUrl");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new jo.jx(str);
        }
        k41.b.B(eVar, "gitUrl");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.jx jxVar = (jo.jx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jxVar, "value");
        fVar.z0("gitUrl");
        aa.c.a.b(fVar, wVar, jxVar.a);
    }
}
