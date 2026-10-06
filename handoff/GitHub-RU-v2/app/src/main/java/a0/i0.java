package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f108a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f109b;

    /* renamed from: c, reason: collision with root package name */
    public long f110c;

    /* renamed from: d, reason: collision with root package name */
    public long f111d;

    public i0(int i, int i10, a0 a0Var) {
        this.f108a = i;
        this.f109b = a0Var;
        this.f110c = i * 1000000;
        this.f111d = i10 * 1000000;
    }

    @Override // a0.e0
    public final long b(float f6, float f10, float f11) {
        return this.f111d + this.f110c;
    }

    @Override // a0.e0
    public final float c(float f6, float f10, float f11, long j10) {
        long j11 = j10 - this.f111d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = this.f110c;
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 == 0) {
            return f11;
        }
        return (e(f6, f10, f11, j13) - e(f6, f10, f11, j13 - 1000000)) * 1000.0f;
    }

    @Override // a0.e0
    public final float e(float f6, float f10, float f11, long j10) {
        long j11 = j10 - this.f111d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = this.f110c;
        if (j11 > j12) {
            j11 = j12;
        }
        float a10 = this.f109b.a(this.f108a == 0 ? 1.0f : j11 / j12);
        return (f10 * a10) + ((1 - a10) * f6);
    }
}
