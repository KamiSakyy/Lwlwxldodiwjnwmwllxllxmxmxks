package o10;

import f1.e;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;

    public a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return e.z("ViewerTemplateRepositoriesParameters(query=", this.a, ")");
    }
}
