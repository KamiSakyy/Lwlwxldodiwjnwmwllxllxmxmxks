package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class o extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26907c;

    /* renamed from: d, reason: collision with root package name */
    public float f26908d;

    /* renamed from: e, reason: collision with root package name */
    public float f26909e;

    /* renamed from: f, reason: collision with root package name */
    public float f26910f;

    public o(float f6, float f10, float f11, float f12) {
        super(1);
        this.f26907c = f6;
        this.f26908d = f10;
        this.f26909e = f11;
        this.f26910f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f26907c, oVar.f26907c) == 0 && Float.compare(this.f26908d, oVar.f26908d) == 0 && Float.compare(this.f26909e, oVar.f26909e) == 0 && Float.compare(this.f26910f, oVar.f26910f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26910f) + x.i.b(x.i.b(Float.hashCode(this.f26907c) * 31, this.f26908d, 31), this.f26909e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f26907c);
        sb2.append(", y1=");
        sb2.append(this.f26908d);
        sb2.append(", x2=");
        sb2.append(this.f26909e);
        sb2.append(", y2=");
        return x.i.i(sb2, this.f26910f, ')');
    }
}
