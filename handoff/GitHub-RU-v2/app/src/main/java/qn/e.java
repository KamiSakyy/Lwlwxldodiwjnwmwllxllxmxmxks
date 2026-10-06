package qn;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public class e extends a.a {
    public String a;

    public e(String str) {
        k.g(str, "rawMessage");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k.b(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("AliveUnknownMessage(rawMessage=", this.a, ")");
    }
}
