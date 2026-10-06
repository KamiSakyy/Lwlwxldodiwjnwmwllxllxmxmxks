package q01;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements a {
    public String a;

    public j(String str) {
        k71.k.g(str, "term");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k71.k.b(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("SearchShortcutQueryText(term=", this.a, ")");
    }
}
