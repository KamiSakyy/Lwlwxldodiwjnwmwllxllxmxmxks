package com.github.rudroid.projects.triagesheet;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class q<V> {

    /* renamed from: a, reason: collision with root package name */
    public List f18078a;

    /* renamed from: b, reason: collision with root package name */
    public List f18079b;

    public q(List list, List list2) {
        k71.k.g(list, "selected");
        this.f18078a = list;
        this.f18079b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.f18078a, qVar.f18078a) && k71.k.b(this.f18079b, qVar.f18079b);
    }

    public final int hashCode() {
        return this.f18079b.hashCode() + (this.f18078a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectorModel(selected=" + this.f18078a + ", selectable=" + this.f18079b + ")";
    }
}
