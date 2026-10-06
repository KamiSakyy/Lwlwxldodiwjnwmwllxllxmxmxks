package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bt {
    public final ft a;
    public final String b;

    public bt(ft ftVar, String str) {
        this.a = ftVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt)) {
            return false;
        }
        bt btVar = (bt) obj;
        return k71.k.b(this.a, btVar.a) && k71.k.b(this.b, btVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnOrganization(repositories=" + this.a + ", id=" + this.b + ")";
    }
}
