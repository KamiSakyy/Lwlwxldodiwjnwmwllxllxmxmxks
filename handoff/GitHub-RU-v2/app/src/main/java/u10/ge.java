package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ge {
    public ce a;
    public be b;

    public ge(ce ceVar, be beVar) {
        this.a = ceVar;
        this.b = beVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return k71.k.b(this.a, geVar.a) && k71.k.b(this.b, geVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(following=" + this.a + ", followers=" + this.b + ")";
    }
}
