package xg;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.f0;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.v1;
import com.github.rudroid.discussions.replythread.w;
import com.github.rudroid.uitoolkit.d1;
import com.github.rudroid.uitoolkit.r2;
import com.github.rudroid.uitoolkit.text.n0;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class i implements j71.f {
    public final /* synthetic */ int r;

    public /* synthetic */ i(int i) {
        this.r = i;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        long j;
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                k71.k.g((f0) obj, "$this$PrimaryDialog");
                if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
                    n0.a("This is the dialog title", null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar, 6, 0, 65534);
                } else {
                    sVar.V();
                }
                break;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                k71.k.g((f0) obj, "$this$PrimaryDialog");
                if (sVar2.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    n0.a("This is the dialog message", null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar2, 6, 0, 65534);
                } else {
                    sVar2.V();
                }
                break;
            case 2:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryDialogButton");
                if (sVar3.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    n0.a(i4.p0(2131951840, sVar3), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar3, 0, 0, 65534);
                } else {
                    sVar3.V();
                }
                break;
            case 3:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryDialogButton");
                if (sVar4.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    n0.a(i4.p0(2131951849, sVar4), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar4, 0, 0, 65534);
                } else {
                    sVar4.V();
                }
                break;
            case 4:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryDialogButton");
                if (sVar5.S(intValue5 & 1, (intValue5 & 17) != 16)) {
                    n0.a(i4.p0(2131951852, sVar5), null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar5, 0, 0, 65534);
                } else {
                    sVar5.V();
                }
                break;
            case 5:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                k71.k.g((f0) obj, "$this$PrimaryDialog");
                if (sVar6.S(intValue6 & 1, (intValue6 & 17) != 16)) {
                    w1.o oVar = w1.o.a;
                    w1.r e = p2.e(oVar, 1.0f);
                    float f = ih.a.l;
                    w1.r f2 = androidx.compose.foundation.layout.b.A(e, f, ih.a.k, ih.a.m, f).f(oVar);
                    l2 a = j2.a(androidx.compose.foundation.layout.l.b, w1.c.B, sVar6, 54);
                    int hashCode = Long.hashCode(sVar6.T);
                    v1 l = sVar6.l();
                    w1.r c = w1.a.c(sVar6, f2);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar6.g0();
                    if (sVar6.S) {
                        sVar6.k(fVar);
                    } else {
                        sVar6.q0();
                    }
                    androidx.compose.runtime.t.I(sVar6, v2.g.f, a);
                    androidx.compose.runtime.t.I(sVar6, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar6, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar6, v2.g.h);
                    androidx.compose.runtime.t.I(sVar6, v2.g.d, c);
                    Object N = sVar6.N();
                    Object obj4 = androidx.compose.runtime.n.a;
                    if (N == obj4) {
                        N = new com.github.rudroid.widget.p(15);
                        sVar6.n0(N);
                    }
                    d1.a(null, (j71.a) N, false, false, j.b, sVar6, 24624, 13);
                    if (1.0f <= 0.0d) {
                        l0.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.foundation.layout.b.g(sVar6, new w1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    Object N2 = sVar6.N();
                    if (N2 == obj4) {
                        N2 = new com.github.rudroid.widget.p(15);
                        sVar6.n0(N2);
                    }
                    d1.a(null, (j71.a) N2, false, false, j.c, sVar6, 24624, 13);
                    Object N3 = sVar6.N();
                    if (N3 == obj4) {
                        N3 = new com.github.rudroid.widget.p(15);
                        sVar6.n0(N3);
                    }
                    d1.a(null, (j71.a) N3, false, false, j.d, sVar6, 24624, 13);
                    sVar6.q(true);
                } else {
                    sVar6.V();
                }
                break;
            case 6:
                ((Boolean) obj).getClass();
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if (sVar7.S(intValue7 & 1, (intValue7 & 17) != 16)) {
                    p5.a(z3.C(2131231273, 0, sVar7), (String) null, p2.o(w1.o.a, 16), ih.d.b(sVar7).r0, sVar7, 440, 0);
                } else {
                    sVar7.V();
                }
                break;
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= sVar8.g(booleanValue) ? 4 : 2;
                }
                if (sVar8.S(intValue8 & 1, (intValue8 & 19) != 18)) {
                    w1.r o = p2.o(w1.o.a, 16);
                    boolean z = (intValue8 & 14) == 4;
                    Object N4 = sVar8.N();
                    if (z || N4 == androidx.compose.runtime.n.a) {
                        N4 = new w(booleanValue, 10);
                        sVar8.n0(N4);
                    }
                    f0.o.b(6, sVar8, (j71.c) N4, o);
                } else {
                    sVar8.V();
                }
                break;
            case 8:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= sVar9.g(booleanValue2) ? 4 : 2;
                }
                if (sVar9.S(intValue9 & 1, (intValue9 & 19) != 18)) {
                    w1.r o2 = p2.o(w1.o.a, 16);
                    boolean z2 = (intValue9 & 14) == 4;
                    Object N5 = sVar9.N();
                    if (z2 || N5 == androidx.compose.runtime.n.a) {
                        N5 = new w(booleanValue2, 7);
                        sVar9.n0(N5);
                    }
                    f0.o.b(6, sVar9, (j71.c) N5, o2);
                } else {
                    sVar9.V();
                }
                break;
            case 9:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= sVar10.g(booleanValue3) ? 4 : 2;
                }
                if (sVar10.S(intValue10 & 1, (intValue10 & 19) != 18)) {
                    w1.r o3 = p2.o(w1.o.a, 16);
                    boolean z3 = (intValue10 & 14) == 4;
                    Object N6 = sVar10.N();
                    if (z3 || N6 == androidx.compose.runtime.n.a) {
                        N6 = new w(booleanValue3, 9);
                        sVar10.n0(N6);
                    }
                    f0.o.b(6, sVar10, (j71.c) N6, o3);
                } else {
                    sVar10.V();
                }
                break;
            case 10:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.s sVar11 = (androidx.compose.runtime.s) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= sVar11.g(booleanValue4) ? 4 : 2;
                }
                if (sVar11.S(intValue11 & 1, (intValue11 & 19) != 18)) {
                    w1.r o4 = p2.o(w1.o.a, 16);
                    boolean z4 = (intValue11 & 14) == 4;
                    Object N7 = sVar11.N();
                    if (z4 || N7 == androidx.compose.runtime.n.a) {
                        N7 = new w(booleanValue4, 12);
                        sVar11.n0(N7);
                    }
                    f0.o.b(6, sVar11, (j71.c) N7, o4);
                } else {
                    sVar11.V();
                }
                break;
            case 11:
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.s sVar12 = (androidx.compose.runtime.s) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= sVar12.g(booleanValue5) ? 4 : 2;
                }
                if (sVar12.S(intValue12 & 1, (intValue12 & 19) != 18)) {
                    w1.r o5 = p2.o(w1.o.a, 16);
                    boolean z5 = (intValue12 & 14) == 4;
                    Object N8 = sVar12.N();
                    if (z5 || N8 == androidx.compose.runtime.n.a) {
                        N8 = new w(booleanValue5, 11);
                        sVar12.n0(N8);
                    }
                    f0.o.b(6, sVar12, (j71.c) N8, o5);
                } else {
                    sVar12.V();
                }
                break;
            case 12:
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.s sVar13 = (androidx.compose.runtime.s) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= sVar13.g(booleanValue6) ? 4 : 2;
                }
                if (sVar13.S(intValue13 & 1, (intValue13 & 19) != 18)) {
                    w1.r o6 = p2.o(w1.o.a, 16);
                    boolean z6 = (intValue13 & 14) == 4;
                    Object N9 = sVar13.N();
                    if (z6 || N9 == androidx.compose.runtime.n.a) {
                        N9 = new w(booleanValue6, 8);
                        sVar13.n0(N9);
                    }
                    f0.o.b(6, sVar13, (j71.c) N9, o6);
                } else {
                    sVar13.V();
                }
                break;
            case 13:
                ((Boolean) obj).getClass();
                androidx.compose.runtime.s sVar14 = (androidx.compose.runtime.s) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if (sVar14.S(intValue14 & 1, (intValue14 & 17) != 16)) {
                    p5.a(z3.C(2131231497, 0, sVar14), (String) null, (w1.r) null, ih.d.b(sVar14).r0, sVar14, 56, 4);
                } else {
                    sVar14.V();
                }
                break;
            case 14:
                boolean booleanValue7 = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.s sVar15 = (androidx.compose.runtime.s) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= sVar15.g(booleanValue7) ? 4 : 2;
                }
                if (sVar15.S(intValue15 & 1, (intValue15 & 19) != 18)) {
                    i2.b C = z3.C(2131231172, 0, sVar15);
                    if (booleanValue7) {
                        sVar15.c0(-981061278);
                        j = ih.d.b(sVar15).r0;
                        sVar15.q(false);
                    } else {
                        sVar15.c0(-980964000);
                        j = ih.d.b(sVar15).n0;
                        sVar15.q(false);
                    }
                    p5.a(C, (String) null, (w1.r) null, j, sVar15, 56, 4);
                } else {
                    sVar15.V();
                }
                break;
            case 15:
                androidx.compose.runtime.s sVar16 = (androidx.compose.runtime.s) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                k71.k.g((e1) obj, "$this$FlowRow");
                if (sVar16.S(intValue16 & 1, (intValue16 & 17) != 16)) {
                    r2.a(x61.l.r(new com.github.rudroid.uitoolkit.p2[]{new com.github.rudroid.uitoolkit.p2("Updated", 2131231149, null, null, null, null, null, null, 252), new com.github.rudroid.uitoolkit.p2("Updated at", 2131231149, null, null, null, null, null, null, 252)}), sVar16, 0);
                } else {
                    sVar16.V();
                }
                break;
            case 16:
                androidx.compose.runtime.s sVar17 = (androidx.compose.runtime.s) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                k71.k.g((e1) obj, "$this$FlowRow");
                if (sVar17.S(intValue17 & 1, (intValue17 & 17) != 16)) {
                    r2.a(x61.l.r(new com.github.rudroid.uitoolkit.p2[]{new com.github.rudroid.uitoolkit.p2("Updated", 2131231149, null, null, null, null, null, null, 252), new com.github.rudroid.uitoolkit.p2("Updated at", 2131231149, null, null, null, null, null, null, 252)}), sVar17, 0);
                } else {
                    sVar17.V();
                }
                break;
            default:
                androidx.compose.runtime.s sVar18 = (androidx.compose.runtime.s) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                k71.k.g((e1) obj, "$this$FlowRow");
                if (sVar18.S(intValue18 & 1, (intValue18 & 17) != 16)) {
                    r2.a(x61.l.r(new com.github.rudroid.uitoolkit.p2[]{new com.github.rudroid.uitoolkit.p2("Updated", 2131231149, null, null, null, null, null, null, 252), new com.github.rudroid.uitoolkit.p2("Updated at", 2131231149, null, null, null, null, null, null, 252)}), sVar18, 0);
                } else {
                    sVar18.V();
                }
                break;
        }
        return a0.a;
    }
}
