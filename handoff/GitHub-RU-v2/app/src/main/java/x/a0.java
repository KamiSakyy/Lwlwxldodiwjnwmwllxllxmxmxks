package x;

/* loaded from: /home/user/work/p/classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f33517a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f33518b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f33519c;

    /* renamed from: d, reason: collision with root package name */
    public int f33520d;

    /* renamed from: e, reason: collision with root package name */
    public int f33521e;

    /* renamed from: f, reason: collision with root package name */
    public int f33522f;

    public a0(int i) {
        this.f33517a = o0.f33603a;
        this.f33518b = q.f33607a;
        this.f33519c = y.a.f34141c;
        if (i >= 0) {
            f(o0.d(i));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f33521e = 0;
        long[] jArr = this.f33517a;
        if (jArr != o0.f33603a) {
            x61.l.I(jArr, -9187201950435737472L);
            long[] jArr2 = this.f33517a;
            int i = this.f33520d;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        x61.l.G(0, this.f33520d, (Object) null, this.f33519c);
        this.f33522f = o0.a(this.f33520d) - this.f33521e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(long j10) {
        int i;
        int hashCode = Long.hashCode(j10) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f33520d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f33517a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (i11 * 72340172838076673L) ^ j11;
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f33518b[i] == j10) {
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i >= 0;
    }

    public final int c(long j10) {
        long j11;
        long j12;
        int i;
        int i10;
        long j13;
        long[] jArr;
        long[] jArr2;
        long j14;
        Object[] objArr;
        int i11;
        long[] jArr3;
        int i12 = -862048943;
        int hashCode = Long.hashCode(j10) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f33520d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr4 = this.f33517a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j15 = ((jArr4[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr4[i19] >>> i20);
            long j16 = i15;
            int i22 = i18;
            int i23 = 0;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L);
            while (j18 != 0) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j18) >> 3)) & i16;
                int i24 = i12;
                if (this.f33518b[numberOfTrailingZeros] == j10) {
                    return numberOfTrailingZeros;
                }
                j18 &= j18 - 1;
                i12 = i24;
            }
            int i25 = i12;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int d10 = d(i14);
                if (this.f33522f != 0 || ((this.f33517a[d10 >> 3] >> ((d10 & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = j16;
                    i = 0;
                    i10 = 1;
                    j13 = 128;
                } else {
                    int i26 = this.f33520d;
                    if (i26 > 8) {
                        j13 = 128;
                        if (Long.compareUnsigned(this.f33521e * 32, i26 * 25) <= 0) {
                            long[] jArr5 = this.f33517a;
                            int i27 = this.f33520d;
                            long[] jArr6 = this.f33518b;
                            Object[] objArr2 = this.f33519c;
                            int i28 = (i27 + 7) >> 3;
                            j11 = 255;
                            int i29 = 0;
                            while (i29 < i28) {
                                long j19 = jArr5[i29] & (-9187201950435737472L);
                                jArr5[i29] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i29++;
                                i21 = i21;
                                i23 = i23;
                                j16 = j16;
                            }
                            j12 = j16;
                            i = i23;
                            int i30 = i21;
                            char c10 = 7;
                            int O = x61.l.O(jArr5);
                            int i31 = O - 1;
                            long j20 = 72057594037927935L;
                            jArr5[i31] = (jArr5[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[O] = jArr5[i];
                            int i32 = i;
                            while (i32 != i27) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j21 = (jArr5[i33] >> i34) & 255;
                                if (j21 != 128 && j21 == 254) {
                                    int hashCode2 = Long.hashCode(jArr6[i32]) * i25;
                                    int i35 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int d11 = d(i35);
                                    int i36 = i35 & i27;
                                    char c11 = c10;
                                    if (((d11 - i36) & i27) / 8 == ((i32 - i36) & i27) / 8) {
                                        int i37 = i30;
                                        j14 = j20;
                                        jArr5[i33] = ((r9 & 127) << i34) | (jArr5[i33] & (~(255 << i34)));
                                        jArr5[jArr5.length - i37] = (jArr5[i] & j14) | Long.MIN_VALUE;
                                        i32++;
                                        i30 = i37;
                                        c10 = c11;
                                    } else {
                                        int i38 = i30;
                                        j14 = j20;
                                        int i39 = d11 >> 3;
                                        long j22 = jArr5[i39];
                                        int i40 = (d11 & 7) << 3;
                                        if (((j22 >> i40) & 255) == 128) {
                                            i11 = i38;
                                            jArr3 = jArr6;
                                            objArr = objArr2;
                                            jArr5[i39] = (j22 & (~(255 << i40))) | ((r9 & 127) << i40);
                                            jArr5[i33] = (jArr5[i33] & (~(255 << i34))) | (128 << i34);
                                            jArr3[d11] = jArr3[i32];
                                            jArr3[i32] = 0;
                                            objArr[d11] = objArr[i32];
                                            objArr[i32] = null;
                                        } else {
                                            objArr = objArr2;
                                            i11 = i38;
                                            jArr3 = jArr6;
                                            jArr5[i39] = ((r9 & 127) << i40) | (j22 & (~(255 << i40)));
                                            long j23 = jArr3[d11];
                                            jArr3[d11] = jArr3[i32];
                                            jArr3[i32] = j23;
                                            Object obj = objArr[d11];
                                            objArr[d11] = objArr[i32];
                                            objArr[i32] = obj;
                                            i32--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[i] & j14) | Long.MIN_VALUE;
                                        i32++;
                                        jArr6 = jArr3;
                                        i30 = i11;
                                        c10 = c11;
                                        objArr2 = objArr;
                                    }
                                    j20 = j14;
                                } else {
                                    i32++;
                                }
                            }
                            i10 = i30;
                            this.f33522f = o0.a(this.f33520d) - this.f33521e;
                            d10 = d(i14);
                        }
                    } else {
                        j13 = 128;
                    }
                    j11 = 255;
                    j12 = j16;
                    i = 0;
                    i10 = 1;
                    int b10 = o0.b(this.f33520d);
                    long[] jArr7 = this.f33517a;
                    long[] jArr8 = this.f33518b;
                    Object[] objArr3 = this.f33519c;
                    int i41 = this.f33520d;
                    f(b10);
                    long[] jArr9 = this.f33517a;
                    long[] jArr10 = this.f33518b;
                    Object[] objArr4 = this.f33519c;
                    int i42 = this.f33520d;
                    int i43 = 0;
                    while (i43 < i41) {
                        if (((jArr7[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < j13) {
                            long j24 = jArr8[i43];
                            int hashCode3 = Long.hashCode(j24) * i25;
                            int i44 = hashCode3 ^ (hashCode3 << 16);
                            int d12 = d(i44 >>> 7);
                            jArr = jArr9;
                            jArr2 = jArr7;
                            long j25 = i44 & 127;
                            int i45 = d12 >> 3;
                            int i46 = (d12 & 7) << 3;
                            long j26 = (jArr[i45] & (~(255 << i46))) | (j25 << i46);
                            jArr[i45] = j26;
                            jArr[(((d12 - 7) & i42) + (i42 & 7)) >> 3] = j26;
                            jArr10[d12] = j24;
                            objArr4[d12] = objArr3[i43];
                        } else {
                            jArr = jArr9;
                            jArr2 = jArr7;
                        }
                        i43++;
                        jArr7 = jArr2;
                        jArr9 = jArr;
                    }
                    d10 = d(i14);
                }
                this.f33521e++;
                int i47 = this.f33522f;
                long[] jArr11 = this.f33517a;
                int i48 = d10 >> 3;
                long j27 = jArr11[i48];
                int i49 = (d10 & 7) << 3;
                if (((j27 >> i49) & j11) != j13) {
                    i10 = i;
                }
                this.f33522f = i47 - i10;
                int i50 = this.f33520d;
                long j28 = (j27 & (~(j11 << i49))) | (j12 << i49);
                jArr11[i48] = j28;
                jArr11[(((d10 - 7) & i50) + (i50 & 7)) >> 3] = j28;
                return d10;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i25;
        }
    }

    public final int d(int i) {
        int i10 = this.f33520d;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f33517a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j10) {
        int i;
        int hashCode = Long.hashCode(j10) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f33520d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f33517a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (i11 * 72340172838076673L) ^ j11;
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f33518b[i] == j10) {
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (i >= 0) {
            return this.f33519c[i];
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        long[] jArr;
        boolean z11;
        long[] jArr2;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (a0Var.f33521e != this.f33521e) {
            return false;
        }
        long[] jArr3 = this.f33518b;
        Object[] objArr = this.f33519c;
        long[] jArr4 = this.f33517a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j10 = jArr4[i];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j10) < 128) {
                        int i12 = (i << 3) + i11;
                        z11 = z12;
                        jArr2 = jArr3;
                        long j11 = jArr2[i12];
                        Object obj2 = objArr[i12];
                        if (obj2 == null) {
                            if (a0Var.e(j11) != null || !a0Var.b(j11)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(a0Var.e(j11))) {
                            return false;
                        }
                    } else {
                        z11 = z12;
                        jArr2 = jArr3;
                    }
                    j10 >>= 8;
                    i11++;
                    z12 = z11;
                    jArr3 = jArr2;
                }
                z10 = z12;
                jArr = jArr3;
                if (i10 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
                jArr = jArr3;
            }
            if (i == length) {
                return z10;
            }
            i++;
            z12 = z10;
            jArr3 = jArr;
        }
    }

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, o0.c(i)) : 0;
        this.f33520d = max;
        if (max == 0) {
            jArr = o0.f33603a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            x61.l.I(jArr, -9187201950435737472L);
        }
        this.f33517a = jArr;
        int i10 = max >> 3;
        long j10 = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f33522f = o0.a(this.f33520d) - this.f33521e;
        this.f33518b = new long[max];
        this.f33519c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j10) {
        int i;
        int hashCode = Long.hashCode(j10) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f33520d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f33517a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (i11 * 72340172838076673L) ^ j11;
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f33518b[i] == j10) {
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (i < 0) {
            return null;
        }
        this.f33521e--;
        long[] jArr2 = this.f33517a;
        int i17 = this.f33520d;
        int i18 = i >> 3;
        int i19 = (i & 7) << 3;
        long j14 = (jArr2[i18] & (~(255 << i19))) | (254 << i19);
        jArr2[i18] = j14;
        jArr2[(((i - 7) & i17) + (i17 & 7)) >> 3] = j14;
        Object[] objArr = this.f33519c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void h(long j10, Object obj) {
        int c10 = c(j10);
        this.f33518b[c10] = j10;
        this.f33519c[c10] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f33518b;
        Object[] objArr = this.f33519c;
        long[] jArr2 = this.f33517a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i << 3) + i12;
                        long j11 = jArr[i13];
                        Object obj = objArr[i13];
                        i10 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j11);
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

    public final String toString() {
        int i;
        int i10;
        if (this.f33521e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f33518b;
        Object[] objArr = this.f33519c;
        long[] jArr2 = this.f33517a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            i10 = i11;
                            long j11 = jArr[i15];
                            Object obj = objArr[i15];
                            sb2.append(j11);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i12++;
                            if (i12 < this.f33521e) {
                                sb2.append(", ");
                            }
                        } else {
                            i10 = i11;
                        }
                        j10 >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i16 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i = i16;
                } else {
                    i = i11;
                }
                if (i == length) {
                    break;
                }
                i11 = i + 1;
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ a0() {
        this(6);
    }
}
