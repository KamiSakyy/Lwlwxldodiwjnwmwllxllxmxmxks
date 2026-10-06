package w1;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public float f32935a;

    public f(float f6) {
        this.f32935a = f6;
    }

    @Override // w1.d
    public final int a(int i, int i10, s3.m mVar) {
        return Math.round((1 + this.f32935a) * ((i10 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f32935a, ((f) obj).f32935a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32935a);
    }

    public final String toString() {
        return x.i.i(new StringBuilder("Horizontal(bias="), this.f32935a, ')');
    }
}
