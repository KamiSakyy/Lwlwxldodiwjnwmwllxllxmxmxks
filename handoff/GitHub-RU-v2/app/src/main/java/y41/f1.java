package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1 extends g2 {
    public final String a;
    public final String b;

    public f1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            f1 f1Var = (f1) ((g2) obj);
            if (this.a.equals(f1Var.a) && this.b.equals(f1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return com.github.rudroid.copilot.h1.p(sb, this.b, "}");
    }
}
