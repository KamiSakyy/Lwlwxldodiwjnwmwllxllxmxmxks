package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ec implements aaShadow.a {
    public static final ec a = new ec();
    public static final List b = sy.d0Shadow.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new jo.zh(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.zh zhVar = (jo.zh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zhVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, zhVar.a);
    }
}
