package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class w extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26956c;

    /* renamed from: d, reason: collision with root package name */
    public float f26957d;

    /* renamed from: e, reason: collision with root package name */
    public float f26958e;

    /* renamed from: f, reason: collision with root package name */
    public float f26959f;

    public w(float f6, float f10, float f11, float f12) {
        super(1);
        this.f26956c = f6;
        this.f26957d = f10;
        this.f26958e = f11;
        this.f26959f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f26956c, wVar.f26956c) == 0 && Float.compare(this.f26957d, wVar.f26957d) == 0 && Float.compare(this.f26958e, wVar.f26958e) == 0 && Float.compare(this.f26959f, wVar.f26959f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26959f) + x.i.b(x.i.b(Float.hashCode(this.f26956c) * 31, this.f26957d, 31), this.f26958e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f26956c);
        sb2.append(", dy1=");
        sb2.append(this.f26957d);
        sb2.append(", dx2=");
        sb2.append(this.f26958e);
        sb2.append(", dy2=");
        return x.i.i(sb2, this.f26959f, ')');
    }
}
