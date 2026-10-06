package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s9 {
    public String a;

    public s9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9) && k71.k.b(this.a, ((s9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteDiscussion(__typename=", this.a, ")");
    }
}
