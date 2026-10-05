package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hj {
    public final String a;
    public final jj b;

    public hj(String str, jj jjVar) {
        this.a = str;
        this.b = jjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj)) {
            return false;
        }
        hj hjVar = (hj) obj;
        return k71.k.b(this.a, hjVar.a) && k71.k.b(this.b, hjVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        jj jjVar = this.b;
        return hashCode + (jjVar != null ? jjVar.hashCode() : 0);
    }

    public final String toString() {
        return "MarkFileAsViewed(clientMutationId=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
