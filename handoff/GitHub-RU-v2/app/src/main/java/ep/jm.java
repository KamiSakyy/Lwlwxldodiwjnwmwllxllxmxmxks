package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jm implements aaShadow.a {
    public static final jm a = new jm();
    public static final List b = sy.d0Shadow.n("subject");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.kw kwVar = null;
        while (eVar.r0(b) == 0) {
            kwVar = (jo.kw) aa.c.b(aa.c.c(km.a, true)).a(eVar, wVar);
        }
        return new jo.jw(kwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.jw jwVar = (jo.jw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jwVar, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(km.a, true)).b(fVar, wVar, jwVar.a);
    }
}
