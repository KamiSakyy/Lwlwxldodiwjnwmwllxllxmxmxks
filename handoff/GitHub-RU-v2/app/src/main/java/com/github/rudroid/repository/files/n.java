package com.github.rudroid.repository.files;

/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19638a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19639b;

    public n(boolean z10, boolean z11) {
        this.f19638a = z10;
        this.f19639b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f19638a == nVar.f19638a && this.f19639b == nVar.f19639b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19639b) + (Boolean.hashCode(this.f19638a) * 31);
    }

    public final String toString() {
        return "RepoBranchViewerPermissions(viewerCanPush=" + this.f19638a + ", viewerCanCommitToCurrentBranch=" + this.f19639b + ")";
    }
}
