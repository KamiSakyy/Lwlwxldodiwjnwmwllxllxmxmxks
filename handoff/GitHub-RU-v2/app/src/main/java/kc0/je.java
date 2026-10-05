package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class je {
    public final String a;
    public final ee b;
    public final String c;

    public je(String str, ee eeVar, String str2) {
        this.a = str;
        this.b = eeVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je)) {
            return false;
        }
        je jeVar = (je) obj;
        return k71.k.b(this.a, jeVar.a) && k71.k.b(this.b, jeVar.b) && k71.k.b(this.c, jeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ee eeVar = this.b;
        return this.c.hashCode() + ((hashCode + (eeVar == null ? 0 : eeVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", gitObject=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
