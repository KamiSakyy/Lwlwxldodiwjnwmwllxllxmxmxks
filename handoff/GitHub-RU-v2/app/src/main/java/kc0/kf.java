package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kf implements aa.m0 {
    public final lf a;

    public kf(lf lfVar) {
        this.a = lfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf) && k71.k.b(this.a, ((kf) obj).a);
    }

    public final int hashCode() {
        lf lfVar = this.a;
        if (lfVar == null) {
            return 0;
        }
        return lfVar.hashCode();
    }

    public final String toString() {
        return "Data(followUser=" + this.a + ")";
    }
}
