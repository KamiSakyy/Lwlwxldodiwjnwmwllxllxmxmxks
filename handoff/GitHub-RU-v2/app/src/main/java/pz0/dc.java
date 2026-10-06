package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dc {
    public final Object a;
    public final String b;

    public dc(String str, String str2) {
        k71.k.g(str, "contents");
        k71.k.g(str2, "path");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return k71.k.b(this.a, dcVar.a) && k71.k.b(this.b, dcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileAddition(contents=" + this.a + ", path=" + this.b + ")";
    }
}
