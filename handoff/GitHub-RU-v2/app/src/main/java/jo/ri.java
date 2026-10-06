package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ri {
    public String a;
    public String b;
    public ct.u c;

    public ri(String str, String str2, ct.u uVar) {
        this.a = str;
        this.b = str2;
        this.c = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri)) {
            return false;
        }
        ri riVar = (ri) obj;
        return k71.k.b(this.a, riVar.a) && k71.k.b(this.b, riVar.b) && k71.k.b(this.c, riVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnIssue(__typename=", this.a, ", id=", this.b, ", issueListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
