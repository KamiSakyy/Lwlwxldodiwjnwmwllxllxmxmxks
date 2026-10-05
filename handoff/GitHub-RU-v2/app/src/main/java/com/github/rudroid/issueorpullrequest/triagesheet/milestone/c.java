package com.github.rudroid.issueorpullrequest.triagesheet.milestone;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16470a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16471b;

    public c(ArrayList arrayList, boolean z10) {
        this.f16470a = z10;
        this.f16471b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16470a == cVar.f16470a && this.f16471b.equals(cVar.f16471b);
    }

    public final int hashCode() {
        return this.f16471b.hashCode() + (Boolean.hashCode(this.f16470a) * 31);
    }

    public final String toString() {
        return "MilestonePickerUiModel(hasSelectedItemChanged=" + this.f16470a + ", listItems=" + this.f16471b + ")";
    }
}
