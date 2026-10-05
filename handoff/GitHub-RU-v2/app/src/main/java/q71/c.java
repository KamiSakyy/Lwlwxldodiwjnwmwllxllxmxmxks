package q71;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        char c10 = this.f30987r;
        char c11 = this.f30988s;
        if (k.h(c10, c11) > 0) {
            c cVar = (c) obj;
            if (k.h(cVar.f30987r, cVar.f30988s) > 0) {
                return true;
            }
        }
        c cVar2 = (c) obj;
        return c10 == cVar2.f30987r && c11 == cVar2.f30988s;
    }

    public final int hashCode() {
        char c10 = this.f30987r;
        char c11 = this.f30988s;
        if (k.h(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f30987r + ".." + this.f30988s;
    }
}
