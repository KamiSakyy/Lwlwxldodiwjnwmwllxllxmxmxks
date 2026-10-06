package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uu {
    public String a;
    public su b;
    public tu c;
    public String d;

    public uu(String str, su suVar, tu tuVar, String str2) {
        this.a = str;
        this.b = suVar;
        this.c = tuVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu)) {
            return false;
        }
        uu uuVar = (uu) obj;
        return k71.k.b(this.a, uuVar.a) && k71.k.b(this.b, uuVar.b) && k71.k.b(this.c, uuVar.c) && k71.k.b(this.d, uuVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        su suVar = this.b;
        int hashCode2 = (hashCode + (suVar == null ? 0 : suVar.hashCode())) * 31;
        tu tuVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (tuVar != null ? tuVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Repository(id=" + this.a + ", gitObject=" + this.b + ", ref=" + this.c + ", __typename=" + this.d + ")";
    }
}
