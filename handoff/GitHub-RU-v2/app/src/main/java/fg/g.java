package fg;

import ab.m;
import android.content.Context;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f0;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.copilot.i5;
import com.github.rudroid.m0;
import com.github.rudroid.uitoolkit.f1;
import com.github.rudroid.widget.p;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import k71.k;
import sg.k0;
import sg.v;
import sg.y;
import w1.o;
import w1.r;
import w2.j0;
import w61.a0;
import xn.d1;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sz0.b.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                sz0.a aVar = sz0.b.Companion;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[e1.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d1 d1Var = e1.Companion;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d1 d1Var2 = e1.Companion;
                iArr2[4] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d1 d1Var3 = e1.Companion;
                iArr2[5] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d1 d1Var4 = e1.Companion;
                iArr2[6] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d1 d1Var5 = e1.Companion;
                iArr2[0] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d1 d1Var6 = e1.Companion;
                iArr2[1] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d1 d1Var7 = e1.Companion;
                iArr2[7] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final void a(r rVar, final String str, boolean z, final e1 e1Var, List list, final j71.a aVar, final j71.a aVar2, final j71.a aVar3, final j71.a aVar4, j71.a aVar5, final eg.a aVar6, final boolean z2, final boolean z3, sz0.b bVar, s sVar, int i, int i2, int i3) {
        int i4;
        final boolean z4;
        List list2;
        int i5;
        int i6;
        j71.a aVar7;
        sz0.b bVar2;
        final j71.a aVar8;
        k.g(str, "currentUserHandle");
        k.g(e1Var, "licenseType");
        k.g(aVar, "onManageSubscriptionClick");
        k.g(aVar2, "onUpgradeToProClick");
        k.g(aVar3, "onUpgradeToFreeClick");
        k.g(aVar4, "onUpgradeToProPlusClick");
        k.g(aVar6, "copilotChatMonthlyLicenseDetails");
        sVar.e0(-1916478853);
        if ((i & 6) == 0) {
            i4 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z4 = z;
            i4 |= sVar.g(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            i4 |= sVar.d(e1Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            list2 = list;
            i4 |= sVar.h(list2) ? 16384 : 8192;
        } else {
            list2 = list;
        }
        if ((i & 196608) == 0) {
            i4 |= sVar.h(aVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= sVar.h(aVar2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= sVar.h(aVar3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= sVar.h(aVar4) ? 67108864 : 33554432;
        }
        int i7 = i3 & 512;
        if (i7 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= sVar.h(aVar5) ? 536870912 : 268435456;
        }
        int i8 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (sVar.h(aVar6) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= sVar.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= sVar.g(z3) ? 256 : 128;
        }
        int i9 = i3 & 8192;
        if (i9 != 0) {
            i5 |= 3072;
            i6 = i9;
        } else {
            i6 = i9;
            if ((i2 & 3072) == 0) {
                i5 |= sVar.d(bVar == null ? -1 : bVar.ordinal()) ? 2048 : 1024;
            }
        }
        if (sVar.S(i8 & 1, ((i8 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            if (i7 != 0) {
                Object N = sVar.N();
                if (N == n.a) {
                    N = new p(15);
                    sVar.n0(N);
                }
                aVar8 = (j71.a) N;
            } else {
                aVar8 = aVar5;
            }
            final sz0.b bVar3 = i6 != 0 ? null : bVar;
            final List list3 = list2;
            eh.e.a(rVar, i4.p0(2131954521, sVar), null, null, r1.i.d(-1461433928, new j71.f() { // from class: fg.f
                public final Object f(Object obj, Object obj2, Object obj3) {
                    s sVar2 = (s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    k.g((f0) obj, "$this$PrimaryPreferenceGroup");
                    if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
                        g.c(aVar, str, e1Var, aVar6, bVar3, sVar2, 0);
                        s sVar3 = sVar2;
                        o oVar = o.a;
                        if (z2) {
                            sVar3.c0(505757097);
                            l2 a2 = j2.a(l.a, w1.c.B, sVar3, 48);
                            int hashCode = Long.hashCode(sVar3.T);
                            v1 l = sVar3.l();
                            r c = w1.a.c(sVar3, oVar);
                            v2.h.o.getClass();
                            v2.f fVar = v2.g.b;
                            sVar3.g0();
                            if (sVar3.S) {
                                sVar3.k(fVar);
                            } else {
                                sVar3.q0();
                            }
                            t.I(sVar3, v2.g.f, a2);
                            t.I(sVar3, v2.g.e, l);
                            t.w(sVar3, Integer.valueOf(hashCode), v2.g.g);
                            t.E(sVar3, v2.g.h);
                            t.I(sVar3, v2.g.d, c);
                            if (1.0f <= 0.0d) {
                                l0.a.a("invalid weight; must be greater than zero");
                            }
                            w1 w1Var = new w1(1.0f, true);
                            String upperCase = i4.p0(2131954529, sVar3).toUpperCase(Locale.ROOT);
                            k.f(upperCase, "toUpperCase(...)");
                            g.b(0, sVar3, aVar3, upperCase, w1Var);
                            if (z4) {
                                sVar3.c0(-840056116);
                                f1.a(p2.o(androidx.compose.foundation.layout.b.z(oVar, ih.a.n, 0.0f, 2), 16), null, 2, 0L, sVar3, 384, 10);
                                sVar3 = sVar3;
                            } else {
                                sVar3.c0(-844262010);
                            }
                            sVar3.q(false);
                            sVar3.q(true);
                            sVar3.q(false);
                        } else {
                            if (z3) {
                                sVar3.c0(506697420);
                                RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
                                ei.c cVar = ei.c.N;
                                runtimeFeatureFlag.getClass();
                                if (RuntimeFeatureFlag.a(cVar)) {
                                    sVar3.c0(506795442);
                                    y.a(100663296, 234, null, sVar3, null, null, v.d(0, sVar3), null, aVar8, b.a, androidx.compose.foundation.layout.b.z(p2.e(oVar, 1.0f), ih.a.n, 0.0f, 2), false);
                                    sVar3.q(false);
                                } else {
                                    e1 e1Var2 = e1.u;
                                    List list4 = list3;
                                    if (list4.contains(e1Var2)) {
                                        sVar3.c0(507543782);
                                        y.a(100663296, 234, null, sVar3, null, null, v.d(0, sVar3), null, aVar2, b.b, androidx.compose.foundation.layout.b.z(p2.e(oVar, 1.0f), ih.a.n, 0.0f, 2), false);
                                        sVar3.q(false);
                                    } else {
                                        if (list4.contains(e1.v)) {
                                            sVar3.c0(508320797);
                                            y.a(100663296, 234, null, sVar3, null, null, v.d(0, sVar3), null, aVar4, b.c, androidx.compose.foundation.layout.b.z(p2.e(oVar, 1.0f), ih.a.n, 0.0f, 2), false);
                                        } else {
                                            sVar3.c0(502048970);
                                        }
                                        sVar3.q(false);
                                    }
                                }
                            } else {
                                sVar3.c0(502048970);
                            }
                            sVar3.q(false);
                        }
                        androidx.compose.foundation.layout.b.g(sVar3, p2.f(oVar, ih.a.n));
                    } else {
                        sVar2.V();
                    }
                    return a0.a;
                }
            }, sVar), sVar, (i8 & 14) | 24576, 12);
            aVar7 = aVar8;
            bVar2 = bVar3;
        } else {
            sVar.V();
            aVar7 = aVar5;
            bVar2 = bVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.feed.ui.p(rVar, str, z, e1Var, list, aVar, aVar2, aVar3, aVar4, aVar7, aVar6, z2, z3, bVar2, i, i2, i3);
        }
    }

    public static final void b(int i, s sVar, j71.a aVar, String str, r rVar) {
        sVar.e0(262397204);
        int i2 = (sVar.f(str) ? 4 : 2) | i | (sVar.h(aVar) ? 32 : 16) | (sVar.f(rVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            r z = androidx.compose.foundation.layout.b.z(rVar, ih.a.l, 0.0f, 2);
            boolean z2 = (i2 & 112) == 32;
            Object N = sVar.N();
            if (z2 || N == n.a) {
                N = new com.github.rudroid.uitoolkit.markdown.components.c(13, aVar);
                sVar.n0(N);
            }
            k0.a(12582912, 122, null, sVar, null, null, null, (j71.a) N, r1.i.d(855885755, new m(str, 14), sVar), z, false);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.settings.copilot.paywall.ui.y(str, aVar, rVar, i);
        }
    }

    public static final void c(j71.a aVar, String str, e1 e1Var, eg.a aVar2, sz0.b bVar, s sVar, int i) {
        e1 e1Var2;
        boolean z;
        String str2;
        int i2;
        String str3;
        s sVar2 = sVar;
        sVar2.e0(-1412861996);
        int i3 = i | (sVar2.h(aVar) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.d(e1Var.ordinal()) ? 256 : 128) | (sVar2.h(aVar2) ? 2048 : 1024) | (sVar2.d(bVar == null ? -1 : bVar.ordinal()) ? 16384 : 8192);
        if (sVar2.S(i3 & 1, (i3 & 9363) != 9362)) {
            if (i5.d(e1Var)) {
                sVar2.c0(108140666);
                r z2 = androidx.compose.foundation.layout.b.z(p2.e(o.a, 1.0f), ih.a.n, 0.0f, 2);
                l2 a2 = j2.a(l.a, w1.c.B, sVar2, 48);
                int hashCode = Long.hashCode(sVar2.T);
                v1 l = sVar2.l();
                r c = w1.a.c(sVar2, z2);
                v2.h.o.getClass();
                v2.f fVar = v2.g.b;
                sVar2.g0();
                if (sVar2.S) {
                    sVar2.k(fVar);
                } else {
                    sVar2.q0();
                }
                v2.e eVar = v2.g.f;
                t.I(sVar2, eVar, a2);
                v2.e eVar2 = v2.g.e;
                t.I(sVar2, eVar2, l);
                Integer valueOf = Integer.valueOf(hashCode);
                v2.e eVar3 = v2.g.g;
                t.w(sVar2, valueOf, eVar3);
                v2.d dVar = v2.g.h;
                t.E(sVar2, dVar);
                v2.e eVar4 = v2.g.d;
                t.I(sVar2, eVar4, c);
                if (1.0f <= 0.0d) {
                    l0.a.a("invalid weight; must be greater than zero");
                }
                w1 w1Var = new w1(1.0f, true);
                e0 a3 = c0.a(l.c, w1.c.D, sVar2, 0);
                int hashCode2 = Long.hashCode(sVar2.T);
                v1 l2 = sVar2.l();
                r c2 = w1.a.c(sVar2, w1Var);
                sVar2.g0();
                if (sVar2.S) {
                    sVar2.k(fVar);
                } else {
                    sVar2.q0();
                }
                t.I(sVar2, eVar, a3);
                t.I(sVar2, eVar2, l2);
                f1.e.t(hashCode2, sVar2, eVar3, sVar2, dVar);
                t.I(sVar2, eVar4, c2);
                e1Var2 = e1Var;
                z = false;
                ub.b(h.a(e1Var2, (Context) sVar2.j(j0.b)), (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).o, sVar, 0, 0, 131070);
                ub.b(i4.q0(2131954526, new Object[]{str}, sVar), (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).u, sVar, 0, 0, 131070);
                sVar2 = sVar;
                switch (e1Var2.ordinal()) {
                    case 0:
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                        sVar2.c0(1658832782);
                        sVar2.q(false);
                        str2 = null;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        sVar2.c0(1657921817);
                        int i4 = bVar != null ? a.a[bVar.ordinal()] : -1;
                        if (i4 == 1) {
                            str2 = m0.d(sVar2, 192029763, 2131954527, sVar2, false);
                        } else if (i4 != 2) {
                            str2 = m0.d(sVar2, 1658636491, 2131954544, sVar2, false);
                        } else {
                            sVar2.c0(192033661);
                            k.g(aVar2, "<this>");
                            if (aVar2.a.length() > 0) {
                                sVar2.c0(1658130013);
                                String format = aVar2.b.format(DateTimeFormatter.ISO_LOCAL_DATE);
                                k.f(format, "format(...)");
                                str2 = i4.q0(2131954530, new Object[]{format}, sVar2);
                                sVar2.q(false);
                            } else {
                                str2 = m0.d(sVar2, 1658499037, 2131954531, sVar2, false);
                            }
                            sVar2.q(false);
                        }
                        sVar2.q(false);
                        break;
                    default:
                        throw f1.e.r(192025364, sVar2, false);
                }
                if (str2 == null) {
                    sVar2.c0(1984423784);
                    sVar2.q(false);
                    i2 = i3;
                    str3 = "<this>";
                } else {
                    sVar2.c0(1984423785);
                    i2 = i3;
                    str3 = "<this>";
                    ub.b(str2, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).u, sVar, 0, 0, 131070);
                    sVar2 = sVar;
                    sVar2.q(false);
                }
                sVar2.q(true);
                k.g(aVar2, str3);
                if (aVar2.a.length() > 0) {
                    sVar2.c0(1507851385);
                    String upperCase = i4.p0(2131954532, sVar2).toUpperCase(Locale.ROOT);
                    k.f(upperCase, "toUpperCase(...)");
                    k0.b(null, false, aVar, null, upperCase, null, sVar2, (i2 << 6) & 896, 43);
                } else {
                    sVar2.c0(1499156815);
                }
                sVar2.q(false);
                sVar2.q(true);
            } else {
                e1Var2 = e1Var;
                z = false;
                sVar2.c0(100719886);
            }
            sVar2.q(z);
        } else {
            e1Var2 = e1Var;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.checkdetail.j(aVar, str, e1Var2, aVar2, bVar, i, 21);
        }
    }

}
