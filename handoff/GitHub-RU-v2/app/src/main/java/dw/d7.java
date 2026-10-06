package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d7 implements aa.a {
    public static final d7 a = new d7();
    public static final List b = sy.d0Shadow.o("total", "completed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            nn.a aVar = tp.a.a;
            if (r0 == 0) {
                num = (Integer) aVar.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                num2 = (Integer) aVar.a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "total");
            throw null;
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new y6(intValue, num2.intValue());
        }
        k41.b.B(eVar, "completed");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y6 y6Var = (y6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y6Var, "value");
        fVar.z0("total");
        fVar.z(y6Var.a);
        fVar.z0("completed");
        fVar.z(y6Var.b);
    }
}
