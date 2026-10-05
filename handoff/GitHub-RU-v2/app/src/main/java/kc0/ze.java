package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ze {
    public final ve a;
    public final ue b;

    public ze(ve veVar, ue ueVar) {
        this.a = veVar;
        this.b = ueVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze)) {
            return false;
        }
        ze zeVar = (ze) obj;
        return k71.k.b(this.a, zeVar.a) && k71.k.b(this.b, zeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(following=" + this.a + ", followers=" + this.b + ")";
    }
}
