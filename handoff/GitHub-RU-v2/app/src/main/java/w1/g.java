package w1;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f32936a;

    public g(float f6) {
        this.f32936a = f6;
    }

    @Override // w1.e
    public final long a(long j10, long j11, s3.m mVar) {
        long j12 = ((((int) (j11 >> 32)) - ((int) (j10 >> 32))) << 32) | ((((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) & 4294967295L);
        float f6 = 1;
        float f10 = (this.f32936a + f6) * (((int) (j12 >> 32)) / 2.0f);
        float f11 = (f6 - 1.0f) * (((int) (j12 & 4294967295L)) / 2.0f);
        return (Math.round(f11) & 4294967295L) | (Math.round(f10) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f32936a, ((g) obj).f32936a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f32936a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f32936a + ", verticalBias=-1.0)";
    }
}
