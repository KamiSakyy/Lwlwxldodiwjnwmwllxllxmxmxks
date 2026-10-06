package d0;

import a0.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public float f20946a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20947b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f20948c;

    public i(float f6, Object obj, a0 a0Var) {
        this.f20946a = f6;
        this.f20947b = obj;
        this.f20948c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f20946a, iVar.f20946a) == 0 && k71.k.b(this.f20947b, iVar.f20947b) && k71.k.b(this.f20948c, iVar.f20948c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f20946a) * 31;
        Object obj = this.f20947b;
        return this.f20948c.hashCode() + ((hashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        return "Keyframe(fraction=" + this.f20946a + ", value=" + this.f20947b + ", interpolator=" + this.f20948c + ')';
    }
}
