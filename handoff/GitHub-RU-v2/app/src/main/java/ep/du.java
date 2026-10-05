package ep;

import java.util.List;
import jo.e70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class du implements aa.a {
    public static final du a = new du();
    public static final List b = sy.d0.o("name", "code");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 != null) {
            return new e70(str, str2);
        }
        k41.b.B(eVar, "code");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e70 e70Var = (e70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e70Var, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e70Var.a);
        fVar.z0("code");
        bVar.b(fVar, wVar, e70Var.b);
    }
}
