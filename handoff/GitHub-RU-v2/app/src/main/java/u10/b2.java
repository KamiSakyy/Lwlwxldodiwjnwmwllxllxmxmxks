package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 {
    public final String a;

    public b2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2) && k71.k.b(this.a, ((b2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("ApplyMobileSuggestedChanges(__typename=", this.a, ")");
    }
}
