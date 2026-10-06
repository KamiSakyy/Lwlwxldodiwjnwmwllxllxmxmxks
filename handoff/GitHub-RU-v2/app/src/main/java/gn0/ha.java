package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ha {
    public final Object a;
    public final String b;

    public ha(String str, String str2) {
        k71.k.g(str, "contents");
        k71.k.g(str2, "path");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha)) {
            return false;
        }
        ha haVar = (ha) obj;
        return k71.k.b(this.a, haVar.a) && k71.k.b(this.b, haVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileAddition(contents=" + this.a + ", path=" + this.b + ")";
    }
}
