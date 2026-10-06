package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ic {
    public String a;
    public m10.n40 b;
    public hc c;
    public boolean d;
    public String e;

    public ic(String str, m10.n40 n40Var, hc hcVar, boolean z, String str2) {
        this.a = str;
        this.b = n40Var;
        this.c = hcVar;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj;
        return k71.k.b(this.a, icVar.a) && this.b == icVar.b && k71.k.b(this.c, icVar.c) && this.d == icVar.d && k71.k.b(this.e, icVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m10.n40 n40Var = this.b;
        return this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i((hashCode + (n40Var == null ? 0 : n40Var.hashCode())) * 31, this.c.a, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", viewerPermission=");
        sb.append(this.b);
        sb.append(", owner=");
        sb.append(this.c);
        sb.append(", hasNestedDiscussionAnswersEnabled=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
