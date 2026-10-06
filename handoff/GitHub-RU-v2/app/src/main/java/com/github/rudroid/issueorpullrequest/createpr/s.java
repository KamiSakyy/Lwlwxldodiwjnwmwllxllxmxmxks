package com.github.rudroid.issueorpullrequest.createpr;

import yz0.a2;
import yz0.c2;
import yz0.z1;

/* loaded from: /home/user/work/p/classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public c2 f15376a;

    /* renamed from: b, reason: collision with root package name */
    public a2 f15377b;

    /* renamed from: c, reason: collision with root package name */
    public z1 f15378c;

    /* renamed from: d, reason: collision with root package name */
    public String f15379d;

    /* renamed from: e, reason: collision with root package name */
    public oe.c f15380e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15381f;

    public s(c2 c2Var, a2 a2Var, z1 z1Var, String str, oe.c cVar, boolean z10) {
        this.f15376a = c2Var;
        this.f15377b = a2Var;
        this.f15378c = z1Var;
        this.f15379d = str;
        this.f15380e = cVar;
        this.f15381f = z10;
    }

    public static s a(s sVar, c2 c2Var, a2 a2Var, z1 z1Var, String str, oe.c cVar, boolean z10, int i) {
        if ((i & 1) != 0) {
            c2Var = sVar.f15376a;
        }
        c2 c2Var2 = c2Var;
        if ((i & 2) != 0) {
            a2Var = sVar.f15377b;
        }
        a2 a2Var2 = a2Var;
        if ((i & 4) != 0) {
            z1Var = sVar.f15378c;
        }
        z1 z1Var2 = z1Var;
        if ((i & 8) != 0) {
            str = sVar.f15379d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            cVar = sVar.f15380e;
        }
        oe.c cVar2 = cVar;
        if ((i & 32) != 0) {
            z10 = sVar.f15381f;
        }
        return new s(c2Var2, a2Var2, z1Var2, str2, cVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f15376a.equals(sVar.f15376a) && this.f15377b.equals(sVar.f15377b) && this.f15378c.equals(sVar.f15378c) && k71.k.b(this.f15379d, sVar.f15379d) && k71.k.b(this.f15380e, sVar.f15380e) && this.f15381f == sVar.f15381f;
    }

    public final int hashCode() {
        int hashCode = (this.f15378c.hashCode() + ((this.f15377b.hashCode() + (this.f15376a.hashCode() * 31)) * 31)) * 31;
        String str = this.f15379d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        oe.c cVar = this.f15380e;
        return Boolean.hashCode(false) + x.i.e((hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f15381f);
    }

    public final String toString() {
        return "CompareChangesState(refNames=" + this.f15376a + ", filesChangedOverview=" + this.f15377b + ", commitsOverview=" + this.f15378c + ", lastCommitMessage=" + this.f15379d + ", activePullRequest=" + this.f15380e + ", isLoading=" + this.f15381f + ", shouldDismiss=false)";
    }
}
