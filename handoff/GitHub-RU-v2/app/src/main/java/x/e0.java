package x;

import java.util.Arrays;
import java.util.Collection;

/* loaded from: /home/user/work/p/classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f33546a = o0.f33603a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f33547b = y.a.f34141c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f33548c = s.f33620b;

    /* renamed from: d, reason: collision with root package name */
    public int f33549d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f33550e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f33551f;

    /* renamed from: g, reason: collision with root package name */
    public int f33552g;

    /* renamed from: h, reason: collision with root package name */
    public int f33553h;

    public e0(int i) {
        if (i >= 0) {
            f(o0.d(i));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.f33552g;
        int d10 = d(obj);
        this.f33547b[d10] = obj;
        long[] jArr = this.f33548c;
        int i10 = this.f33549d;
        jArr[d10] = (i10 & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((d10 & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f33549d = d10;
        if (this.f33550e == Integer.MAX_VALUE) {
            this.f33550e = d10;
        }
        return this.f33552g != i;
    }

    public final void b() {
        this.f33552g = 0;
        long[] jArr = this.f33546a;
        if (jArr != o0.f33603a) {
            x61.l.I(jArr, -9187201950435737472L);
            long[] jArr2 = this.f33546a;
            int i = this.f33551f;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        x61.l.G(0, this.f33551f, (Object) null, this.f33547b);
        x61.l.I(this.f33548c, 4611686018427387903L);
        this.f33549d = Integer.MAX_VALUE;
        this.f33550e = Integer.MAX_VALUE;
        this.f33553h = o0.a(this.f33551f) - this.f33552g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f33551f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f33546a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (i11 * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (k71.k.b(this.f33547b[i], obj)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i >= 0;
    }

    public final int d(Object obj) {
        int i;
        long j10;
        long j11;
        long j12;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i10 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f33551f;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f33546a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j14 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j15 = i13;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (j16 - 72340172838076673L) & (~j16) & (-9187201950435737472L);
            while (j17 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i15) & i14;
                int i19 = i10;
                if (k71.k.b(this.f33547b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i10 = i19;
            }
            int i20 = i10;
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                int e5 = e(i12);
                long j18 = 255;
                if (this.f33553h != 0 || ((this.f33546a[e5 >> 3] >> ((e5 & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j10 = j15;
                    j11 = 255;
                    j12 = 128;
                } else {
                    int i21 = this.f33551f;
                    if (i21 > 8) {
                        c10 = 31;
                        j12 = 128;
                        if (Long.compareUnsigned(this.f33552g * 32, i21 * 25) <= 0) {
                            long[] jArr4 = this.f33546a;
                            if (jArr4 == null) {
                                i = 0;
                                j10 = j15;
                                j11 = 255;
                            } else {
                                int i22 = this.f33551f;
                                Object[] objArr = this.f33547b;
                                long[] jArr5 = this.f33548c;
                                long[] jArr6 = new long[i22];
                                Arrays.fill(jArr6, 0, i22, 9223372034707292159L);
                                i = 0;
                                int i23 = (i22 + 7) >> 3;
                                int i24 = 0;
                                while (i24 < i23) {
                                    long j19 = j18;
                                    long j20 = jArr4[i24] & (-9187201950435737472L);
                                    int i25 = i24;
                                    jArr4[i25] = ((~j20) + (j20 >>> 7)) & (-72340172838076674L);
                                    i24 = i25 + 1;
                                    j18 = j19;
                                }
                                j11 = j18;
                                int length = jArr4.length;
                                int i26 = length - 1;
                                int i27 = length - 2;
                                jArr4[i27] = (jArr4[i27] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i26] = jArr4[0];
                                int i28 = 0;
                                while (i28 != i22) {
                                    int i29 = i28 >> 3;
                                    int i30 = (i28 & 7) << 3;
                                    long j21 = (jArr4[i29] >> i30) & j11;
                                    if (j21 != 128 && j21 == 254) {
                                        Object obj2 = objArr[i28];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i20;
                                        int i31 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int e10 = e(i31);
                                        int i32 = i31 & i22;
                                        if (((e10 - i32) & i22) / 8 == ((i28 - i32) & i22) / 8) {
                                            int i33 = i22;
                                            Object[] objArr2 = objArr;
                                            jArr4[i29] = (jArr4[i29] & (~(j11 << i30))) | ((r17 & 127) << i30);
                                            if (jArr6[i28] == 9223372034707292159L) {
                                                long j22 = i28;
                                                jArr6[i28] = j22 | (j22 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i33;
                                            objArr = objArr2;
                                        } else {
                                            int i34 = i22;
                                            Object[] objArr3 = objArr;
                                            int i35 = e10 >> 3;
                                            long j23 = jArr4[i35];
                                            int i36 = (e10 & 7) << 3;
                                            if (((j23 >> i36) & j11) == 128) {
                                                jArr4[i35] = (j23 & (~(j11 << i36))) | ((r17 & 127) << i36);
                                                jArr4[i29] = (jArr4[i29] & (~(j11 << i30))) | (128 << i30);
                                                objArr3[e10] = objArr3[i28];
                                                objArr3[i28] = null;
                                                jArr5[e10] = jArr5[i28];
                                                jArr5[i28] = 4611686018427387903L;
                                                int i37 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                int i38 = Integer.MAX_VALUE;
                                                if (i37 != Integer.MAX_VALUE) {
                                                    j13 = j15;
                                                    jArr6[i37] = e10 | (jArr6[i37] & (-4294967296L));
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (-4294967296L);
                                                    i38 = Integer.MAX_VALUE;
                                                } else {
                                                    j13 = j15;
                                                    jArr6[i28] = (Integer.MAX_VALUE << 32) | e10;
                                                }
                                                jArr6[e10] = (i28 << 32) | i38;
                                            } else {
                                                j13 = j15;
                                                jArr4[i35] = ((r17 & 127) << i36) | (j23 & (~(j11 << i36)));
                                                Object obj3 = objArr3[e10];
                                                objArr3[e10] = objArr3[i28];
                                                objArr3[i28] = obj3;
                                                long j24 = jArr5[e10];
                                                jArr5[e10] = jArr5[i28];
                                                jArr5[i28] = j24;
                                                int i39 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                if (i39 != Integer.MAX_VALUE) {
                                                    long j25 = e10;
                                                    jArr6[i39] = (jArr6[i39] & (-4294967296L)) | j25;
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (j25 << 32);
                                                } else {
                                                    long j26 = e10;
                                                    jArr6[i28] = j26 | (j26 << 32);
                                                    i39 = i28;
                                                }
                                                jArr6[e10] = (i39 << 32) | i28;
                                                i28--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i34;
                                            objArr = objArr3;
                                            j15 = j13;
                                        }
                                    } else {
                                        i28++;
                                    }
                                }
                                j10 = j15;
                                this.f33553h = o0.a(this.f33551f) - this.f33552g;
                                long[] jArr7 = this.f33548c;
                                int length2 = jArr7.length;
                                for (int i40 = 0; i40 < length2; i40++) {
                                    long j27 = jArr7[i40];
                                    jArr7[i40] = (((j27 & (-4611686018427387904L)) | (((int) ((j27 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j27 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i41 = this.f33549d;
                                if (i41 != Integer.MAX_VALUE) {
                                    this.f33549d = (int) (jArr6[i41] & 4294967295L);
                                }
                                int i42 = this.f33550e;
                                if (i42 != Integer.MAX_VALUE) {
                                    this.f33550e = (int) (jArr6[i42] & 4294967295L);
                                }
                            }
                            e5 = e(i12);
                        }
                    } else {
                        c10 = 31;
                        j12 = 128;
                    }
                    i = 0;
                    j10 = j15;
                    j11 = 255;
                    int b10 = o0.b(this.f33551f);
                    long[] jArr8 = this.f33546a;
                    Object[] objArr4 = this.f33547b;
                    long[] jArr9 = this.f33548c;
                    int i43 = this.f33551f;
                    int[] iArr = new int[i43];
                    f(b10);
                    long[] jArr10 = this.f33546a;
                    Object[] objArr5 = this.f33547b;
                    long[] jArr11 = this.f33548c;
                    int i44 = this.f33551f;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr8[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < j12) {
                            Object obj4 = objArr4[i45];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i20;
                            int i46 = hashCode3 ^ (hashCode3 << 16);
                            int e11 = e(i46 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j28 = i46 & 127;
                            int i47 = e11 >> 3;
                            int i48 = (e11 & 7) << 3;
                            long j29 = (jArr[i47] & (~(255 << i48))) | (j28 << i48);
                            jArr[i47] = j29;
                            jArr[(((e11 - 7) & i44) + (i44 & 7)) >> 3] = j29;
                            objArr5[e11] = obj4;
                            jArr11[e11] = jArr9[i45];
                            iArr[i45] = e11;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i45++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f33548c;
                    int length3 = jArr12.length;
                    for (int i49 = 0; i49 < length3; i49++) {
                        long j30 = jArr12[i49];
                        jArr12[i49] = (((j30 & (-4611686018427387904L)) | (((int) ((j30 >> c10) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c10) | (((int) (j30 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i50 = this.f33549d;
                    if (i50 != Integer.MAX_VALUE) {
                        this.f33549d = iArr[i50];
                    }
                    int i51 = this.f33550e;
                    if (i51 != Integer.MAX_VALUE) {
                        this.f33550e = iArr[i51];
                    }
                    e5 = e(i12);
                }
                this.f33552g++;
                int i52 = this.f33553h;
                long[] jArr13 = this.f33546a;
                int i53 = e5 >> 3;
                long j31 = jArr13[i53];
                int i54 = (e5 & 7) << 3;
                if (((j31 >> i54) & j11) == j12) {
                    i = 1;
                }
                this.f33553h = i52 - i;
                int i55 = this.f33551f;
                long j32 = (j31 & (~(j11 << i54))) | (j10 << i54);
                jArr13[i53] = j32;
                jArr13[(((e5 - 7) & i55) + (i55 & 7)) >> 3] = j32;
                return e5;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i10 = i20;
        }
    }

    public final int e(int i) {
        int i10 = this.f33551f;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f33546a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.f33552g != this.f33552g) {
            return false;
        }
        Object[] objArr = this.f33547b;
        long[] jArr = this.f33546a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128 && !e0Var.c(objArr[(i << 3) + i11])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void f(int i) {
        long[] jArr;
        long[] jArr2;
        int max = i > 0 ? Math.max(7, o0.c(i)) : 0;
        this.f33551f = max;
        if (max == 0) {
            jArr = o0.f33603a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            x61.l.I(jArr, -9187201950435737472L);
        }
        this.f33546a = jArr;
        int i10 = max >> 3;
        long j10 = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f33553h = o0.a(this.f33551f) - this.f33552g;
        this.f33547b = max == 0 ? y.a.f34141c : new Object[max];
        if (max == 0) {
            jArr2 = s.f33620b;
        } else {
            jArr2 = new long[max];
            x61.l.I(jArr2, 4611686018427387903L);
        }
        this.f33548c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f33551f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f33546a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (i11 * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (k71.k.b(this.f33547b[i], obj)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = i >= 0;
        if (z10) {
            h(i);
        }
        return z10;
    }

    public final void h(int i) {
        this.f33552g--;
        long[] jArr = this.f33546a;
        int i10 = this.f33551f;
        int i11 = i >> 3;
        int i12 = (i & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((i - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.f33547b[i] = null;
        long[] jArr2 = this.f33548c;
        long j11 = jArr2[i];
        int i13 = (int) ((j11 >> 31) & 2147483647L);
        int i14 = (int) (j11 & 2147483647L);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & (-2147483648L)) | (i14 & 2147483647L);
        } else {
            this.f33549d = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((i13 & 2147483647L) << 31) | (jArr2[i14] & (-4611686016279904257L));
        } else {
            this.f33550e = i13;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i = (this.f33551f * 31) + this.f33552g;
        Object[] objArr = this.f33547b;
        long[] jArr = this.f33546a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!k71.k.b(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return i;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return i;
    }

    public final boolean i(Collection collection) {
        k71.k.g(collection, "elements");
        Object[] objArr = this.f33547b;
        int i = this.f33552g;
        long[] jArr = this.f33546a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!x61.m.N(collection, objArr[i13])) {
                                h(i13);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return i != this.f33552g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f33547b;
        long[] jArr = this.f33548c;
        int i = this.f33550e;
        int i10 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i10++;
            i = i11;
        }
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }
}
