package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cd0 {
    public String a;
    public String b;
    public gt.a c;

    public cd0(String str, String str2, gt.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd0)) {
            return false;
        }
        cd0 cd0Var = (cd0) obj;
        return k71.k.b(this.a, cd0Var.a) && k71.k.b(this.b, cd0Var.b) && k71.k.b(this.c, cd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("IssueType(__typename=", this.a, ", id=", this.b, ", issueTypeFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public cd0(String p1, String p2, Object p3) {
    }
}
