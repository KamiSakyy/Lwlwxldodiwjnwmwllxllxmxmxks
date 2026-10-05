package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s6 implements aa.a {
    public static final s6 a = new s6();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new jo.ea(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ea eaVar = (jo.ea) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eaVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, eaVar.a);
    }
}
