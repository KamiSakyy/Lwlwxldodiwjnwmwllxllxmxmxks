package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wg0 {
    public final String a;
    public final String b;

    public wg0(String str, String str2) {
        k71.k.g(str, "titleId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        return k71.k.b(this.a, wg0Var.a) && k71.k.b(this.b, wg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("WorkflowDispatchInput(titleId=", this.a, ", value=", this.b, ")");
    }
}
