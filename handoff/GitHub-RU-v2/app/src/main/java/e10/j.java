package e10;

import aa.w;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = d0.o("lines", "startingLineNumber", "endingLineNumber", "jumpToLineNumber", "score");

    public final Object a(ea.e eVar, w wVar) {
        Integer num;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Double d = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 != 0) {
                nn.a aVar = tp.a.a;
                if (r0 == 1) {
                    num2 = (Integer) aVar.a(eVar, wVar);
                } else if (r0 == 2) {
                    num = num2;
                    num3 = (Integer) aVar.a(eVar, wVar);
                } else if (r0 == 3) {
                    num = num2;
                    num4 = (Integer) aVar.a(eVar, wVar);
                } else {
                    if (r0 != 4) {
                        break;
                    }
                    num = num2;
                    d = (Double) aa.c.c.a(eVar, wVar);
                }
            } else {
                num = num2;
                arrayList = aa.c.a(aa.c.a).c(eVar, wVar);
            }
            num2 = num;
        }
        Integer num5 = num2;
        if (arrayList == null) {
            k41.b.B(eVar, "lines");
            throw null;
        }
        if (num5 == null) {
            k41.b.B(eVar, "startingLineNumber");
            throw null;
        }
        Double d2 = d;
        int intValue = num5.intValue();
        if (num3 == null) {
            k41.b.B(eVar, "endingLineNumber");
            throw null;
        }
        int intValue2 = num3.intValue();
        if (num4 == null) {
            k41.b.B(eVar, "jumpToLineNumber");
            throw null;
        }
        int intValue3 = num4.intValue();
        if (d2 != null) {
            return new d(d2.doubleValue(), intValue, intValue2, intValue3, arrayList);
        }
        k41.b.B(eVar, "score");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        d dVar = (d) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("lines");
        aa.c.a(aa.c.a).e(fVar, wVar, dVar.a);
        fVar.z0("startingLineNumber");
        fVar.z(dVar.b);
        fVar.z0("endingLineNumber");
        fVar.z(dVar.c);
        fVar.z0("jumpToLineNumber");
        fVar.z(dVar.d);
        fVar.z0("score");
        aa.c.c.b(fVar, wVar, Double.valueOf(dVar.e));
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
