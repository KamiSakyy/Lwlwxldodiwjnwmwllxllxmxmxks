package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fn implements aaShadow.m0 {
    public final gn a;

    public fn(gn gnVar) {
        this.a = gnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fn) && k71.k.b(this.a, ((fn) obj).a);
    }

    public final int hashCode() {
        gn gnVar = this.a;
        if (gnVar == null) {
            return 0;
        }
        return gnVar.hashCode();
    }

    public final String toString() {
        return "Data(mobileEventsUpdate=" + this.a + ")";
    }
}
