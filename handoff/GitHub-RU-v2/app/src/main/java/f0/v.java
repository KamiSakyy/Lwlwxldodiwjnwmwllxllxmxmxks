package f0;

/* loaded from: /home/user/work/p/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final float f22377a;

    /* renamed from: b, reason: collision with root package name */
    public final d2.p f22378b;

    public v(float f6, d2.p pVar) {
        this.f22377a = f6;
        this.f22378b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return s3.f.b(this.f22377a, vVar.f22377a) && k71.k.b(this.f22378b, vVar.f22378b);
    }

    public final int hashCode() {
        return this.f22378b.hashCode() + (Float.hashCode(this.f22377a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorderStroke(width=");
        com.github.rudroid.copilot.h1.x(this.f22377a, sb2, ", brush=");
        sb2.append(this.f22378b);
        sb2.append(')');
        return sb2.toString();
    }
}
