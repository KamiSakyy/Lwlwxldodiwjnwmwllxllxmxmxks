package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gb {
    public String a;
    public uf0.p0 b;

    public gb(String str, uf0.p0 p0Var) {
        this.a = str;
        this.b = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return k71.k.b(this.a, gbVar.a) && k71.k.b(this.b, gbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnDiscussion(__typename=" + this.a + ", discussionFragment=" + this.b + ")";
    }
}
