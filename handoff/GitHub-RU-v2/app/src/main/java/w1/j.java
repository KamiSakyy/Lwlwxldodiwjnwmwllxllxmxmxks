package w1;

/* loaded from: /home/user/work/p/classes.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public float f32939a;

    /* renamed from: b, reason: collision with root package name */
    public float f32940b;

    public j(float f6, float f10) {
        this.f32939a = f6;
        this.f32940b = f10;
    }

    @Override // w1.e
    public final long a(long j10, long j11, s3.m mVar) {
        float f6 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f10 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        s3.m mVar2 = s3.m.f31704r;
        float f11 = this.f32939a;
        if (mVar != mVar2) {
            f11 *= -1;
        }
        float f12 = 1;
        float f13 = (f11 + f12) * f6;
        float f14 = (f12 + this.f32940b) * f10;
        return (Math.round(f14) & 4294967295L) | (Math.round(f13) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f32939a, jVar.f32939a) == 0 && Float.compare(this.f32940b, jVar.f32940b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32940b) + (Float.hashCode(this.f32939a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f32939a);
        sb2.append(", verticalBias=");
        return x.i.i(sb2, this.f32940b, ')');
    }
}
