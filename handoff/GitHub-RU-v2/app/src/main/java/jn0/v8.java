package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v8 {
    public final String a;

    public v8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v8) && k71.k.b(this.a, ((v8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteDiscussion(__typename=", this.a, ")");
    }
}
