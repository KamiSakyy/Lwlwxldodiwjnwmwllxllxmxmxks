package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes4.dex */
public class x4 implements Iterable, Serializable {
    public static final x4 t = new x4(n5.b);
    public int r = 0;
    public byte[] s;

    static {
        int i = u4.a;
    }

    public x4(byte[] bArr) {
        bArr.getClass();
        this.s = bArr;
    }

    public static x4 e(byte[] bArr, int i, int i2) {
        f(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new x4(bArr2);
    }

    public static int f(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public byte a(int i) {
        return this.s[i];
    }

    public byte b(int i) {
        return this.s[i];
    }

    public int d() {
        return this.s.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x4) && d() == ((x4) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof x4)) {
                return obj.equals(this);
            }
            x4 x4Var = (x4) obj;
            int i = this.r;
            int i2 = x4Var.r;
            if (i == 0 || i2 == 0 || i == i2) {
                int d = d();
                if (d > x4Var.d()) {
                    int d2 = d();
                    StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 18 + String.valueOf(d2).length());
                    sb.append("Length too large: ");
                    sb.append(d);
                    sb.append(d2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (d <= x4Var.d()) {
                    byte[] bArr = x4Var.s;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < d) {
                        if (this.s[i3] == bArr[i4]) {
                            i3++;
                            i4++;
                        }
                    }
                    return true;
                }
                int d3 = x4Var.d();
                StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 27 + String.valueOf(d3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(d);
                sb2.append(", ");
                sb2.append(d3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.r;
        if (i != 0) {
            return i;
        }
        int d = d();
        int i2 = d;
        for (int i3 = 0; i3 < d; i3++) {
            i2 = (i2 * 31) + this.s[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.r = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d = d();
        if (d() <= 50) {
            concat = v8.l0.V(this);
        } else {
            int f = f(0, 47, d());
            concat = v8.l0.V(f == 0 ? t : new w4(f, this.s)).concat("...");
        }
        return com.github.rudroid.copilot.h1.p(a0.s0.n(d, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
