package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public final String a;

    public r(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && k71.k.b(this.a, ((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnMarkdownFileType(__typename=", this.a, ")");
    }
}
