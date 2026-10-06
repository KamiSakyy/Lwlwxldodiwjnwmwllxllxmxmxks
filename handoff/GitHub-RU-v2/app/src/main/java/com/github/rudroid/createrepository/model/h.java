package com.github.rudroid.createrepository.model;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10597a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10598b;

    public h(boolean z10, boolean z11) {
        this.f10597a = z10;
        this.f10598b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f10597a == hVar.f10597a && this.f10598b == hVar.f10598b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10598b) + (Boolean.hashCode(this.f10597a) * 31);
    }

    public final String toString() {
        return "SuffixValidationState(disableSubmission=" + this.f10597a + ", hadGitSuffixRemoved=" + this.f10598b + ")";
    }
}
