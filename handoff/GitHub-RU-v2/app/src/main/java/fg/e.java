package fg;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.copilot.e5;
import com.github.rudroid.copilot.l;
import com.github.rudroid.uitoolkit.menu.d;
import com.github.rudroid.widget.p;
import com.google.android.gms.internal.measurement.i4;
import f1.q6;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import w1.o;
import w1.r;
import xn.b1;

/* loaded from: /home/user/work/p/classes3.dex */
public class e {

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[cc.b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                cc.b bVar = cc.b.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                cc.b bVar2 = cc.b.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                cc.b bVar3 = cc.b.r;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, String str, j71.f fVar, j71.a aVar, l lVar, boolean z, j71.a aVar2, j71.a aVar3, j71.a aVar4, j71.c cVar, s sVar, int i, int i2) {
        int i3;
        j71.f fVar2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        j71.a aVar5;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        r rVar2;
        j71.a aVar6;
        j71.c cVar2;
        j71.f fVar3;
        boolean z3;
        j71.a aVar7;
        j71.a aVar8;
        b2 t;
        j71.a aVar9;
        j71.a aVar10;
        j71.a aVar11;
        j71.c cVar3;
        k.g(str, "title");
        k.g(lVar, "copilotAiModelsUiModel");
        sVar.e0(1031650668);
        int i18 = i2 & 1;
        if (i18 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(str) ? 32 : 16;
        }
        int i19 = i2 & 4;
        if (i19 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            fVar2 = fVar;
            i3 |= sVar.h(fVar2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= sVar.h(aVar) ? 2048 : 1024;
            }
            int i21 = i3 | (!sVar.h(lVar) ? 16384 : 8192);
            i4 = i2 & 32;
            if (i4 == 0) {
                i5 = i21 | 196608;
                z2 = z;
            } else {
                z2 = z;
                i5 = i21 | (sVar.g(z2) ? 131072 : 65536);
            }
            i6 = i2 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
            } else if ((1572864 & i) == 0) {
                aVar5 = aVar2;
                i5 |= sVar.h(aVar5) ? 1048576 : 524288;
                i7 = i2 & 128;
                if (i7 != 0) {
                    i9 = i5 | 12582912;
                    i8 = i18;
                } else {
                    i8 = i18;
                    i9 = i5 | (sVar.h(aVar3) ? 8388608 : 4194304);
                }
                i11 = i2 & 256;
                if (i11 != 0) {
                    i13 = i9 | 100663296;
                    i12 = i11;
                } else {
                    i12 = i11;
                    i13 = i9 | (sVar.h(aVar4) ? 67108864 : 33554432);
                }
                i14 = i2 & 512;
                if (i14 != 0) {
                    i16 = i13 | 805306368;
                    i15 = i14;
                } else {
                    i15 = i14;
                    i16 = i13 | (sVar.h(cVar) ? 536870912 : 268435456);
                }
                i17 = i16;
                if (sVar.S(i17 & 1, (i17 & 306783379) != 306783378)) {
                    r rVar3 = i8 != 0 ? o.a : rVar;
                    j71.f fVar4 = i19 != 0 ? fg.a.a : fVar2;
                    boolean z4 = i4 != 0 ? false : z2;
                    Object obj = n.a;
                    if (i6 != 0) {
                        Object N = sVar.N();
                        if (N == obj) {
                            N = new p(15);
                            sVar.n0(N);
                        }
                        aVar9 = (j71.a) N;
                    } else {
                        aVar9 = aVar5;
                    }
                    if (i7 != 0) {
                        Object N2 = sVar.N();
                        if (N2 == obj) {
                            N2 = new p(15);
                            sVar.n0(N2);
                        }
                        aVar10 = (j71.a) N2;
                    } else {
                        aVar10 = aVar3;
                    }
                    if (i12 != 0) {
                        Object N3 = sVar.N();
                        if (N3 == obj) {
                            N3 = new p(15);
                            sVar.n0(N3);
                        }
                        aVar11 = (j71.a) N3;
                    } else {
                        aVar11 = aVar4;
                    }
                    if (i15 != 0) {
                        Object N4 = sVar.N();
                        if (N4 == obj) {
                            N4 = new q6(6);
                            sVar.n0(N4);
                        }
                        cVar3 = (j71.c) N4;
                    } else {
                        cVar3 = cVar;
                    }
                    boolean z5 = lVar.a.size() > 1;
                    List<e5> list = lVar.b;
                    sVar.c0(1801116425);
                    y61.b i22 = d0Shadow.i();
                    boolean z6 = z5;
                    i22.add(new d.b(i4.p0(2131952141, sVar), ih.d.b(sVar).w));
                    sVar.c0(1801124257);
                    for (e5 e5Var : list) {
                        b1 b1Var = e5Var.a;
                        i22.add(new d.C0009d(b1Var.getId(), b1Var.getName(), b1Var.C().c(), (com.github.rudroid.uitoolkit.text.o) null, (String) null, 0L, ih.d.b(sVar).w, 0L, false, e5Var.c, 1, 1464));
                        aVar11 = aVar11;
                    }
                    j71.a aVar12 = aVar11;
                    sVar.q(false);
                    i22.add(d.g.a);
                    i22.add(new d.C0009d("view_all_models", i4.p0(2131952142, sVar), (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, ih.d.b(sVar).s, 0L, 0L, false, false, 0, 4060));
                    y61.b h = d0Shadow.h(i22);
                    sVar.q(false);
                    RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
                    ei.c cVar4 = ei.c.U;
                    runtimeFeatureFlag.getClass();
                    boolean a2 = RuntimeFeatureFlag.a(cVar4);
                    int i23 = a2 ? 2131231114 : 2131231498;
                    int i24 = a2 ? 2131953801 : 2131953802;
                    j71.c cVar5 = cVar3;
                    j71.f fVar5 = fVar4;
                    r rVar4 = rVar3;
                    qg.pShadow.b(rVar4, 0L, aVar, i23, i24, 0.0f, 0.0f, fVar5, r1.i.d(-53144046, new com.github.rudroid.projects.triagesheet.textfield.ui.e(z6, lVar, aVar12, aVar10, str, z4, h, cVar3, aVar9), sVar), sVar, (i17 & 14) | 100663296 | ((i17 >> 3) & 896) | ((i17 << 15) & 29360128), 98);
                    rVar2 = rVar4;
                    fVar3 = fVar5;
                    aVar7 = aVar9;
                    aVar8 = aVar10;
                    z3 = z4;
                    aVar6 = aVar12;
                    cVar2 = cVar5;
                } else {
                    sVar.V();
                    rVar2 = rVar;
                    aVar6 = aVar4;
                    cVar2 = cVar;
                    fVar3 = fVar2;
                    z3 = z2;
                    aVar7 = aVar5;
                    aVar8 = aVar3;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new com.github.rudroid.fileschanged.ui.b(rVar2, str, fVar3, aVar, lVar, z3, aVar7, aVar8, aVar6, cVar2, i, i2);
                    return;
                }
                return;
            }
            aVar5 = aVar2;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i11 = i2 & 256;
            if (i11 != 0) {
            }
            i14 = i2 & 512;
            if (i14 != 0) {
            }
            i17 = i16;
            if (sVar.S(i17 & 1, (i17 & 306783379) != 306783378)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        fVar2 = fVar;
        if ((i & 3072) == 0) {
        }
        int i212 = i3 | (!sVar.h(lVar) ? 16384 : 8192);
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        aVar5 = aVar2;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i11 = i2 & 256;
        if (i11 != 0) {
        }
        i14 = i2 & 512;
        if (i14 != 0) {
        }
        i17 = i16;
        if (sVar.S(i17 & 1, (i17 & 306783379) != 306783378)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }


}
