package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 extends z1 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;

    public x0(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            x0 x0Var = (x0) ((z1) obj);
            String str2 = x0Var.c;
            if (this.a == x0Var.a && this.b.equals(x0Var.b) && ((str = this.c) != null ? str.equals(str2) : str2 == null) && this.d == x0Var.d && this.e == x0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return ((hashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return a0.s0.l(sb, this.e, "}");
    }
}
