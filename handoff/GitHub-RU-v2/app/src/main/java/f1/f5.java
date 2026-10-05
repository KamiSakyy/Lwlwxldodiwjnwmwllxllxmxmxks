package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public final float f22791a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22792b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22793c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22794d;

    public f5(float f6, float f10, float f11, float f12) {
        this.f22791a = f6;
        this.f22792b = f10;
        this.f22793c = f11;
        this.f22794d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        if (s3.f.b(this.f22791a, f5Var.f22791a) && s3.f.b(this.f22792b, f5Var.f22792b) && s3.f.b(this.f22793c, f5Var.f22793c)) {
            return s3.f.b(this.f22794d, f5Var.f22794d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22794d) + x.i.b(x.i.b(Float.hashCode(this.f22791a) * 31, this.f22792b, 31), this.f22793c, 31);
    }
}
