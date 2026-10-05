package d20;

import aa.v0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements v0 {
    public final String a;

    public l(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && k71.k.b(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("Data(mobileUpdatesUrl=", this.a, ")");
    }
}
