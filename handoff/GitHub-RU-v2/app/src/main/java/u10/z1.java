package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 {
    public final String a;
    public final la0.c b;

    public z1(String str, la0.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return k71.k.b(this.a, z1Var.a) && k71.k.b(this.b, z1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", discussionVotableFragment=" + this.b + ")";
    }
}
