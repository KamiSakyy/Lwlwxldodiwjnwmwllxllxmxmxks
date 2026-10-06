package com.github.rudroid.projects.table;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f17853a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17854b;

    public c(String str, boolean z10) {
        this.f17853a = str;
        this.f17854b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.f17853a, cVar.f17853a) && this.f17854b == cVar.f17854b;
    }

    public final int hashCode() {
        String str = this.f17853a;
        return Boolean.hashCode(this.f17854b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.n("LoadingState(loadingId=", this.f17853a, ", isLoading=", ")", this.f17854b);
    }
}
