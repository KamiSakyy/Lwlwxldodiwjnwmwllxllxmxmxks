package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fw {
    public final String a;
    public final cw b;
    public final String c;

    public fw(String str, cw cwVar, String str2) {
        this.a = str;
        this.b = cwVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw)) {
            return false;
        }
        fw fwVar = (fw) obj;
        return k71.k.b(this.a, fwVar.a) && k71.k.b(this.b, fwVar.b) && k71.k.b(this.c, fwVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cw cwVar = this.b;
        return this.c.hashCode() + ((hashCode + (cwVar == null ? 0 : cwVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubIssue(id=");
        sb.append(this.a);
        sb.append(", parent=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
