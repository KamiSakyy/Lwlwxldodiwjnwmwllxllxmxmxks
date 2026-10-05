package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y4 extends m7.y {
    public static final Logger e = Logger.getLogger(y4.class.getName());
    public static final boolean f = p6.e;
    public t5 a;
    public final byte[] b;
    public final int c;
    public int d;

    public y4(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(no.a.j(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int b0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int c0(String str) {
        int length;
        try {
            length = q6.b(str);
        } catch (zzor unused) {
            length = str.getBytes(n5.a).length;
        }
        return s0(length) + length;
    }

    public static int s0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void d0(int i, int i2) {
        m0((i << 3) | i2);
    }

    public final void e0(int i, int i2) {
        m0(i << 3);
        l0(i2);
    }

    public final void f0(int i, int i2) {
        m0(i << 3);
        m0(i2);
    }

    public final void g0(int i, int i2) {
        m0((i << 3) | 5);
        n0(i2);
    }

    public final void h0(int i, long j) {
        m0(i << 3);
        o0(j);
    }

    public final void i0(int i, long j) {
        m0((i << 3) | 1);
        p0(j);
    }

    public final void j0(x4 x4Var) {
        m0(x4Var.d());
        q0(x4Var.d(), x4Var.s);
    }

    public final void k0(byte b) {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i = i2;
                throw new zzll(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
        }
    }

    public final void l0(int i) {
        if (i >= 0) {
            m0(i);
        } else {
            o0(i);
        }
    }

    public final void m0(int i) {
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
                    throw new zzll(i2, this.c, 1, e2);
                }
            }
            throw new zzll(i2, this.c, 1, e2);
        }
    }

    public final void n0(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(i2, this.c, 4, e2);
        }
    }

    public final void o0(long j) {
        int i;
        int i2 = this.d;
        int i3 = this.c;
        byte[] bArr = this.b;
        if (!f || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i = i4;
                    throw new zzll(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j2;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                throw new zzll(i, i3, 1, e);
            }
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                p6.c.a(bArr, p6.f + i2, (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            p6.c.a(bArr, p6.f + i2, (byte) j3);
        }
        this.d = i;
    }

    public final void p0(long j) {
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
            throw new zzll(i, this.c, 8, e2);
        }
    }

    public final void q0(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i);
            this.d += i;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(this.d, this.c, i, e2);
        }
    }

    public final void r0(String str) {
        int i = this.d;
        try {
            int s0 = s0(str.length() * 3);
            int s02 = s0(str.length());
            int i2 = this.c;
            byte[] bArr = this.b;
            if (s02 != s0) {
                m0(q6.b(str));
                int i3 = this.d;
                this.d = q6.c(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + s02;
                this.d = i4;
                int c = q6.c(str, bArr, i4, i2 - i4);
                this.d = i;
                m0((c - i) - s02);
                this.d = c;
            }
        } catch (zzor e2) {
            this.d = i;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(n5.a);
            try {
                int length = bytes.length;
                m0(length);
                q0(length, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzll(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new zzll(e4);
        }
    }










}
