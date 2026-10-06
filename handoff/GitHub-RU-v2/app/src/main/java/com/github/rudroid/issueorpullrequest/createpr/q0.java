package com.github.rudroid.issueorpullrequest.createpr;

import com.github.rudroid.copilot.h1;
import jo.f4;
import yz0.c2;

/* loaded from: /home/user/work/p/classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public c2 f15363a;

    /* renamed from: b, reason: collision with root package name */
    public String f15364b;

    /* renamed from: c, reason: collision with root package name */
    public String f15365c;

    /* renamed from: d, reason: collision with root package name */
    public p01.b f15366d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15367e;

    public q0(c2 c2Var, String str, String str2, p01.b bVar, boolean z10) {
        this.f15363a = c2Var;
        this.f15364b = str;
        this.f15365c = str2;
        this.f15366d = bVar;
        this.f15367e = z10;
    }

    public static q0 a(q0 q0Var, String str, String str2, p01.b bVar, boolean z10, int i) {
        String str3 = str;
        c2 c2Var = q0Var.f15363a;
        if ((i & 2) != 0) {
            str3 = q0Var.f15364b;
        }
        if ((i & 4) != 0) {
            str2 = q0Var.f15365c;
        }
        if ((i & 8) != 0) {
            bVar = q0Var.f15366d;
        }
        if ((i & 16) != 0) {
            z10 = q0Var.f15367e;
        }
        boolean z11 = z10;
        q0Var.getClass();
        p01.b bVar2 = bVar;
        return new q0(c2Var, str3, str2, bVar2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.f15363a, q0Var.f15363a) && k71.k.b(this.f15364b, q0Var.f15364b) && k71.k.b(this.f15365c, q0Var.f15365c) && k71.k.b(this.f15366d, q0Var.f15366d) && this.f15367e == q0Var.f15367e;
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.f15363a.hashCode() * 31, this.f15364b, 31), this.f15365c, 31);
        p01.b bVar = this.f15366d;
        return Boolean.hashCode(this.f15367e) + ((i + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubmitPullRequestState(refNames=");
        sb2.append(this.f15363a);
        sb2.append(", prBodyText=");
        sb2.append(this.f15364b);
        sb2.append(", prTitleText=");
        sb2.append(this.f15365c);
        sb2.append(", pullRequestCreationResult=");
        sb2.append(this.f15366d);
        sb2.append(", enabled=");
        return f4.s(sb2, this.f15367e, ")");
    }
}
