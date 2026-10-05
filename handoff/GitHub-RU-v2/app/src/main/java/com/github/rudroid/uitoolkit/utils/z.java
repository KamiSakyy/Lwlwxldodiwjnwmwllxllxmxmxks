package com.github.rudroid.uitoolkit.utils;

import androidx.compose.foundation.layout.q0;
import androidx.compose.runtime.b2;
import f1.l8;
import f1.z1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, j71.e eVar, j71.e eVar2, j71.e eVar3, j71.e eVar4, int i, long j, long j2, final r1.d dVar, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        int i4;
        j71.e eVar5;
        int i5;
        j71.e eVar6;
        int i6;
        j71.e eVar7;
        int i7;
        j71.e eVar8;
        int i8;
        final w1.r rVar2;
        final j71.e eVar9;
        final j71.e eVar10;
        final j71.e eVar11;
        final j71.e eVar12;
        final int i9;
        final long j3;
        final long j4;
        b2 t;
        w1.r rVar3;
        j71.e eVar13;
        long j5;
        j71.e eVar14;
        int i11;
        j71.e eVar15;
        j71.e eVar16;
        long j6;
        long b;
        int i12;
        sVar.e0(-300513737);
        int i13 = i3 & 1;
        if (i13 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            eVar5 = eVar;
            i4 |= sVar.h(eVar5) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                eVar6 = eVar2;
                i4 |= sVar.h(eVar6) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    eVar7 = eVar3;
                    i4 |= sVar.h(eVar7) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        eVar8 = eVar4;
                        i4 |= sVar.h(eVar8) ? 16384 : 8192;
                        if ((196608 & i2) == 0) {
                            if ((i3 & 32) == 0) {
                                i8 = i;
                                if (sVar.d(i8)) {
                                    i12 = 131072;
                                    i4 |= i12;
                                }
                            } else {
                                i8 = i;
                            }
                            i12 = 65536;
                            i4 |= i12;
                        } else {
                            i8 = i;
                        }
                        if ((1572864 & i2) == 0) {
                            i4 |= ((i3 & 64) == 0 && sVar.e(j)) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i4 |= 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            i4 |= sVar.h(dVar) ? 67108864 : 33554432;
                        }
                        if (sVar.S(i4 & 1, (i4 & 38347923) != 38347922)) {
                            sVar.X();
                            if ((i2 & 1) == 0 || sVar.A()) {
                                rVar3 = i13 != 0 ? w1.o.a : rVar;
                                j71.e eVar17 = i14 != 0 ? d.a : eVar5;
                                eVar13 = i5 != 0 ? d.b : eVar6;
                                j71.e eVar18 = i6 != 0 ? d.c : eVar7;
                                j71.e eVar19 = i7 != 0 ? d.d : eVar8;
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                    i8 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ih.d.b(sVar).a;
                                    i4 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                int i15 = (-29360129) & i4;
                                eVar14 = eVar18;
                                i11 = i15;
                                eVar15 = eVar17;
                                eVar16 = eVar19;
                                j6 = j5;
                                b = z1.b(j5, sVar);
                            } else {
                                sVar.V();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                i11 = i4 & (-29360129);
                                eVar15 = eVar5;
                                eVar13 = eVar6;
                                eVar14 = eVar7;
                                eVar16 = eVar8;
                                rVar3 = rVar;
                                j6 = j;
                                b = j2;
                            }
                            sVar.r();
                            float f = 0;
                            int i16 = i11;
                            q0 q0Var = new q0(f, f, f, f);
                            int i17 = (33554430 & i16) | ((i16 << 3) & 1879048192);
                            int i18 = i8;
                            j71.e eVar20 = eVar13;
                            l8.a(rVar3, eVar15, eVar20, eVar14, eVar16, i18, j6, b, q0Var, dVar, sVar, i17);
                            j4 = b;
                            j3 = j6;
                            i9 = i18;
                            eVar12 = eVar16;
                            eVar11 = eVar14;
                            eVar10 = eVar20;
                            eVar9 = eVar15;
                            rVar2 = rVar3;
                        } else {
                            sVar.V();
                            rVar2 = rVar;
                            eVar9 = eVar5;
                            eVar10 = eVar6;
                            eVar11 = eVar7;
                            eVar12 = eVar8;
                            i9 = i8;
                            j3 = j;
                            j4 = j2;
                        }
                        t = sVar.t();
                        if (t != null) {
                            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.utils.y
                                public final Object s(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    z.a(rVar2, eVar9, eVar10, eVar11, eVar12, i9, j3, j4, dVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i2 | 1), i3);
                                    return w61.a0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    eVar8 = eVar4;
                    if ((196608 & i2) == 0) {
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if (sVar.S(i4 & 1, (i4 & 38347923) != 38347922)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                eVar7 = eVar3;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                eVar8 = eVar4;
                if ((196608 & i2) == 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if (sVar.S(i4 & 1, (i4 & 38347923) != 38347922)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            eVar6 = eVar2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            eVar7 = eVar3;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            eVar8 = eVar4;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if (sVar.S(i4 & 1, (i4 & 38347923) != 38347922)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        eVar5 = eVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        eVar6 = eVar2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        eVar7 = eVar3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        eVar8 = eVar4;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (sVar.S(i4 & 1, (i4 & 38347923) != 38347922)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
