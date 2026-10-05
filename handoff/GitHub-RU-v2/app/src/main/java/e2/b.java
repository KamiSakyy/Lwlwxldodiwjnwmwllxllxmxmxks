package e2;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f21844a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f21845b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f21846c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f21847d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f21848e = 0;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f21844a = (0 & 4294967295L) | j11;
        f21845b = (1 & 4294967295L) | j11;
        f21846c = j11 | (2 & 4294967295L);
        f21847d = (j10 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return a(j10, f21844a) ? "Rgb" : a(j10, f21845b) ? "Xyz" : a(j10, f21846c) ? "Lab" : a(j10, f21847d) ? "Cmyk" : "Unknown";
    }
}
