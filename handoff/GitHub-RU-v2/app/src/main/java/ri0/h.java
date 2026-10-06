package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;

    public h(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && k71.k.b(this.a, ((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnMarkdownFileType(__typename=", this.a, ")");
    }
}
