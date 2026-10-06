package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o3 implements y3 {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Long g;
    public Long h;

    public o3(long j, String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        k71.k.g(str, "eventType");
        k71.k.g(str2, "eventContent");
        k71.k.g(str5, "issueUrl");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = l;
        this.h = l2;
    }

    @Override // xn.y3
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return this.a == o3Var.a && k71.k.b(this.b, o3Var.b) && k71.k.b(this.c, o3Var.c) && this.d.equals(o3Var.d) && k71.k.b(this.e, o3Var.e) && k71.k.b(this.f, o3Var.f) && k71.k.b(this.g, o3Var.g) && k71.k.b(this.h, o3Var.h);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
        String str = this.e;
        int i2 = com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 961, this.f, 31);
        Long l = this.g;
        int hashCode = (i2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Issue(userDatabaseId=");
        sb.append(this.a);
        sb.append(", eventType=");
        sb.append(this.b);
        f1.e.x(sb, ", eventContent=", this.c, ", label=", this.d);
        f1.e.x(sb, ", url=", this.e, ", globalId=null, issueUrl=", this.f);
        sb.append(", issueNumber=");
        sb.append(this.g);
        sb.append(", issueId=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
