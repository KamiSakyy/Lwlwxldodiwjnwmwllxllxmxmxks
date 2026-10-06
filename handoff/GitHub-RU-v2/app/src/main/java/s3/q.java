package s3;

/* loaded from: /home/user/work/p/classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public long f31712a;

    public static long a(long j10, float f6, float f10, int i) {
        if ((i & 1) != 0) {
            f6 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final long d(long j10, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j10, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long f(float f6, long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f6;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f6;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String g(long j10) {
        return "(" + b(j10) + ", " + c(j10) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f31712a == ((q) obj).f31712a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31712a);
    }

    public final String toString() {
        return g(this.f31712a);
    }
    public q(long p1) {
    }
}
