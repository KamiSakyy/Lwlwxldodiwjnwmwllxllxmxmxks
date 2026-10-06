package vo;

import m10.b4;
import m10.t3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r2 {
    public String a;
    public b4 b;
    public t3 c;
    public String d;
    public x2 e;
    public u2 f;
    public int g;
    public q2 h;
    public s2 i;
    public String j;

    public r2(String str, b4 b4Var, t3 t3Var, String str2, x2 x2Var, u2 u2Var, int i, q2 q2Var, s2 s2Var, String str3) {
        this.a = str;
        this.b = b4Var;
        this.c = t3Var;
        this.d = str2;
        this.e = x2Var;
        this.f = u2Var;
        this.g = i;
        this.h = q2Var;
        this.i = s2Var;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return k71.k.b(this.a, r2Var.a) && this.b == r2Var.b && this.c == r2Var.c && k71.k.b(this.d, r2Var.d) && k71.k.b(this.e, r2Var.e) && k71.k.b(this.f, r2Var.f) && this.g == r2Var.g && k71.k.b(this.h, r2Var.h) && k71.k.b(this.i, r2Var.i) && k71.k.b(this.j, r2Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        t3 t3Var = this.c;
        int hashCode2 = (hashCode + (t3Var == null ? 0 : t3Var.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        u2 u2Var = this.f;
        int b = a0.s0.b(this.g, (hashCode3 + (u2Var == null ? 0 : u2Var.hashCode())) * 31, 31);
        q2 q2Var = this.h;
        int hashCode4 = (b + (q2Var == null ? 0 : q2Var.hashCode())) * 31;
        s2 s2Var = this.i;
        return this.j.hashCode() + ((hashCode4 + (s2Var != null ? s2Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CheckSuite(id=" + this.a + ", status=" + this.b + ", conclusion=" + this.c + ", workflowFilePath=" + this.d + ", repository=" + this.e + ", matchingPullRequests=" + this.f + ", duration=" + this.g + ", branch=" + this.h + ", creator=" + this.i + ", __typename=" + this.j + ")";
    }
}
