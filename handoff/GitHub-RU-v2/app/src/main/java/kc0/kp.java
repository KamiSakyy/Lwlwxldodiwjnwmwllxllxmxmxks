package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kp implements aaShadow.m0 {
    public final mp a;

    public kp(mp mpVar) {
        this.a = mpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp) && k71.k.b(this.a, ((kp) obj).a);
    }

    public final int hashCode() {
        mp mpVar = this.a;
        if (mpVar == null) {
            return 0;
        }
        return mpVar.hashCode();
    }

    public final String toString() {
        return "Data(rejectDeployments=" + this.a + ")";
    }
}
