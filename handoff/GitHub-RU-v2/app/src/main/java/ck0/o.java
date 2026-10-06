package ck0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public String a;

    public o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && k71.k.b(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnSearchShortcutQueryText(term=", this.a, ")");
    }
}
