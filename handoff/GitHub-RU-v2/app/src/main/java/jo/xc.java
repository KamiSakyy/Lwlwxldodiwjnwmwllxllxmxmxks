package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xc {
    public String a;
    public is.p0 b;

    public xc(String str, is.p0 p0Var) {
        this.a = str;
        this.b = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj;
        return k71.k.b(this.a, xcVar.a) && k71.k.b(this.b, xcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnDiscussion(__typename=" + this.a + ", discussionFragment=" + this.b + ")";
    }
}
