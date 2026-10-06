package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public String a;
    public h b;

    public k(String str, h hVar) {
        this.a = str;
        this.b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Fields(__typename=" + this.a + ", projectV2FieldConfigurationConnectionFragment=" + this.b + ")";
    }
}
