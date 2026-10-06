package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s3 implements y3 {
    public long a;
    public String b;
    public String c;

    public s3(long j, String str, String str2) {
        k71.k.g(str, "eventType");
        k71.k.g(str2, "eventContent");
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    @Override // xn.y3
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return this.a == s3Var.a && k71.k.b(this.b, s3Var.b) && k71.k.b(this.c, s3Var.c);
    }

    public final int hashCode() {
        return (((this.c.hashCode() + com.github.rudroid.copilot.h1.i(Long.hashCode(this.a) * 31, this.b, 31)) * 31) + 678248351) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mobile(userDatabaseId=");
        sb.append(this.a);
        sb.append(", eventType=");
        sb.append(this.b);
        return no.a.q(sb, ", eventContent=", this.c, ", label=GitHub Mobile, url=null, globalId=null)");
    }
}
