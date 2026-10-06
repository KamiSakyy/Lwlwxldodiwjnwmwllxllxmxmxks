package ml;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public String a;
    public String b;

    public n(String str, String str2) {
        k71.k.g(str, "headBranchOid");
        k71.k.g(str2, "suggestedBranch");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("HeadRefAndBranchSuggestion(headBranchOid=", qb.a.a(this.a), ", suggestedBranch=", this.b, ")");
    }
}
