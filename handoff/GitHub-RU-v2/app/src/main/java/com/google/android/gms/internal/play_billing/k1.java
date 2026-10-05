package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k1 implements Iterable, Serializable {
    public static final l1 s = new l1(z1.b);
    public int r = 0;

    static {
        int i = i1.a;
    }

    public static int j(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a0.s0.i("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(no.a.j(i2, i3, "End index: ", " >= "));
    }

    public static l1 k(byte[] bArr, int i, int i2) {
        try {
            j(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new l1(bArr2);
        } catch (zzgc e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean l(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        j(i, i4, bArr.length);
        j(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d(int i, int i2);

    public abstract int e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        int e = e();
        if (e != k1Var.e()) {
            return false;
        }
        if (e == 0) {
            return true;
        }
        int i = this.r;
        int i2 = k1Var.r;
        if (i == 0 || i2 == 0 || i == i2) {
            return i(k1Var);
        }
        return false;
    }

    public abstract k1 f(int i, int i2);

    public abstract void g(m1 m1Var);

    public final int hashCode() {
        int i = this.r;
        if (i == 0) {
            int e = e();
            i = d(e, e);
            if (i == 0) {
                i = 1;
            }
            this.r = i;
        }
        return i;
    }

    public abstract boolean i(k1 k1Var);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return com.github.rudroid.copilot.h1.p(a0.s0.n(e(), "<ByteString@", hexString, " size=", " contents=\""), e() <= 50 ? com.google.common.util.concurrent.a.b0(this) : com.google.common.util.concurrent.a.b0(f(0, 47)).concat("..."), "\">");
    }
}
