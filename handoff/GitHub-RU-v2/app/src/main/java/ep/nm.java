package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nm implements aa.a {
    public static final nm a = new nm();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ow owVar = null;
        while (eVar.r0(b) == 0) {
            owVar = (jo.ow) aa.c.b(aa.c.c(mm.a, true)).a(eVar, wVar);
        }
        return new jo.pw(owVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.pw pwVar = (jo.pw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pwVar, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(mm.a, true)).b(fVar, wVar, pwVar.a);
    }
}
