package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f24063a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24064b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24065c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24066d;

    /* renamed from: e, reason: collision with root package name */
    public final float f24067e;

    public y0(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f24063a = f6;
        this.f24064b = f10;
        this.f24065c = f11;
        this.f24066d = f12;
        this.f24067e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return s3.f.b(this.f24063a, y0Var.f24063a) && s3.f.b(this.f24064b, y0Var.f24064b) && s3.f.b(this.f24065c, y0Var.f24065c) && s3.f.b(this.f24066d, y0Var.f24066d) && s3.f.b(this.f24067e, y0Var.f24067e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f24067e) + x.i.b(x.i.b(x.i.b(Float.hashCode(this.f24063a) * 31, this.f24064b, 31), this.f24065c, 31), this.f24066d, 31);
    }
}
