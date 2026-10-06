package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public class s implements aaShadow.a {
    public static final s a = new s();
    public static final List b = sy.d0Shadow.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new jo.d0(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.d0 d0Var = (jo.d0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, d0Var.a);
    }
}
