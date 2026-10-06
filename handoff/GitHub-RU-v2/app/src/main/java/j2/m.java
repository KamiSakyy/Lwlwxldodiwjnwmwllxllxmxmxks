package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class m extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26902c;

    /* renamed from: d, reason: collision with root package name */
    public float f26903d;

    public m(float f6, float f10) {
        super(3);
        this.f26902c = f6;
        this.f26903d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f26902c, mVar.f26902c) == 0 && Float.compare(this.f26903d, mVar.f26903d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26903d) + (Float.hashCode(this.f26902c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f26902c);
        sb2.append(", y=");
        return x.i.i(sb2, this.f26903d, ')');
    }
}
