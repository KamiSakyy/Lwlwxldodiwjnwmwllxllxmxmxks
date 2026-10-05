package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nu {
    public final String a;
    public final ap0.i0 b;

    public nu(String str, ap0.i0 i0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu)) {
            return false;
        }
        nu nuVar = (nu) obj;
        return k71.k.b(this.a, nuVar.a) && k71.k.b(this.b, nuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", discussionVotableFragment=" + this.b + ")";
    }
}
