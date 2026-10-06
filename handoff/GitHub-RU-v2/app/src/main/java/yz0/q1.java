package yz0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q1 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;

    public q1(ArrayList arrayList, int i, int i2, int i3) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.a.equals(q1Var.a) && this.b == q1Var.b && this.c == q1Var.c && this.d == q1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + a0.s0.b(this.c, a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FilesChangedRefComparison(files=" + this.a + ", totalAdditions=" + this.b + ", totalDeletions=" + this.c + ", totalFilesChanged=" + this.d + ")";
    }
}
