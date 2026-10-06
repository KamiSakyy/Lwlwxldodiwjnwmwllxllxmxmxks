package h91;

import a0.s0;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h0 extends k {
    public final transient byte[][] v;
    public final transient int[] w;

    public h0(byte[][] bArr, int[] iArr) {
        super(k.u.r);
        this.v = bArr;
        this.w = iArr;
    }

    @Override // h91.k
    public final String a() {
        throw null;
    }

    @Override // h91.k
    public final k c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.v;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.w;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        k71.k.d(digest);
        return new k(digest);
    }

    @Override // h91.k
    public final int d() {
        return this.w[this.v.length - 1];
    }

    @Override // h91.k
    public final String e() {
        return u().e();
    }

    @Override // h91.k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.d() == d() && l(0, kVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // h91.k
    public final int f(int i, byte[] bArr) {
        k71.k.g(bArr, "other");
        return u().f(i, bArr);
    }

    @Override // h91.k
    public final byte[] h() {
        return t();
    }

    @Override // h91.k
    public final int hashCode() {
        int i = this.s;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.v;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.w;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.s = i3;
        return i3;
    }

    @Override // h91.k
    public final byte i(int i) {
        byte[][] bArr = this.v;
        int length = bArr.length - 1;
        int[] iArr = this.w;
        b.e(iArr[length], i, 1L);
        int h = i91.b.h(this, i);
        return bArr[h][(i - (h == 0 ? 0 : iArr[h - 1])) + iArr[bArr.length + h]];
    }

    @Override // h91.k
    public final int j(byte[] bArr) {
        k71.k.g(bArr, "other");
        return u().j(bArr);
    }

    @Override // h91.k
    public final boolean l(int i, k kVar, int i2) {
        k71.k.g(kVar, "other");
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int h = i91.b.h(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.w;
                int i5 = h == 0 ? 0 : iArr[h - 1];
                int i6 = iArr[h] - i5;
                byte[][] bArr = this.v;
                int i7 = iArr[bArr.length + h];
                int min = Math.min(i3, i6 + i5) - i;
                if (kVar.m(i4, bArr[h], (i - i5) + i7, min)) {
                    i4 += min;
                    i += min;
                    h++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // h91.k
    public final boolean m(int i, byte[] bArr, int i2, int i3) {
        k71.k.g(bArr, "other");
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int h = i91.b.h(this, i);
        while (i < i4) {
            int[] iArr = this.w;
            int i5 = h == 0 ? 0 : iArr[h - 1];
            int i6 = iArr[h] - i5;
            byte[][] bArr2 = this.v;
            int i7 = iArr[bArr2.length + h];
            int min = Math.min(i4, i6 + i5) - i;
            if (!b.a((i - i5) + i7, i2, min, bArr2[h], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            h++;
        }
        return true;
    }

    @Override // h91.k
    public final String n(Charset charset) {
        k71.k.g(charset, "charset");
        return u().n(charset);
    }

    @Override // h91.k
    public final k o(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i < 0) {
            throw new IllegalArgumentException(s0.i("beginIndex=", i, " < 0").toString());
        }
        if (i2 > d()) {
            StringBuilder o = x.i.o("endIndex=", i2, " > length(");
            o.append(d());
            o.append(')');
            throw new IllegalArgumentException(o.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(no.a.j(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == d()) {
            return this;
        }
        if (i == i2) {
            return k.u;
        }
        int h = i91.b.h(this, i);
        int h2 = i91.b.h(this, i2 - 1);
        byte[][] bArr = this.v;
        byte[][] bArr2 = (byte[][]) x61.l.D(bArr, h, h2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.w;
        if (h <= h2) {
            int i4 = h;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == h2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = h != 0 ? iArr2[h - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new h0(bArr2, iArr);
    }

    @Override // h91.k
    public final k q() {
        return u().q();
    }

    @Override // h91.k
    public final void s(h hVar, int i) {
        int h = i91.b.h(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.w;
            int i3 = h == 0 ? 0 : iArr[h - 1];
            int i4 = iArr[h] - i3;
            byte[][] bArr = this.v;
            int i5 = iArr[bArr.length + h];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            f0 f0Var = new f0(bArr[h], i6, i6 + min, true, false);
            f0 f0Var2 = hVar.r;
            if (f0Var2 == null) {
                f0Var.g = f0Var;
                f0Var.f = f0Var;
                hVar.r = f0Var;
            } else {
                f0 f0Var3 = f0Var2.g;
                k71.k.d(f0Var3);
                f0Var3.b(f0Var);
            }
            i2 += min;
            h++;
        }
        hVar.s += i;
    }

    public final byte[] t() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.v;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.w;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            x61.l.v(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // h91.k
    public final String toString() {
        return u().toString();
    }

    public final k u() {
        return new k(t());
    }
}
