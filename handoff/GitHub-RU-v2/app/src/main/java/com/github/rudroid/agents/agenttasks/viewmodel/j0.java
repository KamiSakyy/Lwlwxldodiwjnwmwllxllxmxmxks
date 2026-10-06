package com.github.rudroid.agents.agenttasks.viewmodel;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f6536a;

    /* renamed from: b, reason: collision with root package name */
    public final on.g f6537b;

    public j0(List list, on.g gVar) {
        k71.k.g(list, "states");
        k71.k.g(gVar, "order");
        this.f6536a = list;
        this.f6537b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k71.k.b(this.f6536a, j0Var.f6536a) && this.f6537b == j0Var.f6537b;
    }

    public final int hashCode() {
        return this.f6537b.hashCode() + (this.f6536a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedStatesAndOrder(states=" + this.f6536a + ", order=" + this.f6537b + ")";
    }
}
