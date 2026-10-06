package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ny {
    public final String a;
    public final String b;

    public ny(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny)) {
            return false;
        }
        ny nyVar = (ny) obj;
        return k71.k.b(this.a, nyVar.a) && k71.k.b(this.b, nyVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return x.i.g("Readme(contentHTML=", this.a, ", path=", this.b, ")");
    }
}
