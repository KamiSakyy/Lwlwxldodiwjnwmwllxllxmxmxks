package c2;

import w8.s;

/* loaded from: /home/user/work/p/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public long f4058a;

    public static final long a(float f6, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static /* synthetic */ long b(long j10, float f6, float f10, int i) {
        if ((i & 1) != 0) {
            f6 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        return a(f6, f10);
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final long e(long j10, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long f(long j10, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long g(float f6, long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f6;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f6;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String h(long j10) {
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + s.J(Float.intBitsToFloat((int) (j10 >> 32))) + ", " + s.J(Float.intBitsToFloat((int) (j10 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f4058a == ((b) obj).f4058a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4058a);
    }

    public final String toString() {
        return h(this.f4058a);
    }
    public Object a = null;
}
