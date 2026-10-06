package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p3 implements y3 {
    public long a;
    public String b;
    public String c;
    public String d;

    public p3(long j, String str, String str2, String str3) {
        k71.k.g(str, "eventType");
        k71.k.g(str2, "eventContent");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // xn.y3
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return this.a == p3Var.a && k71.k.b(this.b, p3Var.b) && k71.k.b(this.c, p3Var.c) && k71.k.b(this.d, p3Var.d);
    }

    public final int hashCode() {
        int hashCode = (((this.c.hashCode() + com.github.rudroid.copilot.h1.i(Long.hashCode(this.a) * 31, this.b, 31)) * 31) + 2309070) * 31;
        String str = this.d;
        return (hashCode + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JiraIssue(userDatabaseId=");
        sb.append(this.a);
        sb.append(", eventType=");
        sb.append(this.b);
        f1.e.x(sb, ", eventContent=", this.c, ", label=Jira, url=", this.d);
        sb.append(", globalId=null)");
        return sb.toString();
    }
}
