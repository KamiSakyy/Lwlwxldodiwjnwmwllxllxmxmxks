package com.github.rudroid.projects.ui.quickaction;

import com.github.rudroid.issueorpullrequest.triagesheet.b;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public String f18379a;

    /* renamed from: b, reason: collision with root package name */
    public il.s f18380b;

    /* renamed from: c, reason: collision with root package name */
    public b.f f18381c;

    /* renamed from: d, reason: collision with root package name */
    public k0 f18382d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18383e;

    /* renamed from: f, reason: collision with root package name */
    public List f18384f;

    public j0(String str, il.s sVar, b.f fVar, k0 k0Var, boolean z10, List list) {
        this.f18379a = str;
        this.f18380b = sVar;
        this.f18381c = fVar;
        this.f18382d = k0Var;
        this.f18383e = z10;
        this.f18384f = list;
    }

    public static j0 a(j0 j0Var, String str, il.s sVar, b.f fVar, k0 k0Var, boolean z10, List list, int i) {
        if ((i & 1) != 0) {
            str = j0Var.f18379a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            sVar = j0Var.f18380b;
        }
        il.s sVar2 = sVar;
        if ((i & 4) != 0) {
            fVar = j0Var.f18381c;
        }
        b.f fVar2 = fVar;
        j0Var.getClass();
        if ((i & 32) != 0) {
            z10 = j0Var.f18383e;
        }
        boolean z11 = z10;
        if ((i & 64) != 0) {
            list = j0Var.f18384f;
        }
        List list2 = list;
        j0Var.getClass();
        k71.k.g(k0Var, "dialogType");
        k71.k.g(list2, "viewGroupedByFields");
        return new j0(str2, sVar2, fVar2, k0Var, z11, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k71.k.b(this.f18379a, j0Var.f18379a) && k71.k.b(this.f18380b, j0Var.f18380b) && k71.k.b(this.f18381c, j0Var.f18381c) && this.f18382d == j0Var.f18382d && this.f18383e == j0Var.f18383e && k71.k.b(this.f18384f, j0Var.f18384f);
    }

    public final int hashCode() {
        String str = this.f18379a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        il.s sVar = this.f18380b;
        int hashCode2 = (hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        b.f fVar = this.f18381c;
        return this.f18384f.hashCode() + x.i.e(x.i.e((this.f18382d.hashCode() + ((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31, 31, false), 31, this.f18383e);
    }

    public final String toString() {
        return "QuickActionDialogState(selectedViewId=" + this.f18379a + ", projectItemWithRelatedProjects=" + this.f18380b + ", projectSectionCard=" + this.f18381c + ", dialogType=" + this.f18382d + ", viewerCanUpdateProject=false, supportsCloseAsDuplicate=" + this.f18383e + ", viewGroupedByFields=" + this.f18384f + ")";
    }

    public /* synthetic */ j0() {
        this(null, null, null, k0.f18389r, false, x61.r.r);
    }
}
