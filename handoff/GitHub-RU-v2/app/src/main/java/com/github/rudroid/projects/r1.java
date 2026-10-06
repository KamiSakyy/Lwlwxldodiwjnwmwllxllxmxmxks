package com.github.rudroid.projects;

/* loaded from: /home/user/work/p/classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public String f17796a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17797b;

    /* renamed from: c, reason: collision with root package name */
    public String f17798c;

    /* renamed from: d, reason: collision with root package name */
    public String f17799d;

    /* renamed from: e, reason: collision with root package name */
    public int f17800e;

    /* renamed from: f, reason: collision with root package name */
    public String f17801f;

    /* renamed from: g, reason: collision with root package name */
    public String f17802g;

    /* renamed from: h, reason: collision with root package name */
    public String f17803h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17804j;

    /* renamed from: k, reason: collision with root package name */
    public String f17805k;
    public boolean l;

    public r1(String str, boolean z10, String str2, String str3, int i, String str4, String str5, String str6, String str7, boolean z11, String str8, boolean z12) {
        k71.k.g(str, "id");
        k71.k.g(str8, "url");
        this.f17796a = str;
        this.f17797b = z10;
        this.f17798c = str2;
        this.f17799d = str3;
        this.f17800e = i;
        this.f17801f = str4;
        this.f17802g = str5;
        this.f17803h = str6;
        this.i = str7;
        this.f17804j = z11;
        this.f17805k = str8;
        this.l = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return k71.k.b(this.f17796a, r1Var.f17796a) && this.f17797b == r1Var.f17797b && k71.k.b(this.f17798c, r1Var.f17798c) && k71.k.b(this.f17799d, r1Var.f17799d) && this.f17800e == r1Var.f17800e && k71.k.b(this.f17801f, r1Var.f17801f) && k71.k.b(this.f17802g, r1Var.f17802g) && k71.k.b(this.f17803h, r1Var.f17803h) && k71.k.b(this.i, r1Var.i) && this.f17804j == r1Var.f17804j && k71.k.b(this.f17805k, r1Var.f17805k) && this.l == r1Var.l;
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.f17800e, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(this.f17796a.hashCode() * 31, 31, this.f17797b), this.f17798c, 31), this.f17799d, 31), 31), this.f17801f, 31), this.f17802g, 31), this.f17803h, 31);
        String str = this.i;
        return Boolean.hashCode(this.l) + com.github.rudroid.copilot.h1.i(x.i.e((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.f17804j), this.f17805k, 31);
    }

    public final String toString() {
        StringBuilder o5 = com.github.rudroid.m0.o("SimpleProjectUiModel(id=", this.f17796a, ", isUserProject=", ", repoNameWithOwner=", this.f17797b);
        f1.e.x(o5, this.f17798c, ", ownerLogin=", this.f17799d, ", number=");
        x.i.r(this.f17800e, ", title=", this.f17801f, ", updatedAtString=", o5);
        f1.e.x(o5, this.f17802g, ", updatedAtA11y=", this.f17803h, ", description=");
        com.github.rudroid.m0.x(o5, this.i, ", isPublic=", this.f17804j, ", url=");
        return com.github.rudroid.m0.k(o5, this.f17805k, ", closed=", this.l, ")");
    }
}
