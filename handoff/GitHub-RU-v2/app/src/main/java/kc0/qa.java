package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qa {
    public String a;

    public qa(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qa) && k71.k.b(this.a, ((qa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Owner(id=", this.a, ")");
    }
}
