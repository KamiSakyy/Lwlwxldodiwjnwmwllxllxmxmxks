package x;

/* loaded from: /home/user/work/p/classes.dex */
public final class w extends l {

    /* renamed from: f, reason: collision with root package name */
    public int f33636f;

    public w(int i) {
        this.f33591a = o0.f33603a;
        this.f33592b = n.f33600a;
        this.f33593c = y.a.f34141c;
        if (i >= 0) {
            f(o0.d(i));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f33595e = 0;
        long[] jArr = this.f33591a;
        if (jArr != o0.f33603a) {
            x61.l.I(jArr, -9187201950435737472L);
            long[] jArr2 = this.f33591a;
            int i = this.f33594d;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        x61.l.G(0, this.f33594d, (Object) null, this.f33593c);
        this.f33636f = o0.a(this.f33594d) - this.f33595e;
    }

    public final int d(int i) {
        long j10;
        long j11;
        int i10;
        long j12;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i11;
        int i12 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f33594d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f33591a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j13 = ((jArr3[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr3[i19] >>> i20);
            long j14 = i15;
            int i22 = i18;
            int i23 = 0;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                int i24 = i12;
                int i25 = i23;
                if (this.f33592b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i12 = i24;
                i23 = i25;
            }
            int i26 = i12;
            int i27 = i23;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int e5 = e(i14);
                long j17 = 255;
                if (this.f33636f != 0 || ((this.f33591a[e5 >> 3] >> ((e5 & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    i10 = 1;
                    j12 = 128;
                } else {
                    int i28 = this.f33594d;
                    if (i28 > 8) {
                        j12 = 128;
                        if (Long.compareUnsigned(this.f33595e * 32, i28 * 25) <= 0) {
                            long[] jArr4 = this.f33591a;
                            int i29 = this.f33594d;
                            int[] iArr2 = this.f33592b;
                            Object[] objArr2 = this.f33593c;
                            int i30 = (i29 + 7) >> 3;
                            int i31 = i27;
                            while (i31 < i30) {
                                long j18 = j17;
                                long j19 = jArr4[i31] & (-9187201950435737472L);
                                jArr4[i31] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i31++;
                                j14 = j14;
                                j17 = j18;
                            }
                            j10 = j17;
                            j11 = j14;
                            int O = x61.l.O(jArr4);
                            int i32 = O - 1;
                            long j20 = 72057594037927935L;
                            jArr4[i32] = (jArr4[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[O] = jArr4[i27];
                            int i33 = i27;
                            while (i33 != i29) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j21 = (jArr4[i34] >> i35) & j10;
                                if (j21 != 128 && j21 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i33]) * i26;
                                    int i36 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e10 = e(i36);
                                    int i37 = i36 & i29;
                                    if (((e10 - i37) & i29) / 8 == ((i33 - i37) & i29) / 8) {
                                        long j22 = j20;
                                        jArr4[i34] = ((r8 & 127) << i35) | ((~(j10 << i35)) & jArr4[i34]);
                                        jArr4[jArr4.length - i21] = (jArr4[i27] & j22) | Long.MIN_VALUE;
                                        i33++;
                                        j20 = j22;
                                    } else {
                                        long j23 = j20;
                                        int i38 = e10 >> 3;
                                        long j24 = jArr4[i38];
                                        int i39 = (e10 & 7) << 3;
                                        if (((j24 >> i39) & j10) == 128) {
                                            i11 = i21;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i38] = ((~(j10 << i39)) & j24) | ((r8 & 127) << i39);
                                            jArr4[i34] = (jArr4[i34] & (~(j10 << i35))) | (128 << i35);
                                            iArr[e10] = iArr[i33];
                                            iArr[i33] = i27;
                                            objArr[e10] = objArr[i33];
                                            objArr[i33] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i11 = i21;
                                            jArr4[i38] = ((r8 & 127) << i39) | ((~(j10 << i39)) & j24);
                                            int i40 = iArr[e10];
                                            iArr[e10] = iArr[i33];
                                            iArr[i33] = i40;
                                            Object obj = objArr[e10];
                                            objArr[e10] = objArr[i33];
                                            objArr[i33] = obj;
                                            i33--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i27] & j23) | Long.MIN_VALUE;
                                        i33++;
                                        j20 = j23;
                                        i21 = i11;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i33++;
                                }
                            }
                            i10 = i21;
                            this.f33636f = o0.a(this.f33594d) - this.f33595e;
                            e5 = e(i14);
                        }
                    } else {
                        j12 = 128;
                    }
                    j10 = 255;
                    j11 = j14;
                    i10 = 1;
                    int b10 = o0.b(this.f33594d);
                    long[] jArr5 = this.f33591a;
                    int[] iArr3 = this.f33592b;
                    Object[] objArr3 = this.f33593c;
                    int i41 = this.f33594d;
                    f(b10);
                    long[] jArr6 = this.f33591a;
                    int[] iArr4 = this.f33592b;
                    Object[] objArr4 = this.f33593c;
                    int i42 = this.f33594d;
                    int i43 = i27;
                    while (i43 < i41) {
                        if (((jArr5[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < j12) {
                            int i44 = iArr3[i43];
                            int hashCode3 = Integer.hashCode(i44) * i26;
                            int i45 = hashCode3 ^ (hashCode3 << 16);
                            int e11 = e(i45 >>> 7);
                            long j25 = i45 & 127;
                            int i46 = e11 >> 3;
                            int i47 = (e11 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j26 = (jArr6[i46] & (~(255 << i47))) | (j25 << i47);
                            jArr[i46] = j26;
                            jArr[(((e11 - 7) & i42) + (i42 & 7)) >> 3] = j26;
                            iArr4[e11] = i44;
                            objArr4[e11] = objArr3[i43];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i43++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e5 = e(i14);
                }
                this.f33595e++;
                int i48 = this.f33636f;
                long[] jArr7 = this.f33591a;
                int i49 = e5 >> 3;
                long j27 = jArr7[i49];
                int i50 = (e5 & 7) << 3;
                if (((j27 >> i50) & j10) != j12) {
                    i10 = i27;
                }
                this.f33636f = i48 - i10;
                int i51 = this.f33594d;
                long j28 = (j27 & (~(j10 << i50))) | (j11 << i50);
                jArr7[i49] = j28;
                jArr7[(((e5 - 7) & i51) + (i51 & 7)) >> 3] = j28;
                return e5;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i26;
        }
    }

    public final int e(int i) {
        int i10 = this.f33594d;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f33591a;
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

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, o0.c(i)) : 0;
        this.f33594d = max;
        if (max == 0) {
            jArr = o0.f33603a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            x61.l.I(jArr, -9187201950435737472L);
        }
        this.f33591a = jArr;
        int i10 = max >> 3;
        long j10 = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f33636f = o0.a(this.f33594d) - this.f33595e;
        this.f33592b = new int[max];
        this.f33593c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i) {
        int i10;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f33594d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f33591a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f33592b[i10] == i) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (i10 >= 0) {
            return h(i10);
        }
        return null;
    }

    public final Object h(int i) {
        this.f33595e--;
        long[] jArr = this.f33591a;
        int i10 = this.f33594d;
        int i11 = i >> 3;
        int i12 = (i & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((i - 7) & i10) + (i10 & 7)) >> 3] = j10;
        Object[] objArr = this.f33593c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void i(int i, Object obj) {
        int d10 = d(i);
        this.f33592b[d10] = i;
        this.f33593c[d10] = obj;
    }

    public /* synthetic */ w() {
        this(6);
    }
}
