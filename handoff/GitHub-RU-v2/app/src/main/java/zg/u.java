package zg;

import a0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public int a;
    public int b;
    public int c;

    public u(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b == uVar.b && this.c == uVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + s0.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return s0.l(x.i.m(this.a, this.b, "FilesChangedDetails(changedFiles=", ", additions=", ", deletions="), this.c, ")");
    }
}
