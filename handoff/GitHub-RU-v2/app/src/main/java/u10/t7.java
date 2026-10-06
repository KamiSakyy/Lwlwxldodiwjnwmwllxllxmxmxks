package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t7 {
    public String a;

    public t7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7) && k71.k.b(this.a, ((t7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteDiscussion(__typename=", this.a, ")");
    }
}
