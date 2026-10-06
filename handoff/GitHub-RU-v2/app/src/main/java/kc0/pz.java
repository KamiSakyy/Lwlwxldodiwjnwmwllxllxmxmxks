package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pz implements aaShadow.v0 {
    public final tz a;

    public pz(tz tzVar) {
        this.a = tzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pz) && k71.k.b(this.a, ((pz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(search=" + this.a + ")";
    }
}
