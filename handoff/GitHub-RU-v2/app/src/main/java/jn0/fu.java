package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fu {
    public final String a;
    public final String b;

    public fu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu)) {
            return false;
        }
        fu fuVar = (fu) obj;
        return k71.k.b(this.a, fuVar.a) && k71.k.b(this.b, fuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Parent1(id=", this.a, ", __typename=", this.b, ")");
    }
}
