package ci0;

import oj0.o3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final String a;
    public final o3 b;

    public h(String str, o3 o3Var) {
        this.a = str;
        this.b = o3Var;
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
