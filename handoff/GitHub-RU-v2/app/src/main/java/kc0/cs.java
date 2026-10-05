package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cs {
    public final String a;
    public final sd0.k b;

    public cs(String str, sd0.k kVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        return k71.k.b(this.a, csVar.a) && k71.k.b(this.b, csVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", discussionVotableFragment=" + this.b + ")";
    }
}
