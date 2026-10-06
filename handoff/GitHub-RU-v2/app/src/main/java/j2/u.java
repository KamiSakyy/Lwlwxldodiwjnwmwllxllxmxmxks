package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class u extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f26950c;

    /* renamed from: d, reason: collision with root package name */
    public float f26951d;

    public u(float f6, float f10) {
        super(3);
        this.f26950c = f6;
        this.f26951d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f26950c, uVar.f26950c) == 0 && Float.compare(this.f26951d, uVar.f26951d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26951d) + (Float.hashCode(this.f26950c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f26950c);
        sb2.append(", dy=");
        return x.i.i(sb2, this.f26951d, ')');
    }
}
