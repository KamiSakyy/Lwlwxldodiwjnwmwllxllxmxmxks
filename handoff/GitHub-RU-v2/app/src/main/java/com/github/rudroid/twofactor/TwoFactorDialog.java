package com.github.rudroid.twofactor;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.p1;
import androidx.lifecycle.d1;
import com.github.rudroid.activities.f3;
import com.github.rudroid.uitoolkit.t0;
import com.github.rudroid.uitoolkit.u0;
import com.github.rudroid.uitoolkit.v0;
import com.github.service.models.response.type.MobileAuthRequestType;
import kotlin.NoWhenBranchMatchedException;
import v71.q1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class TwoFactorDialog extends w2.a {
    public static final /* synthetic */ int B = 0;
    public p1 A;
    public j71.a z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a A;
        public static final a B;
        public static final /* synthetic */ a[] C;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;

        static {
            a aVar = new a("FETCH", 0);
            r = aVar;
            a aVar2 = new a("FETCH_ERROR", 1);
            s = aVar2;
            a aVar3 = new a("CHOICE_INPUT", 2);
            t = aVar3;
            a aVar4 = new a("CHOICE_NO_INPUT", 3);
            u = aVar4;
            a aVar5 = new a("LOADING_APPROVED", 4);
            v = aVar5;
            a aVar6 = new a("LOADING_REJECTED", 5);
            w = aVar6;
            a aVar7 = new a("ERROR_APPROVED", 6);
            x = aVar7;
            a aVar8 = new a("ERROR_REJECTED", 7);
            y = aVar8;
            a aVar9 = new a("FINISHED_APPROVED", 8);
            z = aVar9;
            a aVar10 = new a("FINISHED_REJECTED", 9);
            A = aVar10;
            a aVar11 = new a("UNKNOWN", 10);
            B = aVar11;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
            C = aVarArr;
            v8.l0.t(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) C.clone();
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a aVar = a.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a aVar2 = a.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a aVar3 = a.r;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a aVar4 = a.r;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a aVar5 = a.r;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a aVar6 = a.r;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a aVar7 = a.r;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a aVar8 = a.r;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a aVar9 = a.r;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a aVar10 = a.r;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[MobileAuthRequestType.values().length];
            try {
                iArr2[MobileAuthRequestType.TWO_FACTOR_LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MobileAuthRequestType.DEVICE_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[MobileAuthRequestType.TWO_FACTOR_PASSWORD_RESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[MobileAuthRequestType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[MobileAuthRequestType.TWO_FACTOR_SUDO_CHALLENGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            a = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFactorDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k71.k.g(context, "context");
        this.z = new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(9);
        this.A = androidx.compose.runtime.t.B(Boolean.TRUE);
    }

    public static a j(fl.f fVar) {
        fn.a aVar;
        f11.b bVar;
        com.github.rudroid.twofactor.b bVar2 = (com.github.rudroid.twofactor.b) fVar.b;
        boolean z = (bVar2 == null || (aVar = bVar2.a) == null || (bVar = aVar.b) == null) ? true : bVar.v;
        if (bVar2 == null) {
            return a.B;
        }
        com.github.rudroid.twofactor.a aVar2 = bVar2.b;
        com.github.rudroid.twofactor.a aVar3 = com.github.rudroid.twofactor.a.r;
        if (aVar2 == aVar3 && i21.a.x(fVar)) {
            return a.r;
        }
        if (aVar2 == aVar3 && i21.a.v(fVar)) {
            return a.s;
        }
        com.github.rudroid.twofactor.a aVar4 = com.github.rudroid.twofactor.a.s;
        if (aVar2 == aVar4 && z) {
            return a.t;
        }
        if (aVar2 == aVar4 && !z) {
            return a.u;
        }
        com.github.rudroid.twofactor.a aVar5 = com.github.rudroid.twofactor.a.t;
        if (aVar2 == aVar5 && i21.a.x(fVar)) {
            return a.v;
        }
        if (aVar2 == aVar5 && i21.a.v(fVar)) {
            return a.x;
        }
        if (aVar2 == aVar5 && i21.a.y(fVar)) {
            return a.z;
        }
        com.github.rudroid.twofactor.a aVar6 = com.github.rudroid.twofactor.a.u;
        return (aVar2 == aVar6 && i21.a.x(fVar)) ? a.w : (aVar2 == aVar6 && i21.a.v(fVar)) ? a.y : (aVar2 == aVar6 && i21.a.y(fVar)) ? a.A : a.B;
    }

    public static boolean k(String str) {
        return (str == null || t71.p.T(str) || !TextUtils.isDigitsOnly(str) || str.length() >= 6 || t71.w.G(str) == null) ? false : true;
    }

    public final void a(final int i, androidx.compose.runtime.s sVar) {
        sVar.e0(-1271992427);
        int i2 = (sVar.h(this) ? 4 : 2) | i;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            if (((Boolean) this.A.getValue()).booleanValue()) {
                sVar.c0(570106508);
                i(null, null, sVar, (i2 << 6) & 896);
            } else {
                sVar.c0(566833869);
            }
            sVar.q(false);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e(i) { // from class: com.github.rudroid.twofactor.z
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i3 = TwoFactorDialog.B;
                    int L = androidx.compose.runtime.t.L(1);
                    TwoFactorDialog.this.a(L, (androidx.compose.runtime.s) obj);
                    return w61.a0.a;
                }
            };
        }
    }

    public final j71.a getOnFinished() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(w1.r rVar, h hVar, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        h hVar2;
        w1.r rVar3;
        final h hVar3;
        Object u0Var;
        Object t0Var;
        f1 f1Var;
        String string;
        sVar.e0(1179957964);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 = i | 22;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(this) ? 256 : 128;
        }
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                androidx.lifecycle.r a2 = u6.a.a(sVar);
                if (a2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                h hVar4 = (h) t.e.v(k71.x.a(h.class), a2, a2 instanceof androidx.lifecycle.r ? a2.g0() : t6.a.b, sVar);
                rVar3 = w1.o.a;
                hVar3 = hVar4;
            } else {
                sVar.V();
                rVar3 = rVar;
                hVar3 = hVar;
            }
            sVar.r();
            f1 n = androidx.compose.runtime.t.n(hVar3.z, sVar);
            boolean h = sVar.h(this);
            Object N = sVar.N();
            Object obj = androidx.compose.runtime.n.a;
            if (h || N == obj) {
                N = new e(this, 1);
                sVar.n0(N);
            }
            j71.a aVar = (j71.a) N;
            fl.f fVar = (fl.f) n.getValue();
            boolean h2 = sVar.h(hVar3);
            Object N2 = sVar.N();
            if (h2 || N2 == obj) {
                final int i3 = 2;
                N2 = new j71.a() { // from class: com.github.rudroid.twofactor.a0
                    public final Object a() {
                        fn.a aVar2;
                        q1 q1Var;
                        int i4 = i3;
                        w61.a0 a0Var = w61.a0.a;
                        h hVar5 = hVar3;
                        switch (i4) {
                            case 0:
                                int i5 = TwoFactorDialog.B;
                                b bVar = (b) ((fl.f) hVar5.x.getValue()).b;
                                if (bVar != null && (aVar2 = bVar.a) != null && ((q1Var = hVar5.y) == null || !q1Var.f())) {
                                    hVar5.y = v71.b0.z(d1.k(hVar5), (a71.h) null, (v71.a0) null, new s(hVar5, aVar2, new b(aVar2, a.u, ""), null), 3);
                                    break;
                                }
                                break;
                            case 1:
                                int i6 = TwoFactorDialog.B;
                                hVar5.P();
                                break;
                            default:
                                int i7 = TwoFactorDialog.B;
                                hVar5.P();
                                break;
                        }
                        return a0Var;
                    }
                };
                sVar.n0(N2);
            }
            j71.a aVar2 = (j71.a) N2;
            boolean h3 = sVar.h(hVar3);
            Object N3 = sVar.N();
            if (h3 || N3 == obj) {
                final int i4 = 0;
                N3 = new j71.a() { // from class: com.github.rudroid.twofactor.a0
                    public final Object a() {
                        fn.a aVar22;
                        q1 q1Var;
                        int i42 = i4;
                        w61.a0 a0Var = w61.a0.a;
                        h hVar5 = hVar3;
                        switch (i42) {
                            case 0:
                                int i5 = TwoFactorDialog.B;
                                b bVar = (b) ((fl.f) hVar5.x.getValue()).b;
                                if (bVar != null && (aVar22 = bVar.a) != null && ((q1Var = hVar5.y) == null || !q1Var.f())) {
                                    hVar5.y = v71.b0.z(d1.k(hVar5), (a71.h) null, (v71.a0) null, new s(hVar5, aVar22, new b(aVar22, a.u, ""), null), 3);
                                    break;
                                }
                                break;
                            case 1:
                                int i6 = TwoFactorDialog.B;
                                hVar5.P();
                                break;
                            default:
                                int i7 = TwoFactorDialog.B;
                                hVar5.P();
                                break;
                        }
                        return a0Var;
                    }
                };
                sVar.n0(N3);
            }
            j71.a aVar3 = (j71.a) N3;
            switch (j(fVar).ordinal()) {
                case 0:
                    u0Var = new u0(new com.github.rudroid.uitoolkit.c(2131951840, aVar, true, false), null);
                    f1Var = n;
                    w1.r rVar4 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar4;
                    break;
                case 1:
                    u0Var = new com.github.rudroid.uitoolkit.l0(null, new com.github.rudroid.uitoolkit.c(2131951842, aVar, true, false), 5);
                    f1Var = n;
                    w1.r rVar42 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar42;
                    break;
                case 2:
                    String string2 = getContext().getString(2131952722);
                    com.github.rudroid.twofactor.b bVar = (com.github.rudroid.twofactor.b) fVar.b;
                    t0Var = new t0(string2, new com.github.rudroid.uitoolkit.c(2131951839, aVar2, k(bVar != null ? bVar.c : null), false), new com.github.rudroid.uitoolkit.c(2131951854, aVar3, true, true));
                    f1Var = n;
                    u0Var = t0Var;
                    w1.r rVar422 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar422;
                    break;
                case 3:
                    u0Var = new v0(null, new com.github.rudroid.uitoolkit.c(2131951839, aVar2, true, false), new com.github.rudroid.uitoolkit.c(2131951854, aVar3, true, true), 1);
                    f1Var = n;
                    w1.r rVar4222 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar4222;
                    break;
                case 4:
                    u0Var = new u0(new com.github.rudroid.uitoolkit.c(2131951839, aVar2, false, false), new com.github.rudroid.uitoolkit.c(2131951854, aVar3, false, false));
                    f1Var = n;
                    w1.r rVar42222 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar42222;
                    break;
                case 5:
                    u0Var = new u0(new com.github.rudroid.uitoolkit.c(2131951839, aVar2, false, false), new com.github.rudroid.uitoolkit.c(2131951854, aVar3, false, true));
                    f1Var = n;
                    w1.r rVar422222 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar422222;
                    break;
                case 6:
                    fl.b bVar2 = fVar.c;
                    if (bVar2 == null || (string = bVar2.b) == null) {
                        string = getContext().getString(2131951769);
                        k71.k.f(string, "getString(...)");
                    }
                    t0Var = new com.github.rudroid.uitoolkit.l0(string, new com.github.rudroid.uitoolkit.c(2131951842, aVar, true, false), 4);
                    f1Var = n;
                    u0Var = t0Var;
                    w1.r rVar4222222 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar4222222;
                    break;
                case 7:
                    u0Var = new com.github.rudroid.uitoolkit.l0(getContext().getString(2131951777), new com.github.rudroid.uitoolkit.c(2131951842, aVar, true, false), 4);
                    f1Var = n;
                    w1.r rVar42222222 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar42222222;
                    break;
                case 8:
                    u0Var = new v0(getContext().getString(2131951771), new com.github.rudroid.uitoolkit.c(2131951842, aVar, true, false), null, 4);
                    f1Var = n;
                    w1.r rVar422222222 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar422222222;
                    break;
                case 9:
                    u0Var = new v0(getContext().getString(2131951779), new com.github.rudroid.uitoolkit.c(2131951842, aVar, true, false), null, 4);
                    f1Var = n;
                    w1.r rVar4222222222 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar4222222222;
                    break;
                case 10:
                    u0Var = new com.github.rudroid.uitoolkit.l0(getContext().getString(2131951774), new com.github.rudroid.uitoolkit.c(2131951842, aVar, true, false), 4);
                    f1Var = n;
                    w1.r rVar42222222222 = rVar3;
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1781853402, new f3(f1Var, hVar3, rVar3, this, aVar, u0Var, 14), sVar), sVar, 805306368, 511);
                    hVar2 = hVar3;
                    rVar2 = rVar42222222222;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            sVar.V();
            rVar2 = rVar;
            hVar2 = hVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new androidx.compose.foundation.lazy.layout.k0(this, rVar2, hVar2, i, 28);
        }
    }

    public final void setOnFinished(j71.a aVar) {
        k71.k.g(aVar, "<set-?>");
        this.z = aVar;
    }


    public static Object getContext(Object... a) {
        return null;
    }
}
