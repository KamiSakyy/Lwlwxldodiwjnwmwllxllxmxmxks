package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xf {
    public String a;

    public xf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xf) && k71.k.b(this.a, ((xf) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnMarkdownFileType(contentRaw=", this.a, ")");
    }
}
