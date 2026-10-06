package fd0;

import java.util.List;
import kc0.o30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hr implements aaShadow.a {
    public static final hr a = new hr();
    public static final List b = sy.d0Shadow.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new o30(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o30 o30Var = (o30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o30Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, o30Var.a);
    }
}
