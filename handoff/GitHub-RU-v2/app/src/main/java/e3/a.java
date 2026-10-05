package e3;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f21921a = (1023 << 50) ^ (-1);

    /* renamed from: b, reason: collision with root package name */
    public static final long f21922b = (-1) ^ (33554431 << 25);

    /* renamed from: c, reason: collision with root package name */
    public static final long f21923c;

    static {
        long j10 = 33554431;
        f21923c = j10 | (Math.min(0, 1023) << 50) | (j10 << 25);
    }
}
