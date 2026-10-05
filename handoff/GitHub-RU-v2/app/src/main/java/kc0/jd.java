package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jd {
    public final String a;

    public jd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd) && k71.k.b(this.a, ((jd) obj).a);
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
