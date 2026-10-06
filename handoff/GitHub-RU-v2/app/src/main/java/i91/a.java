package i91;

import com.github.rudroid.copilot.h1;
import h91.f0;
import h91.y;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class a {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(t71.a.a);
        k71.k.f(bytes, "getBytes(...)");
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(h91.h hVar, h91.kShadow kVar, long j, long j2, int i) {
        f0 f0Var;
        byte[] bArr;
        long j3 = j;
        long j4 = j2;
        k71.k.g(kVar, "bytes");
        long j5 = i;
        h91.b.e(kVar.d(), 0, j5);
        if (i <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j6 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(h1.m("fromIndex < 0: ", j3).toString());
        }
        if (j3 > j4) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j3 + " > " + j4).toString());
        }
        long j7 = hVar.s;
        if (j4 > j7) {
            j4 = j7;
        }
        if (j3 == j4 || (f0Var = hVar.r) == null) {
            return -1L;
        }
        if (j7 - j3 >= j3) {
            while (true) {
                long j8 = (f0Var.c - f0Var.b) + j6;
                if (j8 > j3) {
                    break;
                }
                f0Var = f0Var.f;
                k71.k.d(f0Var);
                j6 = j8;
            }
            byte[] h = kVar.h();
            byte b2 = h[0];
            long min = Math.min(j4, (hVar.s - j5) + 1);
            while (j6 < min) {
                byte[] bArr2 = f0Var.a;
                int min2 = (int) Math.min(f0Var.c, (f0Var.b + min) - j6);
                for (int i2 = (int) ((f0Var.b + j3) - j6); i2 < min2; i2++) {
                    if (bArr2[i2] == b2 && b(f0Var, i2 + 1, h, 1, i)) {
                        return (i2 - f0Var.b) + j6;
                    }
                }
                j6 += f0Var.c - f0Var.b;
                f0Var = f0Var.f;
                k71.k.d(f0Var);
                j3 = j6;
            }
            return -1L;
        }
        while (j7 > j3) {
            f0Var = f0Var.g;
            k71.k.d(f0Var);
            j7 -= f0Var.c - f0Var.b;
        }
        byte[] h2 = kVar.h();
        byte b3 = h2[0];
        byte[] bArr3 = h2;
        long min3 = Math.min(j4, (hVar.s - j5) + 1);
        while (j7 < min3) {
            byte[] bArr4 = f0Var.a;
            int min4 = (int) Math.min(f0Var.c, (f0Var.b + min3) - j7);
            int i3 = (int) ((f0Var.b + j3) - j7);
            while (i3 < min4) {
                if (bArr4[i3] == b3) {
                    bArr = bArr3;
                    if (b(f0Var, i3 + 1, bArr, 1, i)) {
                        return (i3 - f0Var.b) + j7;
                    }
                } else {
                    bArr = bArr3;
                }
                i3++;
                bArr3 = bArr;
            }
            j7 += f0Var.c - f0Var.b;
            f0Var = f0Var.f;
            k71.k.d(f0Var);
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(f0 f0Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = f0Var.c;
        byte[] bArr2 = f0Var.a;
        while (i2 < i3) {
            if (i == i4) {
                f0Var = f0Var.f;
                k71.k.d(f0Var);
                byte[] bArr3 = f0Var.a;
                bArr2 = bArr3;
                i = f0Var.b;
                i4 = f0Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(h91.h hVar, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (hVar.F(j2) == 13) {
                String i0 = hVar.i0(j2, t71.a.a);
                hVar.skip(2L);
                return i0;
            }
        }
        String i02 = hVar.i0(j, t71.a.a);
        hVar.skip(1L);
        return i02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int d(h91.h hVar, y yVar, boolean z) {
        int i;
        int i2;
        int i3;
        f0 f0Var;
        int i4;
        k71.k.g(yVar, "options");
        f0 f0Var2 = hVar.r;
        if (f0Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = f0Var2.a;
        int i5 = f0Var2.b;
        int i6 = f0Var2.c;
        int[] iArr = yVar.s;
        f0 f0Var3 = f0Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (f0Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            f0Var3 = f0Var3.f;
                            k71.k.d(f0Var3);
                            int i16 = f0Var3.b;
                            byte[] bArr2 = f0Var3.a;
                            i2 = f0Var3.c;
                            if (f0Var3 == f0Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                f0Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) != iArr[i11]) {
                    break loop0;
                }
                boolean z2 = i20 == i18;
                if (i19 == i6) {
                    k71.k.d(f0Var3);
                    f0 f0Var4 = f0Var3.f;
                    k71.k.d(f0Var4);
                    i3 = f0Var4.b;
                    byte[] bArr3 = f0Var4.a;
                    i4 = f0Var4.c;
                    if (f0Var4 != f0Var2) {
                        f0Var = f0Var4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        f0Var = null;
                    }
                } else {
                    f0Var = f0Var3;
                    i4 = i6;
                    i3 = i19;
                }
                if (z2) {
                    i = iArr[i20];
                    int i21 = i4;
                    f0Var3 = f0Var;
                    i2 = i21;
                    break;
                }
                i5 = i3;
                i6 = i4;
                f0Var3 = f0Var;
                i11 = i20;
            }
        }
        return i7;
    }
}
