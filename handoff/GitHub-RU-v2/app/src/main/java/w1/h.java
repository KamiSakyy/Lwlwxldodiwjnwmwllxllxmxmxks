package w1;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f32937a;

    public h(float f6) {
        this.f32937a = f6;
    }

    @Override // w1.d
    public final int a(int i, int i10, s3.m mVar) {
        float f6 = (i10 - i) / 2.0f;
        s3.m mVar2 = s3.m.f31704r;
        float f10 = this.f32937a;
        if (mVar != mVar2) {
            f10 *= -1;
        }
        return Math.round((1 + f10) * f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.f32937a, ((h) obj).f32937a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32937a);
    }

    public final String toString() {
        return x.i.i(new StringBuilder("Horizontal(bias="), this.f32937a, ')');
    }
}
