package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 extends h2 {
    public final g2 a;
    public final String b;
    public final String c;
    public final long d;

    public e1(f1 f1Var, String str, String str2, long j) {
        this.a = f1Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            e1 e1Var = (e1) ((h2) obj);
            if (this.a.equals(e1Var.a) && this.b.equals(e1Var.b) && this.c.equals(e1Var.c) && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return a0.s0.f(this.d, "}", sb);
    }
}
