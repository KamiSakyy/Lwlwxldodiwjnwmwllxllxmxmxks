package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class v extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f26953c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26954d;

    public v(float f6, float f10) {
        super(3);
        this.f26953c = f6;
        this.f26954d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f26953c, vVar.f26953c) == 0 && Float.compare(this.f26954d, vVar.f26954d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26954d) + (Float.hashCode(this.f26953c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f26953c);
        sb2.append(", dy=");
        return x.i.i(sb2, this.f26954d, ')');
    }
}
