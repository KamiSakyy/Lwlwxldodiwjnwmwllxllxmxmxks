package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class k extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26884c;

    /* renamed from: d, reason: collision with root package name */
    public float f26885d;

    /* renamed from: e, reason: collision with root package name */
    public float f26886e;

    /* renamed from: f, reason: collision with root package name */
    public float f26887f;

    /* renamed from: g, reason: collision with root package name */
    public float f26888g;

    /* renamed from: h, reason: collision with root package name */
    public float f26889h;

    public k(float f6, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f26884c = f6;
        this.f26885d = f10;
        this.f26886e = f11;
        this.f26887f = f12;
        this.f26888g = f13;
        this.f26889h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f26884c, kVar.f26884c) == 0 && Float.compare(this.f26885d, kVar.f26885d) == 0 && Float.compare(this.f26886e, kVar.f26886e) == 0 && Float.compare(this.f26887f, kVar.f26887f) == 0 && Float.compare(this.f26888g, kVar.f26888g) == 0 && Float.compare(this.f26889h, kVar.f26889h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26889h) + x.i.b(x.i.b(x.i.b(x.i.b(Float.hashCode(this.f26884c) * 31, this.f26885d, 31), this.f26886e, 31), this.f26887f, 31), this.f26888g, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f26884c);
        sb2.append(", y1=");
        sb2.append(this.f26885d);
        sb2.append(", x2=");
        sb2.append(this.f26886e);
        sb2.append(", y2=");
        sb2.append(this.f26887f);
        sb2.append(", x3=");
        sb2.append(this.f26888g);
        sb2.append(", y3=");
        return x.i.i(sb2, this.f26889h, ')');
    }
}
