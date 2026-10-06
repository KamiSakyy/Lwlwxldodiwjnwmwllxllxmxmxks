package cr0;

import f1.e;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public String a;

    public a(String str) {
        k.g(str, "url");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return e.z("Template(url=", this.a, ")");
    }
}
