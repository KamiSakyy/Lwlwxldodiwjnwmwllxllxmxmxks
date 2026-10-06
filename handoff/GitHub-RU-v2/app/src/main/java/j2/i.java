package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26868c;

    /* renamed from: d, reason: collision with root package name */
    public float f26869d;

    /* renamed from: e, reason: collision with root package name */
    public float f26870e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26871f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26872g;

    /* renamed from: h, reason: collision with root package name */
    public float f26873h;
    public float i;

    public i(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        super(3);
        this.f26868c = f6;
        this.f26869d = f10;
        this.f26870e = f11;
        this.f26871f = z10;
        this.f26872g = z11;
        this.f26873h = f12;
        this.i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f26868c, iVar.f26868c) == 0 && Float.compare(this.f26869d, iVar.f26869d) == 0 && Float.compare(this.f26870e, iVar.f26870e) == 0 && this.f26871f == iVar.f26871f && this.f26872g == iVar.f26872g && Float.compare(this.f26873h, iVar.f26873h) == 0 && Float.compare(this.i, iVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + x.i.b(x.i.e(x.i.e(x.i.b(x.i.b(Float.hashCode(this.f26868c) * 31, this.f26869d, 31), this.f26870e, 31), 31, this.f26871f), 31, this.f26872g), this.f26873h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f26868c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f26869d);
        sb2.append(", theta=");
        sb2.append(this.f26870e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f26871f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f26872g);
        sb2.append(", arcStartX=");
        sb2.append(this.f26873h);
        sb2.append(", arcStartY=");
        return x.i.i(sb2, this.i, ')');
    }

    public Object i;
}
