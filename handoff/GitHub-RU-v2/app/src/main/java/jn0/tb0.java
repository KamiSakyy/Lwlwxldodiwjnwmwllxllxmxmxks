package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tb0 {
    public String a;
    public ac0 b;
    public String c;

    public tb0(String str, ac0 ac0Var, String str2) {
        this.a = str;
        this.b = ac0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb0)) {
            return false;
        }
        tb0 tb0Var = (tb0) obj;
        return k71.k.b(this.a, tb0Var.a) && k71.k.b(this.b, tb0Var.b) && k71.k.b(this.c, tb0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ac0 ac0Var = this.b;
        return this.c.hashCode() + ((hashCode + (ac0Var == null ? 0 : Boolean.hashCode(ac0Var.a))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeadRef(id=");
        sb.append(this.a);
        sb.append(", refUpdateRule=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
