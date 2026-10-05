package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mw {
    public final String a;
    public final String b;

    public mw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw)) {
            return false;
        }
        mw mwVar = (mw) obj;
        return k71.k.b(this.a, mwVar.a) && k71.k.b(this.b, mwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Repository(id=", this.a, ", __typename=", this.b, ")");
    }
}
