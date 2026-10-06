package com.github.rudroid.agents.chatthreads.viewmodel;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public List f6714a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6715b;

    public a(List list, boolean z10) {
        k71.k.g(list, "threads");
        this.f6714a = list;
        this.f6715b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f6714a, aVar.f6714a) && this.f6715b == aVar.f6715b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6715b) + (this.f6714a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatThreadsUiModel(threads=" + this.f6714a + ", chatCreationEnabled=" + this.f6715b + ")";
    }
}
