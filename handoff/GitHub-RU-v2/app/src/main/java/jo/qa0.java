package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qa0 {
    public String a;
    public String b;

    public qa0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa0)) {
            return false;
        }
        qa0 qa0Var = (qa0) obj;
        return k71.k.b(this.a, qa0Var.a) && k71.k.b(this.b, qa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("OnBot(displayName=", this.a, ", id=", this.b, ")");
    }
}
