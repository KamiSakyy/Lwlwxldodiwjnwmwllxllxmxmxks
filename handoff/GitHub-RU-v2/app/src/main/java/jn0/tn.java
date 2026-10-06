package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tn {
    public String a;
    public String b;

    public tn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn)) {
            return false;
        }
        tn tnVar = (tn) obj;
        return k71.k.b(this.a, tnVar.a) && k71.k.b(this.b, tnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ReplyTo(id=", this.a, ", __typename=", this.b, ")");
    }
}
