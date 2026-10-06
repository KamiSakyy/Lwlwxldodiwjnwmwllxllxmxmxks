package com.github.rudroid.agents.sessionevents;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f7669a;

    /* renamed from: b, reason: collision with root package name */
    public int f7670b;

    /* renamed from: c, reason: collision with root package name */
    public int f7671c;

    /* renamed from: d, reason: collision with root package name */
    public int f7672d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f7673e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7674f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7675g;

    public j4(ArrayList arrayList, int i, int i10, int i11, ArrayList arrayList2, boolean z10, boolean z11) {
        this.f7669a = arrayList;
        this.f7670b = i;
        this.f7671c = i10;
        this.f7672d = i11;
        this.f7673e = arrayList2;
        this.f7674f = z10;
        this.f7675g = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return this.f7669a.equals(j4Var.f7669a) && this.f7670b == j4Var.f7670b && this.f7671c == j4Var.f7671c && this.f7672d == j4Var.f7672d && this.f7673e.equals(j4Var.f7673e) && this.f7674f == j4Var.f7674f && this.f7675g == j4Var.f7675g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7675g) + x.i.e(no.a.b(this.f7673e, a0.s0.b(this.f7672d, a0.s0.b(this.f7671c, a0.s0.b(this.f7670b, this.f7669a.hashCode() * 31, 31), 31), 31), 31), 31, this.f7674f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionFilesChangedResult(files=");
        sb2.append(this.f7669a);
        sb2.append(", totalAdditions=");
        sb2.append(this.f7670b);
        sb2.append(", totalDeletions=");
        a0.s0.z(sb2, this.f7671c, ", totalFilesChanged=", this.f7672d, ", diffData=");
        sb2.append(this.f7673e);
        sb2.append(", hasMoreFiles=");
        sb2.append(this.f7674f);
        sb2.append(", canLoadNextPage=");
        return jo.f4Shadow.s(sb2, this.f7675g, ")");
    }
}
