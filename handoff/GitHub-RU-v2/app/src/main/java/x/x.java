package x;

/* loaded from: /home/user/work/p/classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long[] f33637a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f33638b;

    /* renamed from: c, reason: collision with root package name */
    public int f33639c;

    /* renamed from: d, reason: collision with root package name */
    public int f33640d;

    /* renamed from: e, reason: collision with root package name */
    public int f33641e;

    public x(int i) {
        this.f33637a = o0.f33603a;
        this.f33638b = n.f33600a;
        if (i >= 0) {
            e(o0.d(i));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(int i) {
        int i10 = this.f33640d;
        this.f33638b[c(i)] = i;
        return this.f33640d != i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i) {
        int i10;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f33639c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f33637a;
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
                if (this.f33638b[i10] == i) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return i10 >= 0;
    }

    public final int c(int i) {
        long j10;
        long j11;
        int i10;
        long j12;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        int i11;
        int i12;
        int i13 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f33639c;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.f33637a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j13 = ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i20] >>> i21);
            long j14 = i16;
            int i23 = i19;
            int i24 = 0;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int numberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j16) >> 3)) & i17;
                int i25 = i13;
                int i26 = i24;
                if (this.f33638b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i13 = i25;
                i24 = i26;
            }
            int i27 = i13;
            int i28 = i24;
            char c10 = '\b';
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int d10 = d(i15);
                long j17 = 255;
                if (this.f33641e != 0 || ((this.f33637a[d10 >> 3] >> ((d10 & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    i10 = 1;
                    j12 = 128;
                } else {
                    int i29 = this.f33639c;
                    if (i29 > 8) {
                        j12 = 128;
                        if (Long.compareUnsigned(this.f33640d * 32, i29 * 25) <= 0) {
                            long[] jArr4 = this.f33637a;
                            int i30 = this.f33639c;
                            int[] iArr2 = this.f33638b;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = i28;
                            while (i32 < i31) {
                                char c11 = c10;
                                long j18 = jArr4[i32] & (-9187201950435737472L);
                                jArr4[i32] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i32++;
                                j14 = j14;
                                c10 = c11;
                                j17 = j17;
                            }
                            j10 = j17;
                            j11 = j14;
                            int O = x61.l.O(jArr4);
                            int i33 = O - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[O] = jArr4[i28];
                            int i34 = i28;
                            while (i34 != i30) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j20 = (jArr4[i35] >> i36) & j10;
                                if (j20 != 128 && j20 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i34]) * i27;
                                    int i37 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int d11 = d(i37);
                                    int i38 = i37 & i30;
                                    if (((d11 - i38) & i30) / 8 == ((i34 - i38) & i30) / 8) {
                                        long j21 = j19;
                                        jArr4[i35] = ((r7 & 127) << i36) | ((~(j10 << i36)) & jArr4[i35]);
                                        jArr4[jArr4.length - i22] = (jArr4[i28] & j21) | Long.MIN_VALUE;
                                        i34++;
                                        j19 = j21;
                                    } else {
                                        long j22 = j19;
                                        int i39 = d11 >> 3;
                                        long j23 = jArr4[i39];
                                        int i40 = (d11 & 7) << 3;
                                        if (((j23 >> i40) & j10) == 128) {
                                            i11 = i22;
                                            iArr = iArr2;
                                            int i41 = i34;
                                            jArr4[i39] = ((~(j10 << i40)) & j23) | ((r7 & 127) << i40);
                                            jArr4[i35] = (jArr4[i35] & (~(j10 << i36))) | (128 << i36);
                                            iArr[d11] = iArr[i41];
                                            iArr[i41] = i28;
                                            i12 = i41;
                                        } else {
                                            iArr = iArr2;
                                            int i42 = i34;
                                            i11 = i22;
                                            jArr4[i39] = ((r7 & 127) << i40) | ((~(j10 << i40)) & j23);
                                            int i43 = iArr[d11];
                                            iArr[d11] = iArr[i42];
                                            iArr[i42] = i43;
                                            i12 = i42 - 1;
                                        }
                                        jArr4[jArr4.length - i11] = (jArr4[i28] & j22) | Long.MIN_VALUE;
                                        i34 = i12 + i11;
                                        i22 = i11;
                                        j19 = j22;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            i10 = i22;
                            this.f33641e = o0.a(this.f33639c) - this.f33640d;
                            d10 = d(i15);
                        }
                    } else {
                        j12 = 128;
                    }
                    j10 = 255;
                    j11 = j14;
                    i10 = 1;
                    int b10 = o0.b(this.f33639c);
                    long[] jArr5 = this.f33637a;
                    int[] iArr3 = this.f33638b;
                    int i44 = this.f33639c;
                    e(b10);
                    long[] jArr6 = this.f33637a;
                    int[] iArr4 = this.f33638b;
                    int i45 = this.f33639c;
                    int i46 = i28;
                    while (i46 < i44) {
                        if (((jArr5[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < j12) {
                            int i47 = iArr3[i46];
                            int hashCode3 = Integer.hashCode(i47) * i27;
                            int i48 = hashCode3 ^ (hashCode3 << 16);
                            int d12 = d(i48 >>> 7);
                            long j24 = i48 & 127;
                            int i49 = d12 >> 3;
                            int i50 = (d12 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j25 = (jArr6[i49] & (~(255 << i50))) | (j24 << i50);
                            jArr[i49] = j25;
                            jArr[(((d12 - 7) & i45) + (i45 & 7)) >> 3] = j25;
                            iArr4[d12] = i47;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i46++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    d10 = d(i15);
                }
                this.f33640d += i10;
                int i51 = this.f33641e;
                long[] jArr7 = this.f33637a;
                int i52 = d10 >> 3;
                long j26 = jArr7[i52];
                int i53 = (d10 & 7) << 3;
                if (((j26 >> i53) & j10) != j12) {
                    i10 = i28;
                }
                this.f33641e = i51 - i10;
                int i54 = this.f33639c;
                long j27 = (j26 & (~(j10 << i53))) | (j11 << i53);
                jArr7[i52] = j27;
                jArr7[(((d10 - 7) & i54) + (i54 & 7)) >> 3] = j27;
                return d10;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i27;
        }
    }

    public final int d(int i) {
        int i10 = this.f33639c;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f33637a;
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

    public final void e(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, o0.c(i)) : 0;
        this.f33639c = max;
        if (max == 0) {
            jArr = o0.f33603a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            x61.l.I(jArr, -9187201950435737472L);
        }
        this.f33637a = jArr;
        int i10 = max >> 3;
        long j10 = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f33641e = o0.a(this.f33639c) - this.f33640d;
        this.f33638b = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f33640d != this.f33640d) {
            return false;
        }
        int[] iArr = this.f33638b;
        long[] jArr = this.f33637a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128 && !xVar.b(iArr[(i << 3) + i11])) {
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(int i) {
        int i10;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f33639c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f33637a;
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
                if (this.f33638b[i10] == i) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        boolean z10 = i10 >= 0;
        if (z10) {
            g(i10);
        }
        return z10;
    }

    public final void g(int i) {
        this.f33640d--;
        long[] jArr = this.f33637a;
        int i10 = this.f33639c;
        int i11 = i >> 3;
        int i12 = (i & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((i - 7) & i10) + (i10 & 7)) >> 3] = j10;
    }

    public final int hashCode() {
        int[] iArr = this.f33638b;
        long[] jArr = this.f33637a;
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
                        i10 = Integer.hashCode(iArr[(i << 3) + i12]) + i10;
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f33638b;
        long[] jArr = this.f33637a;
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
                            int i13 = iArr[(i << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(i13);
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

    public /* synthetic */ x() {
        this(6);
    }
}
