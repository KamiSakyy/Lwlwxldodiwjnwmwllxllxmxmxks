package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class s extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26933c;

    /* renamed from: d, reason: collision with root package name */
    public float f26934d;

    /* renamed from: e, reason: collision with root package name */
    public float f26935e;

    /* renamed from: f, reason: collision with root package name */
    public float f26936f;

    /* renamed from: g, reason: collision with root package name */
    public float f26937g;

    /* renamed from: h, reason: collision with root package name */
    public float f26938h;

    public s(float f6, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f26933c = f6;
        this.f26934d = f10;
        this.f26935e = f11;
        this.f26936f = f12;
        this.f26937g = f13;
        this.f26938h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f26933c, sVar.f26933c) == 0 && Float.compare(this.f26934d, sVar.f26934d) == 0 && Float.compare(this.f26935e, sVar.f26935e) == 0 && Float.compare(this.f26936f, sVar.f26936f) == 0 && Float.compare(this.f26937g, sVar.f26937g) == 0 && Float.compare(this.f26938h, sVar.f26938h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26938h) + x.i.b(x.i.b(x.i.b(x.i.b(Float.hashCode(this.f26933c) * 31, this.f26934d, 31), this.f26935e, 31), this.f26936f, 31), this.f26937g, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f26933c);
        sb2.append(", dy1=");
        sb2.append(this.f26934d);
        sb2.append(", dx2=");
        sb2.append(this.f26935e);
        sb2.append(", dy2=");
        sb2.append(this.f26936f);
        sb2.append(", dx3=");
        sb2.append(this.f26937g);
        sb2.append(", dy3=");
        return x.i.i(sb2, this.f26938h, ')');
    }
}
