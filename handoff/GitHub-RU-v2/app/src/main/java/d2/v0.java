package d2;

/* loaded from: /home/user/work/p/classes.dex */
public final class v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f21394b = a0.h(0.5f, 0.5f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21395c = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f21396a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v0) {
            return this.f21396a == ((v0) obj).f21396a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21396a);
    }

    public final String toString() {
        return d(this.f21396a);
    }
}
