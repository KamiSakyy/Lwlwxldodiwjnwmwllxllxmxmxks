package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class y extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f26966c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26967d;

    public y(float f6, float f10) {
        super(1);
        this.f26966c = f6;
        this.f26967d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f26966c, yVar.f26966c) == 0 && Float.compare(this.f26967d, yVar.f26967d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26967d) + (Float.hashCode(this.f26966c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f26966c);
        sb2.append(", dy=");
        return x.i.i(sb2, this.f26967d, ')');
    }
}
