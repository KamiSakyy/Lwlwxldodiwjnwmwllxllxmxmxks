package jv0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public final String a;

    public n(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && k71.k.b(this.a, ((n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnSearchShortcutQueryText(term=", this.a, ")");
    }
}
