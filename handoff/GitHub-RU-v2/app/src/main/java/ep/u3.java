package ep;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u3 implements aaShadow.a {
    public static final u3 a = new u3();
    public static final List b = sy.d0.o("startingLineNumber", "endingLineNumber", "jumpToLineNumber", "lines", "score");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Double d = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(b);
            nn.a aVar = tp.a.a;
            if (r0 == 0) {
                num = (Integer) aVar.a(eVar, wVar);
            } else if (r0 == 1) {
                num2 = (Integer) aVar.a(eVar, wVar);
            } else if (r0 == 2) {
                num3 = (Integer) aVar.a(eVar, wVar);
            } else if (r0 == 3) {
                arrayList = aa.c.a(aa.c.a).c(eVar, wVar);
                d = d;
            } else {
                if (r0 != 4) {
                    break;
                }
                d = (Double) aa.c.c.a(eVar, wVar);
            }
        }
        Double d2 = d;
        if (num == null) {
            k41.b.B(eVar, "startingLineNumber");
            throw null;
        }
        int intValue = num.intValue();
        if (num2 == null) {
            k41.b.B(eVar, "endingLineNumber");
            throw null;
        }
        int intValue2 = num2.intValue();
        if (num3 == null) {
            k41.b.B(eVar, "jumpToLineNumber");
            throw null;
        }
        int intValue3 = num3.intValue();
        if (arrayList == null) {
            k41.b.B(eVar, "lines");
            throw null;
        }
        if (d2 != null) {
            return new jo.w5(d2.doubleValue(), intValue, intValue2, intValue3, arrayList);
        }
        k41.b.B(eVar, "score");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.w5 w5Var = (jo.w5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w5Var, "value");
        fVar.z0("startingLineNumber");
        fVar.z(w5Var.a);
        fVar.z0("endingLineNumber");
        fVar.z(w5Var.b);
        fVar.z0("jumpToLineNumber");
        fVar.z(w5Var.c);
        fVar.z0("lines");
        aa.c.a(aa.c.a).e(fVar, wVar, w5Var.d);
        fVar.z0("score");
        aa.c.c.b(fVar, wVar, Double.valueOf(w5Var.e));
    }
}
