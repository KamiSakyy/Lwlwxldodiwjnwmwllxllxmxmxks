package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yf {
    public final String a;

    public yf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yf) && k71.k.b(this.a, ((yf) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnTextFileType(contentRaw=", this.a, ")");
    }
}
