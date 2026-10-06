package com.github.rudroid.copilot.threads;

import com.github.rudroid.copilot.threads.l;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public l.a f10040a;

    /* renamed from: b, reason: collision with root package name */
    public List f10041b;

    public n(l.a aVar, List list) {
        k71.k.g(aVar, "dateGroup");
        k71.k.g(list, "threads");
        this.f10040a = aVar;
        this.f10041b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f10040a == nVar.f10040a && k71.k.b(this.f10041b, nVar.f10041b);
    }

    public final int hashCode() {
        return this.f10041b.hashCode() + (this.f10040a.hashCode() * 31);
    }

    public final String toString() {
        return "GroupedThreadsUiModel(dateGroup=" + this.f10040a + ", threads=" + this.f10041b + ")";
    }
}
