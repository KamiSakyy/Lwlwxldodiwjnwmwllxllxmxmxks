package x;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f33575a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f33576b;

    /* renamed from: c, reason: collision with root package name */
    public int f33577c;

    /* renamed from: d, reason: collision with root package name */
    public int f33578d;

    /* renamed from: e, reason: collision with root package name */
    public int f33579e;

    public i0(int i) {
        this.f33575a = o0.f33603a;
        this.f33576b = y.a.f34141c;
        if (i >= 0) {
            f(o0.d(i));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.f33578d;
        this.f33576b[d(obj)] = obj;
        return this.f33578d != i;
    }

    public final void b() {
        this.f33578d = 0;
        long[] jArr = this.f33575a;
        if (jArr != o0.f33603a) {
            x61.l.I(jArr, -9187201950435737472L);
            long[] jArr2 = this.f33575a;
            int i = this.f33577c;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        x61.l.G(0, this.f33577c, (Object) null, this.f33576b);
        this.f33579e = o0.a(this.f33577c) - this.f33578d;
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
        int i12 = this.f33577c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f33575a;
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
                if (k71.k.b(this.f33576b[i], obj)) {
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
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i10;
        int i11 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f33577c;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f33575a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j14 = i14;
            int i20 = i14;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int numberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j16) >> 3)) & i15;
                int i21 = i11;
                if (k71.k.b(this.f33576b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int e5 = e(i13);
                long j17 = 255;
                if (this.f33579e != 0 || ((this.f33575a[e5 >> 3] >> ((e5 & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i23 = this.f33577c;
                    if (i23 > 8) {
                        int i24 = 8;
                        if (Long.compareUnsigned(this.f33578d * 32, i23 * 25) <= 0) {
                            long[] jArr4 = this.f33575a;
                            int i25 = this.f33577c;
                            Object[] objArr2 = this.f33576b;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            j12 = 128;
                            while (i27 < i26) {
                                long j18 = j17;
                                long j19 = jArr4[i27] & (-9187201950435737472L);
                                jArr4[i27] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i27++;
                                i24 = i24;
                                j14 = j14;
                                j17 = j18;
                            }
                            j10 = j17;
                            j11 = j14;
                            int i28 = i24;
                            int O = x61.l.O(jArr4);
                            int i29 = O - 1;
                            long j20 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[O] = jArr4[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j21 = (jArr4[i31] >> i32) & j10;
                                if (j21 != 128 && j21 == 254) {
                                    Object obj2 = objArr2[i30];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i22;
                                    int i33 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e10 = e(i33);
                                    int i34 = i33 & i25;
                                    if (((e10 - i34) & i25) / i28 == ((i30 - i34) & i25) / i28) {
                                        long j22 = j20;
                                        jArr4[i31] = ((r7 & 127) << i32) | ((~(j10 << i32)) & jArr4[i31]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i30++;
                                        j20 = j22;
                                    } else {
                                        long j23 = j20;
                                        int i35 = e10 >> 3;
                                        long j24 = jArr4[i35];
                                        int i36 = (e10 & 7) << 3;
                                        if (((j24 >> i36) & j10) == 128) {
                                            i10 = i28;
                                            i = i25;
                                            objArr = objArr2;
                                            jArr4[i35] = ((~(j10 << i36)) & j24) | ((r7 & 127) << i36);
                                            jArr4[i31] = (jArr4[i31] & (~(j10 << i32))) | (128 << i32);
                                            objArr[e10] = objArr[i30];
                                            objArr[i30] = null;
                                        } else {
                                            i = i25;
                                            objArr = objArr2;
                                            i10 = i28;
                                            jArr4[i35] = ((r7 & 127) << i36) | ((~(j10 << i36)) & j24);
                                            Object obj3 = objArr[e10];
                                            objArr[e10] = objArr[i30];
                                            objArr[i30] = obj3;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j23) | Long.MIN_VALUE;
                                        i30++;
                                        j20 = j23;
                                        i28 = i10;
                                        i25 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f33579e = o0.a(this.f33577c) - this.f33578d;
                            e5 = e(i13);
                        }
                    }
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                    int b10 = o0.b(this.f33577c);
                    long[] jArr5 = this.f33575a;
                    Object[] objArr3 = this.f33576b;
                    int i37 = this.f33577c;
                    f(b10);
                    long[] jArr6 = this.f33575a;
                    Object[] objArr4 = this.f33576b;
                    int i38 = this.f33577c;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i39];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i22;
                            int i40 = hashCode3 ^ (hashCode3 << 16);
                            int e11 = e(i40 >>> 7);
                            long j25 = i40 & 127;
                            int i41 = e11 >> 3;
                            int i42 = (e11 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j26 = (jArr6[i41] & (~(255 << i42))) | (j25 << i42);
                            jArr[i41] = j26;
                            jArr[(((e11 - 7) & i38) + (i38 & 7)) >> 3] = j26;
                            objArr4[e11] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i39++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e5 = e(i13);
                }
                this.f33578d++;
                int i43 = this.f33579e;
                long[] jArr7 = this.f33575a;
                int i44 = e5 >> 3;
                long j27 = jArr7[i44];
                int i45 = (e5 & 7) << 3;
                this.f33579e = i43 - (((j27 >> i45) & j10) == j12 ? 1 : 0);
                int i46 = this.f33577c;
                long j28 = (j27 & (~(j10 << i45))) | (j11 << i45);
                jArr7[i44] = j28;
                jArr7[(((e5 - 7) & i46) + (i46 & 7)) >> 3] = j28;
                return e5;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = i22;
        }
    }

    public final int e(int i) {
        int i10 = this.f33577c;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f33575a;
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
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (i0Var.f33578d != this.f33578d) {
            return false;
        }
        Object[] objArr = this.f33576b;
        long[] jArr = this.f33575a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128 && !i0Var.c(objArr[(i << 3) + i11])) {
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
        int max = i > 0 ? Math.max(7, o0.c(i)) : 0;
        this.f33577c = max;
        if (max == 0) {
            jArr = o0.f33603a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            x61.l.I(jArr, -9187201950435737472L);
        }
        this.f33575a = jArr;
        int i10 = max >> 3;
        long j10 = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f33579e = o0.a(this.f33577c) - this.f33578d;
        this.f33576b = max == 0 ? y.a.f34141c : new Object[max];
    }

    public final boolean g() {
        return this.f33578d == 0;
    }

    public final boolean h() {
        return this.f33578d != 0;
    }

    public final int hashCode() {
        int i = (this.f33577c * 31) + this.f33578d;
        Object[] objArr = this.f33576b;
        long[] jArr = this.f33575a;
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj) {
        int i;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f33577c;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f33575a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (k71.k.b(this.f33576b[i], obj)) {
                    break loop0;
                } else {
                    j12 &= j12 - 1;
                }
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (i >= 0) {
            m(i);
        }
    }

    public final void j(Object obj) {
        this.f33576b[d(obj)] = obj;
    }

    public final void k(i0 i0Var) {
        k71.k.g(i0Var, "elements");
        Object[] objArr = i0Var.f33576b;
        long[] jArr = i0Var.f33575a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j10 = jArr[i];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j10) < 128) {
                        j(objArr[(i << 3) + i11]);
                    }
                    j10 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
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
    public final boolean l(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f33577c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f33575a;
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
                if (k71.k.b(this.f33576b[i], obj)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = i >= 0;
        if (z10) {
            m(i);
        }
        return z10;
    }

    public final void m(int i) {
        this.f33578d--;
        long[] jArr = this.f33575a;
        int i10 = this.f33577c;
        int i11 = i >> 3;
        int i12 = (i & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((i - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.f33576b[i] = null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f33576b;
        long[] jArr = this.f33575a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i10 = 0;
            loop0: while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i10++;
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb2.append((CharSequence) "]");
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ i0() {
        this(6);
    }
}
