package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ba0 {
    public String a;
    public String b;

    public ba0(String str, String str2) {
        k71.k.g(str, "titleId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba0)) {
            return false;
        }
        ba0 ba0Var = (ba0) obj;
        return k71.k.b(this.a, ba0Var.a) && k71.k.b(this.b, ba0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("WorkflowDispatchInput(titleId=", this.a, ", value=", this.b, ")");
    }
}
