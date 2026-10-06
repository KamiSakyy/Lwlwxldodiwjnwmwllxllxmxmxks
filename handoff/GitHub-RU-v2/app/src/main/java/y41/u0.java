package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 extends y1 {
    public String a;
    public String b;
    public long c;

    public u0(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            u0 u0Var = (u0) ((y1) obj);
            if (this.a.equals(u0Var.a) && this.b.equals(u0Var.b) && this.c == u0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return a0.s0.f(this.c, "}", sb);
    }
}
