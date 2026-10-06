package j2;

/* loaded from: /home/user/work/p/classes.dex */
public final class n extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f26905c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26906d;

    public n(float f6, float f10) {
        super(3);
        this.f26905c = f6;
        this.f26906d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f26905c, nVar.f26905c) == 0 && Float.compare(this.f26906d, nVar.f26906d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26906d) + (Float.hashCode(this.f26905c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f26905c);
        sb2.append(", y=");
        return x.i.i(sb2, this.f26906d, ')');
    }
}
