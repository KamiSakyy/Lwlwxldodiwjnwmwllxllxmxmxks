package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ee {
    public String a;
    public he b;
    public bl0.a c;

    public ee(String str, he heVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = heVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee)) {
            return false;
        }
        ee eeVar = (ee) obj;
        return k71.k.b(this.a, eeVar.a) && k71.k.b(this.b, eeVar.b) && k71.k.b(this.c, eeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        he heVar = this.b;
        int hashCode2 = (hashCode + (heVar == null ? 0 : heVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4Shadow.q(sb, this.c, ")");
    }
}
