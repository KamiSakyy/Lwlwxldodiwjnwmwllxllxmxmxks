package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ok {
    public final String a;
    public final String b;

    public ok(String str, String str2) {
        k71.k.g(str, "commentId");
        k71.k.g(str2, "suggestedChangeId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok)) {
            return false;
        }
        ok okVar = (ok) obj;
        return k71.k.b(this.a, okVar.a) && k71.k.b(this.b, okVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("MobileSuggestedChangeInput(commentId=", this.a, ", suggestedChangeId=", this.b, ")");
    }
}
