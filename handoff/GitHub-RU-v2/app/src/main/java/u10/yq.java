package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yq {
    public String a;
    public la0.c b;

    public yq(String str, la0.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq)) {
            return false;
        }
        yq yqVar = (yq) obj;
        return k71.k.b(this.a, yqVar.a) && k71.k.b(this.b, yqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", discussionVotableFragment=" + this.b + ")";
    }
    public yq(String p1, Object p2) {
    }
}
