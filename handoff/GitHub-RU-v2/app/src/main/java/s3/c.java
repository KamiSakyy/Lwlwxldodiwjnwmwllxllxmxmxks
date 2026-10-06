package s3;

import m7.y;
import y41.t1;

/* loaded from: /home/user/work/p/classes.dex */
public interface c {
    default float E(int i) {
        return i / b();
    }

    default float H(float f6) {
        return f6 / b();
    }

    float Q();

    default float W(float f6) {
        return b() * f6;
    }

    float b();

    default int i0(float f6) {
        float W = W(f6);
        if (Float.isInfinite(W)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(W);
    }

    default long m(float f6) {
        float[] fArr = t3.b.f32054a;
        if (Q() < 1.03f) {
            return t1.E(f6 / Q(), 4294967296L);
        }
        t3.a a10 = t3.b.a(Q());
        return t1.E(a10 != null ? a10.a(f6) : f6 / Q(), 4294967296L);
    }

    default long n(long j10) {
        if (j10 != 9205357640488583168L) {
            return y.a(H(Float.intBitsToFloat((int) (j10 >> 32))), H(Float.intBitsToFloat((int) (j10 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long r0(long j10) {
        if (j10 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float W = W(h.b(j10));
        float W2 = W(h.a(j10));
        return (Float.floatToRawIntBits(W2) & 4294967295L) | (Float.floatToRawIntBits(W) << 32);
    }

    default float s(long j10) {
        float c10;
        float Q;
        if (!p.a(o.b(j10), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = t3.b.f32054a;
        if (Q() >= 1.03f) {
            t3.a a10 = t3.b.a(Q());
            c10 = o.c(j10);
            if (a10 != null) {
                return a10.b(c10);
            }
            Q = Q();
        } else {
            c10 = o.c(j10);
            Q = Q();
        }
        return Q * c10;
    }

    default float u0(long j10) {
        if (!p.a(o.b(j10), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return W(s(j10));
    }

    default long z(float f6) {
        return m(H(f6));
    }

    default <T0> T0 b(Object... a) {
        return null;
    }
    public Object a = null;
    public Object d = null;
}
