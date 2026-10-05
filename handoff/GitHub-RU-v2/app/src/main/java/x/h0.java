package x;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f33569a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f33570b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f33571c;

    /* renamed from: d, reason: collision with root package name */
    public int f33572d;

    /* renamed from: e, reason: collision with root package name */
    public int f33573e;

    /* renamed from: f, reason: collision with root package name */
    public int f33574f;

    public h0(int i) {
        this.f33569a = o0.f33603a;
        Object[] objArr = y.a.f34141c;
        this.f33570b = objArr;
        this.f33571c = objArr;
        if (i >= 0) {
            h(o0.d(i));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f33573e = 0;
        long[] jArr = this.f33569a;
        if (jArr != o0.f33603a) {
            x61.l.I(jArr, -9187201950435737472L);
            long[] jArr2 = this.f33569a;
            int i = this.f33572d;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        x61.l.G(0, this.f33572d, (Object) null, this.f33571c);
        x61.l.G(0, this.f33572d, (Object) null, this.f33570b);
        this.f33574f = o0.a(this.f33572d) - this.f33573e;
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
    public final boolean b(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f33572d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f33569a;
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
                if (k71.k.b(this.f33570b[i], obj)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i >= 0;
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
        int i12 = this.f33572d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f33569a;
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
                if (k71.k.b(this.f33570b[i], obj)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i >= 0;
    }

    public final boolean d(Object obj) {
        Object[] objArr = this.f33571c;
        long[] jArr = this.f33569a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128 && k71.k.b(obj, objArr[(i << 3) + i11])) {
                            return true;
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
        return false;
    }

    public final int e(int i) {
        int i10 = this.f33572d;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f33569a;
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
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (h0Var.f33573e != this.f33573e) {
            return false;
        }
        Object[] objArr = this.f33570b;
        Object[] objArr2 = this.f33571c;
        long[] jArr = this.f33569a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            int i12 = (i << 3) + i11;
                            Object obj2 = objArr[i12];
                            Object obj3 = objArr2[i12];
                            if (obj3 == null) {
                                if (h0Var.g(obj2) != null || !h0Var.c(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(h0Var.g(obj2))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int f(Object obj) {
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i10 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f33572d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f33569a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j13 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j14 = i13;
            int i19 = i13;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int numberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j16) >> 3)) & i14;
                int i20 = i10;
                if (k71.k.b(this.f33570b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int e5 = e(i12);
                long j17 = 255;
                if (this.f33574f != 0 || ((this.f33569a[e5 >> 3] >> ((e5 & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i22 = this.f33572d;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compareUnsigned(this.f33573e * 32, i22 * 25) <= 0) {
                            long[] jArr4 = this.f33569a;
                            int i24 = this.f33572d;
                            Object[] objArr2 = this.f33570b;
                            Object[] objArr3 = this.f33571c;
                            j12 = 128;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
                            while (i26 < i25) {
                                long j18 = j17;
                                long j19 = jArr4[i26] & (-9187201950435737472L);
                                jArr4[i26] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i26++;
                                i23 = i23;
                                j14 = j14;
                                j17 = j18;
                            }
                            j10 = j17;
                            j11 = j14;
                            int i27 = i23;
                            int O = x61.l.O(jArr4);
                            int i28 = O - 1;
                            jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[O] = jArr4[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j20 = (jArr4[i30] >> i31) & j10;
                                if (j20 != 128 && j20 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e10 = e(i32);
                                    int i33 = i32 & i24;
                                    if (((e10 - i33) & i24) / i27 == ((i29 - i33) & i24) / i27) {
                                        jArr4[i30] = ((r8 & 127) << i31) | (jArr4[i30] & (~(j10 << i31)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i29++;
                                        i27 = i27;
                                    } else {
                                        int i34 = i27;
                                        int i35 = e10 >> 3;
                                        long j21 = jArr4[i35];
                                        int i36 = (e10 & 7) << 3;
                                        if (((j21 >> i36) & j10) == 128) {
                                            i = i24;
                                            objArr = objArr2;
                                            jArr4[i35] = ((~(j10 << i36)) & j21) | ((r8 & 127) << i36);
                                            jArr4[i30] = (jArr4[i30] & (~(j10 << i31))) | (128 << i31);
                                            objArr[e10] = objArr[i29];
                                            objArr[i29] = null;
                                            objArr3[e10] = objArr3[i29];
                                            objArr3[i29] = null;
                                        } else {
                                            i = i24;
                                            objArr = objArr2;
                                            jArr4[i35] = ((r8 & 127) << i36) | ((~(j10 << i36)) & j21);
                                            Object obj3 = objArr[e10];
                                            objArr[e10] = objArr[i29];
                                            objArr[i29] = obj3;
                                            Object obj4 = objArr3[e10];
                                            objArr3[e10] = objArr3[i29];
                                            objArr3[i29] = obj4;
                                            i29--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i29++;
                                        i27 = i34;
                                        i24 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f33574f = o0.a(this.f33572d) - this.f33573e;
                            e5 = e(i12);
                        }
                    }
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                    int b10 = o0.b(this.f33572d);
                    long[] jArr5 = this.f33569a;
                    Object[] objArr4 = this.f33570b;
                    Object[] objArr5 = this.f33571c;
                    int i37 = this.f33572d;
                    h(b10);
                    long[] jArr6 = this.f33569a;
                    Object[] objArr6 = this.f33570b;
                    Object[] objArr7 = this.f33571c;
                    int i38 = this.f33572d;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i39];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i21;
                            int i40 = hashCode3 ^ (hashCode3 << 16);
                            int e11 = e(i40 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j22 = i40 & 127;
                            int i41 = e11 >> 3;
                            int i42 = (e11 & 7) << 3;
                            long j23 = (jArr[i41] & (~(255 << i42))) | (j22 << i42);
                            jArr[i41] = j23;
                            jArr[(((e11 - 7) & i38) + (i38 & 7)) >> 3] = j23;
                            objArr6[e11] = obj5;
                            objArr7[e11] = objArr5[i39];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i39++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e5 = e(i12);
                }
                this.f33573e++;
                int i43 = this.f33574f;
                long[] jArr7 = this.f33569a;
                int i44 = e5 >> 3;
                long j24 = jArr7[i44];
                int i45 = (e5 & 7) << 3;
                this.f33574f = i43 - (((j24 >> i45) & j10) == j12 ? 1 : 0);
                int i46 = this.f33572d;
                long j25 = (j24 & (~(j10 << i45))) | (j11 << i45);
                jArr7[i44] = j25;
                jArr7[(((e5 - 7) & i46) + (i46 & 7)) >> 3] = j25;
                return ~e5;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        int i;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f33572d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f33569a;
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
                if (k71.k.b(this.f33570b[i], obj)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (i >= 0) {
            return this.f33571c[i];
        }
        return null;
    }

    public final void h(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, o0.c(i)) : 0;
        this.f33572d = max;
        if (max == 0) {
            jArr = o0.f33603a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            x61.l.I(jArr, -9187201950435737472L);
            int i10 = max >> 3;
            long j10 = 255 << ((max & 7) << 3);
            jArr[i10] = (jArr[i10] & (~j10)) | j10;
        }
        this.f33569a = jArr;
        this.f33574f = o0.a(this.f33572d) - this.f33573e;
        Object[] objArr = y.a.f34141c;
        this.f33570b = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.f33571c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f33570b;
        Object[] objArr2 = this.f33571c;
        long[] jArr = this.f33569a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i10 = 0;
        while (true) {
            long j10 = jArr[i];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        i10 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return i10;
                }
            }
            if (i == length) {
                return i10;
            }
            i++;
        }
    }

    public final boolean i() {
        return this.f33573e == 0;
    }

    public final boolean j() {
        return this.f33573e != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int i;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f33572d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f33569a;
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
                if (k71.k.b(this.f33570b[i], obj)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (i >= 0) {
            return l(i);
        }
        return null;
    }

    public final Object l(int i) {
        this.f33573e--;
        long[] jArr = this.f33569a;
        int i10 = this.f33572d;
        int i11 = i >> 3;
        int i12 = (i & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((i - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.f33570b[i] = null;
        Object[] objArr = this.f33571c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int f6 = f(obj);
        if (f6 < 0) {
            f6 = ~f6;
        }
        this.f33570b[f6] = obj;
        this.f33571c[f6] = obj2;
    }

    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f33570b;
        Object[] objArr2 = this.f33571c;
        long[] jArr = this.f33569a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i10 = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i10++;
                            if (i10 < this.f33573e) {
                                sb2.append(", ");
                            }
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
        sb2.append('}');
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ h0() {
        this(6);
    }
}
