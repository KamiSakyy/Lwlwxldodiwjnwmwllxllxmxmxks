package eo0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n3 implements aa.a {
    public static final n3 a = new n3();
    public static final List b = sy.d0.o(new String[]{"startingLineNumber", "endingLineNumber", "jumpToLineNumber", "lines", "score"});

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
            nn.a aVar = ro0.a.a;
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
            return new jn0.m5(d2.doubleValue(), intValue, intValue2, intValue3, arrayList);
        }
        k41.b.B(eVar, "score");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.m5 m5Var = (jn0.m5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m5Var, "value");
        fVar.z0("startingLineNumber");
        fVar.z(m5Var.a);
        fVar.z0("endingLineNumber");
        fVar.z(m5Var.b);
        fVar.z0("jumpToLineNumber");
        fVar.z(m5Var.c);
        fVar.z0("lines");
        aa.c.a(aa.c.a).e(fVar, wVar, m5Var.d);
        fVar.z0("score");
        aa.c.c.b(fVar, wVar, Double.valueOf(m5Var.e));
    }
}
