package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class p extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f26915c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26916d;

    /* renamed from: e, reason: collision with root package name */
    public final float f26917e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26918f;

    public p(float f6, float f10, float f11, float f12) {
        super(2);
        this.f26915c = f6;
        this.f26916d = f10;
        this.f26917e = f11;
        this.f26918f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f26915c, pVar.f26915c) == 0 && Float.compare(this.f26916d, pVar.f26916d) == 0 && Float.compare(this.f26917e, pVar.f26917e) == 0 && Float.compare(this.f26918f, pVar.f26918f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26918f) + x.i.b(x.i.b(Float.hashCode(this.f26915c) * 31, this.f26916d, 31), this.f26917e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f26915c);
        sb2.append(", y1=");
        sb2.append(this.f26916d);
        sb2.append(", x2=");
        sb2.append(this.f26917e);
        sb2.append(", y2=");
        return x.i.i(sb2, this.f26918f, ')');
    }
}
