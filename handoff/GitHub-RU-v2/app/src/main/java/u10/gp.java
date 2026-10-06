package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gp {
    public final String a;
    public final op b;
    public final String c;

    public gp(String str, op opVar, String str2) {
        this.a = str;
        this.b = opVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        return k71.k.b(this.a, gpVar.a) && k71.k.b(this.b, gpVar.b) && k71.k.b(this.c, gpVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        op opVar = this.b;
        return this.c.hashCode() + ((hashCode + (opVar == null ? 0 : opVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ref(id=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
