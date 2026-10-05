package f5;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f24336a;

    /* renamed from: b, reason: collision with root package name */
    public int f24337b;

    /* renamed from: c, reason: collision with root package name */
    public float f24338c;

    /* renamed from: d, reason: collision with root package name */
    public float f24339d;

    /* renamed from: e, reason: collision with root package name */
    public long f24340e;

    /* renamed from: f, reason: collision with root package name */
    public long f24341f;

    /* renamed from: g, reason: collision with root package name */
    public long f24342g;

    /* renamed from: h, reason: collision with root package name */
    public float f24343h;
    public int i;

    public final float a(long j10) {
        if (j10 < this.f24340e) {
            return 0.0f;
        }
        long j11 = this.f24342g;
        if (j11 < 0 || j10 < j11) {
            return d.b((j10 - r0) / this.f24336a, 0.0f, 1.0f) * 0.5f;
        }
        float f6 = this.f24343h;
        return (d.b((j10 - j11) / this.i, 0.0f, 1.0f) * f6) + (1.0f - f6);
    }
}
