package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r3 implements y3 {
    public long a;
    public String b;
    public String c;
    public String d;
    public Long e;

    public r3(long j, String str, String str2, String str3, Long l) {
        k71.k.g(str, "eventType");
        k71.k.g(str2, "eventContent");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
    }

    @Override // xn.y3
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return this.a == r3Var.a && k71.k.b(this.b, r3Var.b) && k71.k.b(this.c, r3Var.c) && k71.k.b(this.d, r3Var.d) && k71.k.b(this.e, r3Var.e);
    }

    public final int hashCode() {
        int hashCode = (((this.c.hashCode() + com.github.rudroid.copilot.h1.i(Long.hashCode(this.a) * 31, this.b, 31)) * 31) + 350683225) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
        Long l = this.e;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergeConflict(userDatabaseId=");
        sb.append(this.a);
        sb.append(", eventType=");
        sb.append(this.b);
        f1.e.x(sb, ", eventContent=", this.c, ", label=a merge conflict, url=", this.d);
        sb.append(", globalId=null, pullRequestId=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
