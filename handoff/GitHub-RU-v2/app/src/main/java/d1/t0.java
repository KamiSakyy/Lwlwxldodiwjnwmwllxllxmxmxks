package d1;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f21225a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f21226b;

    /* renamed from: c, reason: collision with root package name */
    public static final d3.b0 f21227c = new d3.b0("SelectionHandleInfo");

    static {
        float f6 = 25;
        f21225a = f6;
        f21226b = f6;
    }

    public static final long a(long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - 1.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
