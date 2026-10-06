package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mk {
    public String a;
    public ok b;

    public mk(String str, ok okVar) {
        this.a = str;
        this.b = okVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk)) {
            return false;
        }
        mk mkVar = (mk) obj;
        return k71.k.b(this.a, mkVar.a) && k71.k.b(this.b, mkVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ok okVar = this.b;
        return hashCode + (okVar != null ? okVar.hashCode() : 0);
    }

    public final String toString() {
        return "MarkFileAsViewed(clientMutationId=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
