package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qj0 {
    public String a;
    public mj0 b;
    public String c;

    public qj0(String str, mj0 mj0Var, String str2) {
        this.a = str;
        this.b = mj0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj0)) {
            return false;
        }
        qj0 qj0Var = (qj0) obj;
        return k71.k.b(this.a, qj0Var.a) && k71.k.b(this.b, qj0Var.b) && k71.k.b(this.c, qj0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mj0 mj0Var = this.b;
        return this.c.hashCode() + ((hashCode + (mj0Var == null ? 0 : mj0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", issueOrPullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
