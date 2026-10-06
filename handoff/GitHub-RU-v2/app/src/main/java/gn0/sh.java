package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sh {
    public String a;
    public String b;

    public sh(String str, String str2) {
        k71.k.g(str, "commentId");
        k71.k.g(str2, "suggestedChangeId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj;
        return k71.k.b(this.a, shVar.a) && k71.k.b(this.b, shVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("MobileSuggestedChangeInput(commentId=", this.a, ", suggestedChangeId=", this.b, ")");
    }
}
