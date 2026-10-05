package s3;

import y41.t1;

/* loaded from: /home/user/work/p/classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final p[] f31708b = {new p(0), new p(4294967296L), new p(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f31709c = t1.E(Float.NaN, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f31710a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final long b(long j10) {
        return f31708b[(int) ((j10 & 1095216660480L) >>> 32)].f31711a;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        long b10 = b(j10);
        if (p.a(b10, 0L)) {
            return "Unspecified";
        }
        if (p.a(b10, 4294967296L)) {
            return c(j10) + ".sp";
        }
        if (!p.a(b10, 8589934592L)) {
            return "Invalid";
        }
        return c(j10) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f31710a == ((o) obj).f31710a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31710a);
    }

    public final String toString() {
        return d(this.f31710a);
    }
}
