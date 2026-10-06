package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b8 {
    public String a;

    public b8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8) && k71.k.b(this.a, ((b8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteDiscussion(__typename=", this.a, ")");
    }
}
