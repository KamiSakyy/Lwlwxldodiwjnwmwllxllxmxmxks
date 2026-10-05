package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yu {
    public final String a;
    public final String b;

    public yu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu)) {
            return false;
        }
        yu yuVar = (yu) obj;
        return k71.k.b(this.a, yuVar.a) && k71.k.b(this.b, yuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Repository(id=", this.a, ", __typename=", this.b, ")");
    }
}
