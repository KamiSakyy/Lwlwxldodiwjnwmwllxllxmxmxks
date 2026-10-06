package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 extends q1 {
    public String a;
    public String b;

    public f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            f0 f0Var = (f0) ((q1) obj);
            if (this.a.equals(f0Var.a) && this.b.equals(f0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return com.github.rudroid.copilot.h1.p(sb, this.b, "}");
    }
}
