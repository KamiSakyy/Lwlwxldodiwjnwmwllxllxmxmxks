package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.measurement.d5;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 extends d5 {
    public static final boolean e = v2.e;
    public c2 a;
    public final byte[] b;
    public final int c;
    public int d;

    public m1(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(no.a.j(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int A0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int z0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void m0(byte b) {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i = i2;
                throw new zzfa(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
        }
    }

    public final void n0(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzfa(this.d, this.c, i2, e2);
        }
    }

    public final void o0(int i, int i2) {
        w0((i << 3) | 5);
        p0(i2);
    }

    public final void p0(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzfa(i2, this.c, 4, e2);
        }
    }

    public final void q0(int i, long j) {
        w0((i << 3) | 1);
        r0(j);
    }

    public final void r0(long j) {
        int i = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzfa(i, this.c, 8, e2);
        }
    }

    public final void s0(int i, int i2) {
        w0(i << 3);
        t0(i2);
    }

    public final void t0(int i) {
        if (i >= 0) {
            w0(i);
        } else {
            y0(i);
        }
    }

    public final void u0(int i, int i2) {
        w0((i << 3) | i2);
    }

    public final void v0(int i, int i2) {
        w0(i << 3);
        w0(i2);
    }

    public final void w0(int i) {
        int i2;
        int i3 = this.d;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.b;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.d = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzfa(i2, this.c, 1, e2);
                }
            }
            throw new zzfa(i2, this.c, 1, e2);
        }
    }

    public final void x0(int i, long j) {
        w0(i << 3);
        y0(j);
    }

    public final void y0(long j) {
        int i;
        int i2 = this.d;
        boolean z = e;
        int i3 = this.c;
        byte[] bArr = this.b;
        if (!z || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzfa(i, i3, 1, e2);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j2;
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                v2.c.d(bArr, v2.f + i2, (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            v2.c.d(bArr, v2.f + i2, (byte) j3);
        }
        this.d = i;
    }
}
