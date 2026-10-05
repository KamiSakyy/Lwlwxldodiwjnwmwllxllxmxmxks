package com.github.rudroid.uitoolkit.debug;

import androidx.compose.runtime.n1;
import d2.a0;
import d2.r0;
import d2.t;
import k71.k;
import v2.i0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Long[] s;
    public final /* synthetic */ n1 t;

    public /* synthetic */ g(Long[] lArr, n1 n1Var, int i) {
        this.r = i;
        this.s = lArr;
        this.t = n1Var;
    }

    public final Object k(Object obj) {
        int i = this.r;
        n1 n1Var = this.t;
        Long[] lArr = this.s;
        switch (i) {
            case 0:
                a2.e eVar = (a2.e) obj;
                int i2 = h.a;
                k.g(eVar, "$this$drawWithCache");
                return eVar.c(new g(lArr, n1Var, r2));
            default:
                i0 i0Var = (i0) obj;
                int i3 = h.a;
                k.g(i0Var, "$this$onDrawWithContent");
                i0Var.c();
                long longValue = lArr[0].longValue() - n1Var.y();
                f2.b bVar = i0Var.r;
                if (c2.e.d(bVar.a()) > 0.0f && longValue > 0) {
                    w61.k kVar = longValue == 1 ? new w61.k(new t(t.g), Float.valueOf(1.0f)) : longValue == 2 ? new w61.k(new t(t.f), Float.valueOf(i0Var.W(2))) : new w61.k(new t(a0.s(Math.min(1.0f, (longValue - 1) / 100.0f), t.b(0.8f, t.h), t.b(0.5f, t.e))), Float.valueOf(i0Var.W((int) longValue)));
                    long j = ((t) kVar.r).a;
                    float floatValue = ((Number) kVar.s).floatValue();
                    float f = 2;
                    float f2 = floatValue / f;
                    long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.a() & 4294967295L)) - floatValue) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.a() >> 32)) - floatValue) << 32);
                    r2 = f * floatValue <= c2.e.d(bVar.a()) ? 0 : 1;
                    long j2 = r2 != 0 ? 0L : floatToRawIntBits;
                    if (r2 != 0) {
                        floatToRawIntBits2 = bVar.a();
                    }
                    f2.d.u(i0Var, new r0(j), j2, floatToRawIntBits2, 0.0f, r2 != 0 ? f2.g.a : new f2.h(floatValue, 0.0f, 0, 0, 30), 0, 104);
                }
                return w61.a0.a;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class n1<T1,T2,T3,T4> {
        public n1() {
        }
    }
}
