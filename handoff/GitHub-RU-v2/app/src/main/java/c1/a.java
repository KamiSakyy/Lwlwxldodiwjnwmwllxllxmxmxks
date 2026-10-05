package c1;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f3954a = a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3955b = 0;

    public static long a(float f6, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static String b(long j10) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j10 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j10 & 4294967295L)) + ')';
    }
}
