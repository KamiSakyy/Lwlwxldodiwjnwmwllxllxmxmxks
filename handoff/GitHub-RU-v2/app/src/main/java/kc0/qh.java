package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qh {
    public String a;
    public sh b;

    public qh(String str, sh shVar) {
        this.a = str;
        this.b = shVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh)) {
            return false;
        }
        qh qhVar = (qh) obj;
        return k71.k.b(this.a, qhVar.a) && k71.k.b(this.b, qhVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        sh shVar = this.b;
        return hashCode + (shVar != null ? shVar.hashCode() : 0);
    }

    public final String toString() {
        return "MarkFileAsViewed(clientMutationId=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
