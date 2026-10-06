package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l7 implements aa.h0 {
    public final String a;
    public final k7 b;
    public final String c;

    public l7(String str, k7 k7Var, String str2) {
        this.a = str;
        this.b = k7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        return k71.k.b(this.a, l7Var.a) && k71.k.b(this.b, l7Var.b) && k71.k.b(this.c, l7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k7 k7Var = this.b;
        return this.c.hashCode() + ((hashCode + (k7Var == null ? 0 : k7Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewerLatestReviewRequestFragment(id=");
        sb.append(this.a);
        sb.append(", viewerLatestReviewRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
