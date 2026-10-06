package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f22969a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22970b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22971c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22972d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22973e;

    /* renamed from: f, reason: collision with root package name */
    public final float f22974f;

    public i1(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f22969a = f6;
        this.f22970b = f10;
        this.f22971c = f11;
        this.f22972d = f12;
        this.f22973e = f13;
        this.f22974f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return s3.f.b(this.f22969a, i1Var.f22969a) && s3.f.b(this.f22970b, i1Var.f22970b) && s3.f.b(this.f22971c, i1Var.f22971c) && s3.f.b(this.f22972d, i1Var.f22972d) && s3.f.b(this.f22974f, i1Var.f22974f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f22974f) + x.i.b(x.i.b(x.i.b(Float.hashCode(this.f22969a) * 31, this.f22970b, 31), this.f22971c, 31), this.f22972d, 31);
    }
}
