package com.github.rudroid.fileeditor;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f12991a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12992b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12993c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12994d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12995e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12996f;

    /* renamed from: g, reason: collision with root package name */
    public final a f12997g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12998h;

    public x(String str, boolean z10, boolean z11, String str2, String str3, String str4, a aVar, String str5) {
        k71.k.g(str, "text");
        k71.k.g(str2, "baseBranchToCommit");
        k71.k.g(str3, "selectedBranch");
        this.f12991a = str;
        this.f12992b = z10;
        this.f12993c = z11;
        this.f12994d = str2;
        this.f12995e = str3;
        this.f12996f = str4;
        this.f12997g = aVar;
        this.f12998h = str5;
    }

    public static x a(x xVar, String str, boolean z10, boolean z11, String str2, String str3, String str4, a aVar, String str5, int i) {
        if ((i & 1) != 0) {
            str = xVar.f12991a;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            z10 = xVar.f12992b;
        }
        boolean z12 = z10;
        if ((i & 4) != 0) {
            z11 = xVar.f12993c;
        }
        boolean z13 = z11;
        if ((i & 8) != 0) {
            str2 = xVar.f12994d;
        }
        String str7 = str2;
        if ((i & 16) != 0) {
            str3 = xVar.f12995e;
        }
        String str8 = str3;
        if ((i & 32) != 0) {
            str4 = xVar.f12996f;
        }
        String str9 = str4;
        a aVar2 = (i & 64) != 0 ? xVar.f12997g : aVar;
        String str10 = (i & 128) != 0 ? xVar.f12998h : str5;
        xVar.getClass();
        k71.k.g(str6, "text");
        k71.k.g(str7, "baseBranchToCommit");
        k71.k.g(str8, "selectedBranch");
        return new x(str6, z12, z13, str7, str8, str9, aVar2, str10);
    }

    public final boolean equals(Object obj) {
        boolean b10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!k71.k.b(this.f12991a, xVar.f12991a) || this.f12992b != xVar.f12992b || this.f12993c != xVar.f12993c || !k71.k.b(this.f12994d, xVar.f12994d) || !k71.k.b(this.f12995e, xVar.f12995e) || !k71.k.b(this.f12996f, xVar.f12996f) || !k71.k.b(this.f12997g, xVar.f12997g)) {
            return false;
        }
        String str = xVar.f12998h;
        String str2 = this.f12998h;
        if (str2 == null) {
            if (str == null) {
                b10 = true;
            }
            b10 = false;
        } else {
            if (str != null) {
                b10 = k71.k.b(str2, str);
            }
            b10 = false;
        }
        return b10;
    }

    public final int hashCode() {
        int i = h1.i(h1.i(x.i.e(x.i.e(this.f12991a.hashCode() * 31, 31, this.f12992b), 31, this.f12993c), this.f12994d, 31), this.f12995e, 31);
        String str = this.f12996f;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f12997g;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f12998h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f12998h;
        String a10 = str == null ? "null" : qb.a.a(str);
        StringBuilder o5 = com.github.rudroid.m0.o("FileEditorState(text=", this.f12991a, ", commitEnabled=", ", displayCommitBox=", this.f12992b);
        com.github.rudroid.m0.z(o5, this.f12993c, ", baseBranchToCommit=", this.f12994d, ", selectedBranch=");
        f1.e.x(o5, this.f12995e, ", suggestedHeadBranch=", this.f12996f, ", commitOperationResult=");
        o5.append(this.f12997g);
        o5.append(", headBranchOid=");
        o5.append(a10);
        o5.append(")");
        return o5.toString();
    }

    public /* synthetic */ x(String str, int i, String str2) {
        this("", false, false, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, null, null, null);
    }
}
