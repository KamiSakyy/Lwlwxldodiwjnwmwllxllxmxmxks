package wc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n2 {
    public String a;
    public gn0.r2 b;
    public gn0.l2 c;
    public String d;
    public t2 e;
    public q2 f;
    public int g;
    public m2 h;
    public o2 i;
    public String j;

    public n2(String str, gn0.r2 r2Var, gn0.l2 l2Var, String str2, t2 t2Var, q2 q2Var, int i, m2 m2Var, o2 o2Var, String str3) {
        this.a = str;
        this.b = r2Var;
        this.c = l2Var;
        this.d = str2;
        this.e = t2Var;
        this.f = q2Var;
        this.g = i;
        this.h = m2Var;
        this.i = o2Var;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return k71.k.b(this.a, n2Var.a) && this.b == n2Var.b && this.c == n2Var.c && k71.k.b(this.d, n2Var.d) && k71.k.b(this.e, n2Var.e) && k71.k.b(this.f, n2Var.f) && this.g == n2Var.g && k71.k.b(this.h, n2Var.h) && k71.k.b(this.i, n2Var.i) && k71.k.b(this.j, n2Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        gn0.l2 l2Var = this.c;
        int hashCode2 = (hashCode + (l2Var == null ? 0 : l2Var.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        q2 q2Var = this.f;
        int b = a0.s0.b(this.g, (hashCode3 + (q2Var == null ? 0 : q2Var.hashCode())) * 31, 31);
        m2 m2Var = this.h;
        int hashCode4 = (b + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        o2 o2Var = this.i;
        return this.j.hashCode() + ((hashCode4 + (o2Var != null ? o2Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CheckSuite(id=" + this.a + ", status=" + this.b + ", conclusion=" + this.c + ", workflowFilePath=" + this.d + ", repository=" + this.e + ", matchingPullRequests=" + this.f + ", duration=" + this.g + ", branch=" + this.h + ", creator=" + this.i + ", __typename=" + this.j + ")";
    }
}
