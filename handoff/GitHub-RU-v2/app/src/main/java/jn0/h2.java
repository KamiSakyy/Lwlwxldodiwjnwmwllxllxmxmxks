package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h2 {
    public final String a;

    public h2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2) && k71.k.b(this.a, ((h2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("ApplyMobileSuggestedChanges(__typename=", this.a, ")");
    }
}
