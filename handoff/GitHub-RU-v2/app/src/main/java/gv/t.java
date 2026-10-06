package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public String a;

    public t(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && k71.k.b(this.a, ((t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnTextFileType(__typename=", this.a, ")");
    }
}
