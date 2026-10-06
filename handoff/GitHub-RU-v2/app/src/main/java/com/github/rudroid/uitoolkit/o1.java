package com.github.rudroid.uitoolkit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 {
    public final int a;
    public final long b;

    public o1(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.a == o1Var.a && d2.t.c(this.b, o1Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        int i = d2.t.l;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "ProgressSegment(count=" + this.a + ", color=" + d2.t.i(this.b) + ")";
    }
}
