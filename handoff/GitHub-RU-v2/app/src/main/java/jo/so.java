package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class so implements aaShadow.v0 {
    public uo a;
    public String b;
    public String c;

    public so(uo uoVar, String str, String str2) {
        this.a = uoVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so)) {
            return false;
        }
        so soVar = (so) obj;
        return k71.k.b(this.a, soVar.a) && k71.k.b(this.b, soVar.b) && k71.k.b(this.c, soVar.c);
    }

    public final int hashCode() {
        uo uoVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((uoVar == null ? 0 : uoVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(mobileCopilotPaywall=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
