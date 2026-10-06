package h91;

import com.github.rudroid.copilot.h1;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h implements j, i, Cloneable, ByteChannel {
    public f0 r;
    public long s;

    public final long A() {
        long j = this.s;
        if (j == 0) {
            return 0L;
        }
        f0 f0Var = this.r;
        k71.k.d(f0Var);
        f0 f0Var2 = f0Var.g;
        k71.k.d(f0Var2);
        return (f0Var2.c >= 8192 || !f0Var2.e) ? j : j - (r3 - f0Var2.b);
    }

    @Override // h91.j
    public final boolean A0(long j, kShadow kVar) {
        k71.k.g(kVar, "bytes");
        return N(kVar.d(), j, kVar);
    }

    @Override // h91.j
    public final void C0(long j) {
        if (this.s < j) {
            throw new EOFException();
        }
    }

    public final void E(h hVar, long j, long j2) {
        k71.k.g(hVar, "out");
        long j3 = j;
        b.e(this.s, j3, j2);
        if (j2 == 0) {
            return;
        }
        hVar.s += j2;
        f0 f0Var = this.r;
        while (true) {
            k71.k.d(f0Var);
            long j4 = f0Var.c - f0Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            f0Var = f0Var.f;
        }
        f0 f0Var2 = f0Var;
        long j5 = j2;
        while (j5 > 0) {
            k71.k.d(f0Var2);
            f0 c = f0Var2.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            f0 f0Var3 = hVar.r;
            if (f0Var3 == null) {
                c.g = c;
                c.f = c;
                hVar.r = c;
            } else {
                f0 f0Var4 = f0Var3.g;
                k71.k.d(f0Var4);
                f0Var4.b(c);
            }
            j5 -= c.c - c.b;
            f0Var2 = f0Var2.f;
            j3 = 0;
        }
    }

    public final void E0(kShadow kVar) {
        k71.k.g(kVar, "byteString");
        kVar.s(this, kVar.d());
    }

    public final byte F(long j) {
        b.e(this.s, j, 1L);
        f0 f0Var = this.r;
        if (f0Var == null) {
            k71.k.d((Object) null);
            throw null;
        }
        long j2 = this.s;
        if (j2 - j < j) {
            while (j2 > j) {
                f0Var = f0Var.g;
                k71.k.d(f0Var);
                j2 -= f0Var.c - f0Var.b;
            }
            return f0Var.a[(int) ((f0Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = f0Var.c;
            int i2 = f0Var.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return f0Var.a[(int) ((i2 + j) - j3)];
            }
            f0Var = f0Var.f;
            k71.k.d(f0Var);
            j3 = j4;
        }
    }

    @Override // h91.i
    public final long G(k0 k0Var) {
        k71.k.g(k0Var, "source");
        long j = 0;
        while (true) {
            long U = k0Var.U(this, 8192L);
            if (U == -1) {
                return j;
            }
            j += U;
        }
    }

    @Override // h91.j
    public final InputStream G0() {
        return new g(this, 0);
    }

    @Override // h91.j
    public final byte[] H() {
        return W(this.s);
    }

    @Override // h91.i0Shadow
    public final void I0(h hVar, long j) {
        f0 b;
        k71.k.g(hVar, "source");
        if (hVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        b.e(hVar.s, 0L, j);
        while (j > 0) {
            f0 f0Var = hVar.r;
            k71.k.d(f0Var);
            int i = f0Var.c;
            f0 f0Var2 = hVar.r;
            k71.k.d(f0Var2);
            long j2 = i - f0Var2.b;
            int i2 = 0;
            if (j < j2) {
                f0 f0Var3 = this.r;
                f0 f0Var4 = f0Var3 != null ? f0Var3.g : null;
                if (f0Var4 != null && f0Var4.e) {
                    if ((f0Var4.c + j) - (f0Var4.d ? 0 : f0Var4.b) <= 8192) {
                        f0 f0Var5 = hVar.r;
                        k71.k.d(f0Var5);
                        f0Var5.d(f0Var4, (int) j);
                        hVar.s -= j;
                        this.s += j;
                        return;
                    }
                }
                f0 f0Var6 = hVar.r;
                k71.k.d(f0Var6);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > f0Var6.c - f0Var6.b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    b = f0Var6.c();
                } else {
                    b = g0.b();
                    byte[] bArr = f0Var6.a;
                    byte[] bArr2 = b.a;
                    int i4 = f0Var6.b;
                    x61.l.v(0, i4, i4 + i3, bArr, bArr2);
                }
                b.c = b.b + i3;
                f0Var6.b += i3;
                f0 f0Var7 = f0Var6.g;
                k71.k.d(f0Var7);
                f0Var7.b(b);
                hVar.r = b;
            }
            f0 f0Var8 = hVar.r;
            k71.k.d(f0Var8);
            long j3 = f0Var8.c - f0Var8.b;
            hVar.r = f0Var8.a();
            f0 f0Var9 = this.r;
            if (f0Var9 == null) {
                this.r = f0Var8;
                f0Var8.g = f0Var8;
                f0Var8.f = f0Var8;
            } else {
                f0 f0Var10 = f0Var9.g;
                k71.k.d(f0Var10);
                f0Var10.b(f0Var8);
                f0 f0Var11 = f0Var8.g;
                if (f0Var11 == f0Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                k71.k.d(f0Var11);
                if (f0Var11.e) {
                    int i5 = f0Var8.c - f0Var8.b;
                    f0 f0Var12 = f0Var8.g;
                    k71.k.d(f0Var12);
                    int i6 = 8192 - f0Var12.c;
                    f0 f0Var13 = f0Var8.g;
                    k71.k.d(f0Var13);
                    if (!f0Var13.d) {
                        f0 f0Var14 = f0Var8.g;
                        k71.k.d(f0Var14);
                        i2 = f0Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        f0 f0Var15 = f0Var8.g;
                        k71.k.d(f0Var15);
                        f0Var8.d(f0Var15, i5);
                        f0Var8.a();
                        g0.a(f0Var8);
                    }
                }
            }
            hVar.s -= j3;
            this.s += j3;
            j -= j3;
        }
    }

    public final void J0(int i) {
        f0 x0 = x0(1);
        byte[] bArr = x0.a;
        int i2 = x0.c;
        x0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.s++;
    }

    public final long K(byte b, long j, long j2) {
        f0 f0Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.s + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.s;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (f0Var = this.r) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                f0Var = f0Var.g;
                k71.k.d(f0Var);
                j6 -= f0Var.c - f0Var.b;
            }
            while (j6 < j4) {
                byte[] bArr = f0Var.a;
                long j8 = j7;
                int min = (int) Math.min(f0Var.c, (f0Var.b + j4) - j6);
                for (int i = (int) ((f0Var.b + j3) - j6); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - f0Var.b) + j6;
                    }
                }
                j6 += f0Var.c - f0Var.b;
                f0Var = f0Var.f;
                k71.k.d(f0Var);
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (f0Var.c - f0Var.b) + j5;
            if (j9 > j3) {
                break;
            }
            f0Var = f0Var.f;
            k71.k.d(f0Var);
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = f0Var.a;
            int min2 = (int) Math.min(f0Var.c, (f0Var.b + j4) - j5);
            for (int i2 = (int) ((f0Var.b + j3) - j5); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - f0Var.b) + j5;
                }
            }
            j5 += f0Var.c - f0Var.b;
            f0Var = f0Var.f;
            k71.k.d(f0Var);
            j3 = j5;
        }
        return -1L;
    }

    public final void K0(long j) {
        boolean z;
        if (j == 0) {
            J0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                P0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = i91.a.a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j > i91.a.b[numberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        f0 x0 = x0(i);
        byte[] bArr2 = x0.a;
        int i2 = x0.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr2[i2] = i91.a.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        x0.c += i;
        this.s += i;
    }

    @Override // h91.j
    public final boolean L() {
        return this.s == 0;
    }

    public final void L0(long j) {
        if (j == 0) {
            J0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        f0 x0 = x0(i);
        byte[] bArr = x0.a;
        int i2 = x0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = i91.a.a[(int) (15 & j)];
            j >>>= 4;
        }
        x0.c += i;
        this.s += i;
    }

    public final long M(long j, kShadow kVar) {
        k71.k.g(kVar, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("fromIndex < 0: ", j).toString());
        }
        f0 f0Var = this.r;
        if (f0Var == null) {
            return -1L;
        }
        long j3 = this.s;
        if (j3 - j < j) {
            while (j3 > j) {
                f0Var = f0Var.g;
                k71.k.d(f0Var);
                j3 -= f0Var.c - f0Var.b;
            }
            if (kVar.d() == 2) {
                byte i = kVar.i(0);
                byte i2 = kVar.i(1);
                while (j3 < this.s) {
                    byte[] bArr = f0Var.a;
                    int i3 = f0Var.c;
                    for (int i4 = (int) ((f0Var.b + j) - j3); i4 < i3; i4++) {
                        byte b = bArr[i4];
                        if (b == i || b == i2) {
                            return (i4 - f0Var.b) + j3;
                        }
                    }
                    j3 += f0Var.c - f0Var.b;
                    f0Var = f0Var.f;
                    k71.k.d(f0Var);
                    j = j3;
                }
            } else {
                byte[] h = kVar.h();
                while (j3 < this.s) {
                    byte[] bArr2 = f0Var.a;
                    int i5 = f0Var.c;
                    for (int i6 = (int) ((f0Var.b + j) - j3); i6 < i5; i6++) {
                        byte b2 = bArr2[i6];
                        for (byte b3 : h) {
                            if (b2 == b3) {
                                return (i6 - f0Var.b) + j3;
                            }
                        }
                    }
                    j3 += f0Var.c - f0Var.b;
                    f0Var = f0Var.f;
                    k71.k.d(f0Var);
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = (f0Var.c - f0Var.b) + j2;
            if (j4 > j) {
                break;
            }
            f0Var = f0Var.f;
            k71.k.d(f0Var);
            j2 = j4;
        }
        if (kVar.d() == 2) {
            byte i7 = kVar.i(0);
            byte i8 = kVar.i(1);
            while (j2 < this.s) {
                byte[] bArr3 = f0Var.a;
                int i9 = f0Var.c;
                for (int i10 = (int) ((f0Var.b + j) - j2); i10 < i9; i10++) {
                    byte b4 = bArr3[i10];
                    if (b4 == i7 || b4 == i8) {
                        return (i10 - f0Var.b) + j2;
                    }
                }
                j2 += f0Var.c - f0Var.b;
                f0Var = f0Var.f;
                k71.k.d(f0Var);
                j = j2;
            }
        } else {
            byte[] h2 = kVar.h();
            while (j2 < this.s) {
                byte[] bArr4 = f0Var.a;
                int i11 = f0Var.c;
                for (int i12 = (int) ((f0Var.b + j) - j2); i12 < i11; i12++) {
                    byte b5 = bArr4[i12];
                    for (byte b6 : h2) {
                        if (b5 == b6) {
                            return (i12 - f0Var.b) + j2;
                        }
                    }
                }
                j2 += f0Var.c - f0Var.b;
                f0Var = f0Var.f;
                k71.k.d(f0Var);
                j = j2;
            }
        }
        return -1L;
    }

    public final void M0(int i) {
        f0 x0 = x0(4);
        byte[] bArr = x0.a;
        int i2 = x0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        x0.c = i2 + 4;
        this.s += 4;
    }

    public final boolean N(int i, long j, kShadow kVar) {
        k71.k.g(kVar, "bytes");
        if (i >= 0 && j >= 0 && i + j <= this.s && i <= kVar.d()) {
            return i == 0 || i91.a.a(this, kVar, j, j + 1, i) != -1;
        }
        return false;
    }

    public final void N0(int i) {
        f0 x0 = x0(2);
        byte[] bArr = x0.a;
        int i2 = x0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        x0.c = i2 + 2;
        this.s += 2;
    }

    public final f O(f fVar) {
        k71.k.g(fVar, "unsafeCursor");
        byte[] bArr = i91.a.a;
        if (fVar == b.a) {
            fVar = new f();
        }
        if (fVar.r != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        fVar.r = this;
        fVar.s = true;
        return fVar;
    }

    public final void O0(int i, String str, int i2) {
        char charAt;
        k71.k.g(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(no.a.k("beginIndex < 0: ", i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(no.a.j(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder o = x.i.o("endIndex > string.length: ", i2, " > ");
            o.append(str.length());
            throw new IllegalArgumentException(o.toString().toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                f0 x0 = x0(1);
                byte[] bArr = x0.a;
                int i3 = x0.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = x0.c;
                int i6 = (i3 + i) - i5;
                x0.c = i5 + i6;
                this.s += i6;
            } else {
                if (charAt2 < 2048) {
                    f0 x02 = x0(2);
                    byte[] bArr2 = x02.a;
                    int i7 = x02.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    x02.c = i7 + 2;
                    this.s += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    f0 x03 = x0(3);
                    byte[] bArr3 = x03.a;
                    int i8 = x03.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    x03.c = i8 + 3;
                    this.s += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        J0(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        f0 x04 = x0(4);
                        byte[] bArr4 = x04.a;
                        int i11 = x04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        x04.c = i11 + 4;
                        this.s += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // h91.j
    public final String P(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("limit < 0: ", j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long K = K((byte) 10, 0L, j2);
        if (K != -1) {
            return i91.a.c(this, K);
        }
        if (j2 < this.s && F(j2 - 1) == 13 && F(j2) == 10) {
            return i91.a.c(this, j2);
        }
        h hVar = new h();
        E(hVar, 0L, Math.min(32, this.s));
        throw new EOFException("\\n not found: limit=" + Math.min(this.s, j) + " content=" + hVar.v(hVar.s).e() + (char) 8230);
    }

    public final void P0(String str) {
        k71.k.g(str, "string");
        O0(0, str, str.length());
    }

    public final void Q0(int i) {
        if (i < 128) {
            J0(i);
            return;
        }
        if (i < 2048) {
            f0 x0 = x0(2);
            byte[] bArr = x0.a;
            int i2 = x0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            x0.c = i2 + 2;
            this.s += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            J0(63);
            return;
        }
        if (i < 65536) {
            f0 x02 = x0(3);
            byte[] bArr2 = x02.a;
            int i3 = x02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            x02.c = i3 + 3;
            this.s += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.h(i)));
        }
        f0 x03 = x0(4);
        byte[] bArr3 = x03.a;
        int i4 = x03.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        x03.c = i4 + 4;
        this.s += 4;
    }

    @Override // h91.k0
    public final long U(h hVar, long j) {
        k71.k.g(hVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        long j2 = this.s;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        hVar.I0(this, j);
        return j;
    }

    public final byte[] W(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(h1.m("byteCount: ", j).toString());
        }
        if (this.s < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // h91.j
    public final int Z(y yVar) {
        k71.k.g(yVar, "options");
        int d = i91.a.d(this, yVar, false);
        if (d == -1) {
            return -1;
        }
        skip(yVar.r[d].d());
        return d;
    }

    @Override // h91.j
    public final h a() {
        return this;
    }

    @Override // h91.i
    public final /* bridge */ /* synthetic */ i a0(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    @Override // h91.k0
    public final m0 b() {
        return m0.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[EDGE_INSN: B:40:0x00a2->B:37:0x00a2 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b0() {
        int i;
        if (this.s == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            f0 f0Var = this.r;
            k71.k.d(f0Var);
            byte[] bArr = f0Var.a;
            int i3 = f0Var.b;
            int i4 = f0Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = i91.b.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.r = f0Var.a();
                        g0.a(f0Var);
                    } else {
                        f0Var.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    h hVar = new h();
                    hVar.L0(j);
                    hVar.J0(b);
                    throw new NumberFormatException("Number too large: ".concat(hVar.o0()));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.r != null);
        this.s -= i2;
        return j;
    }

    public final Object clone() {
        h hVar = new h();
        if (this.s == 0) {
            return hVar;
        }
        f0 f0Var = this.r;
        k71.k.d(f0Var);
        f0 c = f0Var.c();
        hVar.r = c;
        c.g = c;
        c.f = c;
        for (f0 f0Var2 = f0Var.f; f0Var2 != f0Var; f0Var2 = f0Var2.f) {
            f0 f0Var3 = c.g;
            k71.k.d(f0Var3);
            k71.k.d(f0Var2);
            f0Var3.b(f0Var2.c());
        }
        hVar.s = this.s;
        return hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, h91.i0Shadow
    public final void close() {
    }

    @Override // h91.i
    public final /* bridge */ /* synthetic */ i d0(String str) {
        P0(str);
        return this;
    }

    public final short e0() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        long j = this.s;
        h hVar = (h) obj;
        if (j != hVar.s) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        f0 f0Var = this.r;
        k71.k.d(f0Var);
        f0 f0Var2 = hVar.r;
        k71.k.d(f0Var2);
        int i = f0Var.b;
        int i2 = f0Var2.b;
        long j2 = 0;
        while (j2 < this.s) {
            long min = Math.min(f0Var.c - i, f0Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (f0Var.a[i] != f0Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == f0Var.c) {
                f0Var = f0Var.f;
                k71.k.d(f0Var);
                i = f0Var.b;
            }
            if (i2 == f0Var2.c) {
                f0Var2 = f0Var2.f;
                k71.k.d(f0Var2);
                i2 = f0Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // h91.i, h91.i0Shadow, java.io.Flushable
    public final void flush() {
    }

    @Override // h91.j
    public final String h0(Charset charset) {
        k71.k.g(charset, "charset");
        return i0(this.s, charset);
    }

    public final int hashCode() {
        f0 f0Var = this.r;
        if (f0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = f0Var.c;
            for (int i3 = f0Var.b; i3 < i2; i3++) {
                i = (i * 31) + f0Var.a[i3];
            }
            f0Var = f0Var.f;
            k71.k.d(f0Var);
        } while (f0Var != this.r);
        return i;
    }

    public final String i0(long j, Charset charset) {
        k71.k.g(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(h1.m("byteCount: ", j).toString());
        }
        if (this.s < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        f0 f0Var = this.r;
        k71.k.d(f0Var);
        int i = f0Var.b;
        if (i + j > f0Var.c) {
            return new String(W(j), charset);
        }
        int i2 = (int) j;
        String str = new String(f0Var.a, i, i2, charset);
        int i3 = f0Var.b + i2;
        f0Var.b = i3;
        this.s -= j;
        if (i3 == f0Var.c) {
            this.r = f0Var.a();
            g0.a(f0Var);
        }
        return str;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final String o0() {
        return i0(this.s, t71.a.a);
    }

    @Override // h91.i
    public final /* bridge */ /* synthetic */ i p(kShadow kVar) {
        E0(kVar);
        return this;
    }

    @Override // h91.j
    public final String p0() {
        return P(Long.MAX_VALUE);
    }

    @Override // h91.j
    public final long q(kShadow kVar) {
        k71.k.g(kVar, "targetBytes");
        return M(0L, kVar);
    }

    public final void r() {
        skip(this.s);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        k71.k.g(byteBuffer, "sink");
        f0 f0Var = this.r;
        if (f0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), f0Var.c - f0Var.b);
        byteBuffer.put(f0Var.a, f0Var.b, min);
        int i = f0Var.b + min;
        f0Var.b = i;
        this.s -= min;
        if (i == f0Var.c) {
            this.r = f0Var.a();
            g0.a(f0Var);
        }
        return min;
    }

    @Override // h91.j
    public final byte readByte() {
        if (this.s == 0) {
            throw new EOFException();
        }
        f0 f0Var = this.r;
        k71.k.d(f0Var);
        int i = f0Var.b;
        int i2 = f0Var.c;
        int i3 = i + 1;
        byte b = f0Var.a[i];
        this.s--;
        if (i3 != i2) {
            f0Var.b = i3;
            return b;
        }
        this.r = f0Var.a();
        g0.a(f0Var);
        return b;
    }

    @Override // h91.j
    public final void readFully(byte[] bArr) {
        k71.k.g(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // h91.j
    public final int readInt() {
        if (this.s < 4) {
            throw new EOFException();
        }
        f0 f0Var = this.r;
        k71.k.d(f0Var);
        int i = f0Var.b;
        int i2 = f0Var.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = f0Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.s -= 4;
        if (i5 != i2) {
            f0Var.b = i5;
            return i6;
        }
        this.r = f0Var.a();
        g0.a(f0Var);
        return i6;
    }

    @Override // h91.j
    public final long readLong() {
        if (this.s < 8) {
            throw new EOFException();
        }
        f0 f0Var = this.r;
        k71.k.d(f0Var);
        int i = f0Var.b;
        int i2 = f0Var.c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = f0Var.a;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        this.s -= 8;
        if (i4 != i2) {
            f0Var.b = i4;
            return j2;
        }
        this.r = f0Var.a();
        g0.a(f0Var);
        return j2;
    }

    @Override // h91.j
    public final short readShort() {
        if (this.s < 2) {
            throw new EOFException();
        }
        f0 f0Var = this.r;
        k71.k.d(f0Var);
        int i = f0Var.b;
        int i2 = f0Var.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = f0Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.s -= 2;
        if (i5 == i2) {
            this.r = f0Var.a();
            g0.a(f0Var);
        } else {
            f0Var.b = i5;
        }
        return (short) i6;
    }

    @Override // h91.j
    public final boolean request(long j) {
        return this.s >= j;
    }

    @Override // h91.j
    public final long s(i iVar) {
        long j = this.s;
        if (j > 0) {
            iVar.I0(this, j);
        }
        return j;
    }

    @Override // h91.j
    public final void skip(long j) {
        while (j > 0) {
            f0 f0Var = this.r;
            if (f0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, f0Var.c - f0Var.b);
            long j2 = min;
            this.s -= j2;
            j -= j2;
            int i = f0Var.b + min;
            f0Var.b = i;
            if (i == f0Var.c) {
                this.r = f0Var.a();
                g0.a(f0Var);
            }
        }
    }

    public final String toString() {
        long j = this.s;
        if (j <= 2147483647L) {
            return w0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.s).toString());
    }

    @Override // h91.j
    public final void u0(h hVar, long j) {
        long j2 = this.s;
        if (j2 >= j) {
            hVar.I0(this, j);
        } else {
            hVar.I0(this, j2);
            throw new EOFException();
        }
    }

    @Override // h91.j
    public final k v(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(h1.m("byteCount: ", j).toString());
        }
        if (this.s < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new kShadow(W(j));
        }
        kShadow w0 = w0((int) j);
        skip(j);
        return w0;
    }

    public final k w0(int i) {
        if (i == 0) {
            return k.u;
        }
        b.e(this.s, 0L, i);
        f0 f0Var = this.r;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            k71.k.d(f0Var);
            int i5 = f0Var.c;
            int i6 = f0Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            f0Var = f0Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        f0 f0Var2 = this.r;
        int i7 = 0;
        while (i2 < i) {
            k71.k.d(f0Var2);
            bArr[i7] = f0Var2.a;
            i2 += f0Var2.c - f0Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = f0Var2.b;
            f0Var2.d = true;
            i7++;
            f0Var2 = f0Var2.f;
        }
        return new h0(bArr, iArr);
    }

    @Override // h91.i
    public final i write(byte[] bArr) {
        k71.k.g(bArr, "source");
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // h91.i
    public final /* bridge */ /* synthetic */ i writeByte(int i) {
        J0(i);
        return this;
    }

    @Override // h91.i
    public final /* bridge */ /* synthetic */ i writeInt(int i) {
        M0(i);
        return this;
    }

    @Override // h91.i
    public final /* bridge */ /* synthetic */ i writeShort(int i) {
        N0(i);
        return this;
    }

    public final f0 x0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        f0 f0Var = this.r;
        if (f0Var == null) {
            f0 b = g0.b();
            this.r = b;
            b.g = b;
            b.f = b;
            return b;
        }
        f0 f0Var2 = f0Var.g;
        k71.k.d(f0Var2);
        if (f0Var2.c + i <= 8192 && f0Var2.e) {
            return f0Var2;
        }
        f0 b2 = g0.b();
        f0Var2.b(b2);
        return b2;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        k71.k.g(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            f0 x0 = x0(1);
            int min = Math.min(i, 8192 - x0.c);
            byteBuffer.get(x0.a, x0.c, min);
            i -= min;
            x0.c += min;
        }
        this.s += remaining;
        return remaining;
    }

    public final int read(byte[] bArr, int i, int i2) {
        k71.k.g(bArr, "sink");
        b.e(bArr.length, i, i2);
        f0 f0Var = this.r;
        if (f0Var == null) {
            return -1;
        }
        int min = Math.min(i2, f0Var.c - f0Var.b);
        byte[] bArr2 = f0Var.a;
        int i3 = f0Var.b;
        x61.l.v(i, i3, i3 + min, bArr2, bArr);
        int i4 = f0Var.b + min;
        f0Var.b = i4;
        this.s -= min;
        if (i4 == f0Var.c) {
            this.r = f0Var.a();
            g0.a(f0Var);
        }
        return min;
    }

    public final void write(byte[] bArr, int i, int i2) {
        k71.k.g(bArr, "source");
        long j = i2;
        b.e(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            f0 x0 = x0(1);
            int min = Math.min(i3 - i, 8192 - x0.c);
            int i4 = i + min;
            x61.l.v(x0.c, i, i4, bArr, x0.a);
            x0.c += min;
            i = i4;
        }
        this.s += j;
    }
}
