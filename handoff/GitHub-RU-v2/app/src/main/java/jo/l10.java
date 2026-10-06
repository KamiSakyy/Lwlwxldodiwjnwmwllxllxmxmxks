package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l10 {
    public String a;
    public String b;

    public l10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l10)) {
            return false;
        }
        l10 l10Var = (l10) obj;
        return k71.k.b(this.a, l10Var.a) && k71.k.b(this.b, l10Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return x.i.g("PullRequestTemplate(filename=", this.a, ", body=", this.b, ")");
    }
}
