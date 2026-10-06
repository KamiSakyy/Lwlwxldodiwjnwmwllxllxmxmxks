package e01;

import f1.e;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public String a;

    public c(String str) {
        k.g(str, "path");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k.b(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return e.z("ContentDeletion(path=", this.a, ")");
    }
}
