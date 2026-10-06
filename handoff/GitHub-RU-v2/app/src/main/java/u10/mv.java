package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mv {
    public jv a;
    public lv b;
    public String c;
    public String d;

    public mv(jv jvVar, lv lvVar, String str, String str2) {
        this.a = jvVar;
        this.b = lvVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv)) {
            return false;
        }
        mv mvVar = (mv) obj;
        return k71.k.b(this.a, mvVar.a) && k71.k.b(this.b, mvVar.b) && k71.k.b(this.c, mvVar.c) && k71.k.b(this.d, mvVar.d);
    }

    public final int hashCode() {
        jv jvVar = this.a;
        int hashCode = (jvVar == null ? 0 : jvVar.hashCode()) * 31;
        lv lvVar = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (lvVar != null ? lvVar.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(defaultBranchRef=");
        sb.append(this.a);
        sb.append(", refs=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
