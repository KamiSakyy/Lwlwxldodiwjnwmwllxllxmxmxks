package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ry implements aaShadow.m0 {
    public final sy a;

    public ry(sy syVar) {
        this.a = syVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ry) && k71.k.b(this.a, ((ry) obj).a);
    }

    public final int hashCode() {
        sy syVar = this.a;
        if (syVar == null) {
            return 0;
        }
        return syVar.hashCode();
    }

    public final String toString() {
        return "Data(resolveReviewThread=" + this.a + ")";
    }
}
