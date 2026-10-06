package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ya {
    public String a;
    public e50.l0 b;

    public ya(String str, e50.l0 l0Var) {
        this.a = str;
        this.b = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya)) {
            return false;
        }
        ya yaVar = (ya) obj;
        return k71.k.b(this.a, yaVar.a) && k71.k.b(this.b, yaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnDiscussion(__typename=" + this.a + ", discussionFragment=" + this.b + ")";
    }
}
