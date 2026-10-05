package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h6 implements aa.a {
    public static final h6 a = new h6();
    public static final List b = sy.d0.o(new String[]{"total", "completed"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            nn.a aVar = ro0.a.a;
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
            return new c6(intValue, num2.intValue());
        }
        k41.b.B(eVar, "completed");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c6 c6Var = (c6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c6Var, "value");
        fVar.z0("total");
        fVar.z(c6Var.a);
        fVar.z0("completed");
        fVar.z(c6Var.b);
    }
}
