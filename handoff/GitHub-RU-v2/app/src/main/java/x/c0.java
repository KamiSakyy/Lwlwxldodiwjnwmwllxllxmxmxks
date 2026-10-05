package x;

/* loaded from: /home/user/work/p/classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f33533a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f33534b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f33535c;

    /* renamed from: d, reason: collision with root package name */
    public int f33536d;

    /* renamed from: e, reason: collision with root package name */
    public int f33537e;

    /* renamed from: f, reason: collision with root package name */
    public int f33538f;

    public c0(int i) {
        this.f33533a = o0.f33603a;
        this.f33534b = y.a.f34141c;
        this.f33535c = n.f33600a;
        if (i >= 0) {
            f(o0.d(i));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f33537e = 0;
        long[] jArr = this.f33533a;
        if (jArr != o0.f33603a) {
            x61.l.I(jArr, -9187201950435737472L);
            long[] jArr2 = this.f33533a;
            int i = this.f33536d;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        x61.l.G(0, this.f33536d, (Object) null, this.f33534b);
        this.f33538f = o0.a(this.f33536d) - this.f33537e;
    }

    public final int b(int i) {
        int i10 = this.f33536d;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f33533a;
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

    public final int c(Object obj) {
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
        int i14 = this.f33536d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f33533a;
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
                if (k71.k.b(this.f33534b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int b10 = b(i12);
                long j17 = 255;
                if (this.f33538f != 0 || ((this.f33533a[b10 >> 3] >> ((b10 & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i22 = this.f33536d;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compareUnsigned(this.f33537e * 32, i22 * 25) <= 0) {
                            long[] jArr4 = this.f33533a;
                            int i24 = this.f33536d;
                            Object[] objArr2 = this.f33534b;
                            int[] iArr = this.f33535c;
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
                            long j20 = 72057594037927935L;
                            jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[O] = jArr4[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j21 = (jArr4[i30] >> i31) & j10;
                                if (j21 != 128 && j21 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int b11 = b(i32);
                                    int i33 = i32 & i24;
                                    long j22 = j20;
                                    if (((b11 - i33) & i24) / 8 == ((i29 - i33) & i24) / i27) {
                                        jArr4[i30] = ((r8 & 127) << i31) | (jArr4[i30] & (~(j10 << i31)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i29++;
                                        i27 = i27;
                                        j20 = j22;
                                    } else {
                                        int i34 = i27;
                                        int i35 = b11 >> 3;
                                        long j23 = jArr4[i35];
                                        int i36 = (b11 & 7) << 3;
                                        if (((j23 >> i36) & j10) == 128) {
                                            i = i24;
                                            objArr = objArr2;
                                            jArr4[i35] = ((~(j10 << i36)) & j23) | ((r8 & 127) << i36);
                                            jArr4[i30] = (jArr4[i30] & (~(j10 << i31))) | (128 << i31);
                                            objArr[b11] = objArr[i29];
                                            objArr[i29] = null;
                                            iArr[b11] = iArr[i29];
                                            iArr[i29] = 0;
                                        } else {
                                            i = i24;
                                            objArr = objArr2;
                                            jArr4[i35] = ((r8 & 127) << i36) | ((~(j10 << i36)) & j23);
                                            Object obj3 = objArr[b11];
                                            objArr[b11] = objArr[i29];
                                            objArr[i29] = obj3;
                                            int i37 = iArr[b11];
                                            iArr[b11] = iArr[i29];
                                            iArr[i29] = i37;
                                            i29--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i29++;
                                        i24 = i;
                                        i27 = i34;
                                        j20 = j22;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f33538f = o0.a(this.f33536d) - this.f33537e;
                            b10 = b(i12);
                        }
                    }
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                    int b12 = o0.b(this.f33536d);
                    long[] jArr5 = this.f33533a;
                    Object[] objArr3 = this.f33534b;
                    int[] iArr2 = this.f33535c;
                    int i38 = this.f33536d;
                    f(b12);
                    long[] jArr6 = this.f33533a;
                    Object[] objArr4 = this.f33534b;
                    int[] iArr3 = this.f33535c;
                    int i39 = this.f33536d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i40];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i41 = hashCode3 ^ (hashCode3 << 16);
                            int b13 = b(i41 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j24 = i41 & 127;
                            int i42 = b13 >> 3;
                            int i43 = (b13 & 7) << 3;
                            long j25 = (jArr[i42] & (~(255 << i43))) | (j24 << i43);
                            jArr[i42] = j25;
                            jArr[(((b13 - 7) & i39) + (i39 & 7)) >> 3] = j25;
                            objArr4[b13] = obj4;
                            iArr3[b13] = iArr2[i40];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    b10 = b(i12);
                }
                this.f33537e++;
                int i44 = this.f33538f;
                long[] jArr7 = this.f33533a;
                int i45 = b10 >> 3;
                long j26 = jArr7[i45];
                int i46 = (b10 & 7) << 3;
                this.f33538f = i44 - (((j26 >> i46) & j10) == j12 ? 1 : 0);
                int i47 = this.f33536d;
                long j27 = (j26 & (~(j10 << i46))) | (j11 << i46);
                jArr7[i45] = j27;
                jArr7[(((b10 - 7) & i47) + (i47 & 7)) >> 3] = j27;
                return ~b10;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    public final int d(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f33536d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f33533a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (i11 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i12;
                if (k71.k.b(this.f33534b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i13 = i14 + i;
        }
    }

    public final int e(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f33535c[d10];
        }
        y.a.e("There is no key " + obj + " in the map");
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.f33537e != this.f33537e) {
            return false;
        }
        Object[] objArr = this.f33534b;
        int[] iArr = this.f33535c;
        long[] jArr = this.f33533a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j10 = jArr[i];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j10) < 128) {
                        int i12 = (i << 3) + i11;
                        Object obj2 = objArr[i12];
                        int i13 = iArr[i12];
                        int d10 = c0Var.d(obj2);
                        if (d10 < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (i13 != c0Var.f33535c[d10]) {
                            break loop0;
                        }
                    } else {
                        z11 = z12;
                    }
                    j10 >>= 8;
                    i11++;
                    z12 = z11;
                }
                z10 = z12;
                if (i10 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
            }
            if (i == length) {
                return z10;
            }
            i++;
            z12 = z10;
        }
        return false;
    }

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, o0.c(i)) : 0;
        this.f33536d = max;
        if (max == 0) {
            jArr = o0.f33603a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            x61.l.I(jArr, -9187201950435737472L);
        }
        this.f33533a = jArr;
        int i10 = max >> 3;
        long j10 = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f33538f = o0.a(this.f33536d) - this.f33537e;
        this.f33534b = new Object[max];
        this.f33535c = new int[max];
    }

    public final void g(int i) {
        this.f33537e--;
        long[] jArr = this.f33533a;
        int i10 = this.f33536d;
        int i11 = i >> 3;
        int i12 = (i & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((i - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.f33534b[i] = null;
    }

    public final void h(int i, Object obj) {
        int c10 = c(obj);
        if (c10 < 0) {
            c10 = ~c10;
        }
        this.f33534b[c10] = obj;
        this.f33535c[c10] = i;
    }

    public final int hashCode() {
        Object[] objArr = this.f33534b;
        int[] iArr = this.f33535c;
        long[] jArr = this.f33533a;
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
                        i10 += Integer.hashCode(iArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f33537e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f33534b;
        int[] iArr = this.f33535c;
        long[] jArr = this.f33533a;
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
                            int i14 = iArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i14);
                            i10++;
                            if (i10 < this.f33537e) {
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

    public /* synthetic */ c0() {
        this(6);
    }
}
