package ey;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public final String a;
    public final q b;

    public o(String str, q qVar) {
        this.a = str;
        this.b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q qVar = this.b;
        return hashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        return "OnPullRequest(id=" + this.a + ", pullRequestStatus=" + this.b + ")";
    }
}
