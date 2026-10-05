package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public final String a;

    public s(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && k71.k.b(this.a, ((s) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnPdfFileType(url=", this.a, ")");
    }
}
