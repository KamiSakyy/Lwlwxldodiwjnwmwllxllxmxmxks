package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class og {
    public String a;
    public qg b;

    public og(String str, qg qgVar) {
        this.a = str;
        this.b = qgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og)) {
            return false;
        }
        og ogVar = (og) obj;
        return k71.k.b(this.a, ogVar.a) && k71.k.b(this.b, ogVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        qg qgVar = this.b;
        return hashCode + (qgVar != null ? qgVar.hashCode() : 0);
    }

    public final String toString() {
        return "MarkFileAsViewed(clientMutationId=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
