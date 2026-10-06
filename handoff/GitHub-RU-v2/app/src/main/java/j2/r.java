package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class r extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26925c;

    /* renamed from: d, reason: collision with root package name */
    public float f26926d;

    /* renamed from: e, reason: collision with root package name */
    public float f26927e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26928f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26929g;

    /* renamed from: h, reason: collision with root package name */
    public float f26930h;
    public float i;

    public r(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        super(3);
        this.f26925c = f6;
        this.f26926d = f10;
        this.f26927e = f11;
        this.f26928f = z10;
        this.f26929g = z11;
        this.f26930h = f12;
        this.i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f26925c, rVar.f26925c) == 0 && Float.compare(this.f26926d, rVar.f26926d) == 0 && Float.compare(this.f26927e, rVar.f26927e) == 0 && this.f26928f == rVar.f26928f && this.f26929g == rVar.f26929g && Float.compare(this.f26930h, rVar.f26930h) == 0 && Float.compare(this.i, rVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + x.i.b(x.i.e(x.i.e(x.i.b(x.i.b(Float.hashCode(this.f26925c) * 31, this.f26926d, 31), this.f26927e, 31), 31, this.f26928f), 31, this.f26929g), this.f26930h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f26925c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f26926d);
        sb2.append(", theta=");
        sb2.append(this.f26927e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f26928f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f26929g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f26930h);
        sb2.append(", arcStartDy=");
        return x.i.i(sb2, this.i, ')');
    }

    public Object i;
}
