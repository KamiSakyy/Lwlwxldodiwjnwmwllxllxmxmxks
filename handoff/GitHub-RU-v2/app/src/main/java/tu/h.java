package tu;

import dw.m5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public String a;
    public m5 b;

    public h(String str, m5 m5Var) {
        this.a = str;
        this.b = m5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Readme(__typename=" + this.a + ", repositoryReadmeFragment=" + this.b + ")";
    }
}
